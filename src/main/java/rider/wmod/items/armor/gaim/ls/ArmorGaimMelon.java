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
import rider.wmod.rendering.models.items.gaim.ModelArmsMelon;
import rider.wmod.util.IHasModel;

public class ArmorGaimMelon extends ItemArmor implements IHasModel{

	public static int DriverCheck=0;
	public static int isInvisible=0;

	public ArmorGaimMelon(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelArmsMelon model = new ModelArmsMelon();
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
		
		ItemStack arms_weapon = new ItemStack(ItemInit.AW_MELON, 1);
		ItemStack musou_saber = new ItemStack(ItemInit.AW_MUSOU_SABER, 1);

		if(ArmorSengokuDriver.SengokuDriverCheck(playerIn))
		{
			playerIn.swingArm(handIn);
			ArmorSengokuDriver.deleteArmsWeapon(playerIn);
			playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());	
			itemstack.setCount(0);

			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_GAIM
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_ZANGETSU
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_BUJIN_GAIM)
			{
				playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,musou_saber);
			}

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
		if(ArmorSengokuDriver.SengokuDriverCheck(player))
		{
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,10,1,true,false));
			if(player.getFoodStats().needFood())
			{
				player.getFoodStats().setFoodLevel(player.getFoodStats().getFoodLevel()+1);
				item.damageItem(this.getDamage(item)-10, player);
			}
			if((player.inventory.armorItemInSlot(0).getItem()==ItemInit.GENESIS_CORE)
					&&(player.inventory.armorItemInSlot(2).getItem()==ItemInit.JIMBER_LEMON
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.JIMBER_CHERRY
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.JIMBER_PEACH
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.JIMBER_MELON
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.JIMBER_MATSUBOKKURI
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.JIMBER_MARRON
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.JIMBER_DRAGON
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.JIMBER_BLACK
							))
			{
				DriverCheck=3;
			}
			else
			{
				DriverCheck=1;
			}
		}
		else if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_STUDY)
		{
			DriverCheck=2;
			if(player.getFoodStats().needFood())
			{
				player.getFoodStats().setFoodLevel(player.getFoodStats().getFoodLevel()+1);
				item.damageItem(this.getDamage(item)-10, player);
			}
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