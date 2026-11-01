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
import rider.wmod.rendering.models.items.exaid.ModelExaidSafari;
import rider.wmod.util.IHasModel;

public class ArmorExaidSafari extends ItemArmor implements IHasModel{

	public static int DriverCheck=0;
	public static int isInvisible=0;
	public static int GashatLevel=4;
	public static int DoublegashatIn=0;
	public static int Atk=0;
	public static int Def=0;
	public static int Spd=0;
	public static int Hst=2;
	public static int Jmp=1;
	
	public ArmorExaidSafari(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelExaidSafari model = new ModelExaidSafari();
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
					gashatLevelUp(worldIn,playerIn,playerIn.experienceLevel,GashatLevel);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatRidePlayer)
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					gashatLevelUp(worldIn,playerIn,playerIn.experienceLevel,GashatLevel);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					gashatLevelUp(worldIn,playerIn,playerIn.experienceLevel,GashatLevel);
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

	public void gashatLevelUp(World worldIn, EntityPlayer playerIn, int playerlevel,int gashatlevel) 
	{
		if(playerlevel<gashatlevel)
		{
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ,
					SoundEvents.ENTITY_PLAYER_LEVELUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
		}
		playerIn.experienceLevel=gashatlevel;
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
			{
				DriverCheck=1;
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION) {
					ArmorExaidAction.Atk_gst2=Atk;
					ArmorExaidAction.Def_gst2=Def;
					ArmorExaidAction.Spd_gst2=Spd;
					ArmorExaidAction.Hst_gst2=Hst;
					ArmorExaidAction.Jmp_gst2=Jmp;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMAXIMUM) {
					ArmorExaidMAX.Atk_gst2=Atk;
					ArmorExaidMAX.Def_gst2=Def;
					ArmorExaidMAX.Spd_gst2=Spd;
					ArmorExaidMAX.Hst_gst2=Hst;
					ArmorExaidMAX.Jmp_gst2=Jmp;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatNOVEL) {
					ArmorExaidNovel.Atk_gst2=Atk;
					ArmorExaidNovel.Def_gst2=Def;
					ArmorExaidNovel.Spd_gst2=Spd;
					ArmorExaidNovel.Hst_gst2=Hst;
					ArmorExaidNovel.Jmp_gst2=Jmp;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION_Proto) {
					ArmorExaidActionProto.Atk_gst2=Atk;
					ArmorExaidActionProto.Def_gst2=Def;
					ArmorExaidActionProto.Spd_gst2=Spd;
					ArmorExaidActionProto.Hst_gst2=Hst;
					ArmorExaidActionProto.Jmp_gst2=Jmp;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION_Origin) {
					ArmorExaidActionOrigin.Atk_gst2=Atk;
					ArmorExaidActionOrigin.Def_gst2=Def;
					ArmorExaidActionOrigin.Spd_gst2=Spd;
					ArmorExaidActionOrigin.Hst_gst2=Hst;
					ArmorExaidActionOrigin.Jmp_gst2=Jmp;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatGODMAXIMUM) {
					ArmorExaidGOD.Atk_gst2=Atk;
					ArmorExaidGOD.Def_gst2=Def;
					ArmorExaidGOD.Spd_gst2=Spd;
					ArmorExaidGOD.Hst_gst2=Hst;
					ArmorExaidGOD.Jmp_gst2=Jmp;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMAXIMUM_ZOMBIE) {
					ArmorExaidZombieMAX.Atk_gst2=Atk;
					ArmorExaidZombieMAX.Def_gst2=Def;
					ArmorExaidZombieMAX.Spd_gst2=Spd;
					ArmorExaidZombieMAX.Hst_gst2=Hst;
					ArmorExaidZombieMAX.Jmp_gst2=Jmp;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatRidePlayer) {	
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
					}else if(Jmp<0) {
						player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,10,(Jmp*-1)-1,true,false));
					}
				}

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
			}else if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.BUGGLE_DRIVER_ZWEI)
			{
				player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,1,3,true,false));
				DriverCheck=2;
				DoublegashatIn=0;
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

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("Level %d",GashatLevel));
		if(Atk>=1||Atk<0) {
			tooltip.add(I18n.format("ATK %d",Atk));
		}
		if(Def>=1||Def<0) {
			tooltip.add(I18n.format("DEF %d",Def));	
		}
		if(Spd>=1||Spd<0) {
			tooltip.add(I18n.format("SPD %d",Spd));
		}
		if(Hst>=1||Hst<0) {
			tooltip.add(I18n.format("HST %d",Hst));
		}
		if(Jmp>=1||Jmp<0) {
			tooltip.add(I18n.format("JMP %d",Jmp));
		}
	}
}