package rider.wmod.items.tools.ryuki;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;


public class ItemBlankDeck extends Item implements IHasModel
{
	int n =4;
	int count =0;
	Random rand = new Random();
	
	public ItemBlankDeck(String name,CreativeTabs tab) 
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
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		ItemStack itemstack = player.getHeldItem(hand);
		
		ItemStack itemstack2 = new ItemStack(ItemInit.V_BUCKLE, 1);
		EntityEquipmentSlot driverslot = EntityLiving.getSlotForItemStack(itemstack2);
		ItemStack erase_vbuckle = this.findAmmo(player,ItemInit.V_BUCKLE);

		if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)
				||player.inventory.armorItemInSlot(1).getItem()==ItemInit.V_BUCKLE
				){
			return EnumActionResult.FAIL;
		}
		else
		{
			IBlockState iblockstate = worldIn.getBlockState(pos);
			Block block = iblockstate.getBlock();
			Material material = iblockstate.getMaterial();

			if (material==Material.GLASS||material==Material.IRON||material==Material.ICE)
			{
				player.inventory.deleteStack(erase_vbuckle);
				player.setItemStackToSlot(driverslot, itemstack2.copy());
				return EnumActionResult.SUCCESS;
			}
			else 
			{
				return EnumActionResult.PASS;
			}
		}
	}


	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		playerIn.swingArm(handIn);
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack deck1 = new ItemStack(ItemInit.DECK_RYUKI_BLANK, 1);
//		ItemStack deck2 = new ItemStack(ItemInit.DECK_KNIGHT_BLANK, 1);
		ItemStack deck3 = new ItemStack(ItemInit.DECK_OUJA_BLANK, 1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(deck1);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);

		ItemStack itemstack2 = new ItemStack(ItemInit.V_BUCKLE, 1);
		EntityEquipmentSlot driverslot = EntityLiving.getSlotForItemStack(itemstack2);
		ItemStack erase_vbuckle = this.findAmmo(playerIn,ItemInit.V_BUCKLE);
		int r=0;
		r=rand.nextInt(3);// 1/3

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.V_BUCKLE)
			{
				if (itemstack1.isEmpty())
				{
					if(r==1) {playerIn.setItemStackToSlot(entityequipmentslot, deck1.copy());}
					else if(r==2) {playerIn.setItemStackToSlot(entityequipmentslot, deck1.copy());}
					else {playerIn.setItemStackToSlot(entityequipmentslot, deck3.copy());}	
					
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else
				{
					if(r==1) {playerIn.setItemStackToSlot(entityequipmentslot, deck1.copy());}
					else if(r==2) {playerIn.setItemStackToSlot(entityequipmentslot, deck3.copy());}
					else {playerIn.setItemStackToSlot(entityequipmentslot, deck1.copy());}	
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
			}
			else
			{
				RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);
				ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(playerIn, worldIn, itemstack, raytraceresult);
				if (ret != null) return ret;

				if (raytraceresult == null)
				{
					return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
				}
				else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
				{
					return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
				}
				else
				{
					BlockPos blockpos = raytraceresult.getBlockPos();

					if (!worldIn.isBlockModifiable(playerIn, blockpos))
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else
					{
						if (!playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
						{
							return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
						}
						else
						{
							IBlockState iblockstate = worldIn.getBlockState(blockpos);
							Material material = iblockstate.getMaterial();

							if (material == Material.WATER && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0)
							{
								playerIn.inventory.deleteStack(erase_vbuckle);
								playerIn.setItemStackToSlot(driverslot, itemstack2.copy());
								return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
							}
							else
							{
								return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
							}
						}
					}
				}
			}
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
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