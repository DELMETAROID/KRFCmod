package rider.wmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import rider.wmod.init.ItemInit;

public class TabHiddenItems extends CreativeTabs
{
	public TabHiddenItems(String label)
	{
		super("TabHiddenItems");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.SPADE_A);
	}
}
