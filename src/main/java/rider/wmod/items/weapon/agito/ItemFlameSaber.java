package rider.wmod.items.weapon.agito;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumHand;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemFlameSaber extends ItemSword implements IHasModel
{

	public ItemFlameSaber(String name,ToolMaterial material,CreativeTabs tab)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		if(name=="agito_flame_saber") {
			setCreativeTab(tab);
		}else {
			setCreativeTab(Blocks.BARRIER.getCreativeTabToDisplayOn());
		}
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity,EnumHand hand)
	{
		ItemStack sword = player.getHeldItem(hand);
		ItemStack sword_awaken =new ItemStack(ItemInit.FLAME_SABER_AWAKEN,1);

		if (entity.world.isRemote)
		{
			return false;
		}
		if (entity instanceof EntityMob)
		{
			if(player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND)==sword)
			{
				player.swingArm(hand);
				player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,sword_awaken.copy());
				return true;
			}
		}
		return false;
	}
}