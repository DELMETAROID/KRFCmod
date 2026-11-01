package rider.wmod.items.armor.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.geats.ModelRaiseArmed;
import rider.wmod.util.IHasModel;

public class ArmorRaise_up extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public int AtkP;
	public int DefP;
	public int SpdP;
	public int HstP;
	public int JmpP;

	public ArmorRaise_up(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
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
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
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

				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SKUMATTER) 
				{
					ArmorIDSkumatter.Atk_up=AtkP;
					ArmorIDSkumatter.Def_up=DefP;
					ArmorIDSkumatter.Spd_up=SpdP;
					ArmorIDSkumatter.Hst_up=HstP;
					ArmorIDSkumatter.Jmp_up=JmpP;
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