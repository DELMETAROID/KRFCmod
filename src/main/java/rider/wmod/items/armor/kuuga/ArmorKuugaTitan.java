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
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.init.MetaItemInit;
import rider.wmod.rendering.models.items.kuuga.ModelKuugaTitan;
import rider.wmod.util.IHasModel;

public class ArmorKuugaTitan extends ItemArmor implements IHasModel{

	public static int ArcleCheck=0;
	public static int ArcleCheckRising=0;
	public static int ArcleCheckAmazing=0;
	public static int isInvisible=0;

	int list[]= {256,257,258,262,267,268,269,270,271,272,273,274,275,276,277,278,279,280,283,284,285,286,290,291,292,293,294,346,352,369,398,439,440};
	int list2[]= {50,69,75,76,83,198,323,425};

	public ArmorKuugaTitan(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelKuugaTitan model = new ModelKuugaTitan();
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
		ItemStack itemstack2 = new ItemStack(ItemInit.TITAN_SWORD, 1);
		ItemStack itemstack3 = new ItemStack(ItemInit.TITAN_SWORD_RISING, 1);

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


	private Boolean MophingItem(ItemStack holding,int list[]) 
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


	private Boolean MophingBlock(ItemStack holding,int list[]) 
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

	private Boolean MophingItemKRFCmod(ItemStack holding) 
	{
		ItemStack compare1 = new ItemStack(ItemInit.DRAGON_ROD,1);
		ItemStack compare2 = new ItemStack(ItemInit.DRAGON_ROD_RISING,1);
		ItemStack compare3 = new ItemStack(ItemInit.METAL_SHAFT,1);
		ItemStack compare4 = new ItemStack(ItemInit.GashaconBreaker_hammer,1);
		ItemStack compare5 = new ItemStack(ItemInit.GashaconBreakerProro_hammer,1);

		if(holding.isItemEqualIgnoreDurability(compare1)
				||holding.isItemEqualIgnoreDurability(compare2)
				||holding.isItemEqualIgnoreDurability(compare3)
				||holding.isItemEqualIgnoreDurability(compare4)
				||holding.isItemEqualIgnoreDurability(compare5)
				||holding.getItem() instanceof ItemSword) {
			return true;
		}

		for(int n=0;n<=16;n++) 
		{
			ItemStack compare6 = new ItemStack(MetaItemInit.COLORED_STICK,1,n);
			if(			holding.isItemEqualIgnoreDurability(compare6))
				return true;
		}
		
		for(int n=0;n<=257;n++) 
		{
			ItemStack compare7 = new ItemStack(MetaItemInit.ONGEKIBOU,1,n);
			if(holding.isItemEqualIgnoreDurability(compare7))
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
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1,1,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,1,1,true,false));
				}
			}
			else {
				ArcleCheck=0;
			} 


			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING)
			{
				ArcleCheckRising=1;
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,2,2,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,1,1,true,false));
			}
			else
			{
				ArcleCheckRising=0;
			}

			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING)
			{
				ArcleCheckAmazing=1;
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,3,3,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,2,2,true,false));
				if(player.isSprinting()) {
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED,0,0,true,false));
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
