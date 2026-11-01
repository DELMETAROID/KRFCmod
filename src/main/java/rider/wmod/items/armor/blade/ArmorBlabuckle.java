package rider.wmod.items.armor.blade;

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
import rider.wmod.rendering.models.items.blade.ModelBlabuckle;
import rider.wmod.util.IHasModel;

public class ArmorBlabuckle extends ItemArmor implements IHasModel{

	public static int TurnUp=0;
	public static int isInvisible=0;

	public ArmorBlabuckle(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelBlabuckle model = new ModelBlabuckle();
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
		ItemStack itemstack2 = new ItemStack(ItemInit.BLADE_TURN_UP, 1);

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
			playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, itemstack1);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(3) != null)
		{
			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.SPADE_A)
			{
				TurnUp=1;
	//			if(!world.isRemote && Keyboard.isKeyDown(Keyboard.KEY_C))
	//			{
	//				HenshinCancel(world, player, EnumHand.MAIN_HAND);
	//			}
			}
			else
			{
				TurnUp=0;
			}
		}
		else
		{
			TurnUp=0;
		}

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}
	}

/*	public void HenshinCancel(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack belt_blade =new ItemStack(ItemInit.BLABUCKLE_BELT,1);
		ItemStack buckle_blade =new ItemStack(ItemInit.BLABUCKLE_ITEM,1);
		ItemStack spade_a =new ItemStack(ItemInit.SPADE_A,1);
		
		EntityEquipmentSlot belt = EntityLiving.getSlotForItemStack(belt_blade);
		EntityEquipmentSlot ace = EntityLiving.getSlotForItemStack(spade_a);
		ItemStack wearingace = playerIn.getItemStackFromSlot(ace);
		ItemStack erase_blade = this.findAmmo(playerIn,ItemInit.BLAROUSER);

		if(playerIn.inventory.armorItemInSlot(3).getItem()!=null)
		{
			if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.SPADE_A)
			{
				ArmorBlade.isHenshin=0;
				playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,buckle_blade.copy());
				playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,wearingace);
				playerIn.setItemStackToSlot(ace,ItemStack.EMPTY);
				playerIn.setItemStackToSlot(belt,ItemStack.EMPTY);
				playerIn.inventory.deleteStack(erase_blade);
				
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, SoundCategory.PLAYERS, 1.0F, 1.0F);;
			}
		}
	}
*/

	protected ItemStack findAmmo(EntityPlayer player,Item ammo)
	{
		if (this.isAmmo(player.getHeldItem(EnumHand.OFF_HAND),ammo))
		{
			return player.getHeldItem(EnumHand.OFF_HAND);
		}
		else if (this.isAmmo(player.getHeldItem(EnumHand.MAIN_HAND),ammo))
		{
			return player.getHeldItem(EnumHand.MAIN_HAND);
		}
		else
		{
			for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
			{
				ItemStack itemstack = player.inventory.getStackInSlot(i);

				if (this.isAmmo(itemstack,ammo))
				{
					return itemstack;
				}
			}

			return ItemStack.EMPTY;
		}
	}

	protected boolean isAmmo(ItemStack stack,Item ammo)
	{
		if(stack.getItem() == ammo) 
		{
			return true;
		}
		else
		{
			return false; 
		}
	}

//	@Override
//	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
//		tooltip.add(I18n.format("tip.c_to_henshin_cancel"));
//	}	
}