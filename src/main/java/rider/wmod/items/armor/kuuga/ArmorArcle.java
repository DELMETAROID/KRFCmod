
package rider.wmod.items.armor.kuuga;

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
import rider.wmod.rendering.models.items.kuuga.ModelKuugaGrowing;
import rider.wmod.util.IHasModel;

public class ArmorArcle extends ItemArmor implements IHasModel{

	public static int AmadamCheck=0;
	public static int AmadamCheckGrowing=0;
	public static int AmadamCheckMighty=0;
	public static int AmadamCheckDragon=0;
	public static int AmadamCheckPegasas=0;
	public static int AmadamCheckTitan=0;
	public static int isInvisible=0;
	int num;

	public ArmorArcle(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn,int sortnum) {
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
				ModelKuugaGrowing model = new ModelKuugaGrowing();
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
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if((player.inventory.armorItemInSlot(3).getItem()==ItemInit.AMADAM_RED
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.AMADAM_BLUE
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.AMADAM_GREEN
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.AMADAM_PURPLE))
			{
				AmadamCheck=1;

				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.AMADAM_RED)
				{
					AmadamCheckMighty=1;
				}else {
					AmadamCheckMighty=0;
				}

				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.AMADAM_BLUE)
				{
					AmadamCheckDragon=1;
				}else {
					AmadamCheckDragon=0;
				}

				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.AMADAM_GREEN)
				{
					AmadamCheckPegasas=1;
				}else {
					AmadamCheckPegasas=0;
				}

				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.AMADAM_PURPLE)
				{
					AmadamCheckTitan=1;
				}else {
					AmadamCheckTitan=0;
				}

				if(player.getHealth()<=5.0) 
				{
					if(player.getActivePotionEffect(MobEffects.REGENERATION)==null){
						world.playSound(player,player.posX,player.posY,player.posZ, SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, SoundCategory.PLAYERS, 0.5F, 1.0F);
						player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,180,2,true,true));
					}
					AmadamCheckGrowing=1;
					player.removePotionEffect(MobEffects.POISON);
					player.removePotionEffect(MobEffects.WITHER);
					player.removePotionEffect(MobEffects.NAUSEA);
					player.removePotionEffect(MobEffects.BLINDNESS);
				}
				else if(player.getHealth()>16.0) 
				{
					AmadamCheckGrowing=0;
				}
			}
			else
			{
				AmadamCheck=0;
				AmadamCheckGrowing=0;
			}
		}
		else
		{
			AmadamCheck=0;
			AmadamCheckGrowing=0;
		}

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}
	}

	public void setSortNum(int n)
	{
		num=n;
	}

	public int getSortNum() 
	{
		return num;
	}
}