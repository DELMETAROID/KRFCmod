package rider.wmod.entity;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import rider.wmod.init.MetaItemInit;
import rider.wmod.util.handlers.LootTableHandler;

public class EntityEnemyJamatoZombie extends EntityZombie
{
	Random rand = new Random();
	int r=0;

	public EntityEnemyJamatoZombie(World worldIn) {
		super(worldIn);
	}

	@Override
	protected void initEntityAI() 
	{
		super.initEntityAI();
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, false));
		this.tasks.addTask(8, new EntityAIWander(this, 0.6D));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F, 1.0F));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityVillager>(this, EntityVillager.class, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityIronGolem>(this, EntityIronGolem.class, true));
	}
	

	@Override
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
	}

	class GroupData implements IEntityLivingData
	{
		public boolean isChild = false;
	}

	@Override
	protected boolean shouldBurnInDay()
	{
		return false;
	}

	@Override
	@Nullable
	protected ResourceLocation getLootTable()
	{
		return LootTableHandler.JAMATO;
	}

	@Override
    public boolean isChild()
    {
        return false;    }

	/**
	 * Called when the mob's health reaches 0.
	 */
	 public void onDeath(DamageSource cause)
	 {
		 super.onDeath(cause);

		 ItemStack itemstack = new ItemStack(MetaItemInit.MISSION_BOX,1,2);
		 ItemStack itemstack2 = new ItemStack(MetaItemInit.MISSION_BOX,1,3);

		 if (!world.isRemote)
		 {
			 r=rand.nextInt(9);// 1/10
			 if(r==1||r==2)
			 {
				 this.entityDropItem(itemstack, 0.0F);
			 }
			 if(r==0)
			 {
				 this.entityDropItem(itemstack2, 0.0F);
			 }
		 }
	 }

}
