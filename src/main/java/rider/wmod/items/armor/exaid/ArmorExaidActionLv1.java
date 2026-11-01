package rider.wmod.items.armor.exaid;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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
import rider.wmod.rendering.models.items.exaid.ModelExaidActionLv1;
import rider.wmod.util.IHasModel;
import rider.wmod.util.Reference;

public class ArmorExaidActionLv1 extends ItemArmor implements IHasModel{

	public static int DriverCheckActionlv1=0;
	public static int GashatCheckActionlv1=0;
	public static int isInvisible=0;

	public ArmorExaidActionLv1(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Blocks.BARRIER.getCreativeTabToDisplayOn());
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
				ModelExaidActionLv1 model = new ModelExaidActionLv1();
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
		if(playerIn.inventory.armorItemInSlot(3) != null)
		{
			if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION)
			{
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
				itemstack.setCount(0);
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
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
				DriverCheckActionlv1=1;
			}
			else
			{
				DriverCheckActionlv1=0;
			}
		}
		else
		{
			DriverCheckActionlv1=0;
		}
		if(player.inventory.armorItemInSlot(3) != null)
		{
			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION)
			{
				GashatCheckActionlv1=1;
				if(Keyboard.isKeyDown(Reference.ACTION_BUTTON))
				{
					ArmorExaidAction.lvup(world, player, 2);
					player.setItemStackToSlot(EntityEquipmentSlot.CHEST, ItemStack.EMPTY);
				}
			}
			else
			{
				GashatCheckActionlv1=0;
			}
		}
		else
		{
			GashatCheckActionlv1=0;
		}

		if(DriverCheckActionlv1==1 && GashatCheckActionlv1==1)
		{
			player.setInvisible(true);
		}
		else
		{
			player.setInvisible(false);
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