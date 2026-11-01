package rider.wmod.items.action;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.items.armor.saber.ArmorSaberArangina;
import rider.wmod.items.armor.saber.ArmorSaberBremen;
import rider.wmod.items.armor.saber.ArmorSaberCerberus;
import rider.wmod.items.armor.saber.ArmorSaberDragon;
import rider.wmod.items.armor.saber.ArmorSaberEagle;
import rider.wmod.items.armor.saber.ArmorSaberGenbu;
import rider.wmod.items.armor.saber.ArmorSaberHedgehog;
import rider.wmod.items.armor.saber.ArmorSaberHenzel;
import rider.wmod.items.armor.saber.ArmorSaberJaakuDragon;
import rider.wmod.items.armor.saber.ArmorSaberJackun;
import rider.wmod.items.armor.saber.ArmorSaberKobuta;
import rider.wmod.items.armor.saber.ArmorSaberLion;
import rider.wmod.items.armor.saber.ArmorSaberNinja;
import rider.wmod.items.armor.saber.ArmorSaberPegasas;
import rider.wmod.items.armor.saber.ArmorSaberPeter;
import rider.wmod.items.armor.saber.ArmorSaberPhoenix;
import rider.wmod.items.armor.saber.ArmorSaberSaiyuu;
import rider.wmod.items.armor.saber.ArmorSaberSiren;
import rider.wmod.items.armor.saber.ArmorSwordriverIkazuchi;
import rider.wmod.items.armor.saber.ArmorSwordriverNagare;
import rider.wmod.items.armor.saber.ArmorSwordriverRekka;
import rider.wmod.items.armor.saber.ArmorSwordriverShikkoku;
import rider.wmod.util.IHasModel;

