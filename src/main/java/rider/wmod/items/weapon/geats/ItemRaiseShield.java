package rider.wmod.items.weapon.geats;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemRaiseShield extends ItemShield implements IHasModel
{
	String shieldname;

	public ItemRaiseShield(String name,CreativeTabs tab)
	{
		setMaxDamage(300);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
		shieldname=("item." + name + ".name");;
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		if(playerIn.inventory.armorItemInSlot(2) != null
				&& playerIn.inventory.armorItemInSlot(1) != null
				&& playerIn.inventory.armorItemInSlot(0) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER
					&&(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SHIELD_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SHIELD
					||playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SP_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SP))
			{
				playerIn.setActiveHand(handIn);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);

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
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack)
	{
		return I18n.translateToLocal(this.shieldname);

	}


}