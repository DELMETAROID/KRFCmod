package rider.wmod.items.weapon.hibiki;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.init.MetaItemInit;
import rider.wmod.util.IHasModel;

public class ItemOnsaken extends ItemSword implements IHasModel
{
	public ItemOnsaken(String name,ToolMaterial material,CreativeTabs tab)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack onkaku =new ItemStack(MetaItemInit.HIBIKI_ONKAKU,1,0);

		ItemStack hibiki_head =new ItemStack(ItemInit.HIBIKI_HEAD,1);
		ItemStack hibiki_body =new ItemStack(ItemInit.HIBIKI_BODY,1);

		EntityEquipmentSlot entityequipmentslot3 = EntityLiving.getSlotForItemStack(hibiki_head);
		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(hibiki_body);
		
		if(playerIn.isSneaking())
		{
			if((playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.HIBIKI_HEAD
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.HIBIKI_HEAD_KURENAI)
					&& playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.HIBIKI_BODY)//響鬼中
			{
				playerIn.setItemStackToSlot(entityequipmentslot3, ItemStack.EMPTY);//スロットへ
//				playerIn.setItemStackToSlot(entityequipmentslot2, ItemStack.EMPTY);//スロットへ

			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, onkaku);
		}
		else {
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}
}