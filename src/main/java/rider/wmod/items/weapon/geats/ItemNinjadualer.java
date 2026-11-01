package rider.wmod.items.weapon.geats;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemNinjadualer extends ItemSword implements IHasModel
{
	public ItemNinjadualer(String name,ToolMaterial material,CreativeTabs tab)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		if(name=="ninja_dualer_single")
		{
			setCreativeTab(tab);
		}else {
			setCreativeTab(Blocks.BARRIER.getCreativeTabToDisplayOn());
		}
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn,EntityPlayer playerIn,EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack itemstack2 = playerIn.getHeldItem(EnumHand.MAIN_HAND);
		ItemStack itemstack3 = playerIn.getHeldItem(EnumHand.OFF_HAND);
		ItemStack itemstackS = new ItemStack(ItemInit.NINJA_DUALER_SINGLE, 1);
		ItemStack itemstackA = new ItemStack(ItemInit.NINJA_DUALER_TWIN_A, 1);
		ItemStack itemstackB = new ItemStack(ItemInit.NINJA_DUALER_TWIN_B, 1);
		Vec3d aim =playerIn.getLookVec();

		if(playerIn.isSneaking())
		{
			playerIn.swingArm(handIn);
			if((itemstack2.getItem()==ItemInit.NINJA_DUALER_TWIN_A
					&&itemstack3.getItem()==ItemInit.NINJA_DUALER_TWIN_B)
			||(itemstack2.getItem()==ItemInit.NINJA_DUALER_TWIN_B
					&&itemstack3.getItem()==ItemInit.NINJA_DUALER_TWIN_A))
			{
				playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, ItemStack.EMPTY);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstackS);
			}else if(itemstack.getItem()==ItemInit.NINJA_DUALER_SINGLE)
			{
				playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, itemstackA);
				playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, itemstackB);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstackA);
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);

	}
}