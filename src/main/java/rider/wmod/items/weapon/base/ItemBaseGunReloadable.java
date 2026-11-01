package rider.wmod.items.weapon.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityGreenBullet;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemBaseGunReloadable extends Item implements IHasModel
{
	double s=0.1;
	int r=10;
	int ammo=2;
	int bulletleft=1;

	public ItemBaseGunReloadable(String name,CreativeTabs tab,int bullet)
	{
		setMaxDamage(100);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
		this.bulletleft=bullet;
		this.ammo=bullet;
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn,EntityPlayer playerIn,EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		Vec3d aim =playerIn.getLookVec();
		EntityGreenBullet bullet = new EntityGreenBullet(worldIn,playerIn,1,1,1,20);
		
		bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet.accelerationX=aim.x*s;
		bullet.accelerationY=aim.y*s;
		bullet.accelerationZ=aim.z*s;
		
		playerIn.swingArm(handIn);
		
		if(!worldIn.isRemote)
		{
			if(bulletleft>0){
				worldIn.spawnEntity(bullet);
				bulletleft--;
				playerIn.getCooldownTracker().setCooldown(this, r);
			}else {
				bulletleft=this.ammo;
				playerIn.getCooldownTracker().setCooldown(this, r+20);
							}
		}
		
		if(bulletleft>=1){
			itemstack.damageItem(1, playerIn);
		}else if(bulletleft==0){
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.PLAYERS, 0.5F, 1.0F);
		}

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);

	}
}