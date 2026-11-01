package rider.wmod.world.generation;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import rider.wmod.init.BlockInit;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator magic_ore_black;
	private WorldGenerator magic_ore_red;
	private WorldGenerator magic_ore_blue;
	private WorldGenerator magic_ore_green;
	private WorldGenerator magic_ore_yellow;
	private WorldGenerator oniishi_ore;
	private WorldGenerator oniishi_ore_kurenai;
	
	//private WorldGenerator copper_ore_nether, copper_ore_end;
	
	public WorldGenCustomOres() 
	{
		magic_ore_black = new WorldGenMinable(BlockInit.MAGICSTONE_ORE_BLACK.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		magic_ore_red = new WorldGenMinable(BlockInit.MAGICSTONE_ORE_RED.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		magic_ore_blue = new WorldGenMinable(BlockInit.MAGICSTONE_ORE_BLUE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		magic_ore_green = new WorldGenMinable(BlockInit.MAGICSTONE_ORE_GREEN.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		magic_ore_yellow = new WorldGenMinable(BlockInit.MAGICSTONE_ORE_YELLOW.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oniishi_ore = new WorldGenMinable(BlockInit.ONIISHI_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oniishi_ore_kurenai = new WorldGenMinable(BlockInit.ONIISHI_ORE_KURENAI.getDefaultState(), 2, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			//runGenerator(copper_ore_nether, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 0:
			
			runGenerator(magic_ore_black, world, random, chunkX, chunkZ, 9, 30, 70);
			runGenerator(magic_ore_red, world, random, chunkX, chunkZ, 5, 30, 70);
			runGenerator(magic_ore_blue, world, random, chunkX, chunkZ, 5, 30, 70);
			runGenerator(magic_ore_green, world, random, chunkX, chunkZ, 5, 30, 70);
			runGenerator(magic_ore_yellow, world, random, chunkX, chunkZ, 5, 30, 70);
			runGenerator(oniishi_ore, world, random, chunkX, chunkZ, 5, 20, 50);
			runGenerator(oniishi_ore_kurenai, world, random, chunkX, chunkZ, 3, 20, 50);
			break;
			
		case 1:
			
			//runGenerator(copper_ore_end, world, random, chunkX, chunkZ, 50, 0, 256);
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}