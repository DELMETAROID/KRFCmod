package rider.wmod.items.weapon.exaid;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityGreenBullet;
import rider.wmod.entity.EntityPurpleBullet;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemGashaconBugviserGun extends Item implements IHasModel
{
	double s=0.3;
	int r=0;

	public ItemGashaconBugviserGun(String name,CreativeTabs tab)
	{
		setMaxDamage(150);
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
	public ActionResult<ItemStack> onItemRightClick(World worldIn,EntityPlayer playerIn,EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack itemstack2 =new ItemStack(ItemInit.GashaconBugviser,1);
		ItemStack itemstack3 =new ItemStack(ItemInit.GashaconBugviserZwei,1);
		Vec3d aim =playerIn.getLookVec();
		EntityPurpleBullet bullet = new EntityPurpleBullet(worldIn,playerIn,1,1,1,5);
		EntityGreenBullet bullet2 = new EntityGreenBullet(worldIn,playerIn,1,1,1,7);
		bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet.accelerationX=aim.x*s;
		bullet.accelerationY=aim.y*s;
		bullet.accelerationZ=aim.z*s;
//		playerIn.getCooldownTracker().setCooldown(this, r);

		bullet2.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet2.accelerationX=aim.x*s;
		bullet2.accelerationY=aim.y*s;
		bullet2.accelerationZ=aim.z*s;
		
		if(playerIn.isSneaking()) {
			if(itemstack.getItem()==ItemInit.GashaconBugviser_beamgun) {
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack2);
			}else {
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack3);
			}
		}
		else {
			if(!worldIn.isRemote)
			{
				if(itemstack.getItem()==ItemInit.GashaconBugviser_beamgun) {
				worldIn.spawnEntity(bullet);
				}
				else {
				worldIn.spawnEntity(bullet2);
				}
			}
			itemstack.damageItem(1, playerIn);

			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
	}
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("mode.beamgun"));
	}
}