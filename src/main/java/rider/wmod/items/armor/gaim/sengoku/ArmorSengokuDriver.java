package rider.wmod.items.armor.gaim.sengoku;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ArmorSengokuDriver extends Item implements IHasModel
{
	Random rand = new Random();

	public ArmorSengokuDriver(String name,CreativeTabs tab)
	{
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
		ItemStack driver =new ItemStack(ItemInit.MIRAI_DRIVER,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(driver);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);

		ItemStack driver_gaim = new ItemStack (ItemInit.SENGOKU_DRIVER_GAIM,1);
		ItemStack driver_baron = new ItemStack (ItemInit.SENGOKU_DRIVER_BARON,1);
		ItemStack driver_ryugen = new ItemStack (ItemInit.SENGOKU_DRIVER_RYUGEN,1);
		ItemStack driver_zangetsu = new ItemStack (ItemInit.SENGOKU_DRIVER_ZANGETSU,1);
		ItemStack driver_kurokage = new ItemStack (ItemInit.SENGOKU_DRIVER_KUROKAGE,1);
		ItemStack driver_gridon = new ItemStack (ItemInit.SENGOKU_DRIVER_GRIDON,1);
		ItemStack driver_bravo = new ItemStack (ItemInit.SENGOKU_DRIVER_BRAVO,1);
		ItemStack driver_bujingaim = new ItemStack (ItemInit.SENGOKU_DRIVER_BUJIN_GAIM,1);
		ItemStack driver_blackbaron = new ItemStack (ItemInit.SENGOKU_DRIVER_BLACKBARON,1);

		int r=rand.nextInt(8);
		if(itemstack1!=null) 
		{
			switch(r) 
			{
			case 0:
				playerIn.setItemStackToSlot(EntityEquipmentSlot.LEGS,driver_gaim);	
				break;
			case 1:
				playerIn.setItemStackToSlot(EntityEquipmentSlot.LEGS,driver_baron);	
				break;
			case 2:
				playerIn.setItemStackToSlot(EntityEquipmentSlot.LEGS,driver_ryugen);	
				break;
			case 3:
				playerIn.setItemStackToSlot(EntityEquipmentSlot.LEGS,driver_zangetsu);	
				break;
			case 4:
				playerIn.setItemStackToSlot(EntityEquipmentSlot.LEGS,driver_kurokage);	
				break;
			case 5:
				playerIn.setItemStackToSlot(EntityEquipmentSlot.LEGS,driver_gridon);	
				break;
			case 6:
				playerIn.setItemStackToSlot(EntityEquipmentSlot.LEGS,driver_bravo);	
				break;
			case 7:
				playerIn.setItemStackToSlot(EntityEquipmentSlot.LEGS,driver_bujingaim);	
				break;
			case 8:
				playerIn.setItemStackToSlot(EntityEquipmentSlot.LEGS,driver_blackbaron);	
				break;
			}

			itemstack.setCount(0);
			if (itemstack1.isEmpty())
			{
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
			}
		}else {
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.uninitialized"));
	}

	public static boolean SengokuDriverCheck(EntityPlayer playerIn) 
	{
		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_GAIM
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_BARON
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_RYUGEN
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_ZANGETSU
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_KUROKAGE
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_GRIDON
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_BRAVO
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_KNUCKLE
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_MASS
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_BUJIN_GAIM
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.SENGOKU_DRIVER_BLACKBARON)
			{
				return true;
			}		
			else {
				return false;
			}		
		}
		return false;
	}
	

	public static boolean LSCheck(EntityPlayer playerIn) 
	{
		if(playerIn.inventory.armorItemInSlot(3) != null)
		{
			if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_MATSUBOKKURI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_KURUMI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_DONGRI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_MELON
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_PINE
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_ICHIGO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_ORANGE
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_BANANA
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_BUDOU
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_SUICA
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_MANGO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_DORIAN
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_KIWI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_LYCHEE

					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_LEMON
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_BLOOD_ORANGE
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_ORANGE_BLACK
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_ORANGE_FRESH
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_KING_DORIAN
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_YOMI
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_GOLDEN
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_SILVER
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_DARKNESS
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_RINGO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_WATERMELON
//					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_ZAKURO
					||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.LS_HELHEIM)
			{
				return true;
			}		
			else {
				return false;
			}		
		}
		return false;
	}


	public static void deleteArmsWeapon(EntityPlayer playerIn) 
	{
		Item musou_saber = ItemInit.AW_MUSOU_SABER;
		Item aw01 = ItemInit.AW_MATSUBOKKURI;
		Item aw03 = ItemInit.AW_DONGRI;
		Item aw04 = ItemInit.AW_MELON;
		//		Item aw05 = ItemInit.AW_PINE;
		//		Item aw06 = ItemInit.AW_ICHIGO;
		Item aw07 = ItemInit.AW_ORANGE;
		Item aw08 = ItemInit.AW_BANANA;
		Item aw09 = ItemInit.AW_BUDOU;
		Item aw10p = ItemInit.AW_WATERMELON;
		//		Item aw11 = ItemInit.AW_MANGO;
		Item aw12 = ItemInit.AW_DORIAN;
		//		Item aw13 = ItemInit.AW_KIWI;
		//		Item aw14 = ItemInit.AW_LYCHEE;
		//		Item aw14s = ItemInit.AW_LYCHEE;
		Item aw07b = ItemInit.AW_BLOOD_ORANGE;

		Item awe00 = ItemInit.AW_SONIC_ARROW;
		Item awe05 = ItemInit.AW_MATSUBOKKURI_SHIN;
		Item awe06 = ItemInit.AW_MARRON;

		playerIn.inventory.deleteStack(findAmmo(playerIn,musou_saber));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw01));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw03));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw04));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw07));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw08));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw09));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw10p));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw12));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw12));
		playerIn.inventory.deleteStack(findAmmo(playerIn,aw07b));
		playerIn.inventory.deleteStack(findAmmo(playerIn,awe00));
		playerIn.inventory.deleteStack(findAmmo(playerIn,awe05));
		playerIn.inventory.deleteStack(findAmmo(playerIn,awe06));
		playerIn.inventory.deleteStack(findAmmo(playerIn,awe06));
	}

	protected static ItemStack findAmmo(EntityPlayer player,Item ammo)
	{
		if (isAmmo(player.getHeldItem(EnumHand.OFF_HAND),ammo))
		{
			return player.getHeldItem(EnumHand.OFF_HAND);
		}
		else if (isAmmo(player.getHeldItem(EnumHand.MAIN_HAND),ammo))
		{
			return player.getHeldItem(EnumHand.MAIN_HAND);
		}
		else
		{
			for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
			{
				ItemStack itemstack = player.inventory.getStackInSlot(i);

				if (isAmmo(itemstack,ammo))
				{
					return itemstack;
				}
			}

			return ItemStack.EMPTY;
		}
	}

	protected static boolean isAmmo(ItemStack stack,Item ammo)
	{
		if(stack.getItem() == ammo) 
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
}