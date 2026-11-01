package rider.wmod.items.armor.exaid;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
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
import rider.wmod.rendering.models.items.exaid.ModelExaidActionProto;
import rider.wmod.util.IHasModel;

public class ArmorExaidActionProto extends ItemArmor implements IHasModel{

	public static int DriverCheckAction=0;
	public static int Level1CheckAction=0;
	public static int isInvisible=0;
	public static int GashatLevel=2;
	public static int Atk=1;
	public static int Def=0;
	public static int Spd=1;
	public static int Hst=0;
	public static int Jmp=1;
	public static int Atk_gst1=1;
	public static int Def_gst1=0;
	public static int Spd_gst1=1;
	public static int Hst_gst1=0;
	public static int Jmp_gst1=1;
	public static int Atk_gst2=0;
	public static int Def_gst2=0;
	public static int Spd_gst2=0;
	public static int Hst_gst2=0;
	public static int Jmp_gst2=0;

	public ArmorExaidActionProto(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelExaidActionProto model = new ModelExaidActionProto();
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
		
		ItemStack lv1armor = new ItemStack(ItemInit.LV1_ACTION_Proto, 1);
		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(lv1armor);
		
//		ItemStack itemstack4 = new ItemStack(ItemInit.Gashacon_Breaker_blade, 1);

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
			{
				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					if(!playerIn.isSneaking())
					{
						lv1henshin(worldIn, playerIn, lv1armor);
					}else{
						lvup(worldIn,playerIn,GashatLevel);
					}
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatRidePlayer)
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					if(!playerIn.isSneaking())
					{
						lv1henshin(worldIn, playerIn, lv1armor);
					}else{
						lvup(worldIn,playerIn,GashatLevel);
					}
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
				DriverCheckAction=1;
				GashatEffect(world, player,Atk_gst1,Def_gst1,Spd_gst1,Hst_gst1,Jmp_gst1,Atk_gst2,Def_gst2,Spd_gst2,Hst_gst2,Jmp_gst2);
				if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatROBOT
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatBEAT
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatCOMBAT
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatCHAMBARA
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatSPORTS
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatHUNTER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatHUNTER_FANG
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatHUNTER_BLADE
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatHUNTER_GUN
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatHUNTER_CRAW
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatBURGER
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatSAFARI
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatTANK
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatZOMBIE
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatCHROCICLE
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatCRISIS
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatMINECRAFT
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatMUTEKI
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatFUMETSU

						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatBIKE_Proto
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatBIKE_Proto_Combi
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatROBOT_Proto
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatBEAT_Proto
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatCOMBAT_Proto
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatCHAMBARA_Proto
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatSPORTS_Proto
						||player.inventory.armorItemInSlot(2).getItem()==ItemInit.GashatHUNTER_Proto
						){}
				else{
					Atk_gst2=0;
					Def_gst2=0;
					Spd_gst2=0;
					Hst_gst2=0;
					Jmp_gst2=0;
				}
			}
			else
			{
				DriverCheckAction=0;
			}
		}
		else
		{
			DriverCheckAction=0;
		}

		if(player.inventory.armorItemInSlot(2) != null)
		{
			if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.LV1_ACTION_Proto)
			{
				Level1CheckAction=1;
			}
			else
			{
				Level1CheckAction=0;
			}
		}else {
			Level1CheckAction=0;
		}

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}
	}
	
	protected static void GashatEffect(World worldIn,EntityPlayer player,int atk1,int def1, int spd1, int hst1, int jmp1,int atk2,int def2, int spd2, int hst2, int jmp2)
	{
		Atk=atk1+atk2;
		Def=def1+def2;
		Spd=spd1+spd2;
		Hst=hst1+hst2;
		Jmp=jmp1+jmp2;
		
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
	}	
	
	
	protected void lv1henshin(World worldIn,EntityPlayer playerIn,ItemStack lv1armor)
	{
		playerIn.inventory.deleteStack(this.findAmmo(playerIn,lv1armor.getItem()));
		playerIn.setItemStackToSlot(EntityEquipmentSlot.CHEST, lv1armor.copy());
		lvup(worldIn, playerIn, 1);
	}

	protected static void lvup(World worldIn,EntityPlayer playerIn,int n)
	{
		if(playerIn.experienceLevel<n)
		{
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ,
					SoundEvents.ENTITY_PLAYER_LEVELUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
		}playerIn.experienceLevel=n;
	}
	
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
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("Level %d",GashatLevel));
			tooltip.add(I18n.format("ATK %d",Atk));
			tooltip.add(I18n.format("DEF %d",Def));	
			tooltip.add(I18n.format("SPD %d",Spd));
			tooltip.add(I18n.format("HST %d",Hst));
			tooltip.add(I18n.format("JMP %d",Jmp));
	}
}