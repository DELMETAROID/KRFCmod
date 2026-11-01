package rider.wmod.items.armor.exaid;

import java.util.List;
import java.util.Random;

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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.exaid.ModelExaidZombie;
import rider.wmod.util.IHasModel;

public class ArmorExaidZombie extends ItemArmor implements IHasModel{

	public static int DriverCheck=0;
	public static int DriverCheckBuggle=0;
	public static int GashatInOrigin=0;
	public static int isInvisible=0;
	public static int GashatLevel=10;
	public static int DoublegashatIn=0;
	public static int Atk=2;
	public static int Def=2;
	public static int Spd=0;
	public static int Hst=0;
	public static int Jmp=0;
	public Random rand = new Random();

	public ArmorExaidZombie(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelExaidZombie model = new ModelExaidZombie();
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
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.BUGGLE_DRIVER)
			{
				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					lvup(worldIn,playerIn,GashatLevel);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatRidePlayer)
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					lvup(worldIn,playerIn,GashatLevel);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					lvup(worldIn,playerIn,GashatLevel);
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

	protected static void lvup(World worldIn,EntityPlayer playerIn,int n)
	{
		if(playerIn.experienceLevel<n)
		{
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ,
					SoundEvents.ENTITY_PLAYER_LEVELUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
		}playerIn.experienceLevel=n;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
			{
				DriverCheck=1;
				DriverCheckBuggle=0;
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION) {
					ArmorExaidAction.Atk_gst2=0;
					ArmorExaidAction.Def_gst2=0;
					ArmorExaidAction.Spd_gst2=0;
					ArmorExaidAction.Hst_gst2=0;
					ArmorExaidAction.Jmp_gst2=0;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMAXIMUM) {
					ArmorExaidMAX.Atk_gst2=0;
					ArmorExaidMAX.Def_gst2=0;
					ArmorExaidMAX.Spd_gst2=0;
					ArmorExaidMAX.Hst_gst2=0;
					ArmorExaidMAX.Jmp_gst2=0;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatNOVEL) {
					ArmorExaidNovel.Atk_gst2=0;
					ArmorExaidNovel.Def_gst2=0;
					ArmorExaidNovel.Spd_gst2=0;
					ArmorExaidNovel.Hst_gst2=0;
					ArmorExaidNovel.Jmp_gst2=0;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION_Proto) {
					ArmorExaidActionProto.Atk_gst2=0;
					ArmorExaidActionProto.Def_gst2=0;
					ArmorExaidActionProto.Spd_gst2=0;
					ArmorExaidActionProto.Hst_gst2=0;
					ArmorExaidActionProto.Jmp_gst2=0;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION_Origin) {
					ArmorExaidActionOrigin.Atk_gst2=Atk;
					ArmorExaidActionOrigin.Def_gst2=Def;
					ArmorExaidActionOrigin.Spd_gst2=Spd;
					ArmorExaidActionOrigin.Hst_gst2=Hst;
					ArmorExaidActionOrigin.Jmp_gst2=Jmp;
					GashatInOrigin=1;
				}else {
					GashatInOrigin=0;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatGODMAXIMUM) {
					ArmorExaidGOD.Atk_gst2=0;
					ArmorExaidGOD.Def_gst2=0;
					ArmorExaidGOD.Spd_gst2=0;
					ArmorExaidGOD.Hst_gst2=0;
					ArmorExaidGOD.Jmp_gst2=0;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMAXIMUM_ZOMBIE) {
					ArmorExaidZombieMAX.Atk_gst2=0;
					ArmorExaidZombieMAX.Def_gst2=0;
					ArmorExaidZombieMAX.Spd_gst2=0;
					ArmorExaidZombieMAX.Hst_gst2=0;
					ArmorExaidZombieMAX.Jmp_gst2=0;
				}
				if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatRidePlayer) {	}

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
			else if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.BUGGLE_DRIVER) 
			{
				DriverCheck=0;
				DoublegashatIn=0;
				if(player.getHealth()<3) {
					DriverCheckBuggle=2;
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,3,3,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,3,3,true,false));
					world.spawnParticle(EnumParticleTypes.SPELL_WITCH, player.posX+rand.nextDouble()-0.5, player.posY+rand.nextDouble() * 2.0D, player.posZ+rand.nextDouble()-0.5,0, 0.0D,0);
				}
				else {
					DriverCheckBuggle=1;
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,2,2,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,2,2,true,false));
				}	
			}
			else
			{
				DriverCheck=0;
				DoublegashatIn=0;
				DriverCheckBuggle=0;
				GashatInOrigin=0;
			}
		}
		else
		{
			DriverCheck=0;
			DoublegashatIn=0;
			DriverCheckBuggle=0;
			GashatInOrigin=0;
		}

		if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
		{
			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION_Origin
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatGODMAXIMUM
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMAXIMUM_ZOMBIE
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatBIKE_TURBO){}
			else {
				player.addPotionEffect(new PotionEffect(MobEffects.WITHER,200,3,true,true));
			}
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
		if(DriverCheckBuggle==2) {
			tooltip.add(I18n.format("Level X"));
		}else {
			tooltip.add(I18n.format("Level %d",GashatLevel));
		}
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