package rider.wmod.items.tools.geats;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.init.MetaItemInit;
import rider.wmod.util.IHasModel;

public class ItemMissionBox extends Item implements IHasModel
{
	int n =4;
	int count =0;
	Random rand = new Random();

	public ItemMissionBox() {
		setUnlocalizedName("missionbox");
		setRegistryName("missionbox");
		setCreativeTab(Wmod.TabKamenRiderGEATS);
		setMaxStackSize(1);
		this.setHasSubtypes(true);
		MetaItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		for(int i = 0; i < n; i++){
			Wmod.proxy.registerModelwithMeta(this,i,"missionbox_");
		}
	}


	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		playerIn.swingArm(handIn);
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		int r=0;
		int r2 = 0;
		int r3=0;

		r=rand.nextInt(9);// 1/10
		r2=rand.nextInt(12);// 1/12
		r3=rand.nextInt(2);// 1/6


		
		ItemStack DRIVER = new ItemStack(ItemInit.DESIRE_DRIVER,1);

		ItemStack RB_HAMMER = new ItemStack(ItemInit.RB_HAMMER,1);
		ItemStack RB_WATER = new ItemStack(ItemInit.RB_WATER,1);
		ItemStack RB_ARROW = new ItemStack(ItemInit.RB_ARROW,1);
		ItemStack RB_SHIELD = new ItemStack(ItemInit.RB_SHIELD,1);
		ItemStack RB_CRAW = new ItemStack(ItemInit.RB_CRAW,1);
		ItemStack RB_CHAINARRAY = new ItemStack(ItemInit.RB_CHAINARRAY,1);
		ItemStack RB_DRILL = new ItemStack(ItemInit.RB_DRILL,1);
		ItemStack RB_PROPELLER = new ItemStack(ItemInit.RB_PROPELLER,1);
		ItemStack RB_SHOOTER = new ItemStack(ItemInit.RB_SHOOTER,1);
		ItemStack RB_BREAKER = new ItemStack(ItemInit.RB_BREAKER,1);
		ItemStack RB_DUALER = new ItemStack(ItemInit.RB_DUALER,1);
		ItemStack RB_AX = new ItemStack(ItemInit.RB_AX,1);
		ItemStack RB_MAGNUM = new ItemStack(ItemInit.RB_MAGNUM,1);
		ItemStack RB_ZOMBIE = new ItemStack(ItemInit.RB_ZOMBIE,1);
		ItemStack RB_NINJA = new ItemStack(ItemInit.RB_NINJA,1);
		ItemStack RB_BEAT = new ItemStack(ItemInit.RB_BEAT,1);
		ItemStack RB_MONSTER = new ItemStack(ItemInit.RB_MONSTER,1);
		ItemStack RB_BOOST = new ItemStack(ItemInit.RB_BOOST,1);
		if(itemstack.getMetadata()==0) {//0
			//				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, DRIVER);
		}

		if(itemstack.getMetadata()==1) {//!
			if(handIn==EnumHand.MAIN_HAND) {
				playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,DRIVER.copy());
			}else {
				playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,DRIVER.copy());	
			}
			//				itemstack.setCount(0);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
		}

		if(itemstack.getMetadata()==2) {//?

			if(r<=7) {
				switch(r2) 
				{
				case 0:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_HAMMER.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_HAMMER.copy());	
					}
					break;
				case 1:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_WATER.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_WATER.copy());	
					}break;
				case 2:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_ARROW.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_ARROW.copy());	
					}break;
				case 3:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_SHIELD.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_SHIELD.copy());	
					}break;
				case 4:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_CRAW.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_CRAW.copy());	
					}break;
				case 5:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_CHAINARRAY.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_CHAINARRAY.copy());	
					}break;
				case 6:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_DRILL.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_DRILL.copy());	
					}break;
				case 7:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_PROPELLER.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_PROPELLER.copy());	
					}break;
				case 8:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_SHOOTER.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_SHOOTER.copy());	
					}
				case 9:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_BREAKER.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_BREAKER.copy());	
					}break;
				case 10:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_DUALER.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_DUALER.copy());	
					}break;
				case 11:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_AX.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_AX.copy());	
					}break;
				}
			}else {
				switch(r3) 
				{
				case 0:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_MAGNUM.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_MAGNUM.copy());	
					}break;
				case 1:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_BOOST.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_BOOST.copy());	
					}break;
				case 2:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_ZOMBIE.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_ZOMBIE.copy());	
					}break;
				case 3:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_NINJA.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_NINJA.copy());	
					}break;
				case 4:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_BEAT.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_BEAT.copy());	
					}break;
				case 5:
					if(handIn==EnumHand.MAIN_HAND) {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_MONSTER.copy());	
					}else {
						playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_MONSTER.copy());	
					}break;
				}
			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,itemstack);
		}
		else if(itemstack.getMetadata()==3) 
		{
			switch(r3) 
			{
			case 0:
				if(handIn==EnumHand.MAIN_HAND) {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_MAGNUM.copy());	
				}else {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_MAGNUM.copy());	
				}break;
			case 1:
				if(handIn==EnumHand.MAIN_HAND) {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_BOOST.copy());	
				}else {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_BOOST.copy());	
				}break;
			case 2:
				if(handIn==EnumHand.MAIN_HAND) {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_ZOMBIE.copy());	
				}else {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_ZOMBIE.copy());	
				}break;
			case 3:
				if(handIn==EnumHand.MAIN_HAND) {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_NINJA.copy());	
				}else {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_NINJA.copy());	
				}break;
			case 4:
				if(handIn==EnumHand.MAIN_HAND) {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_BEAT.copy());	
				}else {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_BEAT.copy());	
				}break;
			case 5:
				if(handIn==EnumHand.MAIN_HAND) {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,RB_MONSTER.copy());	
				}else {
					playerIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,RB_MONSTER.copy());	
				}break;
			}
		}			
		else 
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
		return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	}


	//翻訳名を変更する。後ろに.nameが着くためその前まで。
	public String getUnlocalizedName(ItemStack stack) {
		int i = stack.getMetadata();
		return "item.missionbox." + i;
	}

	public String getRegistryName(ItemStack stack) {
		int i = stack.getMetadata();
		return "missionbox_" + i;
	}

	//クリエイティブタブに複数のアイテムを登録する。
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < n; ++i) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		if(stack.getMetadata()==3) { return true;}
		else return false;
	}
}
