package rider.wmod.items.weapon.ooo;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemMedajaribar extends ItemSword implements IHasModel
{
	public ItemMedajaribar(String name,ToolMaterial material,CreativeTabs tab)
	{
		super(material);
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