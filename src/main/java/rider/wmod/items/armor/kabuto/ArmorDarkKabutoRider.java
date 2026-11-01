package rider.wmod.items.armor.kabuto;

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
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityDarkKabutoZector;
import rider.wmod.entity.EntityEnemyDarkKabuto;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.kabuto.ModelDarkKabuto;
import rider.wmod.util.IHasModel;

public class ArmorDarkKabutoRider extends ItemArmor implements IHasModel{

	public static int BeltCheck=0;
	public static int MaskedIn=0;
	public static int isInvisible=0;

	public ArmorDarkKabutoRider(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelDarkKabuto model = new ModelDarkKabuto();
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
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		//追加=マスクドアーマー
		ItemStack itemstack2 = new ItemStack(ItemInit.KABUTO_MASKED_ARMOR, 1);
		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(itemstack2);

		ItemStack itemstack3 = new ItemStack(ItemInit.KABUTO_CAST_OFF, 1);

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.KABUTO_RIDERBELT
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.GATACK_RIDERBELT
					||playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DARKKABUTO_RIDERBELT)
			{
				if (itemstack1.isEmpty())
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					playerIn.setItemStackToSlot(entityequipmentslot2, itemstack2.copy());//追加
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack3);
				}
				else
				{
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					playerIn.setItemStackToSlot(entityequipmentslot2, itemstack2.copy());//追加
					itemstack.setCount(0);
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, itemstack1);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack3);
				}
			}
			else//ライダーベルト
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}


	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		ItemStack itemstack = player.getHeldItem(hand);
		//エンティティ
		EntityEnemyDarkKabuto enemy = new EntityEnemyDarkKabuto(worldIn);
		EntityDarkKabutoZector kabutozector = new EntityDarkKabutoZector(worldIn);

		if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
		{
			return EnumActionResult.FAIL;
		}
		else if(player.isSneaking())//スニーク中：放す
		{
			itemstack.setCount(0);
			if(!worldIn.isRemote)
			{
//				kabutozector.setPosition(pos.getX()+0.5,pos.getY()+1,pos.getZ()+0.5);
//				worldIn.spawnEntity(kabutozector);//カブトゼクターをスポーン
				
				kabutozector.setPosition(pos.getX()+0.5,pos.getY()+1,pos.getZ()+0.5);
				worldIn.spawnEntity(kabutozector);//カブトゼクターをスポーン
			}
			return EnumActionResult.SUCCESS;
		}
		else
		{
			return EnumActionResult.PASS;
		}

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(2) != null)
		{
			if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.KABUTO_MASKED_ARMOR)
			{
				MaskedIn=1;
			}
			else
			{
				MaskedIn=0;
			}
		}else {
			MaskedIn=0;
		}
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.KABUTO_RIDERBELT
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.GATACK_RIDERBELT
					||player.inventory.armorItemInSlot(1).getItem()==ItemInit.DARKKABUTO_RIDERBELT)

			{
				BeltCheck=1;
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1,1));
			}
			else
			{
				BeltCheck=0;
			}
		}else {
			BeltCheck=0;
		}

		if(BeltCheck==1 && MaskedIn==0)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1,1));
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
