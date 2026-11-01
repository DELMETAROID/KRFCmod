package rider.wmod.items.tools;

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
import rider.wmod.items.armor.kuuga.ArmorKuugaPegasas;
import rider.wmod.util.IHasModel;

public class ItemDriverSummoner extends Item implements IHasModel
{
	public ItemDriverSummoner(String name,CreativeTabs tab)
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

	public static Boolean MophingItem(EntityPlayer playerIn,ItemStack holding) 
	{
		if(ArmorKuugaPegasas.MophingItem(holding,ArmorKuugaPegasas.list)
				||ArmorKuugaPegasas.MophingBlock(holding,ArmorKuugaPegasas.list2)
				||ArmorKuugaPegasas.MophingItemKRFCmod(holding)) 
		{
			playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, new ItemStack(ItemInit.PEGASAS_BOWGUN_RISING, 1));
		}

		for (int i=0; i<=ArmorKuugaPegasas.list.length-1; i++)
		{
			ItemStack compare = new ItemStack(Item.getItemById(ArmorKuugaPegasas.list[i]),1);
			if(holding.isItemEqualIgnoreDurability(compare)) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		playerIn.swingArm(handIn);
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
		ItemStack miraidriver =new ItemStack(ItemInit.MIRAI_DRIVER,1);
		ItemStack quizdriver =new ItemStack(ItemInit.QUIZ_DRIVER,1);
		ItemStack hibiki_head =new ItemStack(ItemInit.HIBIKI_HEAD,1);
		ItemStack hibiki_body =new ItemStack(ItemInit.HIBIKI_BODY,1);
		ItemStack wizardriver =new ItemStack(ItemInit.WIZARDRIVER,1);
		ItemStack wisedriver =new ItemStack(ItemInit.WISE_DRIVER,1);
		ItemStack arcle_rising =new ItemStack(ItemInit.ARCLE_RISING,1);
		ItemStack arcle_amazing =new ItemStack(ItemInit.ARCLE_AMAZING,1);
		ItemStack arcle_ultimate =new ItemStack(ItemInit.ARCLE_ULTIMATE,1);
		ItemStack amadam_red =new ItemStack(ItemInit.AMADAM_RED,1);
		ItemStack amadam_blue =new ItemStack(ItemInit.AMADAM_BLUE,1);
		ItemStack amadam_green =new ItemStack(ItemInit.AMADAM_GREEN,1);
		ItemStack amadam_purple =new ItemStack(ItemInit.AMADAM_PURPLE,1);


		EntityEquipmentSlot entityequipmentslot3 = EntityLiving.getSlotForItemStack(hibiki_head);
		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(hibiki_body);
		EntityEquipmentSlot entityequipmentslot1 = EntityLiving.getSlotForItemStack(miraidriver);
		//		EntityEquipmentSlot entityequipmentslot0 = EntityLiving.getSlotForItemStack(foot);
		ItemStack holditem =playerIn.getHeldItemOffhand();

		
		ItemStack itemstack3 = playerIn.getItemStackFromSlot(entityequipmentslot3);
		ItemStack itemstack2 = playerIn.getItemStackFromSlot(entityequipmentslot2);
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot1);
		ItemStack shinobi = new ItemStack(ItemInit.MIRAI_SHINOBI,1);
		ItemStack hattari = new ItemStack(ItemInit.MIRAI_HATTARI,1);
		ItemStack quiz = new ItemStack(ItemInit.MIRAI_QUIZ,1);
		ItemStack onsaken = new ItemStack(ItemInit.HIBIKI_ONSAKEN,1);

		ItemStack dragon = new ItemStack(ItemInit.DRAGON_ROD, 1);
		ItemStack pegasas = new ItemStack(ItemInit.PEGASAS_BOWGUN, 1);
		ItemStack titan = new ItemStack(ItemInit.TITAN_SWORD, 1);
		ItemStack dragonR = new ItemStack(ItemInit.DRAGON_ROD_RISING, 1);
		ItemStack pegasasR = new ItemStack(ItemInit.PEGASAS_BOWGUN_RISING, 1);
		ItemStack titanR = new ItemStack(ItemInit.TITAN_SWORD_RISING, 1);
		ItemStack dragonA = new ItemStack(ItemInit.DRAGON_ROD_AMAZING, 1);
		ItemStack pegasasA = new ItemStack(ItemInit.PEGASAS_BOWGUN_AMAZING, 1);
		ItemStack titanA = new ItemStack(ItemInit.TITAN_SWORD_AMAZING, 1);

