package rider.wmod.items.armor.w;

import net.minecraft.client.model.ModelBiped;
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
import rider.wmod.rendering.models.items.w.ModelLostDriver;
import rider.wmod.util.IHasModel;

public class ArmorLostDriver extends ItemArmor implements IHasModel{

	public static int MemoryCheck=0;
	public static int ArmoredCheck=0;
	public static int isInvisible=0;

	public ArmorLostDriver(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelLostDriver model = new ModelLostDriver();

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
		if(player.inventory.armorItemInSlot(1) != null)
		{
			ArmoredCheck=1;
			if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_CYCLONE
					||player.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_HEAT
					||player.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_LUNA
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_JOKER
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_METAL
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_TRIGGER
					)
				/*					||
					player.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_ETERNAL||
					player.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_ETERNAL_T1||
					player.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_SCULL)
				 */			{
				MemoryCheck=1;
			}
			else
			{
				MemoryCheck=0;
			}

		}else ArmoredCheck=0;

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}
	}
}