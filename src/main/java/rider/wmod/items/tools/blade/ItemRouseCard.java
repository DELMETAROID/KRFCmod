package rider.wmod.items.tools.blade;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.items.weapon.base.ItemBaseGun;
import rider.wmod.util.IHasModel;

public class ItemRouseCard extends Item
//Armor
implements IHasModel
{
	public static int DriverCheck=0;

	public ItemRouseCard(String name,CreativeTabs tab) {
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
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack holditem =playerIn.getHeldItemOffhand();
		
		ItemStack buckle = new ItemStack(ItemInit. BLABUCKLE_BELT, 1);
		ItemStack blarouser = new ItemStack(ItemInit. BLAROUSER, 1);	
		ItemStack garrenrouser = new ItemStack(ItemInit. GARRENROUSER, 1);	
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(buckle);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);

		if(itemstack1.getItem()==ItemInit.BLABUCKLE_BELT||itemstack1.getItem()==ItemInit.GARRENBUCKLE_BELT) 
		{
			if(itemstack.getItem()==ItemInit.SPADE_2)
			{
							
			}
			if(itemstack.getItem()==ItemInit.SPADE_3)
			{
							
			}
			if(itemstack.getItem()==ItemInit.SPADE_4)
			{
							
			}
			if(itemstack.getItem()==ItemInit.SPADE_5)
			{
							
			}
			if(itemstack.getItem()==ItemInit.SPADE_6)
			{
							
			}
			if(itemstack.getItem()==ItemInit.SPADE_7)
			{
							
			}
			if(itemstack.getItem()==ItemInit.SPADE_8)
			{
							
			}
			if(itemstack.getItem()==ItemInit.SPADE_9)
			{
							
			}
			if(itemstack.getItem()==ItemInit.SPADE_10)
			{
		
			}
			if(itemstack.getItem()==ItemInit.SPADE_Q)
			{
		
			}
			if(itemstack.getItem()==ItemInit.DIA_2)
			{
				if(holditem==garrenrouser) 
				{
					ItemBaseGun.flag=true;
				}
			
			}
			if(itemstack.getItem()==ItemInit.DIA_3)
			{
		
			}
			if(itemstack.getItem()==ItemInit.DIA_4)
			{
		
			}
			if(itemstack.getItem()==ItemInit.DIA_5)
			{
		
			}
			if(itemstack.getItem()==ItemInit.DIA_6)
			{
		
			}
			if(itemstack.getItem()==ItemInit.DIA_7)
			{
		
			}
			if(itemstack.getItem()==ItemInit.DIA_8)
			{
		
			}
			if(itemstack.getItem()==ItemInit.DIA_9)
			{
		
			}
			if(itemstack.getItem()==ItemInit.DIA_10)
			{
							
			}
			if(itemstack.getItem()==ItemInit.DIA_Q)
			{
							
			}

			
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
		
		return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	}
}