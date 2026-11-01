package rider.wmod.items.armor.gaim.ls;

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
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriver;
import rider.wmod.rendering.models.items.gaim.ModelJimberCherry;
import rider.wmod.util.IHasModel;

public class ArmorJimberCherry extends ItemArmor implements IHasModel{

	public static int DriverCheck=0;
	public static int isInvisible=0;

	public ArmorJimberCherry(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelJimberCherry model = new ModelJimberCherry();
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
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack arms_weapon = new ItemStack(ItemInit.AW_SONIC_ARROW, 1);

		if(ArmorSengokuDriver.SengokuDriverCheck(playerIn)
				&&playerIn.inventory.armorItemInSlot(0) != null
				&&playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.GENESIS_CORE)
		{
			playerIn.swingArm(handIn);
			ArmorSengokuDriver.deleteArmsWeapon(playerIn);
			playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());	
			itemstack.setCount(0);
			if (itemstack1.isEmpty())
			{
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,arms_weapon);
			}
			else
			{
				if(!worldIn.isRemote) 
				{
					playerIn.dropItem(itemstack1.getItem(), 1);
				}
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,arms_weapon);
			}
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(ArmorSengokuDriver.SengokuDriverCheck(player)&&(ArmorSengokuDriver.LSCheck(player)
				)&&player.inventory.armorItemInSlot(0).getItem()!=null
				&&player.inventory.armorItemInSlot(0).getItem()==ItemInit.GENESIS_CORE)
		{
			DriverCheck=1;
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED,10,2,true,false));
		}else 
		{ 		
			DriverCheck=0;
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