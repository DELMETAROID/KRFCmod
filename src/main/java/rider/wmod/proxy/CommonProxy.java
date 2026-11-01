package rider.wmod.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

public class CommonProxy
{
	public void registerModel(Item item,int meta) {}
	public void registerModelwithMeta(Item item,int meta,String path) {}
	public void init() {}
    public EntityPlayer getEntityPlayerInstance() {return null;}
	public void registerVariantRenderer(Item item,int meta,String filename,String id) {}
}
