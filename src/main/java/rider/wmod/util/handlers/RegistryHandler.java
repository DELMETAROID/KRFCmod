package rider.wmod.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rider.wmod.init.BlockInit;
import rider.wmod.init.EntityInit;
import rider.wmod.init.ItemInit;
import rider.wmod.init.MetaItemInit;
import rider.wmod.util.IHasModel;
import rider.wmod.world.generation.WorldGenCustomOres;
import rider.wmod.world.generation.WorldGenCustomStructures;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{	
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
		event.getRegistry().registerAll(MetaItemInit.ITEMS.toArray(new Item[0]));
		
		GameRegistry.addSmelting(BlockInit.ONIISHI_ORE, new ItemStack(MetaItemInit.ONIISHI,1,8), 10);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}


	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		
		for(Item item : MetaItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}


		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}

	public static void preInitRegistries()
	{
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
//		BiomeInit.registerBiomes();
//		DimensionInit.registerDimension();
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(),0);
//		GameRegistry.registerWorldGenerator(new WorldGenCustomTrees(),0);
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
//		event.registerServerCommand(new CommandDimensionTeleport());
	}
}