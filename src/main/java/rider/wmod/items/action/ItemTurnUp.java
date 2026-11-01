package rider.wmod.items.action;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityBladePlate;
import rider.wmod.entity.EntityGarrenPlate;
import rider.wmod.init.ItemInit;
import rider.wmod.items.armor.blade.ArmorBlade;
import rider.wmod.items.armor.blade.ArmorGarren;
import rider.wmod.util.IHasModel;

public class ItemTurnUp extends Item implements IHasModel
{
	public static double posx=0;
	public static double posz=0;
	public ItemTurnUp(String name,CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
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
		ItemStack turnup = playerIn.getHeldItem(handIn);
		ItemStack belt_blade =new ItemStack(ItemInit.BLABUCKLE_BELT,1);
		ItemStack buckle_blade =new ItemStack(ItemInit.BLABUCKLE_ITEM,1);
		ItemStack spade_a =new ItemStack(ItemInit.SPADE_A,1);
		ItemStack belt_garren =new ItemStack(ItemInit.GARRENBUCKLE_BELT,1);
		ItemStack buckle_garren =new ItemStack(ItemInit.GARRENBUCKLE_ITEM,1);
		ItemStack dia_a =new ItemStack(ItemInit.DIA_A,1);
		
		EntityEquipmentSlot belt = EntityLiving.getSlotForItemStack(belt_blade);
		EntityEquipmentSlot ace = EntityLiving.getSlotForItemStack(spade_a);
		
		ItemStack wearingbelt = playerIn.getItemStackFromSlot(belt);
		ItemStack wearingace = playerIn.getItemStackFromSlot(ace);
		
		ItemStack rouser_blade =new ItemStack(ItemInit.BLAROUSER,1);
		ItemStack rouser_garren =new ItemStack(ItemInit.GARRENROUSER,1);
		ItemStack erase_blade = this.findAmmo(playerIn,ItemInit.BLAROUSER);
		ItemStack erase_garren = this.findAmmo(playerIn,ItemInit.GARRENROUSER);
		
		EntityBladePlate BladePlate = new EntityBladePlate(worldIn);
		EntityGarrenPlate GarrenPlate = new EntityGarrenPlate(worldIn);
		Vec3d aim =playerIn.getLookVec();
//		float yaw = playerIn.getRotationYawHead();

		if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND)==turnup)
		{
			playerIn.swingArm(handIn);
			if(ItemStack.areItemsEqualIgnoreDurability(wearingbelt,belt_blade))//ブレイド
			{
				if(ItemStack.areItemsEqualIgnoreDurability(wearingace,spade_a)) //変身解除
				{
					ArmorBlade.isHenshin=0;
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,buckle_blade.copy());
					playerIn.setItemStackToSlot(ace,ItemStack.EMPTY);
					playerIn.setItemStackToSlot(belt,ItemStack.EMPTY);
					playerIn.inventory.deleteStack(erase_blade);

					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, wearingace);
				}
				else//変身
				{
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,turnup);
					playerIn.setItemStackToSlot(ace,spade_a.copy());
					ArmorBlade.isHenshin=0;
					if(!worldIn.isRemote)
					{
						if(!playerIn.isSneaking())
						{
							BladePlate.setPosition(
									playerIn.posX +aim.x*5,
									playerIn.posY,
									playerIn.posZ +aim.z*5);
							worldIn.spawnEntity(BladePlate);//スポーン
						}else {
							if(ArmorBlade.isHenshin==0)
							{
								ArmorBlade.isHenshin=1;
							}
							else if(ArmorBlade.isHenshin==1)
							{
								ArmorBlade.isHenshin=0;
							}
						}
					}
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, rouser_blade);
				}
			}else if(ItemStack.areItemsEqualIgnoreDurability(wearingbelt,belt_garren))//ギャレン
			{
				if(ItemStack.areItemsEqualIgnoreDurability(wearingace,dia_a)) //変身解除
				{
					ArmorGarren.isHenshin=0;
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,buckle_garren.copy());
					playerIn.setItemStackToSlot(ace,ItemStack.EMPTY);
					playerIn.setItemStackToSlot(belt,ItemStack.EMPTY);
					playerIn.inventory.deleteStack(erase_garren);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, wearingace);
				}
				else//変身
				{
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,turnup);
					playerIn.setItemStackToSlot(ace,dia_a.copy());
					ArmorGarren.isHenshin=0;
					if(!worldIn.isRemote)
					{
						if(!playerIn.isSneaking())
						{
							GarrenPlate.setPosition(
									playerIn.posX +aim.x*5,
									playerIn.posY,
									playerIn.posZ +aim.z*5);
							worldIn.spawnEntity(GarrenPlate);//スポーン
						}else {
							if(ArmorGarren.isHenshin==0)
							{
								ArmorGarren.isHenshin=1;
							}
							else if(ArmorGarren.isHenshin==1)
							{
								ArmorGarren.isHenshin=0;
							}
						}
					}
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, rouser_garren);
				}
			}else{
				turnup.setCount(0);
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
				return new ActionResult<ItemStack>(EnumActionResult.FAIL,turnup);
			}
		}return new ActionResult<ItemStack>(EnumActionResult.FAIL,turnup);
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