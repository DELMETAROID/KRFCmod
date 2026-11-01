package rider.wmod.items.armor.geats;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ArmorIDLetter extends Item//Armor
implements IHasModel{

	public static int isInvisible=0;
	public static int DriverCheck=0;
	public static int UpperBuckleIn=0;
	public static int LowerBuckleIn=0;	
	public static int Atk=0;
	public static int Def=0;
	public static int Spd=0;
	public static int Hst=0;
	public static int Jmp=0;
	public static int Atk_up=0;
	public static int Def_up=0;
	public static int Spd_up=0;
	public static int Hst_up=0;
	public static int Jmp_up=0;
	public static int Atk_dn=0;
	public static int Def_dn=0;
	public static int Spd_dn=0;
	public static int Hst_dn=0;
	public static int Jmp_dn=0;
	public static int isHenshin=0;

	public ArmorIDLetter(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.itembase"));
	}
	
	/*
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityliving,ItemStack itemstack,EntityEquipmentSlot armorslot,ModelBiped _default)
	{
		if(itemstack != ItemStack.EMPTY)
		{
			if(itemstack.getItem() instanceof ItemArmor)
			{
				ModelGeats model = new ModelGeats();
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

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER)
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
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER)
			{
				DriverCheck=1;
				Atk=Atk_up+Atk_dn;
				Def=Def_up+Def_dn;
				Spd=Spd_up+Spd_dn+1;
				Hst=Hst_up+Hst_dn;
				Jmp=Jmp_up+Jmp_dn;
				
				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByID(70), item) <= 0)
				{
					item.addEnchantment(Enchantment.getEnchantmentByID(70),1);
				}

				if(Atk>=1) {
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,10,Atk-1,true,false));
				}else if(Atk<0) {
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,10,(Atk*-1)-1,true,false));
				}

				if(Def>=1) {
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,10,Def-1,true,false));
				}else if(Def<0) {
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,10,(Def*-1)-1,true,false));
				}

				if(Spd>=1) {
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED,10,Spd-1,true,false));
				}else if(Spd<0) {
					player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,10,(Spd*-1)-1,true,false));
				}

				if(Hst>=1) {
					player.addPotionEffect(new PotionEffect(MobEffects.HASTE,10,Hst-1,true,false));
				}
				else if(Hst<0) {
					player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE,10,(Hst*-1)-1,true,false));
				}

				if(Jmp>=1) {
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,10,Jmp-1,true,false));
				}

				if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_HAMMER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_WATER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_ARROW
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SHIELD
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_CRAW
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_CHAINARRAY
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_DRILL
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_PROPELLER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SHOOTER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_BREAKER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_DUALER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_AX	
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SP	
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_KINGOHGER
						) 
				{
					UpperBuckleIn=1;
				}
				else if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_MAGNUM
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_ZOMBIE
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_NINJA
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_BEAT
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_MONSTER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_BOOST

						) {
					UpperBuckleIn=2;				
				}
				else
				{
					UpperBuckleIn=0;
					Atk_up=0;
					Def_up=0;
					Spd_up=0;
					Hst_up=0;
					Jmp_up=0;
				}

				if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_HAMMER_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_WATER_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_ARROW_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SHIELD_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_CRAW_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_CHAINARRAY_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_DRILL_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_PROPELLER_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SHOOTER_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_BREAKER_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_DUALER_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_AX_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SP_R
						) 
				{
					LowerBuckleIn=1;
				}
				else if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_MAGNUM_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_ZOMBIE_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_NINJA_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_BEAT_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_MONSTER_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_BOOST_R
						||player.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_KINGOHGER_R
						)
				{
					LowerBuckleIn=2;				
				}
				else
				{
					LowerBuckleIn=0;
					Atk_dn=0;
					Def_dn=0;
					Spd_dn=0;
					Hst_dn=0;
					Jmp_dn=0;
				}
			}
			else
			{
				DriverCheck=0;
				UpperBuckleIn=0;
				Atk_up=0;
				Def_up=0;
				Spd_up=0;
				Hst_up=0;
				Jmp_up=0;				
				LowerBuckleIn=0;
				Atk_dn=0;
				Def_dn=0;
				Spd_dn=0;
				Hst_dn=0;
				Jmp_dn=0;
			}
		}
		else
		{
			DriverCheck=0;
			UpperBuckleIn=0;
			Atk_up=0;
			Def_up=0;
			Spd_up=0;
			Hst_up=0;
			Jmp_up=0;				
			LowerBuckleIn=0;
			Atk_dn=0;
			Def_dn=0;
			Spd_dn=0;
			Hst_dn=0;
			Jmp_dn=0;
		}


		if(UpperBuckleIn>0||LowerBuckleIn>0)
		{
			isHenshin=1;
		}

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}
	}	
	 */
}