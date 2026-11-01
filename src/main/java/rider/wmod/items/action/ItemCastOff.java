package rider.wmod.items.action;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemCastOff extends Item implements IHasModel
{
	public ItemCastOff(String name,CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Blocks.BARRIER.getCreativeTabToDisplayOn());
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
		ItemStack zector_kabuto =new ItemStack(ItemInit.KABUTO_ZECTOR,1);
		ItemStack zector_darkkabuto =new ItemStack(ItemInit.DARKKABUTO_ZECTOR,1);
		ItemStack armor_kabuto =new ItemStack(ItemInit.KABUTO_MASKED_ARMOR,1);

		EntityEquipmentSlot zector = EntityLiving.getSlotForItemStack(zector_kabuto);
		EntityEquipmentSlot armor = EntityLiving.getSlotForItemStack(armor_kabuto);
		ItemStack wearingzector = playerIn.getItemStackFromSlot(zector);
		ItemStack wearingarmor = playerIn.getItemStackFromSlot(armor);

		if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND)==itemstack)
		{
			playerIn.swingArm(handIn);
			if(ItemStack.areItemsEqualIgnoreDurability(wearingzector,zector_kabuto)
					||ItemStack.areItemsEqualIgnoreDurability(wearingzector,zector_darkkabuto))//カブト・ダークカブト
			{
				if(ItemStack.areItemsEqualIgnoreDurability(wearingarmor,armor_kabuto)) //キャストオフ
				{
					worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.PLAYERS, 0.5F, 1.0F);
					worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.PLAYERS, 0.5F, 1.0F);
					worldIn.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, playerIn.posX,playerIn.posY+1, playerIn.posZ, 0, 0,0, null);
					playerIn.setItemStackToSlot(armor,ItemStack.EMPTY);
					playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,80,3,true,true));
					playerIn.getCooldownTracker().setCooldown(this, 220);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
				}
				else//プットオン
				{
					worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ITEM_ARMOR_EQUIP_IRON, SoundCategory.PLAYERS, 1.0F, 1.0F);
					playerIn.setItemStackToSlot(armor,armor_kabuto);
					playerIn.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,80,4,true,true));
					playerIn.getCooldownTracker().setCooldown(this, 220);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
			}else{
				itemstack.setCount(0);
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
			}
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL,itemstack);
		}
	}
}