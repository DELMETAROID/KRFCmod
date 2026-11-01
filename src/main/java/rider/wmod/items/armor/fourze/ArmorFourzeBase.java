package rider.wmod.items.armor.fourze;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
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
import rider.wmod.rendering.models.items.fourze.ModelFourzeBase;
import rider.wmod.util.IHasModel;
import rider.wmod.util.Reference;

public class ArmorFourzeBase extends ItemArmor implements IHasModel{

	public static int isInvisible=0;
	public static int isHenshin=0;
	public static int DriverCheck=0;
	public int OnGroundFlag=0;

	public ArmorFourzeBase(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelFourzeBase model = new ModelFourzeBase();
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
		
		ItemStack itemstack = new ItemStack(ItemInit.FOURZE_DRIVER,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		
		ItemStack itemstack2 = new ItemStack(ItemInit.FOURZE_LEVER,1);

		isHenshin=0;
		if (itemstack1.isEmpty())
		{
			playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
			itemstack.setCount(0);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
		}
		else
		{
			playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
			itemstack.setCount(0);
			playerIn.dropItem(itemstack1, true);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack2);
		}
	}



	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{	
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.FOURZE_DRIVER)
			{
				DriverCheck=1;
				player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,1,1,true,false));
				
				if(player.onGround==true) {this.OnGroundFlag=1;}
				
				if(!world.isRemote && player.onGround==false && this.OnGroundFlag >0 && Keyboard.isKeyDown(Reference.ACTION_BUTTON))
				{
					this.OnGroundFlag=0;
					player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION,20,2));
				}				
			}
			else
			{
				DriverCheck=0;
				this.OnGroundFlag=1;
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