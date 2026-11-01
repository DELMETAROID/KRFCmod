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
import rider.wmod.entity.EntityYellowBullet;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemBaseGunWithAmmo extends Item implements IHasModel
{
	double s=0.1;
	int r=2;
	int damage=4;
	public static Boolean flag=false;
	int bulletleft=10;

	public ItemBaseGunWithAmmo(String name,CreativeTabs tab)
	{
		setMaxDamage(500);
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
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack holditem =playerIn.getHeldItemOffhand();
		ItemStack ammo = this.findAmmo(playerIn,ItemInit.CELL_MEDAL);
		Vec3d aim =playerIn.getLookVec();
		EntityYellowBullet bullet = new EntityYellowBullet(worldIn,playerIn,1,1,1,damage);
		//		EntityLargeFireball fire = new EntityLargeFireball(worldIn,playerIn,1,1,1);
		bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

		s=0.1;
		r=10;

		bullet.accelerationX=aim.x*s;
		bullet.accelerationY=aim.y*s;
		bullet.accelerationZ=aim.z*s;

		if (!playerIn.capabilities.isCreativeMode)
		{
			ammo.shrink(1);

			if (ammo.isEmpty())
			{
				playerIn.inventory.deleteStack(ammo);
			}
		}

		if(this.findAmmo(playerIn, ammo.getItem())!=ItemStack.EMPTY)
		{
			playerIn.swingArm(handIn);
			playerIn.getCooldownTracker().setCooldown(this, r);

			if(!worldIn.isRemote)
			{
				worldIn.spawnEntity(bullet);
				itemstack.damageItem(1, playerIn);
			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);		
		}
		else {
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.PLAYERS, 1.0F, 1.0F);
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);		
		}
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
}
