package rider.wmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import rider.wmod.Wmod;
import rider.wmod.blocks.BlockBase;
import rider.wmod.blocks.BlockMagicStoneOre;
import rider.wmod.blocks.BlockOniishiOre;
import rider.wmod.blocks.BlockStonePillar;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	//kuuga
	public static final Block STONE_PILLAR_BLOCK = new BlockStonePillar("stone_pillar_block", Material.ROCK, CreativeTabs.BUILDING_BLOCKS);
//	public static final Block COFFIN_KUUGA = new BlockCoffinKuuga("coffin_kuuga", Material.ROCK, Wmod.TabKamenRiderDecade);
	
	//hibiki
	public static final Block ONIISHI_ORE = new BlockOniishiOre("oniishi_ore",Wmod.TabKamenRiderHIBIKI);
	public static final Block ONIISHI_ORE_KURENAI = new BlockOniishiOre("oniishi_ore_kurenai",Wmod.TabKamenRiderHIBIKI);

	//kabuto
	public static final Block MARK_KABUTO = new BlockBase("mark_kabuto", Material.ROCK, Wmod.TabKamenRiderKABUTO);

	//wizard
  	public static final Block MAGICSTONE_ORE_BLACK = new BlockMagicStoneOre("magicstoneore_black", Wmod.TabKamenRiderWIZARD);
  	public static final Block MAGICSTONE_ORE_RED = new BlockMagicStoneOre("magicstoneore_red",Wmod.TabKamenRiderWIZARD);
  	public static final Block MAGICSTONE_ORE_BLUE = new BlockMagicStoneOre("magicstoneore_blue",Wmod.TabKamenRiderWIZARD);
  	public static final Block MAGICSTONE_ORE_GREEN = new BlockMagicStoneOre("magicstoneore_green",Wmod.TabKamenRiderWIZARD);
  	public static final Block MAGICSTONE_ORE_YELLOW = new BlockMagicStoneOre("magicstoneore_yellow",Wmod.TabKamenRiderWIZARD);
// 	public static final Block CONNECT_BOX = new BlockConnectBox("magicstoneore_yellow",Wmod.TabKamenRiderWizard);

	//gaim
 // 	public static final Block CRACK_HELHEIM = new BlockClackHelheim("clack_helheim",Wmod.TabKamenRiderGaim);

  	//ghost

	//exaid
//	public static final Block GAME_AREA_ACTION = new BlockBase("gamearea_action",Material.BARRIER,Wmod.TabKamenRiderExaid);

	//build
	public static final Block FAKE_DIAMOND_BLOCK = new BlockBase("fake_diamond_block", Material.ANVIL,Blocks.BARRIER.getCreativeTabToDisplayOn());

	//zio

	//reiwa

}
