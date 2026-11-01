package rider.wmod.tabs;

import java.util.Collections;
import java.util.Comparator;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.init.ItemInit;

public class TabKamenRiderW extends CreativeTabs
{
	public TabKamenRiderW(String label)
	{
		super("KamenRiderW");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.DOUBLE_DRIVER);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void displayAllRelevantItems(NonNullList<ItemStack> list) {
		super.displayAllRelevantItems(list);
		Collections.sort(list, new Alphabetical());
	}

	private static class Alphabetical implements Comparator<Object> {
		@Override
		public int compare(Object o1, Object o2) {
			ItemStack stack1 = ((ItemStack) o1);
			ItemStack stack2 = ((ItemStack) o2);

			Item item1 = stack1.getItem();
			Item item2 = stack2.getItem();

			int value1 = Item.getIdFromItem(item1);
			int value2 = Item.getIdFromItem(item2);

			return value1 == value2 ? stack1.getDisplayName().compareTo(stack2.getDisplayName()) : value1 > value2 ? 1 : -1;
		}
	}
}
