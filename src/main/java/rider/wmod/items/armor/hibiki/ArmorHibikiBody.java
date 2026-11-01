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
import rider.wmod.init.MetaItemInit;
import rider.wmod.rendering.models.items.hibiki.ModelHibikiBody;
import rider.wmod.util.IHasModel;

public class ArmorHibikiBody extends ItemArmor implements IHasModel{

	public static int HaveOngekiko=0;
	public static int isCrimson=0;
	public static int BeltCheck=0;
	public static int isInvisible=0;

	public ArmorHibikiBody(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelHibikiBody model = new ModelHibikiBody();
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

		if(player.inventory.armorItemInSlot(3) != null)
		{
			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.HIBIKI_HEAD_KURENAI)
			{
				isCrimson=1;
			}
			else
			{
				isCrimson=0;
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1,1,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,1,0,true,false));
				
				if(player.getHeldItemMainhand().getItem()==MetaItemInit.ONGEKIBOU
						&& player.getHeldItemOffhand().getItem()==MetaItemInit.ONGEKIBOU) {}
				else{
					player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE,1,0,true,false));
				}

				if(player.isSprinting()) {
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1,1,true,false));
				}
			}
		}
		else
		{
			isCrimson=0;
		}

		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_ULTIMATE
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.V_BUCKLE
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.V_BUCKLE_GOLD
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.BLABUCKLE_BELT
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
