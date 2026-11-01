package rider.wmod.items.action;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemAgitoHenshin extends Item implements IHasModel
{
	public ItemAgitoHenshin(String name,CreativeTabs tab)
	{
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


	//効果
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack handin 	= playerIn.getHeldItem(handIn);
		ItemStack altering =new ItemStack(ItemInit.ALTERING,1);
		ItemStack agito =new ItemStack(ItemInit.ELEMENT_GROUND,1);
		ItemStack agito_flame =new ItemStack(ItemInit.ELEMENT_FLAME,1);
		ItemStack agito_storm =new ItemStack(ItemInit.ELEMENT_STORM,1);
		ItemStack erase_agito = this.findAmmo(playerIn,ItemInit.ELEMENT_GROUND);

		
		EntityEquipmentSlot driverslot = EntityLiving.getSlotForItemStack(altering);
		EntityEquipmentSlot agitoslot = EntityLiving.getSlotForItemStack(agito);

		
		ItemStack wearingdriver = playerIn.getItemStackFromSlot(driverslot);		

		if(!worldIn.isRemote)
		{
			if(wearingdriver.getItem()==ItemInit.ALTERING)
			{
				playerIn.setItemStackToSlot(agitoslot, agito.copy());
				handin.setCount(0);
				if(handIn==EnumHand.MAIN_HAND) {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, agito_storm.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, agito_flame);
				}else {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, agito_flame.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, agito_storm);
				}
			}else {
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
				handin.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,handin);
			}
		}else {
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, handin);
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