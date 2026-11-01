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
import net.minecraft.init.Blocks;
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
import rider.wmod.rendering.models.items.geats.ModelRaiseArmed_R;
import rider.wmod.util.IHasModel;

public class ArmorRaiseAx_R extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public static int AtkP=1;
	public static int DefP=0;
	public static int SpdP=-1;
	public static int HstP=0;
	public static int JmpP=0;

	public ArmorRaiseAx_R(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Blocks.BARRIER.getCreativeTabToDisplayOn());
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
				ModelRaiseArmed_R model = new ModelRaiseArmed_R();
				model.bipedBody.showModel =armorslot ==EntityEquipmentSlot.FEET;
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
		ItemStack itemstackR = new ItemStack(ItemInit.RB_AX,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		EntityEquipmentSlot entityequipmentslotR = EntityLiving.getSlotForItemStack(itemstackR);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack itemstack1R = playerIn.getItemStackFromSlot(entityequipmentslotR);

		
		ItemStack itemstack2 = new ItemStack(ItemInit.BEAT_AX,1);
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
				if(handIn==EnumHand.OFF_HAND&&!playerIn.isSneaking()) 
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
					ArmorIDGeats.Atk_dn=AtkP;
					ArmorIDGeats.Def_dn=DefP;
					ArmorIDGeats.Spd_dn=SpdP;
					ArmorIDGeats.Hst_dn=HstP;
					ArmorIDGeats.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_TYCOON) 
				{
					ArmorIDTycoon.Atk_dn=AtkP;
					ArmorIDTycoon.Def_dn=DefP;
					ArmorIDTycoon.Spd_dn=SpdP;
					ArmorIDTycoon.Hst_dn=HstP;
					ArmorIDTycoon.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BUFFA) 
				{
					ArmorIDBuffa.Atk_dn=AtkP;
					ArmorIDBuffa.Def_dn=DefP;
					ArmorIDBuffa.Spd_dn=SpdP;
					ArmorIDBuffa.Hst_dn=HstP;
					ArmorIDBuffa.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NAGO) 
				{
					ArmorIDNago.Atk_dn=AtkP;
					ArmorIDNago.Def_dn=DefP;
					ArmorIDNago.Spd_dn=SpdP;
					ArmorIDNago.Hst_dn=HstP;
					ArmorIDNago.Jmp_dn=JmpP;
				}
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SHIROWE) 
				{
					ArmorIDShirowe.Atk_dn=AtkP;
					ArmorIDShirowe.Def_dn=DefP;
					ArmorIDShirowe.Spd_dn=SpdP;
					ArmorIDShirowe.Hst_dn=HstP;
					ArmorIDShirowe.Jmp_dn=JmpP;
				}

				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GINPEN) 
				{
					ArmorIDGinpen.Atk_dn=AtkP;
					ArmorIDGinpen.Def_dn=DefP;
					ArmorIDGinpen.Spd_dn=SpdP;
					ArmorIDGinpen.Hst_dn=HstP;
					ArmorIDGinpen.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_DAPAAN) 
				{
					ArmorIDDapaan.Atk_dn=AtkP;
					ArmorIDDapaan.Def_dn=DefP;
					ArmorIDDapaan.Spd_dn=SpdP;
					ArmorIDDapaan.Hst_dn=HstP;
					ArmorIDDapaan.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_MARY) 
				{
					ArmorIDMary.Atk_dn=AtkP;
					ArmorIDMary.Def_dn=DefP;
					ArmorIDMary.Spd_dn=SpdP;
					ArmorIDMary.Hst_dn=HstP;
					ArmorIDMary.Jmp_dn=JmpP;
				}
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_PUNKJACK) 
				{
					ArmorIDPunkjack.Atk_dn=AtkP;
					ArmorIDPunkjack.Def_dn=DefP;
					ArmorIDPunkjack.Spd_dn=SpdP;
					ArmorIDPunkjack.Hst_dn=HstP;
					ArmorIDPunkjack.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_KEILOW) 
				{
					ArmorIDKeilow.Atk_dn=AtkP;
					ArmorIDKeilow.Def_dn=DefP;
					ArmorIDKeilow.Spd_dn=SpdP;
					ArmorIDKeilow.Hst_dn=HstP;
					ArmorIDKeilow.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_LETTER) 
				{
					ArmorIDLetter.Atk_dn=AtkP;
					ArmorIDLetter.Def_dn=DefP;
					ArmorIDLetter.Spd_dn=SpdP;
					ArmorIDLetter.Hst_dn=HstP;
					ArmorIDLetter.Jmp_dn=JmpP;
				}
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NADGESPARROW) 
				{
					ArmorIDNadgesparrow.Atk_dn=AtkP;
					ArmorIDNadgesparrow.Def_dn=DefP;
					ArmorIDNadgesparrow.Spd_dn=SpdP;
					ArmorIDNadgesparrow.Hst_dn=HstP;
					ArmorIDNadgesparrow.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_LOPO) 
				{
					ArmorIDLopo.Atk_dn=AtkP;
					ArmorIDLopo.Def_dn=DefP;
					ArmorIDLopo.Spd_dn=SpdP;
					ArmorIDLopo.Hst_dn=HstP;
					ArmorIDLopo.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GROOVY) 
				{
					ArmorIDGroovy.Atk_dn=AtkP;
					ArmorIDGroovy.Def_dn=DefP;
					ArmorIDGroovy.Spd_dn=SpdP;
					ArmorIDGroovy.Hst_dn=HstP;
					ArmorIDGroovy.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_HAKUBI) 
				{
					ArmorIDHakubi.Atk_dn=AtkP;
					ArmorIDHakubi.Def_dn=DefP;
					ArmorIDHakubi.Spd_dn=SpdP;
					ArmorIDHakubi.Hst_dn=HstP;
					ArmorIDHakubi.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BUCHI) 
				{
					ArmorIDBuchi.Atk_dn=AtkP;
					ArmorIDBuchi.Def_dn=DefP;
					ArmorIDBuchi.Spd_dn=SpdP;
					ArmorIDBuchi.Hst_dn=HstP;
					ArmorIDBuchi.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_TURBON) 
				{
					ArmorIDTurbon.Atk_dn=AtkP;
					ArmorIDTurbon.Def_dn=DefP;
					ArmorIDTurbon.Spd_dn=SpdP;
					ArmorIDTurbon.Hst_dn=HstP;
					ArmorIDTurbon.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GYAGO) 
				{
					ArmorIDGyago.Atk_dn=AtkP;
					ArmorIDGyago.Def_dn=DefP;
					ArmorIDGyago.Spd_dn=SpdP;
					ArmorIDGyago.Hst_dn=HstP;
					ArmorIDGyago.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BRALI) 
				{
					ArmorIDBrali.Atk_dn=AtkP;
					ArmorIDBrali.Def_dn=DefP;
					ArmorIDBrali.Spd_dn=SpdP;
					ArmorIDBrali.Hst_dn=HstP;
					ArmorIDBrali.Jmp_dn=JmpP;
				}
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SEEKER) 
				{
					ArmorIDSeeker.Atk_dn=AtkP;
					ArmorIDSeeker.Def_dn=DefP;
					ArmorIDSeeker.Spd_dn=SpdP;
					ArmorIDSeeker.Hst_dn=HstP;
					ArmorIDSeeker.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_XGEATS) 
				{
					ArmorIDXGeats.Atk_dn=AtkP;
					ArmorIDXGeats.Def_dn=DefP;
					ArmorIDXGeats.Spd_dn=SpdP;
					ArmorIDXGeats.Hst_dn=HstP;
					ArmorIDXGeats.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GEATSONENESS) 
				{
					ArmorIDGeatsOneness.Atk_dn=AtkP;
					ArmorIDGeatsOneness.Def_dn=DefP;
					ArmorIDGeatsOneness.Spd_dn=SpdP;
					ArmorIDGeatsOneness.Hst_dn=HstP;
					ArmorIDGeatsOneness.Jmp_dn=JmpP;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_DOOMSGEATS) 
				{
					ArmorIDDoomsGeats.Atk_dn=AtkP;
					ArmorIDDoomsGeats.Def_dn=DefP;
					ArmorIDDoomsGeats.Spd_dn=SpdP;
					ArmorIDDoomsGeats.Hst_dn=HstP;
					ArmorIDDoomsGeats.Jmp_dn=JmpP;
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