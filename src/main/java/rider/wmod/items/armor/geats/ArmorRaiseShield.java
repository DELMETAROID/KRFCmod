package rider.wmod.items.armor.geats;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.geats.ModelRaiseArmed;
import rider.wmod.util.IHasModel;

public class ArmorRaiseShield extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public static int AtkP=0;
	public static int DefP=1;
	public static int SpdP=0;
	public static int HstP=0;
	public static int JmpP=0;

	public ArmorRaiseShield(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
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
		ItemStack itemstackR = new ItemStack(ItemInit.RB_SHIELD_R,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		EntityEquipmentSlot entityequipmentslotR = EntityLiving.getSlotForItemStack(itemstackR);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack itemstack1R = playerIn.getItemStackFromSlot(entityequipmentslotR);

		
		ItemStack itemstack2 = new ItemStack(ItemInit.RAISE_SHIELD,1);
		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if((playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER)&&	(
					playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GEATS
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GEATS
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_TYCOON
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BUFFA
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NAGO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SHIROWE
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GINPEN
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_DAPAAN
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_MARY
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_PUNKJACK
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_LETTER
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_KEILOW
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NADGESPARROW
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_LOPO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GROOVY
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_HAKUBI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BUCHI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GYAGO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_TURBON
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BRALI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SEEKER
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_XGEATS
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_DOOMSGEATS
					))
			{
				playerIn.swingArm(handIn);
				if(handIn==EnumHand.MAIN_HAND&&!playerIn.isSneaking())
				{					
					if (itemstack1.isEmpty())
					{
						playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
						itemstack.setCount(0);
						//						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, itemstack2.copy());
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
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER)
			{
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GEATS) 
				{
					ArmorIDGeats.Atk_up=AtkP;
					ArmorIDGeats.Def_up=DefP;
					ArmorIDGeats.Spd_up=SpdP;
					ArmorIDGeats.Hst_up=HstP;
					ArmorIDGeats.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_TYCOON) 
				{
					ArmorIDTycoon.Atk_up=AtkP;
					ArmorIDTycoon.Def_up=DefP;
					ArmorIDTycoon.Spd_up=SpdP;
					ArmorIDTycoon.Hst_up=HstP;
					ArmorIDTycoon.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BUFFA) 
				{
					ArmorIDBuffa.Atk_up=AtkP;
					ArmorIDBuffa.Def_up=DefP;
					ArmorIDBuffa.Spd_up=SpdP;
					ArmorIDBuffa.Hst_up=HstP;
					ArmorIDBuffa.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NAGO) 
				{
					ArmorIDNago.Atk_up=AtkP;
					ArmorIDNago.Def_up=DefP;
					ArmorIDNago.Spd_up=SpdP;
					ArmorIDNago.Hst_up=HstP;
					ArmorIDNago.Jmp_up=JmpP;
				}
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SHIROWE) 
				{
					ArmorIDShirowe.Atk_up=AtkP;
					ArmorIDShirowe.Def_up=DefP;
					ArmorIDShirowe.Spd_up=SpdP;
					ArmorIDShirowe.Hst_up=HstP;
					ArmorIDShirowe.Jmp_up=JmpP;
				}

				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GINPEN) 
				{
					ArmorIDGinpen.Atk_up=AtkP;
					ArmorIDGinpen.Def_up=DefP;
					ArmorIDGinpen.Spd_up=SpdP;
					ArmorIDGinpen.Hst_up=HstP;
					ArmorIDGinpen.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_DAPAAN) 
				{
					ArmorIDDapaan.Atk_up=AtkP;
					ArmorIDDapaan.Def_up=DefP;
					ArmorIDDapaan.Spd_up=SpdP;
					ArmorIDDapaan.Hst_up=HstP;
					ArmorIDDapaan.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_MARY) 
				{
					ArmorIDMary.Atk_up=AtkP;
					ArmorIDMary.Def_up=DefP;
					ArmorIDMary.Spd_up=SpdP;
					ArmorIDMary.Hst_up=HstP;
					ArmorIDMary.Jmp_up=JmpP;
				}
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_PUNKJACK) 
				{
					ArmorIDPunkjack.Atk_up=AtkP;
					ArmorIDPunkjack.Def_up=DefP;
					ArmorIDPunkjack.Spd_up=SpdP;
					ArmorIDPunkjack.Hst_up=HstP;
					ArmorIDPunkjack.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_KEILOW) 
				{
					ArmorIDKeilow.Atk_up=AtkP;
					ArmorIDKeilow.Def_up=DefP;
					ArmorIDKeilow.Spd_up=SpdP;
					ArmorIDKeilow.Hst_up=HstP;
					ArmorIDKeilow.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_LETTER) 
				{
					ArmorIDLetter.Atk_up=AtkP;
					ArmorIDLetter.Def_up=DefP;
					ArmorIDLetter.Spd_up=SpdP;
					ArmorIDLetter.Hst_up=HstP;
					ArmorIDLetter.Jmp_up=JmpP;
				}
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NADGESPARROW) 
				{
					ArmorIDNadgesparrow.Atk_up=AtkP;
					ArmorIDNadgesparrow.Def_up=DefP;
					ArmorIDNadgesparrow.Spd_up=SpdP;
					ArmorIDNadgesparrow.Hst_up=HstP;
					ArmorIDNadgesparrow.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_LOPO) 
				{
					ArmorIDLopo.Atk_up=AtkP;
					ArmorIDLopo.Def_up=DefP;
					ArmorIDLopo.Spd_up=SpdP;
					ArmorIDLopo.Hst_up=HstP;
					ArmorIDLopo.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GROOVY) 
				{
					ArmorIDGroovy.Atk_up=AtkP;
					ArmorIDGroovy.Def_up=DefP;
					ArmorIDGroovy.Spd_up=SpdP;
					ArmorIDGroovy.Hst_up=HstP;
					ArmorIDGroovy.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_HAKUBI) 
				{
					ArmorIDHakubi.Atk_up=AtkP;
					ArmorIDHakubi.Def_up=DefP;
					ArmorIDHakubi.Spd_up=SpdP;
					ArmorIDHakubi.Hst_up=HstP;
					ArmorIDHakubi.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BUCHI) 
				{
					ArmorIDBuchi.Atk_up=AtkP;
					ArmorIDBuchi.Def_up=DefP;
					ArmorIDBuchi.Spd_up=SpdP;
					ArmorIDBuchi.Hst_up=HstP;
					ArmorIDBuchi.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_TURBON) 
				{
					ArmorIDTurbon.Atk_up=AtkP;
					ArmorIDTurbon.Def_up=DefP;
					ArmorIDTurbon.Spd_up=SpdP;
					ArmorIDTurbon.Hst_up=HstP;
					ArmorIDTurbon.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GYAGO) 
				{
					ArmorIDGyago.Atk_up=AtkP;
					ArmorIDGyago.Def_up=DefP;
					ArmorIDGyago.Spd_up=SpdP;
					ArmorIDGyago.Hst_up=HstP;
					ArmorIDGyago.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BRALI) 
				{
					ArmorIDBrali.Atk_up=AtkP;
					ArmorIDBrali.Def_up=DefP;
					ArmorIDBrali.Spd_up=SpdP;
					ArmorIDBrali.Hst_up=HstP;
					ArmorIDBrali.Jmp_up=JmpP;
				}
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SEEKER) 
				{
					ArmorIDSeeker.Atk_up=AtkP;
					ArmorIDSeeker.Def_up=DefP;
					ArmorIDSeeker.Spd_up=SpdP;
					ArmorIDSeeker.Hst_up=HstP;
					ArmorIDSeeker.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_XGEATS) 
				{
					ArmorIDXGeats.Atk_up=AtkP;
					ArmorIDXGeats.Def_up=DefP;
					ArmorIDXGeats.Spd_up=SpdP;
					ArmorIDXGeats.Hst_up=HstP;
					ArmorIDXGeats.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GEATSONENESS) 
				{
					ArmorIDGeatsOneness.Atk_up=AtkP;
					ArmorIDGeatsOneness.Def_up=DefP;
					ArmorIDGeatsOneness.Spd_up=SpdP;
					ArmorIDGeatsOneness.Hst_up=HstP;
					ArmorIDGeatsOneness.Jmp_up=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_DOOMSGEATS) 
				{
					ArmorIDDoomsGeats.Atk_up=AtkP;
					ArmorIDDoomsGeats.Def_up=DefP;
					ArmorIDDoomsGeats.Spd_up=SpdP;
					ArmorIDDoomsGeats.Hst_up=HstP;
					ArmorIDDoomsGeats.Jmp_up=JmpP;
				}
			}
		}

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
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