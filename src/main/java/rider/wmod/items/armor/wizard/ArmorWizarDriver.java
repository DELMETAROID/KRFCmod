package rider.wmod.items.armor.wizard;

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
import rider.wmod.rendering.models.items.wizard.ModelWizarDriver;
import rider.wmod.util.IHasModel;

public class ArmorWizarDriver extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public static int DriverSide=0;

	public ArmorWizarDriver(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelWizarDriver model = new ModelWizarDriver();

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

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}

		if(player.getHeldItem(EnumHand.MAIN_HAND).getItem()!= null)
		{
			if(player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_FLAME
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_WATER
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_HURRICANE
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_LAND
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_DARK
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_BLACK

					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_FLAMEDRAGON
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_WATERDRAGON
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_HURRICANEDRAGON
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_LANDDRAGON
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_INFINITY
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_SPECIALLUSH
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_FINISH_STRIKE
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_DRIVERON
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_DRIVERON_WISE

					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_COMMON
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_ENGAGE
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_COPY
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_CONNECT
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_DEFEND
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_FLOWER
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_LIGHT
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_DRAGORISE
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_SPECIAL
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_BLIZARD
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_THUNDER
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_GRAVITY

					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_EXPLOSION
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_FALL
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_HOPE
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_COMMON_BLACK
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_ECLIPSE
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_HOLY
					||player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemInit.RING_FINALSTRIKE
					)
			{
				DriverSide=1;
			}
			else
			{
				DriverSide=0;
			}
		}else {
			DriverSide=0;
		}
	}
}