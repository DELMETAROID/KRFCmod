package rider.wmod.items.tools.geats;

import java.util.Random;

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
import rider.wmod.util.IHasModel;

public class ItemFeverSlot extends Item implements IHasModel
{
	Random rand = new Random();

	public ItemFeverSlot(String name,CreativeTabs tab)
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
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack itemstackR = new ItemStack(ItemInit.RB_AX_R,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		EntityEquipmentSlot entityequipmentslotR = EntityLiving.getSlotForItemStack(itemstackR);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack itemstack1R = playerIn.getItemStackFromSlot(entityequipmentslotR);

		ItemStack RB_HAMMER = new ItemStack(ItemInit.RB_HAMMER,1);
		ItemStack RB_WATER = new ItemStack(ItemInit.RB_WATER,1);
		ItemStack RB_ARROW = new ItemStack(ItemInit.RB_ARROW,1);
		ItemStack RB_SHIELD = new ItemStack(ItemInit.RB_SHIELD,1);
		ItemStack RB_CRAW = new ItemStack(ItemInit.RB_CRAW,1);
		ItemStack RB_CHAINARRAY = new ItemStack(ItemInit.RB_CHAINARRAY,1);
		ItemStack RB_DRILL = new ItemStack(ItemInit.RB_DRILL,1);
		ItemStack RB_PROPELLER = new ItemStack(ItemInit.RB_PROPELLER,1);
		ItemStack RB_SHOOTER = new ItemStack(ItemInit.RB_SHOOTER,1);
		ItemStack RB_BREAKER = new ItemStack(ItemInit.RB_BREAKER,1);
		ItemStack RB_DUALER = new ItemStack(ItemInit.RB_DUALER,1);
		ItemStack RB_AX = new ItemStack(ItemInit.RB_AX,1);
		
		
		
		
		ItemStack itemstack2 = new ItemStack(ItemInit.BEAT_AX,1);
		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if((playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER)&&	(
					playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GEATS
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GEATS
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_TYCOON
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BUFFA
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NAGO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SHIROWE
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GINPEN
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_DAPAAN
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_MARY
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_PUNKJACK
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_LETTER
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_KEILOW
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NADGESPARROW
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_LOPO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GROOVY
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_HAKUBI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BUCHI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GYAGO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_TURBON
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_BRALI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SEEKER
					))
			{
				playerIn.swingArm(handIn);
				if(handIn==EnumHand.MAIN_HAND) 
				{
					if (itemstack1.isEmpty())
					{
						playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
						itemstack.setCount(0);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
					}
					else
					{
						playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
						itemstack.setCount(0);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
					}
				}else {
					if (itemstack1.isEmpty())
					{
						playerIn.setItemStackToSlot(entityequipmentslotR, itemstackR.copy());
						itemstackR.setCount(0);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
					}
					else
					{
						playerIn.setItemStackToSlot(entityequipmentslotR, itemstackR.copy());
						itemstackR.setCount(0);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1R);
					}					
				}
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}
}