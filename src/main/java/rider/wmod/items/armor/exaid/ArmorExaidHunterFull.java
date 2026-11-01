package rider.wmod.items.armor.exaid;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
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

public class ArmorExaidHunterFull extends Item implements IHasModel
{
	public static int DriverCheck=0;
	public static int isInvisible=0;
	public static int GashatLevel=5;
	public static int DoublegashatIn=0;
	public static int Atk=0;
	public static int Def=0;
	public static int Spd=0;
	public static int Hst=0;
	public static int Jmp=2;

	public ArmorExaidHunterFull(String name,CreativeTabs tab)
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
		
		//		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		
		//		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack nexthunter = new ItemStack(ItemInit.GashatHUNTER_FANG, 1);

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, nexthunter);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.hunter_z"));
		tooltip.add(I18n.format("tip.cannotequip"));
		tooltip.add(I18n.format("Level %d",GashatLevel));
	}
}