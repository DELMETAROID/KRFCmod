package rider.wmod.items.tools.wizard;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemRingCopy extends Item implements IHasModel
{
	public ItemRingCopy(String name,CreativeTabs tab)
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
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		playerIn.swingArm(handIn);
		ItemStack itemstack 	= playerIn.getHeldItem(handIn);
		ItemStack itemstack2 = playerIn.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND);
		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.WIZARDRIVER) 
			{
				if(itemstack2 != null && itemstack2 != ItemStack.EMPTY)
				{
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
				}
				else
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else 
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}
}