package rider.wmod.items.armor.exaid;

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
import rider.wmod.rendering.models.items.exaid.ModelExaidMinecraft;
import rider.wmod.util.IHasModel;

public class ArmorExaidMinecraft extends ItemArmor implements IHasModel{

	public static int DriverCheck=0;
	public static int isInvisible=0;
	public static int DoublegashatIn=0;

	public ArmorExaidMinecraft(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelExaidMinecraft model = new ModelExaidMinecraft();
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

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
			{
				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatRidePlayer)
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
			else if(playerIn.inventory.armorItemInSlot(1).isEmpty())
			{
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
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
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
			{
				DriverCheck=1;
				player.addPotionEffect(new PotionEffect(MobEffects.LUCK,1,100,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING,1,100,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST,1,100,true,false));
				
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatBROTHERS
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatFIGHTER2

						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatDUAL
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatPUZZLE
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatFIGHTER
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatDUAL_BETA
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatFANTASY
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatSIMULATIONS
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatDUAL_ANOTHER
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatPUZZLE_ANOTHER
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatFIGHTER_ANOTHER

						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMAXIMUM
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatGODMAXIMUM
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMUSOU
						||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMAXIMUM_ZOMBIE
						)
				{
					DoublegashatIn=1;
				}
				else
				{
					DoublegashatIn=0;
				}
				
			}
			else
			{
				DriverCheck=0;
				DoublegashatIn=0;
			}
		}
		else
		{
			DriverCheck=0;
			DoublegashatIn=0;
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