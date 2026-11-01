package rider.wmod.items.armor.zeztz;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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
import rider.wmod.rendering.models.items.zeztz.ModelZeztz;
import rider.wmod.util.IHasModel;

public class ArmorZeztzImpact extends ItemArmor implements IHasModel{

	public static int isHenshin=0;
	public static int isInvisible=0;

	public ArmorZeztzImpact(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
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
	public ModelBiped getArmorModel(EntityLivingBase entityliving,ItemStack itemstack,EntityEquipmentSlot armorslot,ModelBiped _default)
	{
		if(itemstack != ItemStack.EMPTY)
		{
			if(itemstack.getItem() instanceof ItemArmor)
			{
				ModelZeztz model = new ModelZeztz();
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
		ItemStack itemstack = playerIn.getHeldItem(handIn);

		playerIn.swingArm(handIn);
		if(playerIn.inventory.armorItemInSlot(2) != null)
		{
			if(playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.ZEZTZ_DRIVER)
			{
				if(playerIn.inventory.armorItemInSlot(3).getItem()!=ItemInit.CAPSEM_IMPACT)
				{
					if(worldIn.isRemote) {
						ArmorZeztzDriver.capsem = new ItemStack(ItemInit.CAPSEM_IMPACT,1);
					}
					itemstack.setCount(0);
				}
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
			else
			{
				playerIn.swingArm(handIn);
				playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,100,2,true,true));
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		PotionEffect effect = player.getActivePotionEffect(MobEffects.INVISIBILITY);
		if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.ZEZTZ_DRIVER)
		{
			if(isHenshin==1)
			{
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,100,2,false,false));
			}
		}
		else
		{
			isHenshin=0;
		}

		if(effect!=null)
		{
			isInvisible=1;
		}else {
			isInvisible=0;
		}
	}
}