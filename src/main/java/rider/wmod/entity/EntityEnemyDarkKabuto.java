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
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import rider.wmod.init.ItemInit;

public class EntityEnemyDarkKabuto extends EntityMob
{
    private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);
	public EntityEnemyDarkKabuto(World worldIn) {
		super(worldIn);
		this.experienceValue = 0;
	}

	@Override
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty)
	{
		super.setEquipmentBasedOnDifficulty(difficulty);

		if (this.rand.nextFloat() < (this.world.getDifficulty() == EnumDifficulty.NORMAL ? 1F : 0.4F))
		{
			this.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(ItemInit.KABUTO_MASKED_ARMOR,1));
		}

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
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(78.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);

	}
	
    public void setCustomNameTag(String name)
    {
        super.setCustomNameTag(name);
        this.bossInfo.setName(this.getDisplayName());
    }
    
    /**
     * Returns false if this Entity is a boss, true otherwise.
     */
    public boolean isNonBoss()
    {
        return false;
    }
    

	/**
	 * Called when the mob's health reaches 0.
	 */
	public void onDeath(DamageSource cause)
	{
		super.onDeath(cause);

		ItemStack itemstack = new ItemStack(ItemInit.DARKKABUTO_RIDERBELT,1);

		if (!world.isRemote)
		{
			this.entityDropItem(itemstack, 0.0F);
		}
	}
	
	@Override	
    protected boolean canDespawn()
    {
        return false;
    }
	
    
    /**
     * Teleport the enderman
     */
    private boolean teleportTo(double x, double y, double z)
    {
        net.minecraftforge.event.entity.living.EnderTeleportEvent event = new net.minecraftforge.event.entity.living.EnderTeleportEvent(this, x, y, z, 0);
        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return false;
        boolean flag = this.attemptTeleport(event.getTargetX(), event.getTargetY(), event.getTargetZ());

        if (flag)
        {
            this.world.playSound((EntityPlayer)null, this.prevPosX, this.prevPosY, this.prevPosZ, SoundEvents.ENTITY_ENDERMEN_TELEPORT, this.getSoundCategory(), 1.0F, 1.0F);
            this.playSound(SoundEvents.ENTITY_ENDERMEN_TELEPORT, 1.0F, 1.0F);
        }

        return flag;
    }
    
    /**
     * Teleport the enderman to a random nearby position
     */
    protected boolean teleportRandomly()
    {
        double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 64.0D;
        double d1 = this.posY + (double)(this.rand.nextInt(64) - 32);
        double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 64.0D;
        return this.teleportTo(d0, d1, d2);
    }
    
    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isEntityInvulnerable(source))
        {
            return false;
        }
        else if (source instanceof EntityDamageSourceIndirect)
        {
            for (int i = 0; i < 64; ++i)
            {
                if (this.teleportRandomly())
                {
                    return true;
                }
            }

            return false;
        }
        else
        {
            boolean flag = super.attackEntityFrom(source, amount);

            if (source.isUnblockable() && this.rand.nextInt(10) != 0)
            {
                this.teleportRandomly();
            }

            return flag;
        }
    }
}
