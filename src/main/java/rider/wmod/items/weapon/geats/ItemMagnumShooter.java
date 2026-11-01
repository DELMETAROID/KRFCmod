package rider.wmod.items.weapon.geats;

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
import rider.wmod.entity.EntityYellowBullet;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemMagnumShooter extends Item implements IHasModel
{
	double s=0.1;
	int r=2;
	double s2=1;
	int r2=10;
	
	public static Boolean flag=false;

	public ItemMagnumShooter(String name,CreativeTabs tab)
	{
		setMaxDamage(150);
		setUnlocalizedName(name);
		setRegistryName(name);		
		if(name=="magnum_shooter_handgun")
		{
			setCreativeTab(tab);
		}
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
		ItemStack itemstack2 =new ItemStack(ItemInit.MAGNUM_SHOOTER_RYFLE,1);
		ItemStack itemstack3 =new ItemStack(ItemInit.MAGNUM_SHOOTER_HANDGUN,1);
		Vec3d aim =playerIn.getLookVec();
		EntityYellowBullet bullet = new EntityYellowBullet(worldIn,playerIn,1,1,1,4);
		EntityYellowBullet bullet2 = new EntityYellowBullet(worldIn,playerIn,1,1,1,7);
		bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet2.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

		bullet.accelerationX=aim.x*s;
		bullet.accelerationY=aim.y*s;
		bullet.accelerationZ=aim.z*s;
		bullet2.accelerationX=aim.x*s2;
		bullet2.accelerationY=aim.y*s2;
		bullet2.accelerationZ=aim.z*s2;

		playerIn.swingArm(handIn);
		if(playerIn.isSneaking())
		{
			if(itemstack.getItem()==ItemInit.MAGNUM_SHOOTER_RYFLE) {
				itemstack3.damageItem(this.getDamage(itemstack), playerIn);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack3);	
			}
			if(itemstack.getItem()==ItemInit.MAGNUM_SHOOTER_HANDGUN) {
				itemstack2.damageItem(this.getDamage(itemstack), playerIn);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);	
			}
		}
		else 
		{
			if(!worldIn.isRemote)
			{

				if(itemstack.getItem()==ItemInit.MAGNUM_SHOOTER_HANDGUN) 
				{
					playerIn.getCooldownTracker().setCooldown(this, r);
					worldIn.spawnEntity(bullet);
				}else {
					playerIn.getCooldownTracker().setCooldown(this, r2);
					worldIn.spawnEntity(bullet2);
				}
				
			}
			itemstack.damageItem(1, playerIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
}