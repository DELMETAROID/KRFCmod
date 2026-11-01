package rider.wmod.items.weapon.exaid;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemGashaconBugviserSaw extends ItemSword implements IHasModel
{
	public ItemGashaconBugviserSaw(String name,ToolMaterial material,CreativeTabs tab)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Blocks.BARRIER.getCreativeTabToDisplayOn());
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	//効果
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack itemstack2 =new ItemStack(ItemInit.GashaconBugviser_beamgun,1);
		ItemStack itemstack3 =new ItemStack(ItemInit.GashaconBugviserZwei_beamgun,1);

		if(playerIn.isSneaking()) {
			if(itemstack.getItem()==ItemInit.GashaconBugviser_chainsaw) {
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack2);
			}else {
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack3);
			}
		}
		else {
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("mode.chainsaw"));
	}
}