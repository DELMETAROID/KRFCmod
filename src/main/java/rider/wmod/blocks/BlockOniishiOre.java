package rider.wmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import rider.wmod.Wmod;
import rider.wmod.init.BlockInit;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class BlockOniishiOre extends Block implements IHasModel{

	public BlockOniishiOre(String name, CreativeTabs tab)
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHardness(2.0F);
		setHarvestLevel("pickaxe", 1);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
}