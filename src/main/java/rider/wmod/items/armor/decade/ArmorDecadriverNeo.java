package rider.wmod.items.armor.decade;

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
import rider.wmod.rendering.models.items.decade.ModelDecadriverNeo;
import rider.wmod.util.IHasModel;

public class ArmorDecadriverNeo extends ItemArmor implements IHasModel{

	public static int HaveCard=0;
	public static int isInvisible=0;

	public ArmorDecadriverNeo(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelDecadriverNeo model = new ModelDecadriverNeo();
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
		playerIn.swingArm(handIn);
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
		if(player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideDECADE
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideKUUGA
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideAGITO
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideRYUKI
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideFAIZ
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideBLADE
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideHIBIKI
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideKABUTO
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideDENO
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideKIVA
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideW
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideOOO
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideFOURZE
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideWIZARD
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideGAIM
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideDRIVE
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideGHOST
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideEXAID
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideBUILD
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.KamenRideZIO
		){
			HaveCard=1;			
		}else {
			HaveCard=0;			
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