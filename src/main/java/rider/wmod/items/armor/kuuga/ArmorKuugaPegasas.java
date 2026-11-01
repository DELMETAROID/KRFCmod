package rider.wmod.items.armor.kuuga;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.items.weapon.base.ItemBaseGun;
import rider.wmod.items.weapon.base.ItemBaseGunReloadable;
import rider.wmod.items.weapon.exaid.ItemGashaconBugviserGun;
import rider.wmod.rendering.models.items.kuuga.ModelKuugaPegasas;
import rider.wmod.util.IHasModel;

public class ArmorKuugaPegasas extends ItemArmor implements IHasModel{

	public static int ArcleCheck=0;
	public static int ArcleCheckRising=0;
	public static int ArcleCheckAmazing=0;
	public static int isInvisible=0;

	public static int list[]= {261,346};
	public static int list2[]= {23};

	public ArmorKuugaPegasas(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelKuugaPegasas model = new ModelKuugaPegasas();
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
		
		ItemStack holditem =playerIn.getHeldItemOffhand();
		ItemStack itemstack2 = new ItemStack(ItemInit.PEGASAS_BOWGUN, 1);
		ItemStack itemstack3 = new ItemStack(ItemInit.PEGASAS_BOWGUN_RISING, 1);

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_ULTIMATE	)
			{
				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					if(MophingItem(holditem,list)||MophingBlock(holditem,list2)||MophingItemKRFCmod(holditem))
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, itemstack2);
					}
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					if(MophingItem(holditem,list)||MophingBlock(holditem,list2)||MophingItemKRFCmod(holditem))
					{
						if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING
								||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING)
						{
							playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, itemstack3);
						}
						else
						{
							playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, itemstack2);
						}
					}
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


	public static Boolean MophingItem(ItemStack holding,int list[]) 
	{

		for (int i=0; i<=list.length-1; i++)
		{
			ItemStack compare = new ItemStack(Item.getItemById(list[i]),1);
			if(holding.isItemEqualIgnoreDurability(compare)) {
				return true;
			}
		}
		return false;
	}


	public static Boolean MophingBlock(ItemStack holding,int list[]) 
	{
		for (int i=0; i<=list.length-1; i++)
		{
			ItemStack compare = new ItemStack(Item.getItemFromBlock(Block.getBlockById(list[i])),1);
			if(holding.isItemEqualIgnoreDurability(compare)) {
				return true;
			}
		}
		return false;
	}

	public static Boolean MophingItemKRFCmod(ItemStack holding) 
	{
		ItemStack compare1 = new ItemStack(ItemInit.TRIGGER_MAGNUM,1);
		ItemStack compare2 = new ItemStack(ItemInit.TRIGGER_MAGNUM_M,1);
		ItemStack compare3 = new ItemStack(ItemInit.SCULL_MAGNUM,1);

		if(holding.isItemEqualIgnoreDurability(compare1)
				||holding.isItemEqualIgnoreDurability(compare2)
				||holding.isItemEqualIgnoreDurability(compare3)
				||holding.getItem() instanceof ItemBaseGun
				||holding.getItem() instanceof ItemBaseGunReloadable
				||holding.getItem() instanceof ItemGashaconBugviserGun) {
			return true;
		}		
		return false;
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE)
			{
				ArcleCheck=1;
				if(ArmorArcle.AmadamCheckGrowing==0) 
				{
					player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,220,1,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,1,-1,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS,1,1,true,false));

					if(player.isSneaking()) {
						player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1,-12,true,false));
					}
				}
			}
			else {
				ArcleCheck=0;
			} 


			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING)
			{
				ArcleCheckRising=1;

				player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,220,1,true,false));

				if(player.isSneaking()) {
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1,-12,true,false));
				}else {
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1,1,true,false));
				}

			}
			else
			{
				ArcleCheckRising=0;
			}

			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING)
			{
				ArcleCheckAmazing=1;
				player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,220,1,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.HASTE,1,1,true,false));

				if(player.isSneaking()) {
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1,-12,true,false));
				}else {
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1,1,true,false));
				}
			}
			else
			{
				ArcleCheckAmazing=0;
			}
		}
		else
		{
			ArcleCheck=0;
			ArcleCheckRising=0;
			ArcleCheckAmazing=0;
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
