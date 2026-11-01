package rider.wmod.items.armor.agito;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.agito.ModelAgitoFlame;
import rider.wmod.util.IHasModel;

public class ArmorAgitoFlame extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public static int armorcheck=0;

	public ArmorAgitoFlame(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelAgitoFlame model = new ModelAgitoFlame();
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
		ItemStack altering = new ItemStack(ItemInit.ALTERING,1);
		ItemStack trinity = new ItemStack(ItemInit.ELEMENT_TRINITY,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(altering);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack driver = playerIn.getItemStackFromSlot(entityequipmentslot2);
		
		ItemStack itemstack2 = new ItemStack(ItemInit.FLAME_SABER,1);
		ItemStack itemstack3 = new ItemStack(ItemInit.STORM_HALBERD,1);

		if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ALTERING
				&&playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.ELEMENT_GROUND)
		{
			if(handIn==EnumHand.MAIN_HAND && playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==ItemInit.ELEMENT_STORM)
			{
				playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,itemstack3);
				playerIn.setItemStackToSlot(entityequipmentslot, trinity.copy());
			}else if(handIn==EnumHand.MAIN_HAND && playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==ItemInit.ELEMENT_FLAME)
			{
				playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,itemstack2);
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
			}
			else {
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
			}
			itemstack.setCount(0);
			if (!itemstack1.isEmpty())
			{
				playerIn.dropItem(itemstack1, true);
			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);

		}else {
			itemstack.setCount(0);
			if(worldIn.isRemote)
			{
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{	
		if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.ALTERING 
				&& player.inventory.armorItemInSlot(3).getItem()==ItemInit.ELEMENT_GROUND)
		{
			armorcheck=1;
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1,1,true,false));
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,220,1,true,false));
		}else {
			armorcheck=0;
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