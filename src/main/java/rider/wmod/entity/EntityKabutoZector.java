package rider.wmod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import rider.wmod.init.ItemInit;

public class EntityKabutoZector extends EntityCreature{

	public EntityKabutoZector(World worldIn) {
		super(worldIn);
		this.setSize(0.25F, 0.25F);
	}

	@Override
	public void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(2, new EntityAIWander(this, 0.25D));
	}

	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack itemstack = player.getHeldItem(hand);
		ItemStack itemstack2 = new ItemStack(ItemInit.KABUTO_ZECTOR, 1);
		if (!this.isChild())
		{
			if(!world.isRemote)
			{
				if (itemstack.isEmpty())
				{
					player.setHeldItem(hand, new ItemStack(ItemInit.KABUTO_ZECTOR));
					this.setDead();
				}
				else if(itemstack==itemstack2)
				{
					this.setDead();
				}
				else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemInit.KABUTO_ZECTOR)))
				{
					player.dropItem(new ItemStack(ItemInit.KABUTO_ZECTOR), false);
					this.setDead();
				}
				else
				{
//					player.dropItem(new ItemStack(ItemInit.KABUTO_ZECTOR), false);
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

	@Override
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	public void fall(float distance, float damageMultiplier)
	{
	}

	public void onLivingUpdate()
	{
		if(this.isEntityInsideOpaqueBlock())
		{
			this.noClip = true;
		}else {
			this.noClip = false;
		}

		if (!this.onGround && this.motionY < 0.0D)
		{
			this.motionY *= 0.8D;
		}
		this.renderYawOffset = this.rotationYaw;
		super.onLivingUpdate();
	}

	protected boolean canDespawn()
	{
		return true;
	}
}
