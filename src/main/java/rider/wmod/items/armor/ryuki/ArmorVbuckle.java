package rider.wmod.items.armor.ryuki;

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
import rider.wmod.rendering.models.items.ryuki.ModelVbuckle;
import rider.wmod.util.IHasModel;

public class ArmorVbuckle extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public static int deckIn=0;

	public ArmorVbuckle(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelVbuckle model = new ModelVbuckle();

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
		if(player.inventory.armorItemInSlot(3) != null)
		{
			if(player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_RYUKI
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_KNIGHT
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_ZOLDA
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_OUJA
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_SCISSORS
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_RAIA
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_GAI
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_TIGER
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_IMPERROR
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_ODIN
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_VERDE
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_FEMME
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_RYUGA
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_ABISS
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_RYUKI_BLANK
//					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_KNIGHT_BLANK
					||player.inventory.armorItemInSlot(3).getItem()==ItemInit.DECK_OUJA_BLANK
					)
			{
				deckIn=1;

			}
			else
			{
				deckIn=0;
			}

		}

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}
	}
}