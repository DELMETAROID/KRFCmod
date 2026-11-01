package rider.wmod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityGordDrive extends EntityMob
{
    public EntityGordDrive(World worldIn) {
		super(worldIn);
		this.experienceValue = 0;
	}

	@Override
	protected void initEntityAI() 
	{
		super.initEntityAI();
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, false));

		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityVindicator.class}));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityEnemyKabuto>(this, EntityEnemyKabuto.class, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityVillager>(this, EntityVillager.class, true));
		this.targetTasks.addTask(5, new EntityAINearestAttackableTarget<EntityCreature>(this, EntityCreature.class, true));
		this.tasks.addTask(8, new EntityAIWander(this, 0.6D,40));
		//        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F, 1.0F));
	}

	@Override
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(102.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
	}

	/**
	 * Called when the mob's health reaches 0.
	 */
	public void onDeath(DamageSource cause)
	{
		super.onDeath(cause);
		EntityBanno banno = new EntityBanno(world);

		if (!world.isRemote)
		{
			banno.setPosition(this.posX,this.posY+1,this.posZ);
			world.spawnEntity(banno);
		}
	}
	
	@Override	
    protected boolean canDespawn()
    {
        return false;
    }
	}