		if(itemstack.getItem()==ItemInit.AMADAM_THUNDER) 
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE)
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_rising.copy());
					if(holditem.isItemEqualIgnoreDurability(dragon)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, dragonR);
					}
					if(holditem.isItemEqualIgnoreDurability(pegasas)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, pegasasR);
					}
					if(holditem.isItemEqualIgnoreDurability(titan))
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, titanR);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING)
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_amazing.copy());
					if(holditem.isItemEqualIgnoreDurability(dragon)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, dragonA);
					}
					if(holditem.isItemEqualIgnoreDurability(pegasas))
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, pegasasA);
					}
					if(holditem.isItemEqualIgnoreDurability(titan))
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, titanA);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING)
				{
					//					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_ultimate.copy());
					if(holditem.isItemEqualIgnoreDurability(dragon)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, dragonA);
					}
					if(holditem.isItemEqualIgnoreDurability(pegasas))
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, pegasasA);
					}
					if(holditem.isItemEqualIgnoreDurability(titan))
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, titanA);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_ULTIMATE)
				{
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else
				{
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				}
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}

		else if(itemstack.getItem()==ItemInit.AMADAM_RED_THUNDER) 
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_red);					
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_rising.copy());
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_red);	
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_amazing.copy());
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				/*				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_red);	
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_ultimate.copy());
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_ULTIMATE)
				{
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				 */				else
				 {
					 return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				 }
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else if(itemstack.getItem()==ItemInit.AMADAM_BLUE_THUNDER) 
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_blue);					
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_rising.copy());
					if(holditem.isItemEqualIgnoreDurability(dragon)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, dragonR);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_blue);	
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_amazing.copy());
					if(holditem.isItemEqualIgnoreDurability(dragonR)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, dragonA);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				/*				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_blue);	
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_ultimate.copy());
					if(holditem.isItemEqualIgnoreDurability(dragonR)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, dragonA);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_ULTIMATE)
				{
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				 */				else
				 {
					 return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				 }
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else if(itemstack.getItem()==ItemInit.AMADAM_GREEN_THUNDER) 
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_green);					
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_rising.copy());
					if(holditem.isItemEqualIgnoreDurability(pegasas)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, pegasasR);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_green);	
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_amazing.copy());
					if(holditem.isItemEqualIgnoreDurability(pegasasR)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, pegasasA);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				/*				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_green);	
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_ultimate.copy());
					if(holditem.isItemEqualIgnoreDurability(pegasasR)) 
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, pegasasA);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_ULTIMATE)
				{
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				 */				else
				 {
					 return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				 }
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else if(itemstack.getItem()==ItemInit.AMADAM_PURPLE_THUNDER) 
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_purple);					
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_rising.copy());
					if(holditem.isItemEqualIgnoreDurability(titan))
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, titanR);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_RISING)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_purple);	
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_amazing.copy());
					if(holditem.isItemEqualIgnoreDurability(titanR))
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, titanA);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				/*				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_AMAZING)
				{
					playerIn.setItemStackToSlot(entityequipmentslot3, amadam_purple);	
					playerIn.setItemStackToSlot(entityequipmentslot1, arcle_ultimate.copy());
					if(holditem.isItemEqualIgnoreDurability(titanR))
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, titanA);
					}
					itemstack.shrink(1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.ARCLE_ULTIMATE)
				{
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				 */				else
				 {
					 return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				 }
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}

		else if(itemstack.getItem()==ItemInit.RING_DRIVERON) 
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, wizardriver.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}				
				else if(playerIn.inventory.armorItemInSlot(1).getItem()!=ItemInit.WIZARDRIVER)
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, wizardriver.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
				else
				{
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				}
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}

		else if(itemstack.getItem()==ItemInit.RING_DRIVERON_WISE) 
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, wisedriver.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}				
				else if(playerIn.inventory.armorItemInSlot(1).getItem()!=ItemInit.WISE_DRIVER)
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, wisedriver.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
				else
				{
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				}
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else if(itemstack.getItem()==ItemInit.HYOUTAN_SHINOBI)
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, miraidriver.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, shinobi);
				}				
				else if(playerIn.inventory.armorItemInSlot(1).getItem()!=ItemInit.MIRAI_DRIVER)
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, miraidriver.copy());
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, shinobi);						
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
				else
				{
					if(playerIn.inventory.armorItemInSlot(1) != null
							&&playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.MIRAI_SHINOBI)
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else{
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, shinobi);
					}
				}
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}

		else if(itemstack.getItem()==ItemInit.HYOUTAN_HATTARI) 
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, miraidriver.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, hattari);
				}				
				else if(playerIn.inventory.armorItemInSlot(1).getItem()!=ItemInit.MIRAI_DRIVER)
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, miraidriver.copy());
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, hattari);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
				else
				{
					if(playerIn.inventory.armorItemInSlot(1) != null
							&&playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.MIRAI_SHINOBI)
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else{
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, shinobi);
					}
				}
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}

		else if(itemstack.getItem()==ItemInit.QUIZ_PENDANT) 
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, quizdriver.copy());
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, quiz);
				}				
				else if(playerIn.inventory.armorItemInSlot(1).getItem()!=ItemInit.QUIZ_DRIVER)
				{
					playerIn.setItemStackToSlot(entityequipmentslot1, quizdriver.copy());
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, quiz);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
				else
				{
					if(playerIn.inventory.armorItemInSlot(1) != null
							&&playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.MIRAI_QUIZ) 
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else{
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, quiz);
					}
				}
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}

		else {
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}
}