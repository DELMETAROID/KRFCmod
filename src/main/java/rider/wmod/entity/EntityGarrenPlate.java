package rider.wmod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.init.SoundEvents;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import rider.wmod.init.ItemInit;
import rider.wmod.items.armor.blade.ArmorGarren;

public class EntityGarrenPlate extends EntityCreature{

    protected EntityLivingBase thrower;

	public EntityGarrenPlate(World worldIn) {
		super(worldIn);
		this.setSize(1.0F, 1.5F);
        this.setPathPriority(PathNodeType.WATER, -1.0F);
        this.setPathPriority(PathNodeType.LAVA, -1.0F);
	}

	@Override
	public void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAITempt(this, 1.25D, ItemInit.BLADE_TURN_UP, false));
	}

	@Override
    public boolean canBePushed()
    {
        return false;
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
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
//		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0D);
	}

	protected void updateAITasks()
	{
		super.updateAITasks();
		if(this.getEntityWorld().isAnyPlayerWithinRangeAt(posX, posY, posZ,1.5))
		{
			if(ArmorGarren.isHenshin==0) {ArmorGarren.isHenshin=1;}
			else if(ArmorGarren.isHenshin==1) {ArmorGarren.isHenshin=0;}
			this.setDead();
		}
	}

	public void onLivingUpdate()
	{
		if(this.isEntityInsideOpaqueBlock()||this.inWater||this.isInLava()||!this.getCanSpawnHere())
		{
			if(ArmorGarren.isHenshin==0) {ArmorGarren.isHenshin=1;}
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
