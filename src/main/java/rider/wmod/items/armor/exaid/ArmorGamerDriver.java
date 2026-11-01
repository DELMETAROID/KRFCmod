package rider.wmod.items.armor.exaid;

import java.util.Random;

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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.exaid.ModelGamerDriver;
import rider.wmod.util.IHasModel;

public class ArmorGamerDriver extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public static int gashatIn=0;
	public static int gashatIn2=0;
	public static int DoublegashatIn=0;

	public static int level1checkDriver=0;
	public static int checkRidePlayer=0;
	public static int MutekiFlag=0;
	public static int FumetsuFlag=0;

	public ArmorGamerDriver(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelGamerDriver model = new ModelGamerDriver();

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
		if(player.inventory.armorItemInSlot(3) != null)
		{
			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatQUEST
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatSHOOTING
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatBIKE
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatBIKE_TURBO
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION_Proto
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatQUEST_Proto
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatSHOOTING_Proto
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatBIKE_Proto
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION_Origin
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatLEGACY
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatNINJA
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatCREATOR

					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatBROTHERS
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
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatNOVEL
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMUSOU
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatMAXIMUM_ZOMBIE
					)
			{
				gashatIn=1;

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
			else
			{
				gashatIn=0;
				DoublegashatIn=0;
			}

			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatRidePlayer)
			{
				checkRidePlayer=1;
			}
			else
			{
				checkRidePlayer=0;
			}

			if(MutekiFlag==1)
			{
				double xr = new Random().nextDouble();
				double yr = new Random().nextDouble();
				double zr = new Random().nextDouble();
				int xrr = new Random().nextInt(2);
				int yrr = new Random().nextInt(2);
				int zrr = new Random().nextInt(2);
				world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX-0.5+xr*xrr,player.posY+yr*yrr+1, player.posZ-0.5+zr*zrr,0,1,0.647,0,1);
				PotionEffect mutekieffect = player.getActivePotionEffect(MobEffects.RESISTANCE);
				if(mutekieffect!=null)
				{
				}else {
					MutekiFlag=0;
				}
			}
			
			if(FumetsuFlag==1)
			{
				double xr = new Random().nextDouble();
				double yr = new Random().nextDouble();
				double zr = new Random().nextDouble();
				int xrr = new Random().nextInt(2);
				int yrr = new Random().nextInt(2);
				int zrr = new Random().nextInt(2);
				world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX-0.5+xr*xrr,player.posY+yr*yrr+1, player.posZ-0.5+zr*zrr, 0, 0,0, null);
				PotionEffect mutekieffect = player.getActivePotionEffect(MobEffects.RESISTANCE);
				if(mutekieffect!=null)
				{
				}else {
					FumetsuFlag=0;
				}
			}
		}

		if(player.inventory.armorItemInSlot(2) != null)
		{
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
					)
			{
				gashatIn2=1;
			}
			else
			{
				gashatIn2=0;
			}
		}


		if(player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(3) != null)
		{
			if((player.inventory.armorItemInSlot(2).getItem()==ItemInit.LV1_ACTION
					&&player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION)
/*					||(player.inventory.armorItemInSlot(2).getItem()==ItemInit.LV1_QUEST
					&&player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatQUEST)
					||(player.inventory.armorItemInSlot(2).getItem()==ItemInit.LV1_SHOOTING
					&&player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatSHOOTING)
					||(player.inventory.armorItemInSlot(2).getItem()==ItemInit.LV1_BIKE
					&&player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatBIKE)
*/					||(player.inventory.armorItemInSlot(2).getItem()==ItemInit.LV1_ACTION_Proto
					&&player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatACTION_Proto)
/*					||(player.inventory.armorItemInSlot(2).getItem()==ItemInit.LV1_QUEST
					&&player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatQUEST)
					||(player.inventory.armorItemInSlot(2).getItem()==ItemInit.LV1_SHOOTING
					&&player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatSHOOTING)
					||(player.inventory.armorItemInSlot(2).getItem()==ItemInit.LV1_BIKE
					&&player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatBIKE)
					||(player.inventory.armorItemInSlot(2).getItem()==ItemInit.LVX_DOUBLE_ACTION
					&&player.inventory.armorItemInSlot(3).getItem()==ItemInit.GashatBROTHERS)
*/					)
			{
				level1checkDriver=1;
			}
			else
			{
				level1checkDriver=0;
			}
		}
		else
		{
			level1checkDriver=0;
		}

		if((gashatIn==1 && level1checkDriver==1) || isInvisible==1)
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