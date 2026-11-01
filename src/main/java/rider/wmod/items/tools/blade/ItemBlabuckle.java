package rider.wmod.items.tools.blade;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemBlabuckle extends Item implements IHasModel
{
	public ItemBlabuckle(String name,CreativeTabs tab)
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
}