package rider.wmod.rendering.models.items.decade;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.decade.ArmorKRWizard;

/**
 * ModelKRWizard - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelKRWizard extends ModelBiped {
	public ModelRenderer RightArm;
	public ModelRenderer RightLeg;
	public ModelRenderer Head;
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Body2;
	public ModelRenderer Body3;
	public ModelRenderer Skart1;
	public ModelRenderer Skart2;
	public ModelRenderer Skart3;
	public ModelRenderer Skart4;
	public ModelRenderer Skart5;
	public ModelRenderer Skart6;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer ring;

	public ModelKRWizard() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Skart6 = new ModelRenderer(this, 45, 0);
		this.Skart6.mirror = true;
		this.Skart6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Skart6.addBox(-1.7F, 11.0F, 1.5F, 4, 10, 1, 0.0F);
		this.setRotateAngle(Skart6, 0.0F, 0.0F, -0.17453292519943295F);
		this.Shoulder_L = new ModelRenderer(this, 0, 33);
		this.Shoulder_L.mirror = true;
		this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_L.addBox(-1.0F, -2.3F, -2.5F, 5, 4, 5, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Skart1 = new ModelRenderer(this, 33, 2);
		this.Skart1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Skart1.addBox(-2.35F, 11.0F, -1.5F, 1, 10, 3, 0.0F);
		this.setRotateAngle(Skart1, 0.0F, 0.0F, 0.17453292519943295F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Body3 = new ModelRenderer(this, 39, 33);
		this.Body3.mirror = true;
		this.Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body3.addBox(2.0F, 1.0F, -2.25F, 2, 7, 4, 0.5F);
		this.Shoulder_R = new ModelRenderer(this, 0, 33);
		this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Shoulder_R.addBox(-3.75F, -2.3F, -2.5F, 5, 4, 5, 0.0F);
		this.Skart3 = new ModelRenderer(this, 45, 0);
		this.Skart3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Skart3.addBox(-2.3F, 11.0F, 1.5F, 4, 10, 1, 0.0F);
		this.setRotateAngle(Skart3, 0.0F, 0.0F, 0.17453292519943295F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Skart5 = new ModelRenderer(this, 33, 4);
		this.Skart5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Skart5.addBox(-2.3F, 11.0F, -2.5F, 3, 10, 1, 0.0F);
		this.setRotateAngle(Skart5, 0.0F, 0.0F, 0.17453292519943295F);
		this.ring = new ModelRenderer(this, 0, 33);
		this.ring.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ring.addBox(2.75F, 8.5F, -0.5F, 1, 1, 1, 0.0F);
		this.Skart2 = new ModelRenderer(this, 33, 2);
		this.Skart2.mirror = true;
		this.Skart2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Skart2.addBox(1.3F, 11.0F, -1.5F, 1, 10, 3, 0.0F);
		this.setRotateAngle(Skart2, 0.0F, 0.0F, -0.17453292519943295F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Skart4 = new ModelRenderer(this, 33, 4);
		this.Skart4.mirror = true;
		this.Skart4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Skart4.addBox(-0.7F, 11.0F, -2.5F, 3, 10, 1, 0.0F);
		this.setRotateAngle(Skart4, 0.0F, 0.0F, -0.17453292519943295F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Body2 = new ModelRenderer(this, 39, 33);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 1.0F, -2.25F, 2, 7, 4, 0.5F);
		this.LeftArm.addChild(this.Shoulder_L);
		this.RightArm.addChild(this.Shoulder_R);
		this.LeftArm.addChild(this.ring);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 

		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if((ArmorKRWizard.DriverCheck==1 && ArmorKRWizard.isInvisible==0)
				){
			this.Head.showModel=true;
			this.Body.showModel=true;
			this.RightArm.showModel=true;
			this.RightLeg.showModel=true;
			this.LeftArm.showModel=true;
			this.LeftLeg.showModel=true;
			this.Shoulder_R.showModel=true;
			this.Shoulder_L.showModel=true;
			this.Body2.showModel=true;
			this.Body3.showModel=true;

			this.Skart1.showModel=true;
			this.Skart2.showModel=true;
			this.Skart3.showModel=true;	
			this.Skart4.showModel=true;
			this.Skart5.showModel=true;
			this.Skart6.showModel=true;
			this.Shoulder_R.showModel=true;
			this.Shoulder_L.showModel=true;
			this.ring.showModel=true;
		}
		else
		{
			this.Head.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_L.showModel=false;

			this.Body2.showModel=false;
			this.Body3.showModel=false;
			this.Skart1.showModel=false;
			this.Skart2.showModel=false;
			this.Skart3.showModel=false;
			this.Skart4.showModel=false;
			this.Skart5.showModel=false;
			this.Skart6.showModel=false;
			this.Shoulder_R.showModel=false;
			this.Shoulder_L.showModel=false;
			this.ring.showModel=false;
		}

		if (this.isChild) {

			this.Skart6.render(f5);
			this.RightLeg.render(f5);
			this.Body.render(f5);
			this.Skart1.render(f5);
			this.RightArm.render(f5);
			this.Body3.render(f5);
			this.Skart3.render(f5);
			this.LeftLeg.render(f5);
			this.Skart5.render(f5);
			this.Skart2.render(f5);
			this.LeftArm.render(f5);
			this.Skart4.render(f5);
			this.Head.render(f5);
			this.Body2.render(f5);
		}else {


			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.RightLeg.render(f5);
			this.Body.render(f5);
			this.RightArm.render(f5);
			this.Body3.render(f5);
			this.LeftLeg.render(f5);
			this.LeftArm.render(f5);
			this.Head.render(f5);
			this.Body2.render(f5);
			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
			}

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.3F);
			}
			this.Skart1.render(f5);	
			this.Skart2.render(f5);	
			this.Skart3.render(f5);
			this.Skart4.render(f5);
			this.Skart5.render(f5);
			this.Skart6.render(f5);

			if (entity.isSneaking()) {
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
			setAngle(Head, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(Body3, this.bipedBody);
			/*		setAngle(Skart1, this.bipedBody);
		setAngle(Skart2, this.bipedBody);
		setAngle(Skart3, this.bipedBody);
		setAngle(Skart4, this.bipedBody);
		setAngle(Skart5, this.bipedBody);
		setAngle(Skart6, this.bipedBody);
			 */		setAngle(RightArm, this.bipedRightArm);
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
