package rider.wmod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import rider.wmod.init.ItemInit;
import rider.wmod.items.armor.blade.ArmorBlade;

public class EntityBladePlate extends EntityCreature
	{

	EntityCreature player;

	public EntityBladePlate(World worldIn) {
		super(worldIn);
		this.setSize(1.0F, 1.5F);
        this.setPathPriority(PathNodeType.WATER, -1.0F);
        this.setPathPriority(PathNodeType.LAVA, -1.0F);
	}

	public EntityBladePlate(World worldIn, double x, double y, double z) {
		super(worldIn);
		this.setSize(1.0F, 1.5F);
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
		this.tasks.addTask(0, new EntityAITempt(this, 1.25D, ItemInit.BLADE_TURN_UP, false));
		this.tasks.addTask(0, new EntityAITempt(this, 1.25D, ItemInit.BLAROUSER, false));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 100));
	}

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.BLOCK_GLASS_BREAK;
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
			if(ArmorBlade.isHenshin==0) {ArmorBlade.isHenshin=1;}
			else if(ArmorBlade.isHenshin==1) {ArmorBlade.isHenshin=0;}
			this.setDead();
		}
	}

	public void onLivingUpdate()
	{
		if(this.isEntityInsideOpaqueBlock()||this.inWater||this.isInLava()||!this.getCanSpawnHere())
		{
			if(ArmorBlade.isHenshin==0) {ArmorBlade.isHenshin=1;}
			this.setDead();
			world.playSound(this.posX,this.posY,this.posZ,  SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.PLAYERS, 1.0F, 1.0F, false);
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
