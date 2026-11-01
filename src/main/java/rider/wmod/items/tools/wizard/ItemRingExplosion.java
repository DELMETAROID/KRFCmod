package rider.wmod.items.tools.wizard;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityPurpleBullet;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemRingExplosion extends Item implements IHasModel
{
	double s=0.1;
	int r=10;
	public static Boolean flag=false;
	
	public ItemRingExplosion(String name,CreativeTabs tab)
	{
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
		EntityPurpleBullet bullet = new EntityPurpleBullet(worldIn,playerIn,1,1,1,5);
		//		EntityLargeFireball fire = new EntityLargeFireball(worldIn,playerIn,1,1,1);
		bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

		s=0.1;
		r=10;

		bullet.accelerationX=aim.x*s;
		bullet.accelerationY=aim.y*s;
		bullet.accelerationZ=aim.z*s;

		playerIn.swingArm(handIn);
		playerIn.getCooldownTracker().setCooldown(this, r);
		if(!worldIn.isRemote)
		{
			worldIn.spawnEntity(bullet);
		}
		itemstack.damageItem(1, playerIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
}