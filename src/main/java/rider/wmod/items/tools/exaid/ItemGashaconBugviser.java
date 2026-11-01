package rider.wmod.items.tools.exaid;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
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

public class ItemGashaconBugviser extends Item implements IHasModel
{
	public ItemGashaconBugviser(String name,CreativeTabs tab)
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

	//効果
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack itemstack2 =new ItemStack(ItemInit.GashaconBugviser_chainsaw,1);
		ItemStack itemstack3 =new ItemStack(ItemInit.GashaconBugviserZwei_chainsaw,1);
		ItemStack itemstack4 =new ItemStack(ItemInit.BUGGLE_DRIVER,1);
		ItemStack itemstack5 =new ItemStack(ItemInit.BUGGLE_DRIVER_ZWEI,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack4);

		if(playerIn.isSneaking()) {
			if(itemstack.getItem()==ItemInit.GashaconBugviser) {
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack2);
			}else {
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack3);
			}
		}
		else {
			if(itemstack.getItem()==ItemInit.GashaconBugviser) {
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack4.copy());
				itemstack.setCount(0);	
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
			}else {
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack5.copy());
				itemstack.setCount(0);	
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
			}

		}
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("mode.pad"));
	}
}