package rider.wmod.world.generation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeForestMutated;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeSavanna;
import net.minecraft.world.biome.BiomeSwamp;
import net.minecraft.world.biome.BiomeTaiga;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import rider.wmod.world.generation.generators.WorldGenStructureDarkKabutoMark;
import rider.wmod.world.generation.generators.WorldGenStructureDyno;
import rider.wmod.world.generation.generators.WorldGenStructureKabutoMark;
import rider.wmod.world.generation.generators.WorldGenStructureKuugaRuin;
import rider.wmod.world.generation.generators.WorldGenStructureKuwa;
import rider.wmod.world.generation.generators.WorldGenStructureLion;
import rider.wmod.world.generation.generators.WorldGenStructureSai;
import rider.wmod.world.generation.generators.WorldGenStructureShachi;
import rider.wmod.world.generation.generators.WorldGenStructureTaka;


public class WorldGenCustomStructures implements IWorldGenerator
{
	public static final WorldGenStructureKuugaRuin KUUGA_RUIN = new WorldGenStructureKuugaRuin("kuuga_ruin");
	
	public static final WorldGenStructureKabutoMark KABUTO_MARK = new WorldGenStructureKabutoMark("kabuto_mark");
	public static final WorldGenStructureDarkKabutoMark DARKKABUTO_MARK = new WorldGenStructureDarkKabutoMark("darkkabuto_mark");
	
