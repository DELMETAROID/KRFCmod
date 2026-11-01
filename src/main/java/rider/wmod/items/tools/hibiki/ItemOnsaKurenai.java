package rider.wmod.items.tools.hibiki;

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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.init.MetaItemInit;
import rider.wmod.util.IHasModel;

public class ItemOnsaKurenai extends Item implements IHasModel
{
	public ItemOnsaKurenai()
	{
		setUnlocalizedName("hibiki_onkaku_kurenai");
		setRegistryName("hibiki_onkaku_kurenai");
		setCreativeTab(Wmod.TabKamenRiderHIBIKI);
		setMaxStackSize(1);
		this.setHasSubtypes(true);
		MetaItemInit.ITEMS.add(this);
	}

	//翻訳名を変更する。後ろに.nameが着くためその前まで。
	public String getUnlocalizedName(ItemStack stack) {
		int i = stack.getMetadata();
		return "item.hibiki_onkaku_kurenai." + i;
	}

	public String getRegistryName(ItemStack stack) {
		int i = stack.getMetadata();
		return "hibiki_onkaku_kurenai_" + i;
	}

	//クリエイティブタブに複数のアイテムを登録する。
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			//			for (int i = 0; i < 2; ++i) {
			items.add(new ItemStack(this, 1, 0));
			//			}
		}
	}

	@Override
	public void registerModels()
	{
		for(int i = 0; i < 2; i++){
			Wmod.proxy.registerModelwithMeta(this,i,"hibiki_onkaku_kurenai_");
		}
	}

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		playerIn.swingArm(handIn);
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
		ItemStack miraidriver =new ItemStack(ItemInit.MIRAI_DRIVER,1);
		ItemStack hibiki_head =new ItemStack(ItemInit.HIBIKI_HEAD_KURENAI,1);
		ItemStack hibiki_body =new ItemStack(ItemInit.HIBIKI_BODY,1);
		ItemStack foot =new ItemStack(ItemInit.MEMORY_CYCLONE,1);

		EntityEquipmentSlot entityequipmentslot3 = EntityLiving.getSlotForItemStack(hibiki_head);
		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(hibiki_body);
		EntityEquipmentSlot entityequipmentslot1 = EntityLiving.getSlotForItemStack(miraidriver);
		EntityEquipmentSlot entityequipmentslot0 = EntityLiving.getSlotForItemStack(foot);

		
		ItemStack itemstack3 = playerIn.getItemStackFromSlot(entityequipmentslot3);
		ItemStack itemstack2 = playerIn.getItemStackFromSlot(entityequipmentslot2);
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot1);
		ItemStack itemstack0 = playerIn.getItemStackFromSlot(entityequipmentslot0);
		
		ItemStack onsaken = new ItemStack(ItemInit.HIBIKI_ONSAKEN,1);

		if(itemstack.getItem()==MetaItemInit.HIBIKI_ONKAKU_KURENAI)
		{
			if(playerIn.inventory.armorItemInSlot(3) != null && playerIn.inventory.armorItemInSlot(2) != null)
			{

				if(itemstack.getMetadata()==0) {//鳴らす
					if((playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.HIBIKI_HEAD
							||playerIn.inventory.armorItemInSlot(3).getItem()==ItemInit.HIBIKI_HEAD_KURENAI)
							&& playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.HIBIKI_BODY)//響鬼中 
					{
						worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 0.5F, 1.0F);
						playerIn.setItemStackToSlot(entityequipmentslot2, ItemStack.EMPTY);//スロットへ
						playerIn.setItemStackToSlot(entityequipmentslot3, ItemStack.EMPTY);//スロットへ
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
					else 
					{
						worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_NOTE_BELL, SoundCategory.PLAYERS, 0.5F, 1.0F);
						worldIn.spawnParticle(EnumParticleTypes.NOTE, playerIn.posX,playerIn.posY+2, playerIn.posZ, 0, 0,0, null);
						itemstack.setItemDamage(1);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
				}
				else {
					worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.PLAYERS, 0.5F, 1.0F);
					worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.PLAYERS, 0.5F, 1.0F);
					worldIn.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, playerIn.posX,playerIn.posY+1, playerIn.posZ, 0, 0,0, null);
					//						}
					playerIn.inventory.deleteStack(this.findAmmo(playerIn,hibiki_head.getItem()));
					playerIn.inventory.deleteStack(this.findAmmo(playerIn,hibiki_body.getItem()));
					
					playerIn.setItemStackToSlot(entityequipmentslot3, hibiki_head.copy());//スロットへ
					playerIn.setItemStackToSlot(entityequipmentslot2, hibiki_body.copy());//スロットへ
					playerIn.setItemStackToSlot(entityequipmentslot1, ItemStack.EMPTY);//スロットへ
					playerIn.setItemStackToSlot(entityequipmentslot0, ItemStack.EMPTY);//スロットへ
					itemstack.setItemDamage(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
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
	
	protected ItemStack findAmmo(EntityPlayer player,Item ammo)
	{
		if (this.isAmmo(player.getHeldItem(EnumHand.OFF_HAND),ammo))
		{
			return player.getHeldItem(EnumHand.OFF_HAND);
		}
		else if (this.isAmmo(player.getHeldItem(EnumHand.MAIN_HAND),ammo))
		{
			return player.getHeldItem(EnumHand.MAIN_HAND);
		}
		else
		{
			for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
			{
				ItemStack itemstack = player.inventory.getStackInSlot(i);

				if (this.isAmmo(itemstack,ammo))
				{
					return itemstack;
				}
			}

			return ItemStack.EMPTY;
		}
	}

	protected boolean isAmmo(ItemStack stack,Item ammo)
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