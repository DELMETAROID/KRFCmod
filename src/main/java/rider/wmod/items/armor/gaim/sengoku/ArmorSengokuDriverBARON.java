package rider.wmod.items.armor.gaim.sengoku;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.gaim.ModelBaron;
import rider.wmod.util.IHasModel;

public class ArmorSengokuDriverBARON extends ItemArmor implements IHasModel
	{
		public static int isInvisible=0;
		public static int isHenshin=0;
		
		public ArmorSengokuDriverBARON(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
			super(materialIn, 1, equipmentSlotIn);
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
		public ModelBiped getArmorModel(EntityLivingBase entityliving,ItemStack itemstack,EntityEquipmentSlot armorslot,ModelBiped _default)
		{
			if(itemstack != ItemStack.EMPTY)
			{
				if(itemstack.getItem() instanceof ItemArmor)
				{
					ModelBaron model = new ModelBaron();
					model.bipedBody.showModel =armorslot ==EntityEquipmentSlot.LEGS;
					model.isChild= _default.isChild;
					model.isRiding=_default.isRiding;
					model.isSneak= _default.isSneak;
					model.rightArmPose=_default.rightArmPose;
					model.leftArmPose= _default.leftArmPose;

					return model;
				}
			}return null;
		}

		
		@Override
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		{
			
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			
			EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
			
			ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
			
			//		ItemStack itemstack2 = new ItemStack(ItemInit.FOURZE_LEVER,1);

			if (itemstack1.isEmpty())
			{
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
				itemstack.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
			else
			{
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
				itemstack.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
			}
		}

		@Override
		public void onArmorTick(World world, EntityPlayer player, ItemStack item)
		{	
			PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
			if(effect!=null)
			{
				isInvisible=1;
			}else {
				isInvisible=0;
			}

			if(ArmorSengokuDriver.LSCheck(player))
			{
				isHenshin=1;
			}else {
				isHenshin=0;
			}
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.baron"));
	}
}