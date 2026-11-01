package rider.wmod.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityPurpleBullet extends EntityBullet
{
	public static int damage=0;

	public EntityPurpleBullet(World worldIn)
    {
        super(worldIn);
    }

    @SideOnly(Side.CLIENT)
    public EntityPurpleBullet(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ)
    {
        super(worldIn, x, y, z, accelX, accelY, accelZ);
    }

    public EntityPurpleBullet(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ,int d)
   {
        super(worldIn, shooter, accelX, accelY, accelZ);
        damage=d;
    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onImpact(RayTraceResult result)
    {
        if (!this.world.isRemote)
        {
            if (result.entityHit != null)
            {
               result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.shootingEntity), damage);
               this.applyEnchantments(this.shootingEntity, result.entityHit);
            }
            this.setDead();
        }
    }

/*
    public static void registerFixesLargeFireball(DataFixer fixer)
    {
        EntityBullet.registerFixesBullet(fixer, "Fireball");
    }

     // (abstract) Protected helper method to write subclass entity data to NBT.

    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("ExplosionPower", this.explosionPower);
    }

     // (abstract) Protected helper method to read subclass entity data from NBT.

    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);

        if (compound.hasKey("ExplosionPower", 99))
        {
            this.explosionPower = compound.getInteger("ExplosionPower");
        }
    }*/
}