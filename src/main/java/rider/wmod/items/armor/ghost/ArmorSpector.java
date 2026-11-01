package rider.wmod.items.armor.ghost;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityGhostSpector;
import rider.wmod.init.ItemInit;
import rider.wmod.rendering.models.items.ghost.ModelSpector;
import rider.wmod.util.IHasModel;
import rider.wmod.util.Reference;

public class ArmorSpector extends ItemArmor implements IHasModel{

	public static int DriverCheck=0;
	public static int HaveEyecon=0;
	public static int isHenshin=0;
	public static int EyeconIn2=0;
	public static int isInvisible=0;

	public ArmorSpector(String name,CreativeTabs tab,ArmorMaterial materialIn,EntityEquipmentSlot equipmentSlotIn) {
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
				ModelSpector model = new ModelSpector();
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
		ItemStack ghostdriver =new ItemStack(ItemInit.GHOST_DRIVER,1);
		
		EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		EntityEquipmentSlot entityequipmentslot1 = EntityLiving.getSlotForItemStack(ghostdriver);
		
		ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);
		EntityGhostSpector ParkaGhost = new EntityGhostSpector(worldIn);
		
		//消去アイテム
		ItemStack erase_driver = this.findAmmo(playerIn,ItemInit.GHOST_DRIVER);

		if(playerIn.inventory.armorItemInSlot(1) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.GHOST_DRIVER)
			{
				playerIn.swingArm(handIn);			
				if (itemstack1.isEmpty())
				{
					isHenshin=0;
					if(!worldIn.isRemote)
					{
						ParkaGhost.setPosition(playerIn.posX,playerIn.posY+8,playerIn.posZ);
						worldIn.spawnEntity(ParkaGhost);
					}
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
				else
				{
					isHenshin=1;
					playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
					itemstack.setCount(0);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack1);
				}
			}
			else if(playerIn.inventory.armorItemInSlot(1).isEmpty())
			{
				playerIn.swingArm(handIn);
				playerIn.inventory.deleteStack(erase_driver);
				playerIn.setItemStackToSlot(entityequipmentslot1, ghostdriver.copy());
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
			else
			{
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
		else
		{
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

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorItemInSlot(2) != null)
		{
			if(player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconMUSASHI
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconEDISON
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconROBIN_HOOT
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconNEWTON
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconBILLY_THE_KID
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconBEETHOVEN
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconBENKEI
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconGOEMON
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconRYOMA
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconHIMIKO
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconNOBUNAGA
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconTUTANKHAMUN
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconHOUDINI
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconGRIMM
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconSANZO
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconIKKYU
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconPYTAGORAS
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconDARWIN
					||player.inventory.armorItemInSlot(2).getItem()==ItemInit.EyeconNAPOLEON
					)
			{
				isHenshin=1;
				EyeconIn2=1;
			}
			else
			{
				EyeconIn2=0;
			}
		}

		if(player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconMUSASHI
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconEDISON
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconROBIN_HOOT
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconNEWTON
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconBILLY_THE_KID
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconBEETHOVEN
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconBENKEI
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconGOEMON
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconRYOMA
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconHIMIKO
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconNOBUNAGA
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconTUTANKHAMUN
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconHOUDINI
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconGRIMM
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconSANZO
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconIKKYU
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconPYTAGORAS
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconDARWIN
				||player.getHeldItem(EnumHand.MAIN_HAND).getItem()==ItemInit.EyeconNAPOLEON
				){
			HaveEyecon=1;			
		}
		else {
			HaveEyecon=0;			
		}
		
		
		if(player.inventory.armorItemInSlot(1) != null)
		{
			if(player.inventory.armorItemInSlot(1).getItem()==ItemInit.GHOST_DRIVER)
			{
				DriverCheck=1;
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,0,0,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,1,1,true,false));
				
				if((item.getMaxDamage()-item.getItemDamage()>10) && Keyboard.isKeyDown(Reference.ACTION_BUTTON))
				{
					item.damageItem(10, player);
					player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY,40,0,true,true));
					player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION,40,0,true,true));
				}
			}
			else
			{
				DriverCheck=0;
			}
		}
		else
		{
			DriverCheck=0;
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