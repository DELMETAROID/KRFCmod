package rider.wmod.rendering.models.items.kuuga;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.kuuga.ArmorArcle;

/**
 * ModelKuugaGrowing - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKuugaGrowing extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer Belt;
	public ModelRenderer driver;
	public ModelRenderer beltL;
	public ModelRenderer beltR;
	public ModelRenderer sideL;
	public ModelRenderer sideL_1;
	public ModelRenderer beltL2;
	public ModelRenderer beltR2;
	public ModelRenderer driverMighty;
	public ModelRenderer driverDragon;
	public ModelRenderer driverPegasas;
	public ModelRenderer driverTitan;

	public ModelKuugaGrowing() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-0.5F, -2.3F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_L, 0.0F, 0.0F, -0.05235987755982988F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.5F, -2.3F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(Shoulder_R, 0.0F, 0.0F, 0.05235987755982988F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);

		this.Belt = new ModelRenderer(this, 16, 33);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.beltR = new ModelRenderer(this, 19, 38);
		this.beltR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR.addBox(-3.0F, 8.5F, -2.7F, 2, 2, 1, 0.0F);
		this.beltL = new ModelRenderer(this, 31, 38);
		this.beltL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL.addBox(1.0F, 8.5F, -2.7F, 2, 2, 1, 0.0F);
		this.sideL_1 = new ModelRenderer(this, 43, 37);
		this.sideL_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.sideL_1.addBox(-4.75F, 8.5F, -1.0F, 1, 2, 2, 0.0F);
		this.beltL2 = new ModelRenderer(this, 38, 38);
		this.beltL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL2.addBox(3.0F, 9.0F, -2.5F, 1, 1, 1, 0.0F);
		this.beltR2 = new ModelRenderer(this, 38, 38);
		this.beltR2.mirror = true;
		this.beltR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR2.addBox(-4.0F, 9.0F, -2.5F, 1, 1, 1, 0.0F);
		this.sideL = new ModelRenderer(this, 43, 37);
		this.sideL.mirror = true;
		this.sideL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.sideL.addBox(3.75F, 8.5F, -1.0F, 1, 2, 2, 0.0F);

		this.driver = new ModelRenderer(this, 37, 41);
		this.driver.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driver.addBox(-1.0F, 8.5F, -3.0F, 2, 2, 1, 0.0F);
		this.driverMighty = new ModelRenderer(this, 25, 38);
		this.driverMighty.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverMighty.addBox(-1.0F, 8.5F, -3.0F, 2, 2, 1, 0.0F);
		this.driverDragon = new ModelRenderer(this, 19, 41);
		this.driverDragon.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverDragon.addBox(-1.0F, 8.5F, -3.0F, 2, 2, 1, 0.0F);
		this.driverPegasas = new ModelRenderer(this, 25, 41);
		this.driverPegasas.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverPegasas.addBox(-1.0F, 8.5F, -3.0F, 2, 2, 1, 0.0F);
		this.driverTitan = new ModelRenderer(this, 31, 41);
		this.driverTitan.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverTitan.addBox(-1.0F, 8.5F, -3.0F, 2, 2, 1, 0.0F);

		this.Belt.addChild(this.beltL);
		this.LeftArm.addChild(this.Shoulder_L);
		this.Belt.addChild(this.sideL_1);
		this.Belt.addChild(this.beltL2);
		this.Belt.addChild(this.beltR);
		this.RightArm.addChild(this.Shoulder_R);
		this.Belt.addChild(this.beltR2);
		this.Belt.addChild(this.sideL);
		this.Belt.addChild(this.driver);
		this.Belt.addChild(this.driverMighty);
		this.Belt.addChild(this.driverDragon);
		this.Belt.addChild(this.driverPegasas);        
		this.Belt.addChild(this.driverTitan);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorArcle.isInvisible==0 && ArmorArcle.AmadamCheckGrowing==1 && ArmorArcle.AmadamCheck==1) {
			this.LeftArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.RightArm.showModel=true;
			this.Body.showModel=true;
			this.Head.showModel=true;
			this.RightLeg.showModel=true;
		}
		else
		{
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.RightArm.showModel=false;
			this.Body.showModel=false;
			this.Head.showModel=false;
			this.RightLeg.showModel=false;
		}


		if(ArmorArcle.isInvisible==0 &&(ArmorArcle.AmadamCheckMighty==1 && ArmorArcle.AmadamCheck==1)||ArmorArcle.AmadamCheckGrowing==1)
		{
			this.driverMighty.showModel=true;
		}
		else
		{
			this.driverMighty.showModel=false;				
		}				

		if(ArmorArcle.isInvisible==0 && (ArmorArcle.AmadamCheckDragon==1 && ArmorArcle.AmadamCheck==1) && ArmorArcle.AmadamCheckGrowing==0) 
		{
			this.driverDragon.showModel=true;
		}
		else
		{
			this.driverDragon.showModel=false;
		}

		if(ArmorArcle.isInvisible==0 &&( ArmorArcle.AmadamCheckPegasas==1 && ArmorArcle.AmadamCheck==1) && ArmorArcle.AmadamCheckGrowing==0) 
		{
			this.driverPegasas.showModel=true;
		}
		else
		{
			this.driverPegasas.showModel=false;				
		}

		if(ArmorArcle.isInvisible==0 && (ArmorArcle.AmadamCheckTitan==1 && ArmorArcle.AmadamCheck==1)&& ArmorArcle.AmadamCheckGrowing==0) 
		{
			this.driverTitan.showModel=true;
		}
		else
		{
			this.driverTitan.showModel=false;				
		}

		if(ArmorArcle.isInvisible==0 && ArmorArcle.AmadamCheck==0) 
		{
			this.driver.showModel=true;
		}
		else
		{
			this.driver.showModel=false;				
		}

		if(ArmorArcle.isInvisible==0)
		{
			this.Belt.showModel=true;
			this.driver.showModel=true;
			this.beltL.showModel=true;
			this.beltR.showModel=true;
			this.sideL.showModel=true;
			this.sideL_1.showModel=true;
			this.beltL2.showModel=true;
			this.beltR2.showModel=true;
		}else {
			this.Belt.showModel=false;
			this.driver.showModel=false;
			this.beltL.showModel=false;
			this.beltR.showModel=false;
			this.sideL.showModel=false;
			this.sideL_1.showModel=false;
			this.beltL2.showModel=false;
			this.beltR2.showModel=false;			
		}

		if (this.isChild)
		{
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);
			this.Body.render(f5);
			this.Head.render(f5);
			this.Belt.render(f5);
			this.RightLeg.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.LeftArm.render(f5);
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);
			this.Body.render(f5);
			this.Head.render(f5);
			this.Belt.render(f5);
			this.RightLeg.render(f5);

			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
			}

		}
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entity) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
		if (entity instanceof EntityArmorStand)
		{
			EntityArmorStand entityarmorstand = (EntityArmorStand)entity;
			this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
			this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
			this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
			this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
			this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
			this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
			this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
			this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
			this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
			this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
			this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
			this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
			this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
			this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
			this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
			this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
			this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
			this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
			this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
			this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
			this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
			copyModelAngles(this.bipedHead, this.bipedHeadwear);
		}else {
			setAngle(Head, this.bipedHeadwear);
			setAngle(Body, this.bipedBody);
			setAngle(Belt, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
		}

		/*		if (this.swingProgress > 0.0F) {
			EnumHandSide side = this.getMainHand(entity);
			ModelRenderer arm = this.getArmForSide(side);
			float f1 = this.swingProgress;
			f1 = 1.0F - this.swingProgress;
			f1 = f1 * f1;
			f1 = f1 * f1;
			f1 = 1.0F - f1;
			float f2 = MathHelper.sin(f1 * (float) Math.PI);
			float f3 = MathHelper.sin(this.swingProgress * (float) Math.PI) *
						-(this.bipedHead.rotateAngleX - 0.7F)* 0.75F;
			arm.rotateAngleX = (float) (arm.rotateAngleX - (f2 * 1.2D + f3));
			arm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
			arm.rotateAngleZ += MathHelper.sin(this.swingProgress * (float) Math.PI) * -0.4F;
		}
		 */	}
	protected void setAngle(ModelRenderer m1, ModelRenderer m2) {
		m1.rotationPointX = m2.rotationPointX;
		m1.rotationPointY = m2.rotationPointY;
		m1.rotationPointZ = m2.rotationPointZ;

		m1.rotateAngleX = m2.rotateAngleX;
		m1.rotateAngleY = m2.rotateAngleY;
		m1.rotateAngleZ = m2.rotateAngleZ;
	}
}
