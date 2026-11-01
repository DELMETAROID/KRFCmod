package rider.wmod.items.weapon.base;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityRaiseChainarray;
import rider.wmod.init.BlockInit;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemBaseChainArray extends ItemTool implements IHasModel
{
	private static final Set<Block> effectiveBlocks = Sets.newHashSet(BlockInit.FAKE_DIAMOND_BLOCK);
	int n =2;
	double s=0.1;
	int r=20;

	public ItemBaseChainArray(String name,CreativeTabs tab,float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn) {
		super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocks);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);

		ItemInit.ITEMS.add(this);
		this.setMaxDamage(materialIn.getMaxUses());
		this.attackDamage = attackDamageIn-1;
		this.attackSpeed = attackSpeedIn-4;

		if(name=="raise_chainarray")
		{
			setCreativeTab(tab);
		}else {
			setCreativeTab(Blocks.BARRIER.getCreativeTabToDisplayOn());
		}
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		playerIn.swingArm(handIn);
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		Vec3d aim =playerIn.getLookVec();
		EntityRaiseChainarray fire = new EntityRaiseChainarray(worldIn,playerIn,1,1,1,6);
		fire.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

		ItemStack itemstack2 = new ItemStack(ItemInit.RAISE_CHAINARRAY, 1);
		ItemStack itemstack3 = new ItemStack(ItemInit.RAISE_CHAINARRAY_SHOOT, 1);

		if(itemstack.getItem()==ItemInit.RAISE_CHAINARRAY)
		{
			if(playerIn.inventory.armorItemInSlot(2) != null
					&& playerIn.inventory.armorItemInSlot(1) != null
					&& playerIn.inventory.armorItemInSlot(0) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER
						&&(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_CHAINARRAY_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_CHAINARRAY
						||playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SP_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SP))
				{

					fire.accelerationX=aim.x*s;
					fire.accelerationY=aim.y*s;
					fire.accelerationZ=aim.z*s;
					itemstack.setItemDamage(1);
					playerIn.getCooldownTracker().setCooldown(this, r);

					if(!worldIn.isRemote)
					{
						worldIn.spawnEntity(fire);
					}
					itemstack3.damageItem(this.getDamage(itemstack), playerIn);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack3);

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
		else if(itemstack.getItem()==ItemInit.RAISE_CHAINARRAY_SHOOT) 
		{
			itemstack2.damageItem(this.getDamage(itemstack), playerIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);	
		}
		else 
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}

}
