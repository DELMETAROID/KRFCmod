package rider.wmod.items.armor.geats;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ArmorRaiseArrow2 extends ArmorRaise_up implements IHasModel{

	public static int isInvisible=0;
	public static int AtkP=0;
	public static int DefP=0;
	public static int SpdP=1;
	public static int HstP=0;
	public static int JmpP=0;

	public ArmorRaiseArrow2(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
		super(name,tab,materialIn,equipmentSlotIn);
		this.SetPoint(AtkP,DefP,SpdP,HstP,JmpP);	
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack itemstackR = new ItemStack(ItemInit.RB_ARROW_R,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		EntityEquipmentSlot entityequipmentslotR = EntityLiving.getSlotForItemStack(itemstackR);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack itemstack1R = playerIn.getItemStackFromSlot(entityequipmentslotR);

		
		ItemStack itemstack2 = new ItemStack(ItemInit.RAISE_ARROW,1,50);
		if(isDesireRider(playerIn)) 
		{
			playerIn.swingArm(handIn);
			if(handIn==EnumHand.MAIN_HAND&&!playerIn.isSneaking())
			{
				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					playerIn.dropItem(itemstack1, true);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
				}
			}else {
				if (itemstack1R.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslotR, itemstackR.copy());
					itemstackR.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslotR, itemstackR.copy());
					itemstackR.setCount(0);
					playerIn.dropItem(itemstack1R, true);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
				}						
			}
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}


	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if(AtkP==1) {tooltip.add(I18n.format("tip.atk1"));}
		if(DefP==1) {tooltip.add(I18n.format("tip.def1"));}
		if(SpdP==1) {tooltip.add(I18n.format("tip.spd1"));}
		if(HstP==1) {tooltip.add(I18n.format("tip.hst1"));}
		if(JmpP==1) {tooltip.add(I18n.format("tip.jmp1"));}

		if(AtkP==2) {tooltip.add(I18n.format("tip.atk2"));}
		if(DefP==2) {tooltip.add(I18n.format("tip.def2"));}
		if(SpdP==2) {tooltip.add(I18n.format("tip.spd2"));}
		if(HstP==2) {tooltip.add(I18n.format("tip.hst2"));}
		if(JmpP==2) {tooltip.add(I18n.format("tip.jmp2"));}

		if(AtkP==-1) {tooltip.add(I18n.format("tip.atk-1"));}
		if(DefP==-1) {tooltip.add(I18n.format("tip.def-1"));}
		if(SpdP==-1) {tooltip.add(I18n.format("tip.spd-1"));}
		if(HstP==-1) {tooltip.add(I18n.format("tip.hst-1"));}
		if(JmpP==-1) {tooltip.add(I18n.format("tip.jmp-1"));}
	}
}