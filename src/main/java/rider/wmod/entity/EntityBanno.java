package rider.wmod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.init.ItemInit;

public class EntityBanno extends EntityCreature{

	public EntityBanno(World worldIn) {
		super(worldIn);
		this.setSize(0.25F, 0.25F);
	}

	@Override
	public void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 16.0F));
		this.tasks.addTask(2, new EntityAIWander(this, 0.05D));
	}

	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack itemstack = player.getHeldItem(hand);
		ItemStack itemstack2 = new ItemStack(ItemInit.BANNO_DRIVER, 1);
		if (!this.isChild())
		{
			if(!world.isRemote)
			{
				if (itemstack.isEmpty())
				{
					player.setHeldItem(hand, new ItemStack(ItemInit.BANNO_DRIVER));
					this.setDead();
				}
				else if(itemstack==itemstack2)
				{
					this.setDead();
				}
				else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemInit.BANNO_DRIVER)))
				{
					player.dropItem(new ItemStack(ItemInit.BANNO_DRIVER), false);
					this.setDead();
				}
				else
				{
					//					player.dropItem(new ItemStack(ItemInit.DARK_KABUTO_ZECTOR), false);
					this.setDead();
				}
			}
			return true;
		}
		else
		{
			return super.processInteract(player, hand);
		}
	}

	@Override
	public float getEyeHeight()
	{
		return 0.1F;
	}

	/**
	 * Called when the mob's health reaches 0.
	 */
	public void onDeath(DamageSource cause)
	{
		super.onDeath(cause);

		ItemStack itemstack = new ItemStack(ItemInit.BANNO_DRIVER_BRONZE,1);

		if (!world.isRemote)
		{
			this.entityDropItem(itemstack, 0.0F);
		}
	}

	@Override
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);
	}


	public void fall(float distance, float damageMultiplier)
	{
	}

	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}

	protected boolean canDespawn()
	{
		return true;
	}
}
