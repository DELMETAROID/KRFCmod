package rider.wmod.items.armor.geats;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.geats.ModelRaiseArmed;
import rider.wmod.util.IHasModel;

public class ArmorRaiseSP extends ArmorRaise_up implements IHasModel{

	public static int isInvisible=0;
	public static int AtkP=0;
	public static int DefP=0;
	public static int SpdP=0;
	public static int HstP=0;
	public static int JmpP=0;
	Random rand = new Random();

	public ArmorRaiseSP(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
		super(name,tab,materialIn,equipmentSlotIn);
		this.SetPoint(AtkP,DefP,SpdP,HstP,JmpP);	
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	public static ItemStack SwitchR(ItemStack itemstack,int r)
	{
		ItemStack RAISE_HAMMER = new ItemStack(ItemInit.RAISE_HAMMER,1);
		ItemStack RAISE_WATER = new ItemStack(ItemInit.RAISE_WATER,1);
		ItemStack RAISE_ARROW = new ItemStack(ItemInit.RAISE_ARROW,1);
		ItemStack RAISE_SHIELD = new ItemStack(ItemInit.RAISE_SHIELD,1);
		ItemStack RAISE_CRAW = new ItemStack(ItemInit.RAISE_CRAW,1);
		ItemStack RAISE_CHAINARRAY = new ItemStack(ItemInit.RAISE_CHAINARRAY,1);
		ItemStack RAISE_DRILL = new ItemStack(ItemInit.RAISE_DRILL,1);
		ItemStack RAISE_PROPELLER = new ItemStack(ItemInit.RAISE_PROPELLER,1);
		ItemStack RAISE_SHOOTER = new ItemStack(ItemInit.MAGNUM_SHOOTER_HANDGUN,1);
		ItemStack RAISE_BREAKER = new ItemStack(ItemInit.ZOMBIE_BREAKER,1);
		ItemStack RAISE_DUALER = new ItemStack(ItemInit.NINJA_DUALER_SINGLE,1);
		ItemStack RAISE_AX = new ItemStack(ItemInit.BEAT_AX,1);

		switch(r) 
		{
		case 0:
			itemstack=RAISE_HAMMER;
			break;
		case 1:
			itemstack=RAISE_WATER;
			break;
		case 2:
			itemstack=RAISE_ARROW;
			break;
		case 3:
			itemstack=RAISE_SHIELD;
			break;
		case 4:
			itemstack=RAISE_CRAW;
			break;
		case 5:
			itemstack=RAISE_CHAINARRAY;
			break;
		case 6:
			itemstack=RAISE_DRILL;
			break;
		case 7:
			itemstack=RAISE_PROPELLER;
			break;
		case 8:
			itemstack=RAISE_SHOOTER;
			break;
		case 9:
			itemstack=RAISE_BREAKER;
			break;
		case 10:
			itemstack=RAISE_DUALER;
			break;
		case 11:
			itemstack=RAISE_AX;
			break;
		}

		return itemstack;
	}

	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityliving,ItemStack itemstack,EntityEquipmentSlot armorslot,ModelBiped _default)
	{
		if(itemstack != ItemStack.EMPTY)
		{
			if(itemstack.getItem() instanceof ItemArmor)
			{
				ModelRaiseArmed model = new ModelRaiseArmed();
				model.bipedBody.showModel =armorslot ==EntityEquipmentSlot.CHEST;
				model.isChild= _default.isChild;
				model.isRiding=_default.isRiding;
				model.isSneak= _default.isSneak;
				model.rightArmPose=_default.rightArmPose;
				model.leftArmPose= _default.leftArmPose;

				return model;
			}
		}return null;
	}

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack itemstackR = new ItemStack(ItemInit.RB_SP_R,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		EntityEquipmentSlot entityequipmentslotR = EntityLiving.getSlotForItemStack(itemstackR);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack itemstack1R = playerIn.getItemStackFromSlot(entityequipmentslotR);

		int r=rand.nextInt(11);	
		int r2=rand.nextInt(11);		

		
		ItemStack itemstack2 = ItemStack.EMPTY;
		ItemStack itemstack3 = ItemStack.EMPTY;

		itemstack2 = SwitchR(itemstack2,r);
		itemstack3 = SwitchR(itemstack3,r2);		

		if(isDesireRider(playerIn))
		{
			playerIn.swingArm(handIn);
			if(handIn==EnumHand.MAIN_HAND&&!playerIn.isSneaking())
			{					
				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, itemstack3.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					playerIn.dropItem(itemstack1, true);
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, itemstack3.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
				}
			}else {
				if (itemstack1R.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslotR, itemstackR.copy());
					itemstackR.setCount(0);
					playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, itemstack3.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslotR, itemstackR.copy());
					itemstackR.setCount(0);
					playerIn.dropItem(itemstack1R, true);
					playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, itemstack3.copy());
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