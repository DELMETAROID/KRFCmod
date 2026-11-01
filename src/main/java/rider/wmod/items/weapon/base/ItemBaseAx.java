package rider.wmod.items.weapon.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemBaseAx extends ItemAxe implements IHasModel
{
    public ItemBaseAx(ToolMaterial materialIn,float attackDamageIn, float attackSpeedIn) {
		super(materialIn,attackDamageIn,attackSpeedIn);
	}
    
	public ItemBaseAx(String name,CreativeTabs tab,float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn) {
		super(materialIn,attackDamageIn,attackSpeedIn);
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
