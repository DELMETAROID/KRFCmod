package rider.wmod.items.tools.ooo;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.ItemInit;
import rider.wmod.items.armor.ooo.ArmorOOODriver;
import rider.wmod.util.IHasModel;

public class ItemOScanner extends Item implements IHasModel
{
	public ItemOScanner(String name,CreativeTabs tab)
	{
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


	//効果
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack oscanner 	= playerIn.getHeldItem(handIn);
		ItemStack ooodriver =new ItemStack(ItemInit.OOO_DRIVER,1);
		//コアメダル
		ItemStack taka =new ItemStack(ItemInit.TAKA_CORE,1);
		ItemStack kujaku =new ItemStack(ItemInit.KUJAKU_CORE,1);
		ItemStack condle =new ItemStack(ItemInit.CONDLE_CORE,1);

		ItemStack kuwa =new ItemStack(ItemInit.KUWA_CORE,1);
		ItemStack kama = new ItemStack(ItemInit.KAMA_CORE,1);
		ItemStack batta = new ItemStack(ItemInit.BATTA_CORE,1);

		ItemStack lion =new ItemStack(ItemInit.LION_CORE,1);
		ItemStack tora = new ItemStack(ItemInit.TORA_CORE,1);
		ItemStack cheetah =new ItemStack(ItemInit.CHEETAH_CORE,1);

		ItemStack sai =new ItemStack(ItemInit.SAI_CORE,1);
		ItemStack gorilla =new ItemStack(ItemInit.GORILLA_CORE,1);
		ItemStack zou =new ItemStack(ItemInit.ZOU_CORE,1);

		ItemStack shachi =new ItemStack(ItemInit.SHACHI_CORE,1);
		ItemStack unagi = new ItemStack(ItemInit.UNAGI_CORE,1);
		ItemStack tako = new ItemStack(ItemInit.TAKO_CORE,1);

		ItemStack putera =new ItemStack(ItemInit.PUTERA_CORE,1);
		ItemStack tricera = new ItemStack(ItemInit.TRICERA_CORE,1);
		ItemStack tyrano =new ItemStack(ItemInit.TYRANO_CORE,1);

		
		EntityEquipmentSlot entityequipmentslot1 = EntityLiving.getSlotForItemStack(taka);
		EntityEquipmentSlot entityequipmentslot2 = EntityLiving.getSlotForItemStack(tora);
		EntityEquipmentSlot entityequipmentslot3 = EntityLiving.getSlotForItemStack(batta);
		EntityEquipmentSlot driverequipmentslot = EntityLiving.getSlotForItemStack(ooodriver);

		
		ItemStack wearing1 = playerIn.getItemStackFromSlot(entityequipmentslot1);
		ItemStack wearing2 = playerIn.getItemStackFromSlot(entityequipmentslot2);
		ItemStack wearing3 = playerIn.getItemStackFromSlot(entityequipmentslot3);
		ItemStack wearingdriver = playerIn.getItemStackFromSlot(driverequipmentslot);		

		if(!playerIn.isSneaking()) 
		{
			if((wearing1==ItemStack.EMPTY && wearing2==ItemStack.EMPTY  && wearing3 ==ItemStack.EMPTY))//無＝解除
			{
				playerIn.swingArm(handIn);	
				playerIn.setItemStackToSlot(driverequipmentslot,ItemStack.EMPTY);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, wearingdriver);
			}
			else if((ItemStack.areItemsEqualIgnoreDurability(wearing1,taka)||ItemStack.areItemsEqualIgnoreDurability(wearing1,kuwa)
					||ItemStack.areItemsEqualIgnoreDurability(wearing1,lion)||ItemStack.areItemsEqualIgnoreDurability(wearing1,sai)
					||ItemStack.areItemsEqualIgnoreDurability(wearing1,shachi)||ItemStack.areItemsEqualIgnoreDurability(wearing1,putera))
					
					&&(ItemStack.areItemsEqualIgnoreDurability(wearing2,kujaku)||ItemStack.areItemsEqualIgnoreDurability(wearing2,kama)
							||ItemStack.areItemsEqualIgnoreDurability(wearing2,tora)||ItemStack.areItemsEqualIgnoreDurability(wearing2,gorilla)
							||ItemStack.areItemsEqualIgnoreDurability(wearing2,unagi)||ItemStack.areItemsEqualIgnoreDurability(wearing2,tricera))
					
					&&(ItemStack.areItemsEqualIgnoreDurability(wearing3,condle)||ItemStack.areItemsEqualIgnoreDurability(wearing3,batta)
							||ItemStack.areItemsEqualIgnoreDurability(wearing3,cheetah)||ItemStack.areItemsEqualIgnoreDurability(wearing3,zou)
							||ItemStack.areItemsEqualIgnoreDurability(wearing3,tako)||ItemStack.areItemsEqualIgnoreDurability(wearing3,tyrano)))
			{
				//頭
				if(ItemStack.areItemsEqualIgnoreDurability(wearing1,taka))
				{ArmorOOODriver.MedalCheckTaka=1;}	else{ArmorOOODriver.MedalCheckTaka=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing1,kuwa))
				{ArmorOOODriver.MedalCheckKuwa=1;}	else {ArmorOOODriver.MedalCheckKuwa=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing1,lion))
				{ArmorOOODriver.MedalCheckLion=1;}	else{ArmorOOODriver.MedalCheckLion=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing1,sai))
				{ArmorOOODriver.MedalCheckSai=1;}	else {ArmorOOODriver.MedalCheckSai=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing1,shachi))
				{ArmorOOODriver.MedalCheckShachi=1;}	else{ArmorOOODriver.MedalCheckShachi=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing1,putera))
				{ArmorOOODriver.MedalCheckPutera=1;}	else {ArmorOOODriver.MedalCheckPutera=0;}
				
				//胴
				if(ItemStack.areItemsEqualIgnoreDurability(wearing2,kujaku))
				{ArmorOOODriver.MedalCheckKujaku=1;}else {ArmorOOODriver.MedalCheckKujaku=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing2,kama))
				{ArmorOOODriver.MedalCheckKama=1;}else{ArmorOOODriver.MedalCheckKama=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing2,tora))
				{ArmorOOODriver.MedalCheckTora=1;}else {ArmorOOODriver.MedalCheckTora=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing2,gorilla))
				{ArmorOOODriver.MedalCheckGorilla=1;}else{ArmorOOODriver.MedalCheckGorilla=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing2,unagi))
				{ArmorOOODriver.MedalCheckUnagi=1;}else {ArmorOOODriver.MedalCheckUnagi=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing2,tricera))
				{ArmorOOODriver.MedalCheckTricera=1;}else{ArmorOOODriver.MedalCheckTricera=0;}

				//足
				if(ItemStack.areItemsEqualIgnoreDurability(wearing3,condle))
				{ArmorOOODriver.MedalCheckCondle=1;}else{ArmorOOODriver.MedalCheckCondle=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing3,batta))
				{ArmorOOODriver.MedalCheckBatta=1;}else{ArmorOOODriver.MedalCheckBatta=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing3,cheetah))
				{ArmorOOODriver.MedalCheckCheetah=1;}else{ArmorOOODriver.MedalCheckCheetah=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing3,zou))
				{ArmorOOODriver.MedalCheckZou=1;}else{ArmorOOODriver.MedalCheckZou=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing3,tako))
				{ArmorOOODriver.MedalCheckTako=1;}else{ArmorOOODriver.MedalCheckTako=0;}
				if(ItemStack.areItemsEqualIgnoreDurability(wearing3,tyrano))
				{ArmorOOODriver.MedalCheckTyrano=1;}else{ArmorOOODriver.MedalCheckTyrano=0;}
				
				playerIn.swingArm(handIn);
				if(worldIn.isRemote)
				{
					worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ENTITY_PLAYER_LEVELUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
				}
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, oscanner);
			}else {
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, oscanner);
			}
		}else {
			ArmorOOODriver.MedalCheckTaka=0;
			ArmorOOODriver.MedalCheckKujaku=0;
			ArmorOOODriver.MedalCheckCondle=0;
			ArmorOOODriver.MedalCheckLion=0;
			ArmorOOODriver.MedalCheckTora=0;
			ArmorOOODriver.MedalCheckCheetah=0;
			ArmorOOODriver.MedalCheckKuwa=0;
			ArmorOOODriver.MedalCheckKama=0;
			ArmorOOODriver.MedalCheckBatta=0;
			ArmorOOODriver.MedalCheckSai=0;
			ArmorOOODriver.MedalCheckGorilla=0;
			ArmorOOODriver.MedalCheckZou=0;
			ArmorOOODriver.MedalCheckShachi=0;
			ArmorOOODriver.MedalCheckUnagi=0;
			ArmorOOODriver.MedalCheckTako=0;
			ArmorOOODriver.MedalCheckPutera=0;
			ArmorOOODriver.MedalCheckTricera=0;
			ArmorOOODriver.MedalCheckTyrano=0;
			
			playerIn.swingArm(handIn);	
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, oscanner);
		}
	}
}