package rider.wmod.rendering.models.items.drive;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.drive.ArmorMachDriver;

/**
 * ModelMachDriver - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelMachDriver extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer DriverBaseMach;
	public ModelRenderer backleMaf1;
	public ModelRenderer backleMaf2;

	public ModelMachDriver() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.backleMaf2 = new ModelRenderer(this, 30, 45);
		this.backleMaf2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backleMaf2.addBox(-2.5F, 8.25F, -3.4F, 4, 2, 1, 0.0F);
		this.setRotateAngle(backleMaf2, 0.0F, 0.0F, -0.2181661564992912F);
		this.DriverBaseMach = new ModelRenderer(this, 22, 43);
		this.DriverBaseMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBaseMach.addBox(-3.5F, 8.5F, -3.35F, 6, 2, 1, 0.0F);
		this.backleMaf1 = new ModelRenderer(this, 36, 45);
		this.backleMaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.backleMaf1.addBox(-2.75F, 8.75F, -3.5F, 2, 1, 1, 0.0F);
		this.setRotateAngle(backleMaf1, 0.0F, 0.0F, -0.2181661564992912F);
		this.Belt = new ModelRenderer(this, 40, 31);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.Belt.addChild(this.backleMaf2);
		this.Belt.addChild(this.backleMaf1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorMachDriver.ShiftcarIn==1) {
			this.DriverBaseMach.showModel=false;
		}else {
			this.DriverBaseMach.showModel=true;			
		}
		
		
		if (this.isChild) {		
			this.DriverBaseMach.render(f5);
			this.Belt.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.DriverBaseMach.render(f5);
			this.Belt.render(f5);

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

		setAngle(Belt, this.bipedBody);
		setAngle(DriverBaseMach, this.bipedBody);

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
