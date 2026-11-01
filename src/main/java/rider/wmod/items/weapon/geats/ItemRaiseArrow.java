package rider.wmod.items.weapon.geats;

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

public class ItemRaiseArrow extends Item implements IHasModel
{
	double s=0.1;
	int r=10;
	public static Boolean flag=false;
	int bulletleft=10;

	public ItemRaiseArrow(String name,CreativeTabs tab)
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
		Vec3d aim =playerIn.getLookVec();
		EntityGreenBullet bullet = new EntityGreenBullet(worldIn,playerIn,1,1,1,3);
		//		EntityLargeFireball fire = new EntityLargeFireball(worldIn,playerIn,1,1,1);
		bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

		s=0.1;
		r=10;

		bullet.accelerationX=aim.x*s;
		bullet.accelerationY=aim.y*s;
		bullet.accelerationZ=aim.z*s;

		if(playerIn.inventory.armorItemInSlot(2) != null
				&& playerIn.inventory.armorItemInSlot(1) != null
				&& playerIn.inventory.armorItemInSlot(0) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER
					&&(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_ARROW_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_ARROW
					||playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SP_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SP))
			{
				playerIn.swingArm(handIn);
				playerIn.getCooldownTracker().setCooldown(this, r);
				if(!worldIn.isRemote)
				{
					worldIn.spawnEntity(bullet);
				}
				itemstack.damageItem(1, playerIn);
			}
			else 
			{//不適
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
				itemstack.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
		}
		else 
		{//不適
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
			itemstack.setCount(0);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
}