	public static final WorldGenStructureTaka OOO_RUIN_TAKA = new WorldGenStructureTaka("ooo_ruin_taka2");
	public static final WorldGenStructureKuwa OOO_RUIN_KUWA = new WorldGenStructureKuwa("ooo_ruin_kuwa2");
	public static final WorldGenStructureLion OOO_RUIN_LION = new WorldGenStructureLion("ooo_ruin_lion2");
	public static final WorldGenStructureSai OOO_RUIN_SAI = new WorldGenStructureSai("ooo_ruin_sai");
	public static final WorldGenStructureShachi OOO_RUIN_SHACHI = new WorldGenStructureShachi("ooo_ruin_shachi");
	public static final WorldGenStructureDyno OOO_RUIN_DYNO = new WorldGenStructureDyno("ooo_ruin_dyno");

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkePrvider) {
		if (world.provider.getDimension() == 0) {
			
			this.generateStructureKUUGARUIN(KUUGA_RUIN, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeForest.class);
			this.generateStructureKUUGARUIN(KUUGA_RUIN, world, random, chunkX, chunkZ, 450, Blocks.GRASS, BiomeHills.class);
			
			this.generateStructureKABUTOMARK(KABUTO_MARK, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeForest.class);
			this.generateStructureKABUTOMARK(KABUTO_MARK, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeJungle.class);
			this.generateStructureKABUTOMARK(KABUTO_MARK, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeTaiga.class);
			this.generateStructureKABUTOMARK(KABUTO_MARK, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeForestMutated.class);
			
			this.generateStructureDarkKABUTOMARK(DARKKABUTO_MARK, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeForest.class);
			this.generateStructureDarkKABUTOMARK(DARKKABUTO_MARK, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeJungle.class);
			this.generateStructureDarkKABUTOMARK(DARKKABUTO_MARK, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeTaiga.class);
			this.generateStructureDarkKABUTOMARK(DARKKABUTO_MARK, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeForestMutated.class);
			
			this.generateStructureOOOTAKA(OOO_RUIN_TAKA, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeForest.class);
			this.generateStructureOOOKUWA(OOO_RUIN_KUWA, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeForest.class);
			this.generateStructureOOOLION(OOO_RUIN_LION, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeForest.class);
			this.generateStructureOOOSAI(OOO_RUIN_SAI, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeForest.class);
			this.generateStructureOOOSHACHI(OOO_RUIN_SHACHI, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeForest.class);
			this.generateStructureOOODYNO(OOO_RUIN_DYNO, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeForest.class);
			
			this.generateStructureOOOTAKA(OOO_RUIN_TAKA, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeJungle.class);
			this.generateStructureOOOKUWA(OOO_RUIN_KUWA, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeJungle.class);
			this.generateStructureOOOLION(OOO_RUIN_LION, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeJungle.class);
			this.generateStructureOOOSAI(OOO_RUIN_SAI, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeJungle.class);
			this.generateStructureOOOSHACHI(OOO_RUIN_SHACHI, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomeJungle.class);
			this.generateStructureOOODYNO(OOO_RUIN_DYNO, world, random, chunkX, chunkZ, 700, Blocks.GRASS, BiomeJungle.class);
		
			this.generateStructureOOOTAKA(OOO_RUIN_TAKA, world, random, chunkX, chunkZ, 550, Blocks.GRASS, BiomePlains.class);
			this.generateStructureOOOKUWA(OOO_RUIN_KUWA, world, random, chunkX, chunkZ, 350, Blocks.GRASS, BiomeTaiga.class);
			this.generateStructureOOOLION(OOO_RUIN_LION, world, random, chunkX, chunkZ, 350, Blocks.GRASS, BiomeSavanna.class);
			this.generateStructureOOOSAI(OOO_RUIN_SAI, world, random, chunkX, chunkZ, 250, Blocks.GRASS, BiomeHills.class);
			this.generateStructureOOOSHACHI(OOO_RUIN_SHACHI, world, random, chunkX, chunkZ,250, Blocks.GRASS, BiomeSwamp.class);
		}
	}
	
	private void generateStructureKUUGARUIN(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkX * 16) + random.nextInt(15) +8;
		int z = (chunkZ * 16) + random.nextInt(15) +8;
		int y = CalculationY(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		if (world.getWorldType() != WorldType.FLAT) {
			if (classesList.contains(biome)) {
				if (random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	private void generateStructureKABUTOMARK(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkX * 16) + random.nextInt(15) +8;
		int z = (chunkZ * 16) + random.nextInt(15) +8;
		int y = CalculationY(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		if (world.getWorldType() != WorldType.FLAT) {
			if (classesList.contains(biome)) {
				if (random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	private void generateStructureDarkKABUTOMARK(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkX * 16) + random.nextInt(15) +8;
		int z = (chunkZ * 16) + random.nextInt(15) +8;
		int y = CalculationY(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		if (world.getWorldType() != WorldType.FLAT) {
			if (classesList.contains(biome)) {
				if (random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	private void generateStructureOOOTAKA(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkX * 16) + random.nextInt(15) +8;
		int z = (chunkZ * 16) + random.nextInt(15) +8;
		int y = CalculationY(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		if (world.getWorldType() != WorldType.FLAT) {
			if (classesList.contains(biome)) {
				if (random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);
				}
			}
		}
	}

	private void generateStructureOOOKUWA(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkX * 16) + random.nextInt(15) +8;
		int z = (chunkZ * 16) + random.nextInt(15) +8;
		int y = CalculationY(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		if (world.getWorldType() != WorldType.FLAT) {
			if (classesList.contains(biome)) {
				if (random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);
				}
			}
		}
	}

	private void generateStructureOOOLION(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkX * 16) + random.nextInt(15) +8;
		int z = (chunkZ * 16) + random.nextInt(15) +8;
		int y = CalculationY(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		if (world.getWorldType() != WorldType.FLAT) {
			if (classesList.contains(biome)) {
				if (random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);

				}
			}
		}
	}
	
	private void generateStructureOOOSAI(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkX * 16) + random.nextInt(15) +8;
		int z = (chunkZ * 16) + random.nextInt(15) +8;
		int y = CalculationY(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		if (world.getWorldType() != WorldType.FLAT) {
			if (classesList.contains(biome)) {
				if (random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);

				}
			}
		}
	}
	
	private void generateStructureOOOSHACHI(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkX * 16) + random.nextInt(15) +8;
		int z = (chunkZ * 16) + random.nextInt(15) +8;
		int y = CalculationY(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		if (world.getWorldType() != WorldType.FLAT) {
			if (classesList.contains(biome)) {
				if (random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);

				}
			}
		}
	}

	private void generateStructureOOODYNO(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkX * 16) + random.nextInt(15) +8;
		int z = (chunkZ * 16) + random.nextInt(15) +8;
		int y = CalculationY(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		if (world.getWorldType() != WorldType.FLAT) {
			if (classesList.contains(biome)) {
				if (random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);

				}
			}
		}
	}

	private static int CalculationY(World world,int x,int z,Block topBlock) 
	{
		int y= world.getHeight();
		boolean foundGround =false;
		boolean underGround =false;

		while(!foundGround && y-- >=0) 
		{
			Block block =world.getBlockState(new BlockPos(x,y,z)).getBlock();
			Block underblock =world.getBlockState(new BlockPos(x,y-1,z)).getBlock();
			Block air = Blocks.AIR;
			Block water = Blocks.WATER;
			
			underGround = underblock ==topBlock;

			if(!underGround ) {
				Block centerblock =world.getBlockState(new BlockPos(x+4,y,z+4)).getBlock();
				if(Block.isEqualTo(centerblock, air)||Block.isEqualTo(centerblock, water))
				{
					foundGround = false;
				}else {
					foundGround = block ==topBlock;
				}
			}else {
				foundGround = false;
			}
		}

		return y+1;
	}
}