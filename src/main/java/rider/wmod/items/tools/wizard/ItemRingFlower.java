package rider.wmod.items.tools.wizard;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemRingFlower extends Item implements IHasModel
{
	public ItemRingFlower(String name,CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		ItemStack itemstack = player.getHeldItem(hand);

		if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.WIZARDRIVER) 
		{
			if (ItemDye.applyBonemeal(itemstack, worldIn, pos, player, hand))
			{
				if (!worldIn.isRemote)
				{
					worldIn.playEvent(2005, pos, 0);
				}

				return EnumActionResult.SUCCESS;
			}
			return EnumActionResult.FAIL;
		}
		return EnumActionResult.FAIL;
	}
}