package rider.wmod.items.weapon.hibiki;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemArmedSaberOpen extends ItemBow implements IHasModel
{
	double s=0.1;
	int r=10;
	int damagecount=0;

	public ItemArmedSaberOpen(String name,CreativeTabs tab)
	{
		setMaxDamage(ItemInit.HIBIKI_SABER.getMaxUses());
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
	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		boolean flag = true;

		ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, worldIn, playerIn, handIn, flag);
		if (ret != null) return ret;

		if (!playerIn.capabilities.isCreativeMode && !flag)
		{
			return flag ? new ActionResult(EnumActionResult.PASS, itemstack) : new ActionResult(EnumActionResult.FAIL, itemstack);
		}
		else
		{
			playerIn.setActiveHand(handIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
	}

	/**
	 * Called when the player stops using an Item (stops holding the right mouse button).
	 */
	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
	{
		ItemStack armedsaber =new ItemStack(ItemInit.ARMED_SABER,1);
		if (entityLiving instanceof EntityPlayer)
		{
			EntityPlayer playerIn = (EntityPlayer)entityLiving;
			boolean flag = true;
			Vec3d aim =playerIn.getLookVec();
			EntityLargeFireball fire = new EntityLargeFireball(worldIn,playerIn,0.75,0.75,0.75);
			fire.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.5+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

			int i = this.getMaxItemUseDuration(stack) - timeLeft;
			if (i < 0) return;

			float f = getArrowVelocity(i);

			if ((double)f >= 1.0D)
			{
				fire.explosionPower=4;
				s= 0.02;
				r=200;
				fire.accelerationX=aim.x*s;
				fire.accelerationY=aim.y*s;
				fire.accelerationZ=aim.z*s;

				if(!worldIn.isRemote)
				{
					worldIn.spawnEntity(fire);
				}
				stack.damageItem(1, playerIn);
				playerIn.addStat(StatList.getObjectUseStats(this));
				
				playerIn.getCooldownTracker().setCooldown(armedsaber.getItem(),r);
				if(playerIn.getActiveHand()==EnumHand.MAIN_HAND){playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,armedsaber);}
				else {playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,armedsaber);}
				}
		}
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("mode.armedsaber_open"));
	}
}