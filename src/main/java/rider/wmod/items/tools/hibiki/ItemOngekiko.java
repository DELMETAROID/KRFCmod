package rider.wmod.items.tools.hibiki;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityOngekiko;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemOngekiko extends Item implements IHasModel
{
	double s=0.1;
	int r=10;
	public ItemOngekiko(String name,CreativeTabs tab)
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
		playerIn.swingArm(handIn);
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		EntityOngekiko ongekiko = new EntityOngekiko(worldIn,playerIn);
	    worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }

	    
		if(!worldIn.isRemote)
		{
			ongekiko.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
			worldIn.spawnEntity(ongekiko);
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
	/*		else
		{
			bullet_B.accelerationX=aim.x*s;
			bullet_B.accelerationY=aim.y*s;
			bullet_B.accelerationZ=aim.z*s;
			if(!worldIn.isRemote)
			{
				worldIn.spawnEntity(bullet_B);
			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}*/
}