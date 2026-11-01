package rider.wmod.items.weapon.geats;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemRaiseDrill extends ItemTool implements IHasModel
{
	private static final Set<Block> effectiveBlocks = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE,
			Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE,
			Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE,
			Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE,
			Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.CONCRETE_POWDER,Blocks.OBSIDIAN);

	public ItemRaiseDrill(String name,CreativeTabs tab,float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn) {
		super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocks);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);

		ItemInit.ITEMS.add(this);
		this.setMaxDamage(materialIn.getMaxUses());
		this.attackDamage = attackDamageIn-1;
		this.attackSpeed = attackSpeedIn-4;
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
	{
		if (EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByID(32), stack) <= 0)
		{
			stack.addEnchantment(Enchantment.getEnchantmentByID(32),4);
		}
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return false;
	}

	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return EnumRarity.COMMON;
	}
}
