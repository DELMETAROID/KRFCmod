package rider.wmod.items.armor.saber;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.saber.ModelSaberHenzel;
import rider.wmod.util.IHasModel;

public class ArmorSaberHenzel extends ItemArmor implements IHasModel{

	public static int isBookOpen=0;
	public static int isHenshin=0;
	public static int DriverCheck=0;
	public static int isInvisible=0;

	public ArmorSaberHenzel(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelSaberHenzel model = new ModelSaberHenzel();
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
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		
		ItemStack itemstack2 = new ItemStack(ItemInit.BATTOU_REKKA,1);
		ItemStack itemstack3 = new ItemStack(ItemInit.BATTOU_NAGARE,1);
		ItemStack itemstack4 = new ItemStack(ItemInit.BATTOU_IKAZUCHI,1);
		ItemStack itemstack5 = new ItemStack(ItemInit.BATTOU_KYOMU,1);
		ItemStack itemstack6 = new ItemStack(ItemInit.BATTOU_SHIKKOKU,1);
		//削除アイテム
		ItemStack eraseitem2 = this.findAmmo(playerIn,ItemInit.BATTOU_REKKA);
		ItemStack eraseitem3 = this.findAmmo(playerIn,ItemInit.BATTOU_NAGARE);
		ItemStack eraseitem4 = this.findAmmo(playerIn,ItemInit.BATTOU_IKAZUCHI);
		ItemStack eraseitem5 = this.findAmmo(playerIn,ItemInit.BATTOU_KYOMU);
		ItemStack eraseitem6 = this.findAmmo(playerIn,ItemInit.BATTOU_SHIKKOKU);
		ItemStack eraseitem22 = this.findAmmo(playerIn,ItemInit.SEIKEN_REKKA);
		ItemStack eraseitem33 = this.findAmmo(playerIn,ItemInit.SEIKEN_NAGARE);
		ItemStack eraseitem44 = this.findAmmo(playerIn,ItemInit.SEIKEN_IKAZUCHI);
		ItemStack eraseitem55 = this.findAmmo(playerIn,ItemInit.SEIKEN_KYOMU);
		ItemStack eraseitem66 = this.findAmmo(playerIn,ItemInit.SEIKEN_SHIKKOKU);

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_REKKA)
			{
				SetCloseBook(playerIn);
				ArmorSaberHenzel.isHenshin=0;
				ArmorSwordriverRekka.isSwordIn=1;
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
				itemstack.setCount(0);
				playerIn.inventory.deleteStack(eraseitem2);
				playerIn.inventory.deleteStack(eraseitem22);
				if (itemstack1.isEmpty()){}else {playerIn.dropItem(itemstack1,true);}
					if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.WRB_DRAGON)		
					{
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
					}else {
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
			}else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_NAGARE)
			{
				SetCloseBook(playerIn);
				ArmorSaberHenzel.isHenshin=0;
				ArmorSwordriverNagare.isSwordIn=1;
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
				itemstack.setCount(0);
				playerIn.inventory.deleteStack(eraseitem3);
				playerIn.inventory.deleteStack(eraseitem33);
				if (itemstack1.isEmpty()){}else {playerIn.dropItem(itemstack1,true);}
					if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.WRB_LION)		
					{
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack3);
					}else {
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
			}else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_IKAZUCHI)
			{
				SetCloseBook(playerIn);
				ArmorSaberHenzel.isHenshin=0;
				ArmorSwordriverIkazuchi.isSwordIn=1;
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
				itemstack.setCount(0);
				playerIn.inventory.deleteStack(eraseitem4);
				playerIn.inventory.deleteStack(eraseitem44);
				if (itemstack1.isEmpty()){}else {playerIn.dropItem(itemstack1,true);}
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_SHIKKOKU)
			{
				SetCloseBook(playerIn);
				ArmorSaberHenzel.isHenshin=0;
				ArmorSwordriverShikkoku.isSwordIn=1;
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
				itemstack.setCount(0);
				playerIn.inventory.deleteStack(eraseitem6);
				playerIn.inventory.deleteStack(eraseitem66);
				if (itemstack1.isEmpty()){}else {playerIn.dropItem(itemstack1,true);}
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack6);
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

	protected ItemStack findAmmo(EntityPlayer player,Item ammo)
	{
		if (this.isAmmo(player.getHeldItem(EnumHand.OFF_HAND),ammo))
		{
			return player.getHeldItem(EnumHand.OFF_HAND);
		}
		else if (this.isAmmo(player.getHeldItem(EnumHand.MAIN_HAND),ammo))
		{
			return player.getHeldItem(EnumHand.MAIN_HAND);
		}
		else
		{
			for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
			{
				ItemStack itemstack = player.inventory.getStackInSlot(i);

				if (this.isAmmo(itemstack,ammo))
				{
					return itemstack;
				}
			}

			return ItemStack.EMPTY;
		}
	}

	protected boolean isAmmo(ItemStack stack,Item ammo)
	{
		if(stack.getItem() == ammo) 
		{
			return true;
		}
		else
		{
			return false; 
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_REKKA
				||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_NAGARE
				||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_IKAZUCHI
				//				||player.inventory.armorItemInSlot(1).getItem()==ItemInit.BLADRIVER_KYOMU
				||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_SHIKKOKU)
		{DriverCheck=1;}else {DriverCheck=0;}

		if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_REKKA && ArmorSwordriverRekka.isHenshin==1
				||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_NAGARE && ArmorSwordriverNagare.isHenshin==1
				||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_IKAZUCHI && ArmorSwordriverIkazuchi.isHenshin==1
				//				||player.inventory.armorItemInSlot(1).getItem()==ItemInit.BLADRIVER_KYOMU && ArmorSwordriverRekka.isHenshin==1
				||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SWORDRIVER_SHIKKOKU && ArmorSwordriverShikkoku.isHenshin==1){}
		else {
			isBookOpen=0;
			isHenshin=0;	
		}

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
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
}