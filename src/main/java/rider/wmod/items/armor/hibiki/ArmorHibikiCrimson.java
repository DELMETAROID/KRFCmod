package rider.wmod.items.armor.hibiki;

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
import rider.wmod.rendering.models.items.hibiki.ModelHibikiCrimson;
import rider.wmod.util.IHasModel;

public class ArmorHibikiCrimson extends ItemArmor implements IHasModel{

	public static int HaveOngekiko=0;
	public static int BeltCheck=0;
	public static int isInvisible=0;
	public static int HibikiCheck=0;

	public ArmorHibikiCrimson(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelHibikiCrimson model = new ModelHibikiCrimson();
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
		if(player.getHeldItemMainhand().getItem()==ItemInit.ONGEKIKO_KAEN
		|| player.getHeldItemOffhand().getItem()==ItemInit.ONGEKIKO_KAEN)
		{HaveOngekiko=1;}
		else{HaveOngekiko=0;}

		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,2,2,true,false));
		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,0,0,true,false));
		if(player.isSprinting()) {
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1,1,true,false));
		}
		
		if(player.inventory.armorItemInSlot(2) != null)
		{
			if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.HIBIKI_BODY)
			{
				HibikiCheck=1;
			}
			else
			{
				HibikiCheck=0;
			}
		}
		else
		{
			HibikiCheck=0;
		}
		
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.BLABUCKLE_BELT
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.GARRENBUCKLE_BELT
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.KABUTO_RIDERBELT
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.GATACK_RIDERBELT
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.DARKKABUTO_RIDERBELT
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.DOUBLE_DRIVER
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.OOO_DRIVER
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.OOO_DRIVER2
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.BUILD_DRIVER
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.ZIKU_DRIVER
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.MIRAI_DRIVER
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.QUIZ_DRIVER
					)
			{
				BeltCheck=1;
			}
			else
			{
				BeltCheck=0;
			}
		}
		else
		{
			BeltCheck=0;
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
