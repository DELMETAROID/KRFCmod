package rider.wmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.BlockInit;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class BlockStonePillar extends Block implements IHasModel
{
	public static final PropertyEnum<EnumType> AXIS = PropertyEnum.create("axis", EnumType.class);

	public BlockStonePillar(String name, Material material, CreativeTabs tab)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHardness(2.0F);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}

	//added

	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		if (meta == EnumType.LINES_Y.getMetadata())
		{
			switch (facing.getAxis())
			{
			case Z:
				return this.getDefaultState().withProperty(AXIS, EnumType.LINES_Z);
			case X:
				return this.getDefaultState().withProperty(AXIS, EnumType.LINES_X);
			case Y:
				return this.getDefaultState().withProperty(AXIS, EnumType.LINES_Y);
			}
		}
		return this.getDefaultState().withProperty(AXIS, EnumType.LINES_Y);
	}


	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(AXIS, EnumType.byMetadata(meta));
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	public int getMetaFromState(IBlockState state)
	{
		return ((EnumType)state.getValue(AXIS)).getMetadata();
	}

	public IBlockState withRotation(IBlockState state, Rotation rot)
	{
		switch (rot)
		{
		case COUNTERCLOCKWISE_90:
		case CLOCKWISE_90:

			switch ((EnumType)state.getValue(AXIS))
			{
			case LINES_X:
				return state.withProperty(AXIS, EnumType.LINES_Z);
			case LINES_Z:
				return state.withProperty(AXIS, EnumType.LINES_X);
			default:
				return state;
			}

		default:
			return state;
		}
	}

	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {AXIS});
	}	

	public boolean rotateBlock(World world, BlockPos pos, EnumFacing axis)
	{
		IBlockState state = world.getBlockState(pos);
		for (IProperty prop : state.getProperties().keySet())
		{
			if (prop.getName().equals("AXIS") && prop.getValueClass() == EnumType.class)
			{
				EnumType current = (EnumType)state.getValue(prop);
				EnumType next = current == EnumType.LINES_X ? EnumType.LINES_Y :
					current == EnumType.LINES_Y ? EnumType.LINES_Z :
						current == EnumType.LINES_Z ? EnumType.LINES_X : current;
				if (next == current)
					return false;
				world.setBlockState(pos, state.withProperty(prop, next));
				return true;
			}
		}
		return false;
	}

	public static enum EnumType implements IStringSerializable
	{
		LINES_Y(0, "lines_y", "y"),
		LINES_X(1, "lines_x", "x"),
		LINES_Z(2, "lines_z", "z");

		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String serializedName;
		private final String unlocalizedName;

		private EnumType(int meta, String name, String unlocalizedName)
		{
			this.meta = meta;
			this.serializedName = name;
			this.unlocalizedName = unlocalizedName;
		}

		public int getMetadata()
		{
			return this.meta;
		}

		public String toString()
		{
			return this.unlocalizedName;
		}

		public static EnumType byMetadata(int meta)
		{
			if (meta < 0 || meta >= META_LOOKUP.length)
			{
				meta = 0;
			}

			return META_LOOKUP[meta];
		}

		public String getName()
		{
			return this.serializedName;
		}

		static
		{
			for (EnumType blockquartz$enumtype : values())
			{
				META_LOOKUP[blockquartz$enumtype.getMetadata()] = blockquartz$enumtype;
			}
		}
	}
}
