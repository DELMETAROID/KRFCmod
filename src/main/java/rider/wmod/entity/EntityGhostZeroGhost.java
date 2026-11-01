package rider.wmod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import rider.wmod.items.armor.ghost.ArmorGhostZero;

public class EntityGhostZeroGhost extends EntityCreature
	{

	EntityPlayer player;

	public EntityGhostZeroGhost(World worldIn) {
		super(worldIn);
	}

	public EntityGhostZeroGhost(World worldIn, double x, double y, double z) {
		super(worldIn);
        this.setPosition(x, y, z);
	}

	@Override
    public float getBrightness()
    {
        return 1.0F;
    }

	@Override
	public void initEntityAI()
	{
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 100));
		this.tasks.addTask(3, new EntityAIWander(this, 1, 10));
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityPlayer.class, false)); //攻撃されなくても追跡される
	}

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.BLOCK_SNOW_FALL;
    }

	@Override
    public boolean canBeHitWithPotion()
    {
        return false;
    }

	@Override
    public boolean attackable()
    {
        return false;
    }

	@Override
	public boolean doesEntityNotTriggerPressurePlate() {
		return false;
	}


	@Override
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
	}

	protected void updateAITasks()
	{
		super.updateAITasks();
		if(this.getEntityWorld().isAnyPlayerWithinRangeAt(posX, posY, posZ,1.5))
		{
			if(ArmorGhostZero.isHenshin==0) {ArmorGhostZero.isHenshin=1;}
			this.setDead();
		}
	}

	public void onLivingUpdate()
	{
		if(this.isEntityInsideOpaqueBlock()||this.inWater||this.isInLava()||ArmorGhostZero.EyeconIn2==1)
		{
			this.setDead();
		}
		super.onLivingUpdate();
	}

	public void fall(float distance, float damageMultiplier)
	{
	}

	protected boolean canDespawn()
	{
		return true;
	}
}
