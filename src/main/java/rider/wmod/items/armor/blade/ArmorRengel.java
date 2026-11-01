package rider.wmod.items.armor.blade;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ArmorRengel extends Item//Armor
implements IHasModel
{

	public static int BeltCheck=0;
	public static int isHenshin=0;
	public static int isInvisible=0;

	public ArmorRengel(String name,CreativeTabs tab//,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn
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
				ModelBlade model = new ModelBlade();
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

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		//アイテム変更用
		ItemStack offhanditem =playerIn.getHeldItemOffhand();
		ItemStack itemstack = new ItemStack(ItemInit.BLABUCKLE_ITEM, 1);
		ItemStack itemstack2 = new ItemStack(ItemInit.BLABUCKLE_BELT, 1);
		ItemStack itemstack3 = new ItemStack(ItemInit.SPADE_A, 1);

		
		ItemStack helditem = playerIn.getHeldItem(handIn);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(helditem);
		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(itemstack3);
		
		ItemStack armor = playerIn.getItemStackFromSlot(entityequipmentslot);
		ItemStack armor2 = playerIn.getItemStackFromSlot(entityequipmentslot2);

		if(offhanditem.isItemEqual(itemstack))
		{
			playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, itemstack2);
			offhanditem.setCount(0);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, helditem);
		}

		else if (armor==itemstack2)//ブレイバックル中
		{
			if (armor2.isEmpty())
			{
				playerIn.setItemStackToSlot(entityequipmentslot2, itemstack3.copy());
				itemstack.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, armor2);
			}
			else//空いてない場合
			{
				playerIn.setItemStackToSlot(entityequipmentslot, itemstack3.copy());
				itemstack.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,armor2);
			}
		}else {
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, helditem);
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.BLABUCKLE_BELT)
			{
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1,1,true,false));
				BeltCheck=1;
			}
			else
			{
				isHenshin=0;
				BeltCheck=0;
			}
		}else {
			BeltCheck=0;
		}

		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}
	}*/
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tip.itembase"));
	}
}