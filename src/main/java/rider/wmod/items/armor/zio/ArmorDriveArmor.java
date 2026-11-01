package rider.wmod.items.armor.zio;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
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
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ArmorDriveArmor extends Item
//Armor
implements IHasModel
{

	public static int DriverCheck=0;

	public ArmorDriveArmor(String name,CreativeTabs tab//,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn
			) {
		//		super(materialIn, 1, equipmentSlotIn);
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
	/*
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityliving,ItemStack itemstack,EntityEquipmentSlot armorslot,ModelBiped _default)
	{
		if(itemstack != ItemStack.EMPTY)
		{
			if(itemstack.getItem() instanceof ItemArmor)
			{
				ModelHawk model = new ModelHawk();
				model.bipedBody.showModel =armorslot ==EntityEquipmentSlot.HEAD;
				model.isChild= _default.isChild;
				model.isRiding=_default.isRiding;
				model.isSneak= _default.isSneak;
				model.rightArmPose=_default.rightArmPose;
				model.leftArmPose= _default.leftArmPose;

				return model;
			}
		}return null;
	}
	 */

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
		ItemStack head =new ItemStack(ItemInit.ShiftSPEED,1);
		ItemStack body =new ItemStack(ItemInit.HIBIKI_BODY,1);
		ItemStack driver =new ItemStack(ItemInit.DRIVE_DRIVER,1);
		ItemStack foot =new ItemStack(ItemInit.MEMORY_CYCLONE,1);
//		ItemStack weapon =new ItemStack(ItemInit.GashaconBreaker_hammer,1);

		EntityEquipmentSlot entityequipmentslot3 = EntityLiving.getSlotForItemStack(head);
		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(body);
		EntityEquipmentSlot entityequipmentslot1 = EntityLiving.getSlotForItemStack(driver);
		EntityEquipmentSlot entityequipmentslot0 = EntityLiving.getSlotForItemStack(foot);

		
		ItemStack itemstack3 = playerIn.getItemStackFromSlot(entityequipmentslot3);
		ItemStack itemstack2 = playerIn.getItemStackFromSlot(entityequipmentslot2);
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot1);
		ItemStack itemstack0 = playerIn.getItemStackFromSlot(entityequipmentslot0);

		
		//		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);

		if(itemstack1.isEmpty()){
			playerIn.swingArm(handIn);
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.PLAYERS, 0.5F, 1.0F);
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.PLAYERS, 0.5F, 1.0F);
			worldIn.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, playerIn.posX,playerIn.posY+1, playerIn.posZ, 0, 0,0, null);

			playerIn.setItemStackToSlot(entityequipmentslot3, head.copy());//スロットへ
			playerIn.setItemStackToSlot(entityequipmentslot2, ItemStack.EMPTY);//スロットへ
			playerIn.setItemStackToSlot(entityequipmentslot1, driver.copy());//スロットへ
			playerIn.setItemStackToSlot(entityequipmentslot0, ItemStack.EMPTY);//スロットへ
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}else {
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);			
		}
	}
	
/*	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.BUILD_DRIVER)
			{
				DriverCheck=1;
			}
			else
			{
				DriverCheck=0;
			}
		}else
		{
			DriverCheck=0;
		}
		if(player.inventory.armorItemInSlot(0) != null)
		{
			if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.BottleTANK)
			{
				InOrganicSideCheck=1;
				LegendCheck=0;
			}
			else if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.BottleMEDAL)
			{
				InOrganicSideCheck=0;
				LegendCheck=1;
			}
			else
			{
				InOrganicSideCheck=0;
				LegendCheck=0;
			}
		}
		else
		{
			InOrganicSideCheck=0;
			LegendCheck=0;
		}
	}*/

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.cannotequip"));
		tooltip.add(I18n.format("tantai.henshin"));
	}
}