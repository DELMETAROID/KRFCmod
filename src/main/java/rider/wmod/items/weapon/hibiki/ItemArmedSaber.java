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
import rider.wmod.util.IHasModel;

public class ItemArmedSaber extends ItemSword implements IHasModel
{
	double s=0.1;
	int r=10;

	public ItemArmedSaber(String name,ToolMaterial material,CreativeTabs tab)
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
	public ActionResult<ItemStack> onItemRightClick(World worldIn,EntityPlayer playerIn,EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		ItemStack hibiki_head =new ItemStack(ItemInit.HIBIKI_HEAD_KURENAI,1);
		//		ItemStack hibiki_body =new ItemStack(ItemInit.HIBIKI_BODY_ARMED,1);

		ItemStack armedsaber_open =new ItemStack(ItemInit.ARMED_SABER_OPEN,1);

		EntityEquipmentSlot entityequipmentslot3 = EntityLiving.getSlotForItemStack(hibiki_head);
		//		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(hibiki_body);

		if((playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.HIBIKI_HEAD
				||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.HIBIKI_HEAD_KURENAI)
				&&playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.HIBIKI_BODY) 
		{
			playerIn.swingArm(handIn);	
			//				playerIn.setItemStackToSlot(entityequipmentslot3, hibiki_head);
			//				playerIn.setItemStackToSlot(entityequipmentslot2, hibiki_body);;
//			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
//		}
//		else if(playerIn.isSneaking())
			//			  		if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.HIBIKI_HEAD_KURENAI
			//			&&playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.HIBIKI_BODY_ARMED) 
//		{
			armedsaber_open.damageItem(this.getDamage(itemstack), playerIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, armedsaber_open);
		}
		else {
			return new ActionResult<ItemStack>(EnumActionResult.FAIL,itemstack);
		}
	}
}

