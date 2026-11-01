package rider.wmod.items.weapon.base;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rider.wmod.Wmod;
import rider.wmod.entity.EntityYellowBullet;
import rider.wmod.init.BlockInit;
import rider.wmod.init.ItemInit;
import rider.wmod.util.IHasModel;

public class ItemBaseGunWeapon extends ItemTool implements IHasModel
{
    private static final Set<Block> effectiveBlocks = Sets.newHashSet(BlockInit.FAKE_DIAMOND_BLOCK);
	double s=0.1;
	int r=10;
	public static Boolean flag=false;
	int bulletleft=10;
    
	public ItemBaseGunWeapon(String name,CreativeTabs tab,float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn) {
		super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocks);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);
		
		setMaxDamage(500);
		ItemInit.ITEMS.add(this);
        this.setMaxDamage(materialIn.getMaxUses());
        this.attackDamage = attackDamageIn-1;
        this.attackSpeed = attackSpeedIn-4;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn,EntityPlayer playerIn,EnumHand handIn)
	{

		ItemStack itemstack = playerIn.getHeldItem(handIn);
		Vec3d aim =playerIn.getLookVec();
		EntityYellowBullet bullet = new EntityYellowBullet(worldIn,playerIn,1,1,1,5);
		//		EntityLargeFireball fire = new EntityLargeFireball(worldIn,playerIn,1,1,1);
		bullet.setPosition(playerIn.posX+aim.x*1.5D,playerIn.posY+playerIn.eyeHeight-0.25D+aim.y*1.5D,playerIn.posZ+aim.z*1.5D);

		s=0.5;
		r=10;

		bullet.accelerationX=aim.x*s;
		bullet.accelerationY=aim.y*s;
		bullet.accelerationZ=aim.z*s;

		playerIn.swingArm(handIn);
		playerIn.getCooldownTracker().setCooldown(this, r);
		if(!worldIn.isRemote)
		{
			worldIn.spawnEntity(bullet);
		}
		itemstack.damageItem(1, playerIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
	
	@Override
	public void registerModels()
	{
		Wmod.proxy.registerModel(this,0);
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return false;
	}
	
    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.COMMON;
    }
}
