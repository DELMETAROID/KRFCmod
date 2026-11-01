package rider.wmod.items.weapon.base;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.Wmod;
import rider.wmod.init.BlockInit;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemBaseWeapon extends ItemTool implements IHasModel
{
    private static final Set<Block> effectiveBlocks = Sets.newHashSet(BlockInit.FAKE_DIAMOND_BLOCK);
	
	public ItemBaseWeapon(String name,CreativeTabs tab,float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn) {
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
