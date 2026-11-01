package rider.wmod.items.tools.exaid;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemGearDual extends Item
//Armor
implements IHasModel
{
	public static int DriverCheck=0;

	public ItemGearDual(String name,CreativeTabs tab) {
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
		
		//		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		
		//		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack puzzle = new ItemStack(ItemInit.GashatPUZZLE, 1);
		ItemStack fighter = new ItemStack(ItemInit.GashatFIGHTER, 1);
		ItemStack fantasy = new ItemStack(ItemInit.GashatFANTASY, 1);
		ItemStack simulation = new ItemStack(ItemInit.GashatSIMULATIONS, 1);
		ItemStack puzzle_another = new ItemStack(ItemInit.GashatPUZZLE_ANOTHER, 1);
		ItemStack fighter_another = new ItemStack(ItemInit.GashatFIGHTER_ANOTHER, 1);

		//		ItemStack another = new ItemStack(ItemInit.GashatDUAL_ANOTHER, 1);

		if(itemstack.getItem()==ItemInit.GashatDUAL) {
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
				{
					//				playerIn.swingArm(handIn);
					//				worldIn.newExplosion(playerIn, playerIn.posX,playerIn.posY+1, playerIn.posZ,0, true, true);
					/*				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					 */				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					 /*				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
					  */
				}
				else
				{	
					if(playerIn.isSneaking()) {
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, fighter);
					}else {
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, puzzle);
					}
				}
			}
			else
			{
				/*		    playerIn.swingArm(handIn);
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.PLAYERS, 1.0F, 1.0F);
			playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,200,0));
				 */
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}else if(itemstack.getItem()==ItemInit.GashatDUAL_BETA) {
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
				{
					//				playerIn.swingArm(handIn);
					//				worldIn.newExplosion(playerIn, playerIn.posX,playerIn.posY+1, playerIn.posZ,0, true, true);
					/*				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					 */				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					 /*				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
					  */
				}
				else
				{
					if(playerIn.isSneaking()) {
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, simulation);
					}else {
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, fantasy);
					}
				}
			}
			else
			{
				/*		    playerIn.swingArm(handIn);
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.PLAYERS, 1.0F, 1.0F);
			playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,200,0));
				 */
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else {
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.GAMER_DRIVER)
				{
					//				playerIn.swingArm(handIn);
					//				worldIn.newExplosion(playerIn, playerIn.posX,playerIn.posY+1, playerIn.posZ,0, true, true);
					/*				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					 */				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					 /*				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
					  */
				}
				else
				{
					if(playerIn.isSneaking()) {
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, fighter_another);
					}else {
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, puzzle_another);
					}
				}
			}
			else
			{
				/*		    playerIn.swingArm(handIn);
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.PLAYERS, 1.0F, 1.0F);
			playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,200,0));
				 */
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
	}
}