public class ItemSwordriverBattou extends Item implements IHasModel
{
	public ItemSwordriverBattou(String name,CreativeTabs tab)
	{
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


	//効果
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack handin 	= playerIn.getHeldItem(handIn);
		ItemStack swordriver = new ItemStack(ItemInit.SWORDRIVER_REKKA,1);
		ItemStack rekka =new ItemStack(ItemInit.SEIKEN_REKKA,1);
		ItemStack nagare =new ItemStack(ItemInit.SEIKEN_NAGARE,1);
		ItemStack ikazuchi =new ItemStack(ItemInit.SEIKEN_IKAZUCHI,1);
		ItemStack kyomu =new ItemStack(ItemInit.SEIKEN_KYOMU,1);
		ItemStack shikkoku =new ItemStack(ItemInit.SEIKEN_SHIKKOKU,1);

		
		EntityEquipmentSlot driverequipmentslot = EntityLiving.getSlotForItemStack(swordriver);

		
		ItemStack wearingdriver = playerIn.getItemStackFromSlot(driverequipmentslot);


		if(handIn == EnumHand.MAIN_HAND && wearingdriver != null && !playerIn.isSneaking())
		{
			playerIn.swingArm(EnumHand.MAIN_HAND);
			OpenBookMystic(playerIn);
			OpenBookAnimal(playerIn);
			OpenBookStory(playerIn);
			if(handin.getItem()==ItemInit.BATTOU_REKKA && wearingdriver.getItem()==ItemInit.SWORDRIVER_REKKA)
			{
				if(ArmorSwordriverRekka.isSwordIn==1)	{ArmorSwordriverRekka.isSwordIn=0;}
				if(ArmorSwordriverRekka.isHenshin==0)	{ArmorSwordriverRekka.isHenshin=1;}
				playerIn.inventory.deleteStack(rekka);
				handin.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, rekka);
			}else if(handin.getItem()==ItemInit.BATTOU_NAGARE && wearingdriver.getItem()==ItemInit.SWORDRIVER_NAGARE) 
			{
				if(ArmorSwordriverNagare.isSwordIn==1)	{ArmorSwordriverNagare.isSwordIn=0;}
				if(ArmorSwordriverNagare.isHenshin==0)	{ArmorSwordriverNagare.isHenshin=1;}
				playerIn.inventory.deleteStack(nagare);
				handin.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, nagare);
			}
			else if(handin.getItem()==ItemInit.BATTOU_IKAZUCHI && wearingdriver.getItem()==ItemInit.SWORDRIVER_IKAZUCHI) 
			{
				if(ArmorSwordriverIkazuchi.isSwordIn==1)	{ArmorSwordriverIkazuchi.isSwordIn=0;}
				if(ArmorSwordriverIkazuchi.isHenshin==0)	{ArmorSwordriverIkazuchi.isHenshin=1;}	
				playerIn.inventory.deleteStack(ikazuchi);
				handin.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, ikazuchi);

			}
			else if(handin.getItem()==ItemInit.BATTOU_KYOMU && wearingdriver.getItem()==ItemInit.BLADRIVER_KYOMU) 
			{
				//				if(ArmorBladriverKyomu.isSwordIn==1)	{ArmorBladriverKyomu.isSwordIn=0;}
				//				if(ArmorBladriverKyomu.isHenshin==0)	{ArmorBladriverKyomu.isHenshin=1;}	
				playerIn.inventory.deleteStack(kyomu);
				handin.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, kyomu);

			}
			else if(handin.getItem()==ItemInit.BATTOU_SHIKKOKU && wearingdriver.getItem()==ItemInit.SWORDRIVER_SHIKKOKU) 
			{
				if(ArmorSwordriverShikkoku.isSwordIn==1)	{ArmorSwordriverShikkoku.isSwordIn=0;}
				if(ArmorSwordriverShikkoku.isHenshin==0)	{ArmorSwordriverShikkoku.isHenshin=1;}	
				playerIn.inventory.deleteStack(shikkoku);
				handin.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, shikkoku);

			}else {
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
				handin.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,handin);
			}
		}else if(playerIn.isSneaking()&&worldIn.isRemote) 
		{
			if(handin.getItem()==ItemInit.BATTOU_REKKA && wearingdriver.getItem()==ItemInit.SWORDRIVER_REKKA)
			{
				ArmorSwordriverRekka.isSwordIn=1;
				ArmorSwordriverRekka.isHenshin=0;
			}
			else if(handin.getItem()==ItemInit.BATTOU_NAGARE && wearingdriver.getItem()==ItemInit.SWORDRIVER_NAGARE) 
			{
				ArmorSwordriverNagare.isSwordIn=1;
				ArmorSwordriverNagare.isHenshin=0;
			}
			else if(handin.getItem()==ItemInit.BATTOU_IKAZUCHI && wearingdriver.getItem()==ItemInit.SWORDRIVER_IKAZUCHI) 
			{
				ArmorSwordriverIkazuchi.isSwordIn=1;
				ArmorSwordriverIkazuchi.isHenshin=0;
			}
			else if(handin.getItem()==ItemInit.BATTOU_KYOMU && wearingdriver.getItem()==ItemInit.BLADRIVER_KYOMU) 
			{
				//				ArmorBladriverKyomu.isSwordIn=1;
				//				ArmorBladriverKyomu.isHenshin=0;
			}
			else if(handin.getItem()==ItemInit.BATTOU_SHIKKOKU && wearingdriver.getItem()==ItemInit.SWORDRIVER_SHIKKOKU) 
			{
				ArmorSwordriverShikkoku.isSwordIn=1;
				ArmorSwordriverShikkoku.isHenshin=0;
			}else {
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
			}
			CloseBook(playerIn);
			handin.setCount(0);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,handin);
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, handin);
		}
	}

	public void OpenBookMystic(EntityPlayer playerIn) 
	{	
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_DRAGON) {ArmorSaberDragon.isBookOpen=1;ArmorSaberDragon.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_PEGASAS) {ArmorSaberPegasas.isBookOpen=1;ArmorSaberPegasas.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_CERBERUS) {ArmorSaberCerberus.isBookOpen=1;ArmorSaberCerberus.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_GENBU) {ArmorSaberGenbu.isBookOpen=1;ArmorSaberGenbu.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_JAAKUDRAGON) {ArmorSaberJaakuDragon.isBookOpen=1;ArmorSaberJaakuDragon.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_PHOENIX) {ArmorSaberPhoenix.isBookOpen=1;ArmorSaberPhoenix.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_SIREN) {ArmorSaberSiren.isBookOpen=1;ArmorSaberSiren.isHenshin=1;}
	}

	public void OpenBookAnimal(EntityPlayer playerIn) 
	{	
		if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_EAGLE) {ArmorSaberEagle.isBookOpen=1;ArmorSaberEagle.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_LION) {ArmorSaberLion.isBookOpen=1;ArmorSaberLion.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_HEDGEHOG) {ArmorSaberHedgehog.isBookOpen=1;ArmorSaberHedgehog.isHenshin=1;}
	}

	public void OpenBookStory(EntityPlayer playerIn) 
	{	
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_SAIYUU) {ArmorSaberSaiyuu.isBookOpen=1;ArmorSaberSaiyuu.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_PETER) {ArmorSaberPeter.isBookOpen=1;ArmorSaberPeter.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_ARANGINA) {ArmorSaberArangina.isBookOpen=1;ArmorSaberArangina.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_JACKUN) {ArmorSaberJackun.isBookOpen=1;ArmorSaberJackun.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_NINJA) {ArmorSaberNinja.isBookOpen=1;ArmorSaberNinja.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_KOBUTA) {ArmorSaberKobuta.isBookOpen=1;ArmorSaberKobuta.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_HENZEL) {ArmorSaberHenzel.isBookOpen=1;ArmorSaberHenzel.isHenshin=1;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_BREMEN) {ArmorSaberBremen.isBookOpen=1;ArmorSaberBremen.isHenshin=1;}
	}
	public void CloseBook(EntityPlayer playerIn)
	{
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_DRAGON) {ArmorSaberDragon.isBookOpen=0;ArmorSaberDragon.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_PEGASAS) {ArmorSaberPegasas.isBookOpen=0;ArmorSaberPegasas.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_CERBERUS) {ArmorSaberCerberus.isBookOpen=0;ArmorSaberCerberus.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_GENBU) {ArmorSaberGenbu.isBookOpen=0;ArmorSaberGenbu.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_JAAKUDRAGON) {ArmorSaberJaakuDragon.isBookOpen=0;ArmorSaberJaakuDragon.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_PHOENIX) {ArmorSaberPhoenix.isBookOpen=0;ArmorSaberPhoenix.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_SIREN) {ArmorSaberSiren.isBookOpen=0;ArmorSaberSiren.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_EAGLE) {ArmorSaberEagle.isBookOpen=0;ArmorSaberEagle.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_LION) {ArmorSaberLion.isBookOpen=0;ArmorSaberLion.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_HEDGEHOG) {ArmorSaberHedgehog.isBookOpen=0;ArmorSaberHedgehog.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_SAIYUU) {ArmorSaberSaiyuu.isBookOpen=0;ArmorSaberSaiyuu.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_PETER) {ArmorSaberPeter.isBookOpen=0;ArmorSaberPeter.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_ARANGINA) {ArmorSaberArangina.isBookOpen=0;ArmorSaberArangina.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_JACKUN) {ArmorSaberJackun.isBookOpen=0;ArmorSaberJackun.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_NINJA) {ArmorSaberNinja.isBookOpen=0;ArmorSaberNinja.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_KOBUTA) {ArmorSaberKobuta.isBookOpen=0;ArmorSaberKobuta.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_HENZEL) {ArmorSaberHenzel.isBookOpen=0;ArmorSaberHenzel.isHenshin=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_BREMEN) {ArmorSaberBremen.isBookOpen=0;ArmorSaberBremen.isHenshin=0;}
	}
}