package rider.wmod.items.weapon.w;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityBlueBullet;
import rider.wmod.entity.EntityGreenBullet;
import rider.wmod.entity.EntityYellowBullet;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemTriggerMaximum extends ItemBow implements IHasModel
{
	double s=0.1;
	int r=10;
	int damagecount=0;

	public ItemTriggerMaximum(String name,CreativeTabs tab)
	{
		setMaxDamage(11);
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
	public ActionResult<ItemStack> onItemRightClick(World worldIn,EntityPlayer playerIn,EnumHand handIn)
	{
		playerIn.swingArm(handIn);
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack itemstack2 = new ItemStack(ItemInit.TRIGGER_MAGNUM,1);
		Vec3d aim =playerIn.getLookVec();
		EntityBlueBullet bullet_B = new EntityBlueBullet(worldIn,playerIn,1,1,1,4);
		EntityGreenBullet bullet_G = new EntityGreenBullet(worldIn,playerIn,1,1,1,4);
		EntityYellowBullet bullet_Y = new EntityYellowBullet(worldIn,playerIn,1,1,1,5);
		EntityLargeFireball fire = new EntityLargeFireball(worldIn,playerIn,1,1,1);
		bullet_B.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet_G.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet_Y.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		fire.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.5+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

		if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_CYCLONE)
		{
			s=0.7;
			r=4;
			bullet_G.accelerationX=aim.x*s;
			bullet_G.accelerationY=aim.y*s;
			bullet_G.accelerationZ=aim.z*s;
			playerIn.getCooldownTracker().setCooldown(this, r);
			if(!worldIn.isRemote)
			{
				worldIn.spawnEntity(bullet_G);
			}
		}
		else if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_HEAT)
		{
			fire.explosionPower=2;
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
		}
		else if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_LUNA)
		{
			s= 0.4;
			r=3;
			bullet_Y.accelerationX=aim.x*s;
			bullet_Y.accelerationY=aim.y*s;
			bullet_Y.accelerationZ=aim.z*s;
			playerIn.getCooldownTracker().setCooldown(this, r);
			if(!worldIn.isRemote)
			{
				worldIn.spawnEntity(bullet_Y);
			}
		}
		else
		{
			s=0.3;
			r=5;
			bullet_B.accelerationX=aim.x*s;
			bullet_B.accelerationY=aim.y*s;
			bullet_B.accelerationZ=aim.z*s;
			playerIn.getCooldownTracker().setCooldown(this, r);
			if(!worldIn.isRemote)
			{
				worldIn.spawnEntity(bullet_B);
			}
		}
			itemstack.damageItem(1, playerIn);
			
		if (!playerIn.capabilities.isCreativeMode)
		{
			if(this.getDamage(itemstack)>=10) {
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
			}
			else {
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
}