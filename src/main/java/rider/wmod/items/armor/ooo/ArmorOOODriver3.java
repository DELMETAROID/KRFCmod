package rider.wmod.items.armor.ooo;

import net.minecraft.client.model.ModelBiped;
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
import rider.wmod.rendering.models.items.ooo.ModelOOODriver;
import rider.wmod.util.IHasModel;

public class ArmorOOODriver3 extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public static int HeadMedalIn=0;
	public static int BodyMedalIn=0;
	public static int LegMedalIn=0;
	public static int ThreeMedalsIn=0;

	public static int MedalCheckTaka=0;
	public static int MedalCheckKujaku=0;
	public static int MedalCheckCondle=0;
	public static int MedalCheckLion=0;
	public static int MedalCheckTora=0;
	public static int MedalCheckCheetah=0;
	public static int MedalCheckKuwa=0;
	public static int MedalCheckKama=0;
	public static int MedalCheckBatta=0;
	public static int MedalCheckSai=0;
	public static int MedalCheckGorilla=0;
	public static int MedalCheckZou=0;
	public static int MedalCheckShachi=0;
	public static int MedalCheckUnagi=0;
	public static int MedalCheckTako=0;
	public static int MedalCheckPutera=0;
	public static int MedalCheckTricera=0;
	public static int MedalCheckTyrano=0;

	public ArmorOOODriver3(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelOOODriver model = new ModelOOODriver();

				model.bipedBody.showModel =armorslot ==EntityEquipmentSlot.LEGS;
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
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		
		ItemStack itemstack2 = new ItemStack(ItemInit.O_SCANNER, 1);

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
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
		}
	}



	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		ArmorOOODriver2.ThreeMedalsIn2=0;
		ArmorOOODriver2.HeadMedalIn2=0;
		ArmorOOODriver2.BodyMedalIn2=0;
		ArmorOOODriver2.LegMedalIn2=0;

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}

		if(player.inventory.armorItemInSlot(3) != null)
		{
			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.TAKA_CORE
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.KUWA_CORE
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.LION_CORE
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.SAI_CORE
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.SHACHI_CORE
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.PUTERA_CORE
					){
				HeadMedalIn=1;
			}
			else
			{
				HeadMedalIn=0;
			}
		}
		else
		{	
			HeadMedalIn=0;
		}

		if(player.inventory.armorItemInSlot(2) != null)
		{
			if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.KUJAKU_CORE
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.KAMA_CORE
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.TORA_CORE
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GORILLA_CORE
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.UNAGI_CORE
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.TRICERA_CORE
					){
				BodyMedalIn=1;
			}
			else
			{
				BodyMedalIn=0;
			}
		}
		else
		{
			BodyMedalIn=0;
		}

		if(player.inventory.armorItemInSlot(0) != null)
		{
			if(	player.inventory.armorItemInSlot(0).getItem()==ItemInit.CONDLE_CORE
					||player.inventory.armorItemInSlot(0).getItem()==ItemInit.CHEETAH_CORE
					||player.inventory.armorItemInSlot(0).getItem()==ItemInit.BATTA_CORE
					||player.inventory.armorItemInSlot(0).getItem()==ItemInit.ZOU_CORE
					||player.inventory.armorItemInSlot(0).getItem()==ItemInit.TAKO_CORE
					||player.inventory.armorItemInSlot(0).getItem()==ItemInit.TYRANO_CORE
					){
				LegMedalIn=1;
			}
			else
			{
				LegMedalIn=0;
			}
		}
		else
		{
			LegMedalIn=0;
		}

		if(HeadMedalIn==1 && BodyMedalIn==1 && LegMedalIn==1) {ThreeMedalsIn=1;}
		else {ThreeMedalsIn=0;}

		if(HeadMedalIn==0 && BodyMedalIn==0 && LegMedalIn==0) {
			MedalCheckTaka=0;
			MedalCheckKujaku=0;
			MedalCheckCondle=0;
			MedalCheckLion=0;
			MedalCheckTora=0;
			MedalCheckCheetah=0;
			MedalCheckKuwa=0;
			MedalCheckKama=0;
			MedalCheckBatta=0;
			MedalCheckSai=0;
			MedalCheckGorilla=0;
			MedalCheckZou=0;
			MedalCheckShachi=0;
			MedalCheckUnagi=0;
			MedalCheckTako=0;
			MedalCheckPutera=0;
			MedalCheckTricera=0;
			MedalCheckTyrano=0;
		}
	}
}