package rider.wmod.items.armor.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.geats.ModelRaiseArmed_R;
import rider.wmod.util.IHasModel;

public class ArmorRaise_dn extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public int AtkP;
	public int DefP;
	public int SpdP;
	public int HstP;
	public int JmpP;

	public ArmorRaise_dn(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Blocks.BARRIER.getCreativeTabToDisplayOn());
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
	}
	
	public void SetPoint(int atk,int def, int spd,int hst,int jmp)
	{
		AtkP=atk;
		DefP=def;
		SpdP=spd;
		HstP=hst;
		JmpP=jmp;		
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
	
	public boolean isDesireRider(EntityPlayer playerIn) 
	{
		if(playerIn.inventory.armorItemInSlot(1) != null&&playerIn.inventory.armorItemInSlot(3) != null)
		{
			if((playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER)&&
					(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GEATS
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
					
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SKUMATTER

							))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
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
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SKUMATTER) 
				{
					ArmorIDSkumatter.Atk_dn=AtkP;
					ArmorIDSkumatter.Def_dn=DefP;
					ArmorIDSkumatter.Spd_dn=SpdP;
					ArmorIDSkumatter.Hst_dn=HstP;
					ArmorIDSkumatter.Jmp_dn=JmpP;
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
}