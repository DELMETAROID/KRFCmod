package rider.wmod.items.weapon.geats;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
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

public class ItemRaiseCraw extends ItemSword implements IHasModel
{
	double s=0.1;
	int r=100;
	int count=0;

	public ItemRaiseCraw(String name,ToolMaterial material,CreativeTabs tab)
	{
		super(material);
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
		ItemStack itemstack2 = playerIn.getHeldItem(EnumHand.MAIN_HAND);
		ItemStack itemstack3 = playerIn.getHeldItem(EnumHand.OFF_HAND);
		Vec3d aim =playerIn.getLookVec();
		EntityYellowBullet bullet = new EntityYellowBullet(worldIn,playerIn,1,1,1,3);

		bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		bullet.accelerationX=aim.x*s;
		bullet.accelerationY=aim.y*s;
		bullet.accelerationZ=aim.z*s;

		if(playerIn.inventory.armorItemInSlot(2) != null
				&& playerIn.inventory.armorItemInSlot(1) != null
				&& playerIn.inventory.armorItemInSlot(0) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER
					&&(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_CRAW_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_CRAW
					||playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SP_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SP))
			{
				if(itemstack2.getItem()==ItemInit.RAISE_CRAW
						&&itemstack3.getItem()==ItemInit.RAISE_CRAW)
				{
					if(!worldIn.isRemote)
					{
						worldIn.spawnEntity(bullet);
						playerIn.getCooldownTracker().setCooldown(this, r);

						if(handIn==EnumHand.MAIN_HAND)
						{
							if(count==0) {count=1;}
							else if(count==1) {	count=0;}
						}
					}

					if(count==0) {
						playerIn.swingArm(EnumHand.MAIN_HAND);
					}
					else if(count==1) {
						playerIn.swingArm(EnumHand.OFF_HAND);
					}
				}
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
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
}