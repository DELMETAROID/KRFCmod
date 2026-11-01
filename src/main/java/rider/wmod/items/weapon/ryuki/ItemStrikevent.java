package rider.wmod.items.weapon.ryuki;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
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

public class ItemStrikevent extends ItemBow implements IHasModel
{
	double s=0.1;
	int r=10;
	int damagecount=0;

	public ItemStrikevent(String name,CreativeTabs tab)
	{
		setMaxDamage(4);
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
				boolean flag1 = true;

				if(stack.getItem()==ItemInit.STRIKEVENT_RYUKI) {fire.explosionPower=3;}
				if(stack.getItem()==ItemInit.STRIKEVENT_RYUGA) {fire.explosionPower=5;}
				s= 0.2;
				r=4;
				fire.accelerationX=aim.x*s;
				fire.accelerationY=aim.y*s;
				fire.accelerationZ=aim.z*s;
				playerIn.getCooldownTracker().setCooldown(this, r);

				if(!worldIn.isRemote)
				{
					worldIn.spawnEntity(fire);
				}
				stack.damageItem(1, playerIn);
				playerIn.addStat(StatList.getObjectUseStats(this));
			}
		}
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if(stack.getItem()==ItemInit.STRIKEVENT_RYUKI) {tooltip.add(I18n.format("tip.ryuki"));}
		if(stack.getItem()==ItemInit.STRIKEVENT_RYUGA) {tooltip.add(I18n.format("tip.ryuga"));}
	}
}