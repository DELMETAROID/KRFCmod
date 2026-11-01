package rider.wmod.items.weapon.saber;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
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

public class ItemSeikenNagare extends ItemSword implements IHasModel
{
	public ItemSeikenNagare(String name,ToolMaterial material,CreativeTabs tab)
	{
		super(material);
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
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack driver =new ItemStack(ItemInit.SWORDRIVER_NAGARE,1);
		ItemStack battou =new ItemStack(ItemInit.BATTOU_NAGARE,1);

		EntityEquipmentSlot entityequipmentslot1 = EntityLiving.getSlotForItemStack(driver);

		if(playerIn.isSneaking() && playerIn.inventory.armorItemInSlot(1).getItem()!= null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_NAGARE&& ArmorSwordriverNagare.isSwordIn==0)
			{
				ArmorSwordriverNagare.isSwordIn=1;
				SetCloseBook(playerIn);
				itemstack.setCount(0);
				if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_LION)		
				{
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, battou);
				}else {
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, ItemStack.EMPTY);
				}
			}
			else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_REKKA && ArmorSwordriverRekka.isSwordIn==0
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_IKAZUCHI&& ArmorSwordriverIkazuchi.isSwordIn==0
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_SHIKKOKU&& ArmorSwordriverShikkoku.isSwordIn==0)
			{
				playerIn.setItemStackToSlot(entityequipmentslot1, driver);//スロットへ
				ArmorSwordriverNagare.isSwordIn=1;
				CloseBook(playerIn);
				itemstack.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, ItemStack.EMPTY);
			}
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
		else {
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}

	public void SetCloseBook(EntityPlayer playerIn)
	{
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_DRAGON) {ArmorSaberDragon.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_PEGASAS) {ArmorSaberPegasas.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_CERBERUS) {ArmorSaberCerberus.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_GENBU) {ArmorSaberGenbu.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_JAAKUDRAGON) {ArmorSaberJaakuDragon.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_PHOENIX) {ArmorSaberPhoenix.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_SIREN) {ArmorSaberSiren.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_EAGLE) {ArmorSaberEagle.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_LION) {ArmorSaberLion.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_HEDGEHOG) {ArmorSaberHedgehog.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_SAIYUU) {ArmorSaberSaiyuu.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_PETER) {ArmorSaberPeter.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_ARANGINA) {ArmorSaberArangina.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_JACKUN) {ArmorSaberJackun.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_NINJA) {ArmorSaberNinja.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_KOBUTA) {ArmorSaberKobuta.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_HENZEL) {ArmorSaberHenzel.isBookOpen=0;}
		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.WRB_BREMEN) {ArmorSaberBremen.isBookOpen=0;}
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