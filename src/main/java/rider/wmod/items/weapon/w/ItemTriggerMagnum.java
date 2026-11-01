package rider.wmod.items.weapon.w;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityBlueBullet;
import rider.wmod.entity.EntityGreenBullet;
import rider.wmod.entity.EntityPurpleBullet;
import rider.wmod.entity.EntityYellowBullet;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemTriggerMagnum extends Item implements IHasModel
{
	double s=0.1;
	int r=10;

	public ItemTriggerMagnum(String name,CreativeTabs tab)
	{
		setMaxDamage(50);
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
		Vec3d aim =playerIn.getLookVec();
		EntityBlueBullet bullet_B = new EntityBlueBullet(worldIn,playerIn,1,1,1,3);
		EntityGreenBullet bullet_G = new EntityGreenBullet(worldIn,playerIn,1,1,1,3);
		EntityYellowBullet bullet_Y = new EntityYellowBullet(worldIn,playerIn,1,1,1,4);
		EntityLargeFireball fire = new EntityLargeFireball(worldIn,playerIn,1,1,1);
		EntityPurpleBullet bullet_P = new EntityPurpleBullet(worldIn,playerIn,1,1,1,5);
		bullet_B.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet_G.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet_Y.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet_P.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		fire.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.5+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

		if(playerIn.inventory.armorItemInSlot(0).getItem()!=null) 
		{
			if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_CYCLONE)
			{
				s=0.5;
				r=5;
				bullet_G.accelerationX=aim.x*s;
				bullet_G.accelerationY=aim.y*s;
				bullet_G.accelerationZ=aim.z*s;
				playerIn.getCooldownTracker().setCooldown(this, r);
				if(!worldIn.isRemote)
				{
					worldIn.spawnEntity(bullet_G);
				}
				itemstack.damageItem(1, playerIn);

				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
			else if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_HEAT)
			{
				fire.explosionPower=1;
				s=0.1;
				r=5;
				fire.accelerationX=aim.x*s;
				fire.accelerationY=aim.y*s;
				fire.accelerationZ=aim.z*s;
				playerIn.getCooldownTracker().setCooldown(this, r);
				if(!worldIn.isRemote)
				{
					worldIn.spawnEntity(fire);
				}
				itemstack.damageItem(1, playerIn);

				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
			else if(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_LUNA)
			{
				s=0.3;
				r=3;
				bullet_Y.accelerationX=aim.x*s;
				bullet_Y.accelerationY=aim.y*s;
				bullet_Y.accelerationZ=aim.z*s;
				playerIn.getCooldownTracker().setCooldown(this, r);
				if(!worldIn.isRemote)
				{
					worldIn.spawnEntity(bullet_Y);
				}
				itemstack.damageItem(1, playerIn);

				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}

			else if(playerIn.inventory.armorItemInSlot(3).getItem()!=null) 
			{
				if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_SCULL)
				{
					s=0.5;
					r=7;
					bullet_P.accelerationX=aim.x*s;
					bullet_P.accelerationY=aim.y*s;
					bullet_P.accelerationZ=aim.z*s;
					playerIn.getCooldownTracker().setCooldown(this, r);
					if(!worldIn.isRemote)
					{
						worldIn.spawnEntity(bullet_G);
					}
					itemstack.damageItem(1, playerIn);

					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
			}	
			else
			{
				s=0.1;
				r=10;
				bullet_B.accelerationX=aim.x*s;
				bullet_B.accelerationY=aim.y*s;
				bullet_B.accelerationZ=aim.z*s;
				playerIn.getCooldownTracker().setCooldown(this, r);
				if(!worldIn.isRemote)
				{
					worldIn.spawnEntity(bullet_B);
				}
				itemstack.damageItem(2, playerIn);

				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
		}		
		return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	}
}