package rider.wmod.items.armor.saber;

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
import rider.wmod.rendering.models.items.saber.ModelSwordriverIkazuchi;
import rider.wmod.util.IHasModel;
	
public class ArmorSwordriverIkazuchi extends ItemArmor implements IHasModel{

	public static int isSwordIn=1;
	public static int isHenshin=0;
	public static int isHenshinL=0;
	public static int isHenshinC=0;
	public static int isInvisible=0;

	public ArmorSwordriverIkazuchi(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelSwordriverIkazuchi model = new ModelSwordriverIkazuchi();
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

		isSwordIn=1;
		isHenshin=0;
		playerIn.swingArm(handIn);
		CloseBook(playerIn);
		if (itemstack1.isEmpty())
		{
			playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
			itemstack.setCount(0);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
		else
		{

			playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
			itemstack.setCount(0);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
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
//		if(ArmorSwordriverIkazuchi.isSwordIn==1 && findAmmo(player,ItemInit.SEIKEN_IKAZUCHI).getItem() == ItemInit.SEIKEN_IKAZUCHI) 
//		{
//			isSwordIn=0;
//		}
		
		if(player.inventory.armorItemInSlot(0).getItem()!=null) 
		{ 
			if(player.inventory.armorItemInSlot(0).getItem()!=ItemInit.WRB_ARANGINA) {
				isHenshin=0;
				isHenshinL=0;
				isHenshinC=0;
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
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.ikazuchi"));
	}
}