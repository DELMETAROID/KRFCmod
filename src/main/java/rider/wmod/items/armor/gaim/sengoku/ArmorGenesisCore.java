package rider.wmod.items.armor.gaim.sengoku;

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
import rider.wmod.rendering.models.items.gaim.ModelGenesisCore;
import rider.wmod.util.IHasModel;

public class ArmorGenesisCore extends ItemArmor implements IHasModel
{
	public static int DriverCheck=0;
	public static int isInvisible=0;

	public ArmorGenesisCore(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelGenesisCore model = new ModelGenesisCore();
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
		
		//		ItemStack itemstack2 = new ItemStack(ItemInit.FOURZE_LEVER,1);

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
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_GAIM
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_BARON
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_RYUGEN
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_ZANGETSU
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_KUROKAGE
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_GRIDON
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_BRAVO
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_KNUCKLE
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_MASS
					)
			{
					DriverCheck=1;
			}
			else 
			{ 		
				DriverCheck=0;
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
}