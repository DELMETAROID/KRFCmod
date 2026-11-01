package rider.wmod.items.armor.w;

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
import rider.wmod.rendering.models.items.w.ModelWMetal;
import rider.wmod.util.IHasModel;

public class ArmorWMetal extends ItemArmor implements IHasModel{
	public static int DriverCheck=0;
	public static int SoulSideCheck=0;
	public static int isInvisible=0;

	public ArmorWMetal(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelWMetal model = new ModelWMetal();

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
		ItemStack itemstack2 = new ItemStack(ItemInit.METAL_SHAFT, 1);

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DOUBLE_DRIVER)
			{
				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, itemstack2);
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
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.DOUBLE_DRIVER)
			{
				DriverCheck=1;
			}
			else {
				DriverCheck=0;
			}
		}

		if(player.inventory.armorItemInSlot(0) != null)
		{
			if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_HEAT
					||player.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_LUNA)
			{
				SoulSideCheck=1;
				if(DriverCheck==1)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,0,0,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,1,1,true,false));
				}
			}
			else if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_CYCLONE)
			{
				SoulSideCheck=1;
				if(DriverCheck==1)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,0,0,true,false));
				}
			}
			else {
				SoulSideCheck=0;
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
}
