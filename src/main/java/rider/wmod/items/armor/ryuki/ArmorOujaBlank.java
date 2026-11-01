package rider.wmod.items.armor.ryuki;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.ryuki.ModelOujaBlank;
import rider.wmod.util.IHasModel;


public class ArmorOujaBlank extends ItemArmor implements IHasModel
{
	public static int DriverCheck=0;
	public static int isInvisible=0;

	public ArmorOujaBlank(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, 1, equipmentSlotIn);
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
	public ModelBiped getArmorModel(EntityLivingBase entityliving,ItemStack itemstack,EntityEquipmentSlot armorslot,ModelBiped _default)
	{
		if(itemstack != ItemStack.EMPTY)
		{
			if(itemstack.getItem() instanceof ItemArmor)
			{
				ModelOujaBlank model = new ModelOujaBlank();
				model.bipedBody.showModel =armorslot ==EntityEquipmentSlot.HEAD;
				model.isChild= _default.isChild;
				model.isRiding=_default.isRiding;
				model.isSneak= _default.isSneak;
				model.rightArmPose=_default.rightArmPose;
				model.leftArmPose= _default.leftArmPose;

				return model;
			}
		}return null;
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
		ItemStack deck = new ItemStack(ItemInit.DECK_OUJA_BLANK, 1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(deck);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);

		ItemStack itemstack2 = new ItemStack(ItemInit.V_BUCKLE, 1);
		EntityEquipmentSlot driverslot = EntityLiving.getSlotForItemStack(itemstack2);
		ItemStack erase_vbuckle = this.findAmmo(playerIn,ItemInit.V_BUCKLE);


		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.V_BUCKLE)
			{
				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, deck.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, deck.copy());
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
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.V_BUCKLE)
			{
				DriverCheck=1;
			}
			else
			{
				DriverCheck=0;
			}
		}
		else
		{
			DriverCheck=0;
		}

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
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

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.ouja"));
	}
}