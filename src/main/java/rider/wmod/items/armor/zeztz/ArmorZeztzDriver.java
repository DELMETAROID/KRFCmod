package rider.wmod.items.armor.zeztz;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.zeztz.ModelZeztzDriver;
import rider.wmod.util.IHasModel;
import rider.wmod.util.Reference;

public class ArmorZeztzDriver extends ItemArmor implements IHasModel{

	public static int isHenshin=0;
	public static int HenshinMode=0;
	public static int HenshinCount=0;
	public static int EyeCount=0;
	public static int ZeztzElement=0;
	public static int AnimationCount=0;
	public static int MaxAnimationCount=81;
	public static int AnimationCount2=0;
	public static int isInvisible=0;
	public static ItemStack capsem = ItemStack.EMPTY;

	public static int brightness=1;

	public ArmorZeztzDriver(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Blocks.BARRIER.getCreativeTabToDisplayOn());
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
				ModelZeztzDriver model = new ModelZeztzDriver();
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
		ArmorZeztzDriver.HenshinMode=0;

		playerIn.swingArm(handIn);
		isHenshin=0;
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

	public void ZeztzParticle(World world, EntityPlayer player, ItemStack item,int element)
	{
		double red=0.3;
		double green=0;
		double blue=0;
		if(element==1)	{red=0.4;green=0;blue=0;}
		else if(element==2)	{red=0;green=0;blue=0.5;}
		else if(element==3)	{red=0;green=0.4;blue=0;}
		else if(element==4)	{red=0.4;green=0;blue=0.4;}

		Vec3d aim =player.getLookVec();		
		float yawRad = player.rotationYaw * 0.017453292F;
		float pitchRad = player.rotationPitch * 0.017453292F;
		float cosYaw = MathHelper.cos(-yawRad - (float)Math.PI);
		float sinYaw = MathHelper.sin(-yawRad - (float)Math.PI);
		float cosPitch = -MathHelper.cos(-pitchRad);
		float sinPitch = MathHelper.sin(-pitchRad);
		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*0.35-aim.z*0.2,	player.posY+1.45+sinPitch* 0.35,	player.posZ+cosYaw * cosPitch*0.35+aim.x*0.2,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*0.35				 ,	player.posY+1.45+sinPitch* 0.35,	player.posZ+cosYaw * cosPitch*0.35				,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*0.35+aim.z*0.2,	player.posY+1.45+sinPitch* 0.35,	player.posZ+cosYaw * cosPitch*0.35-aim.x*0.2,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*0.35-aim.z*0.2,	player.posY+1.65+sinPitch* 0.35,	player.posZ+cosYaw * cosPitch*0.35+aim.x*0.2,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*0.35				 ,	player.posY+1.65+sinPitch* 0.35,	player.posZ+cosYaw * cosPitch*0.35				,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*0.35+aim.z*0.2,	player.posY+1.65+sinPitch* 0.35,	player.posZ+cosYaw * cosPitch*0.35-aim.x*0.2,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*0.35-aim.z*0.2,	player.posY+1.85+sinPitch* 0.35,	player.posZ+cosYaw * cosPitch*0.35+aim.x*0.2,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*0.35				 ,	player.posY+1.85+sinPitch* 0.35,	player.posZ+cosYaw * cosPitch*0.35				,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*0.35+aim.z*0.2,	player.posY+1.85+sinPitch* 0.35,	player.posZ+cosYaw * cosPitch*0.35-aim.x*0.2,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*-0.35-aim.z*0.2,	player.posY+1.45+sinPitch* -0.35,	player.posZ+cosYaw * cosPitch*-0.35+aim.x*0.2,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*-0.35				 ,	player.posY+1.45+sinPitch* -0.35,	player.posZ+cosYaw * cosPitch*-0.35				,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*-0.35+aim.z*0.2,	player.posY+1.45+sinPitch* -0.35,	player.posZ+cosYaw * cosPitch*-0.35-aim.x*0.2,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*-0.35-aim.z*0.2,	player.posY+1.65+sinPitch* -0.35,	player.posZ+cosYaw * cosPitch*-0.35+aim.x*0.2,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*-0.35				 ,	player.posY+1.65+sinPitch* -0.35,	player.posZ+cosYaw * cosPitch*-0.35				,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*-0.35+aim.z*0.2,	player.posY+1.65+sinPitch* -0.35,	player.posZ+cosYaw * cosPitch*-0.35-aim.x*0.2,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*-0.35-aim.z*0.2,	player.posY+1.85+sinPitch* -0.35,	player.posZ+cosYaw * cosPitch*-0.35+aim.x*0.2,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*-0.35				 ,	player.posY+1.85+sinPitch* -0.35,	player.posZ+cosYaw * cosPitch*-0.35				,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX+sinYaw * cosPitch*-0.35+aim.z*0.2,	player.posY+1.85+sinPitch* -0.35,	player.posZ+cosYaw * cosPitch*-0.35-aim.x*0.2,red+0.001,green,blue,brightness);

		}

		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F)) * 0.2, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F)) * 0.2 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +30*Math.PI / 180.0F) * 0.25, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +60*Math.PI / 180.0F) * 0.3, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +60*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.3, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +120*Math.PI / 180.0F) * 0.3, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +120*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +150*Math.PI / 180.0F) * 0.25, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +150*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +180*Math.PI / 180.0F) * 0.2, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +180*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -30*Math.PI / 180.0F) * 0.25, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -30*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -60*Math.PI / 180.0F) * 0.3, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -60*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.3, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -120*Math.PI / 180.0F) * 0.3, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -120*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -150*Math.PI / 180.0F) * 0.25, player.posY, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -150*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
		}
		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F)) * 0.2, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F)) * 0.2 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +30*Math.PI / 180.0F) * 0.25, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +60*Math.PI / 180.0F) * 0.3, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +60*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.3, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +120*Math.PI / 180.0F) * 0.3, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +120*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +150*Math.PI / 180.0F) * 0.25, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +150*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +180*Math.PI / 180.0F) * 0.2, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +180*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -30*Math.PI / 180.0F) * 0.25, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -30*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -60*Math.PI / 180.0F) * 0.3, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -60*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.3, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -120*Math.PI / 180.0F) * 0.3, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -120*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -150*Math.PI / 180.0F) * 0.25, player.posY+0.2, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -150*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
		}
		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F)) * 0.2, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F)) * 0.2 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +30*Math.PI / 180.0F) * 0.25, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +60*Math.PI / 180.0F) * 0.3, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +60*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.3, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +120*Math.PI / 180.0F) * 0.3, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +120*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +150*Math.PI / 180.0F) * 0.25, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +150*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +180*Math.PI / 180.0F) * 0.2, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +180*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -30*Math.PI / 180.0F) * 0.25, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -30*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -60*Math.PI / 180.0F) * 0.3, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -60*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.3, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -120*Math.PI / 180.0F) * 0.3, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -120*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -150*Math.PI / 180.0F) * 0.25, player.posY+0.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -150*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
		}
		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F)) * 0.2, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F)) * 0.2 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +30*Math.PI / 180.0F) * 0.25, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +60*Math.PI / 180.0F) * 0.3, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +60*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.3, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +120*Math.PI / 180.0F) * 0.3, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +120*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +150*Math.PI / 180.0F) * 0.25, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +150*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +180*Math.PI / 180.0F) * 0.2, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +180*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -30*Math.PI / 180.0F) * 0.25, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -30*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -60*Math.PI / 180.0F) * 0.3, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -60*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.3, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -120*Math.PI / 180.0F) * 0.3, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -120*Math.PI / 180.0F) * 0.3 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -150*Math.PI / 180.0F) * 0.25, player.posY+0.6, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -150*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
		}
		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F)) * 0.2, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F)) * 0.2 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +50*Math.PI / 180.0F) * 0.35, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +50*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2, player.posY+0.75, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);
		}
		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F)) * 0.2, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F)) * 0.2 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +50*Math.PI / 180.0F) * 0.35, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +50*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2, player.posY+0.9, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);
		}
		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F)) * 0.2, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F)) * 0.2 ,red+0.001,green,blue,brightness);
			//			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			//			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +50*Math.PI / 180.0F) * 0.35, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +50*Math.PI / 180.0F) * 0.35 ,rd+0.001,1,0,brightness);
			//			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			//			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2, player.posY+1, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);
		}
		{
			//			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F)) * 0.2, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F)) * 0.2 ,red+0.001,green,blue,brightness);
			//			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +55*Math.PI / 180.0F) * 0.35, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +50*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);

			//			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2, player.posY+1.15, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);
		}
		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F)) * 0.2, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F)) * 0.2 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +50*Math.PI / 180.0F) * 0.35, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +50*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);

			//			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -35*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			//			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -50*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -65*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -80*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -95*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -110*Math.PI / 180.0F) * 0.5 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -125*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -140*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -155*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2, player.posY+1.35, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -170*Math.PI / 180.0F) * 0.2 ,red+0.001,green,blue,brightness);
		}
		{
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.25, player.posY+1.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.35, player.posY+1.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.45, player.posY+1.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) +90*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);

			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.25, player.posY+1.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.25 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.35, player.posY+1.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.35 ,red+0.001,green,blue,brightness);
			world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - Math.sin((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.45, player.posY+1.4, player.posZ + Math.cos((player.renderYawOffset * Math.PI / 180.0F) -90*Math.PI / 180.0F) * 0.45 ,red+0.001,green,blue,brightness);
		}
	}

	public int ZeztzElementSelect(EntityPlayer player) 
	{
		if(capsem.getItem()==ItemInit.CAPSEM_IMPACT
			||(player.inventory.armorItemInSlot(3).getItem()==ItemInit.CAPSEM_IMPACT&&capsem==ItemStack.EMPTY))
		{
			return 1;
		}
		/*		else if(capsem.getItem()==ItemInit.CAPSEM_STREAM) 
		{
			return 2;
		}
		else if(capsem.getItem()==ItemInit.CAPSEM_RECOVERY) 
		{
			return 3;
		}
		else if(capsem.getItem()==ItemInit.CAPSEM_WONDER) 
		{
			return 4;
		}
		else if(capsem.getItem()==ItemInit.CAPSEM_PLAZMA) 
		{
			return 5;
		}
		else if(capsem.getItem()==ItemInit.CAPSEM_BOOSTER) 
		{
			return 6;
		}
		else if(capsem.getItem()==ItemInit.CAPSEM_CHARGE) 
		{
			return 7;
		}
		else if(capsem.getItem()==ItemInit.LEGENDRIDE_ZEZTZ)
		{
			return 10;
		}	
		 */
		else {
			return 0;
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		ZeztzElement=ZeztzElementSelect(player);
		
		if(ZeztzElement>0)
		{
			if(Keyboard.isKeyDown(Reference.ACTION_BUTTON))
			{
				AnimationCount=0;
				AnimationCount2++;
				if(AnimationCount2>16) {	AnimationCount2=0;}

				HenshinCount++;	
				if(HenshinCount<5)  
				{
					if(ZeztzElement==3) {player.swingArm(EnumHand.MAIN_HAND);}
					else {player.swingArm(EnumHand.OFF_HAND);}
				}
				else if(HenshinCount>=9)
				{
					HenshinMode=2;
					if(world.isRemote && capsem!=ItemStack.EMPTY)
					{
						isHenshin=1;
						ZeztzParticle(world,player,item,ZeztzElement	);
					}else if(capsem==ItemStack.EMPTY
							&& player.inventory.armorItemInSlot(3).getItem()==ItemInit.CAPSEM_IMPACT) 
					{
						capsem=player.inventory.armorItemInSlot(3);
					}
					if(HenshinCount>31)
					{
						HenshinCount=30;
					}
				}
			}
			else 
			{
				if(capsem!=ItemStack.EMPTY)
				{
					EyeCount=0;	
				}
				
				if(isHenshin==1) 
				{
					if(HenshinCount>0 && capsem!=ItemStack.EMPTY) 
					{
						player.setItemStackToSlot(EntityEquipmentSlot.HEAD, capsem.copy());
						capsem=ItemStack.EMPTY;
						HenshinCount=0;
						if(ZeztzElement==1) {ArmorZeztzImpact.isHenshin=1;}
						if(ZeztzElement==2) {ArmorZeztzImpact.isHenshin=1;}
						if(ZeztzElement==3) {ArmorZeztzImpact.isHenshin=1;}
						if(ZeztzElement==4) {ArmorZeztzImpact.isHenshin=1;}
						if(ZeztzElement==5) {ArmorZeztzImpact.isHenshin=1;}
						if(ZeztzElement==6) {ArmorZeztzImpact.isHenshin=1;}
						if(ZeztzElement==7) {ArmorZeztzImpact.isHenshin=1;}
						if(ZeztzElement==8) {ArmorZeztzImpact.isHenshin=1;}
						if(ZeztzElement==9) {ArmorZeztzImpact.isHenshin=1;}
						if(ZeztzElement==10) {ArmorZeztzImpact.isHenshin=1;}
					}
					HenshinMode=3;
					if(EyeCount<48) {EyeCount++;}
					AnimationCount=0;
					AnimationCount2=100;
				}
				else 
				{
					isHenshin=0;
					HenshinMode=1;
					HenshinCount=0;
					EyeCount=0;
					AnimationCount2=0;
					AnimationCount++;
					if(ZeztzElement==1) {MaxAnimationCount=81;}
					if(ZeztzElement==2) {MaxAnimationCount=81;}
					if(ZeztzElement==3) {MaxAnimationCount=81;}
					if(ZeztzElement==4) {MaxAnimationCount=81;}
					if(ZeztzElement==5) {MaxAnimationCount=81;}
					if(ZeztzElement==6) {MaxAnimationCount=81;}
					if(ZeztzElement==7) {MaxAnimationCount=81;}
					if(ZeztzElement==8) {MaxAnimationCount=81;}
					if(ZeztzElement==9) {MaxAnimationCount=81;}
					if(ZeztzElement==10) {MaxAnimationCount=81;}
					if(AnimationCount>MaxAnimationCount) {AnimationCount=0;}
				}

			}
		}else {
			HenshinMode=0;
			isHenshin=0;
			HenshinCount=0;
			AnimationCount=0;
			AnimationCount2=0;
		}


		if(player.inventory.armorItemInSlot(3)==ItemStack.EMPTY 
				&&player.getHeldItem(EnumHand.MAIN_HAND)==ItemStack.EMPTY
				&&player.isPlayerFullyAsleep()) 
		{
			player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ItemInit.CAPSEM_IMPACT,1));
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