package rider.wmod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import rider.wmod.util.Reference;

public class ClientProxy extends CommonProxy
{
	public void registerModel(Item item, int meta)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}

	public void registerModelwithMeta(Item item, int meta, String path)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation("wmod", path + meta),"inventory"));
	}
	
	@Override
	public void registerVariantRenderer(Item item,int meta,String filename,String id)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID,filename),id));
	}

}