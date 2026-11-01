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
import rider.wmod.rendering.models.items.w.ModelWDriver;
import rider.wmod.util.IHasModel;

public class ArmorWDriver extends ItemArmor implements IHasModel{

	public static int BothMemoryCheck=0;
	public static int MemoryCheckC=0;
	public static int MemoryCheckH=0;
	public static int MemoryCheckL=0;
	public static int MemoryCheckJ=0;
	public static int MemoryCheckM=0;
	public static int MemoryCheckT=0;
	public static int ArmoredCheck=0;
	public static int isInvisible=0;

	public ArmorWDriver(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelWDriver model = new ModelWDriver();

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
			if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_CYCLONE){MemoryCheckC=1;}else{MemoryCheckC=0;}
			if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_HEAT){MemoryCheckH=1;}else {MemoryCheckH=0;}
			if(player.inventory.armorItemInSlot(0).getItem()==ItemInit.MEMORY_LUNA){MemoryCheckL=1;}else{MemoryCheckL=0; }

			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_JOKER) {MemoryCheckJ=1;}else{MemoryCheckJ=0;}
			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_METAL) {MemoryCheckM=1;}else{MemoryCheckM=0; }
			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.MEMORY_TRIGGER) {MemoryCheckT=1;}else{MemoryCheckT=0;}

			if(MemoryCheckC==1||MemoryCheckH==1||MemoryCheckL==1)
			{
			if(MemoryCheckJ==1||MemoryCheckM==1||MemoryCheckT==1)
				{
					BothMemoryCheck=1;
				}
				else
				{
					BothMemoryCheck=0;
				}
			}
			else
			{
				BothMemoryCheck=0;
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