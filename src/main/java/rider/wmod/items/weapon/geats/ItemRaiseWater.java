package rider.wmod.items.weapon.geats;

import java.util.Random;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityBlueBullet;
import rider.wmod.entity.EntitySkyblueBullet;
import rider.wmod.init.BlockInit;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemRaiseWater extends ItemTool implements IHasModel
{
	private static final Set<Block> effectiveBlocks = Sets.newHashSet(BlockInit.FAKE_DIAMOND_BLOCK);

	double s=0.005;
	public static Boolean flag=false;
	int bulletleft=10;
	boolean watercharge=false;
	Random rand = new Random();

	public ItemRaiseWater(String name,CreativeTabs tab,float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn)
	{	
		super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocks);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);

		ItemInit.ITEMS.add(this);
		this.setMaxDamage(materialIn.getMaxUses());
		this.attackDamage = attackDamageIn-1;
		this.attackSpeed = attackSpeedIn-4;
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn,EntityPlayer playerIn,EnumHand handIn)
	{
		boolean flag = true;
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack holditem =playerIn.getHeldItemOffhand();
		Vec3d aim =playerIn.getLookVec();
		RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);
		EntityBlueBullet bullet = new EntityBlueBullet(worldIn,playerIn,1,1,1,1);
		EntitySkyblueBullet charge_bullet = new EntitySkyblueBullet(worldIn,playerIn,1,1,1,5);
		
		//		EntityLargeFireball fire = new EntityLargeFireball(worldIn,playerIn,1,1,1);
		bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		s=0.1;
		bullet.accelerationX=aim.x*s;
		bullet.accelerationY=aim.y*s;
		bullet.accelerationZ=aim.z*s;
		
		charge_bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);
		charge_bullet.accelerationX=aim.x*s;
		charge_bullet.accelerationY=aim.y*s;
		charge_bullet.accelerationZ=aim.z*s;

		
		if(playerIn.isInWater())
		{
			watercharge=true;
			bulletleft=10;
		}
		
		if(playerIn.inventory.armorItemInSlot(2) != null
				&& playerIn.inventory.armorItemInSlot(1) != null
				&& playerIn.inventory.armorItemInSlot(0) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER
					&&(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_WATER_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_WATER
					||playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SP_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SP))
			{
				if (raytraceresult == null||raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
				{
					playerIn.swingArm(handIn);

					if(!worldIn.isRemote)
					{
						if(watercharge) 
						{
							worldIn.spawnEntity(charge_bullet);
							bulletleft--;
							if(bulletleft<=0) 
							{
								watercharge=false;
								bulletleft=10;
							}
						}else {
							worldIn.spawnEntity(bullet);
						}
					}
					itemstack.damageItem(1, playerIn);
				}
				else//水
				{
					BlockPos blockpos = raytraceresult.getBlockPos();

					if (!worldIn.isBlockModifiable(playerIn, blockpos))
					{
						playerIn.swingArm(handIn);

						if(!worldIn.isRemote)
						{
							if(watercharge) 
							{
								worldIn.spawnEntity(charge_bullet);
								bulletleft--;
								if(bulletleft<=0) 
								{
									watercharge=false;
									bulletleft=10;
								}
							}else {
								worldIn.spawnEntity(bullet);
							}
						}
						itemstack.damageItem(1, playerIn);
					}
					else
					{
						if (!playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
						{
							playerIn.swingArm(handIn);

							if(!worldIn.isRemote)
							{
								if(watercharge) 
								{
									worldIn.spawnEntity(charge_bullet);
									bulletleft--;
									if(bulletleft<=0) 
									{
										watercharge=false;
										bulletleft=10;
									}
								}else {
									worldIn.spawnEntity(bullet);
								}
							}
							itemstack.damageItem(1, playerIn);
						}
						else
						{
							IBlockState iblockstate = worldIn.getBlockState(blockpos);
							Material material = iblockstate.getMaterial();

							if (material == Material.WATER && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0)
							{
								worldIn.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
								playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
								watercharge=true;
								bulletleft=10;
								return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
							}
							else
							{
								playerIn.swingArm(handIn);

								if(!worldIn.isRemote)
								{
									if(watercharge) 
									{
										worldIn.spawnEntity(charge_bullet);
										bulletleft--;
										if(bulletleft<=0) 
										{
											watercharge=false;
											bulletleft=10;
										}
									}else {
										worldIn.spawnEntity(bullet);
									}
								}
								itemstack.damageItem(1, playerIn);
							}
						}
					}
				}
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
}
