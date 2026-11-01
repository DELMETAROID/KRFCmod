package rider.wmod.items.action;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.items.armor.geats.ArmorIDDapaan;
import rider.wmod.items.armor.geats.ArmorIDDoomsGeats;
import rider.wmod.items.armor.geats.ArmorIDGeats;
import rider.wmod.items.armor.geats.ArmorIDGinpen;
import rider.wmod.items.armor.geats.ArmorIDKeilow;
import rider.wmod.items.armor.geats.ArmorIDNadgesparrow;
import rider.wmod.items.armor.geats.ArmorIDNago;
import rider.wmod.items.armor.geats.ArmorIDPunkjack;
import rider.wmod.items.armor.geats.ArmorIDShirowe;
import rider.wmod.items.armor.geats.ArmorIDSkumatter;
import rider.wmod.items.armor.geats.ArmorIDXGeats;
import rider.wmod.util.IHasModel;

public class ItemRevolveOn extends Item implements IHasModel
{
	public ItemRevolveOn(String name,CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
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
		ItemStack itemstack= playerIn.getHeldItem(handIn);
		ItemStack driver =new ItemStack(ItemInit.DESIRE_DRIVER,1);

		ItemStack hammer =new ItemStack(ItemInit.RB_HAMMER,1);
		ItemStack water =new ItemStack(ItemInit.RB_WATER,1);
		ItemStack arrow =new ItemStack(ItemInit.RB_ARROW,1);
		ItemStack shield =new ItemStack(ItemInit.RB_SHIELD,1);
		ItemStack craw =new ItemStack(ItemInit.RB_CRAW,1);
		ItemStack chainarray =new ItemStack(ItemInit.RB_CHAINARRAY,1);
		ItemStack drill =new ItemStack(ItemInit.RB_DRILL,1);
		ItemStack propeller =new ItemStack(ItemInit.RB_PROPELLER,1);
		ItemStack shooter =new ItemStack(ItemInit.RB_SHOOTER,1);
		ItemStack breaker =new ItemStack(ItemInit.RB_BREAKER,1);
		ItemStack dualer =new ItemStack(ItemInit.RB_DUALER,1);
		ItemStack ax =new ItemStack(ItemInit.RB_AX,1);
		ItemStack sp =new ItemStack(ItemInit.RB_SP,1);
		ItemStack magnum =new ItemStack(ItemInit.RB_MAGNUM,1);
		ItemStack zombie =new ItemStack(ItemInit.RB_ZOMBIE,1);
		ItemStack ninja =new ItemStack(ItemInit.RB_NINJA,1);
		ItemStack beat =new ItemStack(ItemInit.RB_BEAT,1);
		ItemStack monster =new ItemStack(ItemInit.RB_MONSTER,1);
		ItemStack boost =new ItemStack(ItemInit.RB_BOOST,1);
		ItemStack king =new ItemStack(ItemInit.RB_KINGOHGER,1);

		ItemStack hammer_r =new ItemStack(ItemInit.RB_HAMMER_R,1);
		ItemStack water_r =new ItemStack(ItemInit.RB_WATER_R,1);
		ItemStack arrow_r =new ItemStack(ItemInit.RB_ARROW_R,1);
		ItemStack shield_r =new ItemStack(ItemInit.RB_SHIELD_R,1);
		ItemStack craw_r =new ItemStack(ItemInit.RB_CRAW_R,1);
		ItemStack chainarray_r =new ItemStack(ItemInit.RB_CHAINARRAY_R,1);
		ItemStack drill_r =new ItemStack(ItemInit.RB_DRILL_R,1);
		ItemStack propeller_r =new ItemStack(ItemInit.RB_PROPELLER_R,1);
		ItemStack shooter_r =new ItemStack(ItemInit.RB_SHOOTER_R,1);
		ItemStack breaker_r =new ItemStack(ItemInit.RB_BREAKER_R,1);
		ItemStack dualer_r =new ItemStack(ItemInit.RB_DUALER_R,1);
		ItemStack ax_r =new ItemStack(ItemInit.RB_AX_R,1);
		ItemStack sp_r =new ItemStack(ItemInit.RB_SP_R,1);
		ItemStack magnum_r =new ItemStack(ItemInit.RB_MAGNUM_R,1);
		ItemStack zombie_r =new ItemStack(ItemInit.RB_ZOMBIE_R,1);
		ItemStack ninja_r =new ItemStack(ItemInit.RB_NINJA_R,1);
		ItemStack beat_r =new ItemStack(ItemInit.RB_BEAT_R,1);
		ItemStack monster_r =new ItemStack(ItemInit.RB_MONSTER_R,1);
		ItemStack boost_r =new ItemStack(ItemInit.RB_BOOST_R,1);
		ItemStack king_r =new ItemStack(ItemInit.RB_KINGOHGER_R,1);

		EntityEquipmentSlot slot_up = EntityLiving.getSlotForItemStack(shield);
		EntityEquipmentSlot slot_dn = EntityLiving.getSlotForItemStack(shield_r);		

		ItemStack buckle_up = playerIn.getItemStackFromSlot(slot_up);
		ItemStack buckle_dn = playerIn.getItemStackFromSlot(slot_dn);
		ItemStack hold_up = ItemStack.EMPTY;
		ItemStack hold_dn = ItemStack.EMPTY;

		if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND)==itemstack)
		{
			if(playerIn.inventory.armorItemInSlot(1) != null)
			{
				if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER)
				{
					playerIn.swingArm(handIn);
					playerIn.getCooldownTracker().setCooldown(this, 2);
					worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.PLAYERS, 1.0F, 1.0F);
					hold_up=buckle_up;
					hold_dn=buckle_dn;

					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,hammer)) 
					{
						playerIn.setItemStackToSlot(slot_dn,hammer_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,water)) 
					{
						playerIn.setItemStackToSlot(slot_dn,water_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,arrow)) 
					{
						playerIn.setItemStackToSlot(slot_dn,arrow_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,shield)) 
					{
						playerIn.setItemStackToSlot(slot_dn,shield_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,craw)) 
					{
						playerIn.setItemStackToSlot(slot_dn,craw_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,chainarray)) 
					{
						playerIn.setItemStackToSlot(slot_dn,chainarray_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,drill)) 
					{
						playerIn.setItemStackToSlot(slot_dn,drill_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,propeller)) 
					{
						playerIn.setItemStackToSlot(slot_dn,propeller_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,shooter)) 
					{
						playerIn.setItemStackToSlot(slot_dn,shooter_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,breaker)) 
					{
						playerIn.setItemStackToSlot(slot_dn,breaker_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,dualer)) 
					{
						playerIn.setItemStackToSlot(slot_dn,dualer_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,ax)) 
					{
						playerIn.setItemStackToSlot(slot_dn,ax_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,sp)) 
					{
						playerIn.setItemStackToSlot(slot_dn,sp_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,magnum)) 
					{
						playerIn.setItemStackToSlot(slot_dn,magnum_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,zombie)) 
					{
						playerIn.setItemStackToSlot(slot_dn,zombie_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,ninja)) 
					{
						playerIn.setItemStackToSlot(slot_dn,ninja_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,beat)) 
					{
						playerIn.setItemStackToSlot(slot_dn,beat_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,monster)) 
					{
						playerIn.setItemStackToSlot(slot_dn,monster_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,boost)) 
					{
						playerIn.setItemStackToSlot(slot_dn,boost_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,king)) 
					{
						playerIn.setItemStackToSlot(slot_dn,king_r.copy());
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,ItemStack.EMPTY)) 
					{
						playerIn.setItemStackToSlot(slot_dn,ItemStack.EMPTY);
					}



					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,hammer_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,hammer.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,water_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,water.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,arrow_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,arrow.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,shield_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,shield.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,craw_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,craw.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,chainarray_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,chainarray.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,drill_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,drill.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,propeller_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,propeller.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,shooter_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,shooter.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,breaker_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,breaker.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,dualer_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,dualer.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,ax_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,ax.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,sp_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,sp.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,magnum_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,magnum.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,zombie_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,zombie.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,ninja_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,ninja.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,beat_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,beat.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,monster_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,monster.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,boost_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,boost.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,king_r)) 
					{
						playerIn.setItemStackToSlot(slot_up,king.copy());
					}
					if(ItemStack.areItemsEqualIgnoreDurability(hold_dn,ItemStack.EMPTY)) 
					{
						playerIn.setItemStackToSlot(slot_up,ItemStack.EMPTY);
					}



					if(ItemStack.areItemsEqualIgnoreDurability(hold_up,ItemStack.EMPTY)
							&&ItemStack.areItemsEqualIgnoreDurability(hold_dn,ItemStack.EMPTY)) 
					{
						if(playerIn.inventory.armorItemInSlot(1) != null&&playerIn.inventory.armorItemInSlot(3) != null)
						{
							if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER)
							{
								if(!worldIn.isRemote) 
								{
									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GEATS) 
									{
										if(ArmorIDGeats.isHenshin==1) {ArmorIDGeats.isHenshin=0;}
										else{ArmorIDGeats.isHenshin=1;}
									}
									
									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NAGO) 
									{
										if(ArmorIDNago.isHenshin==1) {ArmorIDNago.isHenshin=0;}
										else{ArmorIDNago.isHenshin=1;}
									}

									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SHIROWE) 
									{
										if(ArmorIDShirowe.isHenshin==1) {ArmorIDShirowe.isHenshin=0;}
										else{ArmorIDShirowe.isHenshin=1;}
									}

									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_GINPEN) 
									{
										if(ArmorIDGinpen.isHenshin==1) {ArmorIDGinpen.isHenshin=0;}
										else{ArmorIDGinpen.isHenshin=1;}
									}

									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_DAPAAN) 
									{
										if(ArmorIDDapaan.isHenshin==1) {ArmorIDDapaan.isHenshin=0;}
										else{ArmorIDDapaan.isHenshin=1;}
									}

									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_PUNKJACK) 
									{
										if(ArmorIDPunkjack.isHenshin==1) {ArmorIDPunkjack.isHenshin=0;}
										else{ArmorIDPunkjack.isHenshin=1;}
									}

									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_KEILOW) 
									{
										if(ArmorIDKeilow.isHenshin==1) {ArmorIDKeilow.isHenshin=0;}
										else{ArmorIDKeilow.isHenshin=1;}
									}

									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_NADGESPARROW) 
									{
										if(ArmorIDNadgesparrow.isHenshin==1) {ArmorIDNadgesparrow.isHenshin=0;}
										else{ArmorIDNadgesparrow.isHenshin=1;}
									}

									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_XGEATS) 
									{
										if(ArmorIDXGeats.isHenshin==1) {ArmorIDXGeats.isHenshin=0;}
										else{ArmorIDXGeats.isHenshin=1;}
									}

									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_DOOMSGEATS) 
									{
										if(ArmorIDDoomsGeats.isHenshin==1) {ArmorIDDoomsGeats.isHenshin=0;}
										else{ArmorIDDoomsGeats.isHenshin=1;}
									}


									if(playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.IDCORE_SKUMATTER) 
									{
										if(ArmorIDSkumatter.isHenshin==1) {ArmorIDSkumatter.isHenshin=0;}
										else{ArmorIDSkumatter.isHenshin=1;}
									}
								}
							}
							else
							{
								itemstack.setCount(0);
								worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
								return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
							}
						}
						else
						{
							itemstack.setCount(0);
							worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
							return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
						}
					}
					else
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL,itemstack);
					}
				}else 
				{
					itemstack.setCount(0);
					worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
				}
			}else 
			{
				itemstack.setCount(0);
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);

			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.FAIL,itemstack);
	}
}