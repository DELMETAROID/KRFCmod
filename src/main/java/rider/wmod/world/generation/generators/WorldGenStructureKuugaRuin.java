package rider.wmod.world.generation.generators;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;
import rider.wmod.util.Reference;
import rider.wmod.util.interfaces.IStructure;

public class WorldGenStructureKuugaRuin extends WorldGenerator implements IStructure{

	public static String structurename;
	
	public WorldGenStructureKuugaRuin(String name) {
		WorldGenStructureKuugaRuin.structurename = name;
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		WorldGenStructureKuugaRuin.generateStructure(worldIn, position);
		return true;
	}
	
	public static void generateStructure(World world,BlockPos pos) 
	{
		MinecraftServer mcServer = world.getMinecraftServer();
		TemplateManager manager = worldserver.getStructureTemplateManager();
		ResourceLocation location = new ResourceLocation(Reference.MODID,structurename);
		Template template =manager.get(mcServer, location);
		
		if(template!=null) {
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
			template.addBlocksToWorldChunk(world, pos, settings);
		}
	}
	
	
}
