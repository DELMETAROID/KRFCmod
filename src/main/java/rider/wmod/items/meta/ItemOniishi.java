package rider.wmod.items.meta;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.Wmod;
import rider.wmod.init.MetaItemInit;
import rider.wmod.util.IHasModel;

public class ItemOniishi extends Item implements IHasModel
{

	public ItemOniishi() {
		setUnlocalizedName("oniishi");
		setRegistryName("oniishi");
		setCreativeTab(Wmod.TabKamenRiderHIBIKI);
		setMaxStackSize(64);
		this.setHasSubtypes(true);
		MetaItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		for(int i = 0; i < 16; i++){
			Wmod.proxy.registerModelwithMeta(this,i,"oniishi_");
		}
	}


	//翻訳名を変更する。後ろに.nameが着くためその前まで。
	public String getUnlocalizedName(ItemStack stack) {
		int i = stack.getMetadata();
		return "item.oniishi." + i;
	}
	
	public String getRegistryName(ItemStack stack) {
		int i = stack.getMetadata();
		return "oniishi_" + i;
	}

	//クリエイティブタブに複数のアイテムを登録する。
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < 16; ++i) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}
}
