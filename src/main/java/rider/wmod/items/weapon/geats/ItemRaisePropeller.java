package rider.wmod.items.weapon.geats;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.Wmod;
import rider.wmod.init.BlockInit;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemRaisePropeller extends ItemTool implements IHasModel
{
	private static final Set<Block> effectiveBlocks = Sets.newHashSet(BlockInit.FAKE_DIAMOND_BLOCK);

	public ItemRaisePropeller(String name,CreativeTabs tab,float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn) {
		super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocks);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);

		ItemInit.ITEMS.add(this);
		this.setMaxDamage(materialIn.getMaxUses());
		this.attackDamage = attackDamageIn-1;
		this.attackSpeed = attackSpeedIn-4;
	}

	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);

		if(playerIn.inventory.armorItemInSlot(2) != null
				&& playerIn.inventory.armorItemInSlot(1) != null
				&& playerIn.inventory.armorItemInSlot(0) != null)
		{
			if(playerIn.inventory.armorItemInSlot(1).getItem()==ItemInit.DESIRE_DRIVER
					&&(playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_PROPELLER_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_PROPELLER
					||playerIn.inventory.armorItemInSlot(0).getItem()==ItemInit.RB_SP_R||playerIn.inventory.armorItemInSlot(2).getItem()==ItemInit.RB_SP))
			{
				playerIn.swingArm(handIn);
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.PLAYERS, 1.0F, 1.0F);
				playerIn.addPotionEffect(new PotionEffect(MobEffects.LEVITATION,40,0));
				playerIn.fallDistance=0;
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
			else 
			{//不適
				worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
				itemstack.setCount(0);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			}
		}
		else 
		{//不適
			worldIn.playSound(playerIn,playerIn.posX,playerIn.posY,playerIn.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 1.0F, 1.0F);
			itemstack.setCount(0);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
	}
}
