package rider.wmod.items.armor.exaid;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ArmorExaidFumetsu extends Item
//Armor
implements IHasModel
{
	public static int DriverCheck=0;

	public ArmorExaidFumetsu(String name,CreativeTabs tab//,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn
			) {
		//		super(materialIn, 1, equipmentSlotIn);
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
	/*
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityliving,ItemStack itemstack,EntityEquipmentSlot armorslot,ModelBiped _default)
	{
		if(itemstack != ItemStack.EMPTY)
		{
			if(itemstack.getItem() instanceof ItemArmor)
			{
				ModelHawk model = new ModelHawk();
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
	 */

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
		//		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		
		//		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);


		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
			{
				playerIn.swingArm(handIn);
				playerIn.addPotionEffect(new PotionEffect(MobEffects.POISON,200,4,true,false));
				playerIn.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,200,4,true,false));
				ArmorGamerDriver.FumetsuFlag=1;
//				worldIn.newExplosion(playerIn, playerIn.posX,playerIn.posY+1, playerIn.posZ,0, true, true);
				/*				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
*/					itemstack.setCount(0);
				 					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				 /*				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
				  */
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else
		{
			/*		    playerIn.swingArm(handIn);
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.PLAYERS, 1.0F, 1.0F);
			playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,200,0));
			 */			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}
	/*
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
			{
				DriverCheck=1;
			}
			else
			{
				DriverCheck=0;
			}
		}else
		{
			DriverCheck=0;
		}
		if(player.inventory.armorItemInSlot(0) != null)
		{
			if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.BottleTANK)
			{
				InOrganicSideCheck=1;
				LegendCheck=0;
			}
			else if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.BottleMEDAL)
			{
				InOrganicSideCheck=0;
				LegendCheck=1;
			}
			else
			{
				InOrganicSideCheck=0;
				LegendCheck=0;
			}
		}
		else
		{
			InOrganicSideCheck=0;
			LegendCheck=0;
		}
	}*/

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.cannotequip"));
		tooltip.add(I18n.format("tantai.fumetsu"));
	}
}