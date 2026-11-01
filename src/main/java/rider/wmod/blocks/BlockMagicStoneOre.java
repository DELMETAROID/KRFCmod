package rider.wmod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import rider.wmod.Wmod;
import rider.wmod.init.BlockInit;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class BlockMagicStoneOre extends Block implements IHasModel{

	public BlockMagicStoneOre(String name, CreativeTabs tab)
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHardness(2.0F);
		setHarvestLevel("pickaxe", 1);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}

	/**
	 * Get the Item that this Block should drop when harvested.
	 */
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		if (this == BlockInit.MAGICSTONE_ORE_RED)
		{
			return ItemInit.MAGICSTONE_RED;
		}
		else if (this == BlockInit.MAGICSTONE_ORE_BLUE)
		{
			return ItemInit.MAGICSTONE_BLUE;
		}
		else if (this == BlockInit.MAGICSTONE_ORE_GREEN)
		{
			return ItemInit.MAGICSTONE_GREEN;
		}
		else if (this == BlockInit.MAGICSTONE_ORE_YELLOW)
		{
			return ItemInit.MAGICSTONE_YELLOW;
		}
		else if (this == BlockInit.MAGICSTONE_ORE_BLACK)
		{
			return ItemInit.MAGICSTONE_BLACK;
		}else 
		{
			return ItemInit.MAGICSTONE_DUST;
		}
	}
}