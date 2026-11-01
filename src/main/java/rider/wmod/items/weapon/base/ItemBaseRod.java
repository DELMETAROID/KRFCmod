package rider.wmod.items.weapon.base;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.Wmod;
import rider.wmod.init.BlockInit;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemBaseRod extends ItemTool implements IHasModel
{
    private static final Set<Block> effectiveBlocks = Sets.newHashSet(BlockInit.FAKE_DIAMOND_BLOCK);
	
	public ItemBaseRod(String name,CreativeTabs tab,float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn) {
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
		if (EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByID(22), stack) <= 0)
		{
			stack.addEnchantment(Enchantment.getEnchantmentByID(22),5);
		}
		if (EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByID(19), stack) <= 0)
		{
			stack.addEnchantment(Enchantment.getEnchantmentByID(19),2);
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
