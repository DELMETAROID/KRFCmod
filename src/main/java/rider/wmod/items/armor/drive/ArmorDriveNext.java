package rider.wmod.items.armor.drive;

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
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.drive.ModelDriveNext;
import rider.wmod.util.IHasModel;

public class ArmorDriveNext extends ItemArmor implements IHasModel{

	public static int DriverCheck=0;
	public static int SetShiftcar=0;
	public static int isInvisible=0;

	public ArmorDriveNext(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelDriveNext model = new ModelDriveNext();
				model.bipedBody.showModel =armorslot ==EntityEquipmentSlot.HEAD;
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

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DRIVE_DRIVER)
			{
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
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.DRIVE_DRIVER)
			{
				DriverCheck=1;
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1,1,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.HASTE,1,1,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED,2,2,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,1,1,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,1,1,true,false));
				if(player.isSprinting()) {
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED,3,3,true,false));
				}
				if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftFLARE
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftSPIKE
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftSHADOW
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftHUNTER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftDOCTOR
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftBRAVER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftDUMP
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftMIXER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftGRAVITY
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftMONSTER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftWRECKER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftTRAVELER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftVEGAS
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftCAB
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftCIRCUS
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftSOLAR
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftWINTER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.ShiftCM
						) 
				{
					SetShiftcar=1;
				}else 
				{
					SetShiftcar=0;
				}				
			}
			else
			{
				DriverCheck=0;
				SetShiftcar=0;
			}
		}
		else
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
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.shiftnext"));
	}
}