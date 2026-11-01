package rider.wmod.rendering.models.items.drive;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.drive.ArmorShiftFlare;

/**
 * ModelShiftFlare - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelShiftFlare extends ModelBiped {
	public ModelRenderer tire1;
	public ModelRenderer ShiftCar;
	public ModelRenderer tire2;
	public ModelRenderer tire3;
	public ModelRenderer flare1;
	public ModelRenderer flare2;
	public ModelRenderer flare5;
	public ModelRenderer flare4;
	public ModelRenderer flare3;
	public ModelRenderer flare6;
	public ModelRenderer ShiftCar2;
	public ModelRenderer LeftArmShift;
	public ModelRenderer DriverBaseMach;

	public ModelShiftFlare() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.flare4 = new ModelRenderer(this, 0, 0);
		this.flare4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.flare4.addBox(2.0F, -5.25F, 6.5F, 2, 1, 4, 0.0F);
		this.setRotateAngle(flare4, -2.007128639793479F, 0.0F, 0.0F);
		this.flare6 = new ModelRenderer(this, 0, 0);
		this.flare6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.flare6.addBox(2.0F, -3.25F, -1.5F, 2, 1, 4, 0.0F);
		this.setRotateAngle(flare6, -1.0471975511965976F, 0.0F, 0.0F);
		this.flare3 = new ModelRenderer(this, 0, 0);
		this.flare3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.flare3.addBox(2.0F, -5.5F, -5.5F, 2, 1, 4, 0.0F);
		this.setRotateAngle(flare3, 2.0943951023931953F, 0.0F, 0.0F);
		this.tire3 = new ModelRenderer(this, 38, 6);
		this.tire3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire3.addBox(2.0F, 6.25F, -2.0F, 2, 2, 4, 0.0F);
		this.tire1 = new ModelRenderer(this, 38, 0);
		this.tire1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire1.addBox(2.0F, -3.75F, -2.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(tire1, 0.0F, 0.0F, 0.8726646259971648F);
		this.flare1 = new ModelRenderer(this, 0, 0);
		this.flare1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.flare1.addBox(2.0F, -3.75F, 2.0F, 2, 1, 4, 0.0F);
		this.setRotateAngle(flare1, 0.9599310885968813F, 0.0F, 0.0F);
		this.flare5 = new ModelRenderer(this, 0, 0);
		this.flare5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.flare5.addBox(2.0F, -1.0F, 4.5F, 2, 1, 5, 0.0F);
		this.setRotateAngle(flare5, -1.2217304763960306F, 0.0F, 0.0F);
		this.tire2 = new ModelRenderer(this, 50, 0);
		this.tire2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire2.addBox(2.0F, -1.75F, -2.5F, 2, 8, 5, 0.0F);
		this.flare2 = new ModelRenderer(this, 0, 0);
		this.flare2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.flare2.addBox(2.0F, -2.5F, 0.0F, 2, 1, 5, 0.0F);
		this.setRotateAngle(flare2, 1.9198621771937625F, 0.0F, 0.0F);
		this.LeftArmShift = new ModelRenderer(this, 32, 48);
		this.LeftArmShift.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmShift.addBox(-1.0F, -1.75F, -2.0F, 1, 1, 1, 0.26F);
        this.ShiftCar = new ModelRenderer(this, 58, 17);
        this.ShiftCar.mirror = true;
        this.ShiftCar.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShiftCar.addBox(3.25F, 3.25F, -6.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(ShiftCar, 0.7853981633974483F, 0.0F, 0.0F);        
        this.ShiftCar2 = new ModelRenderer(this, 58, 15);
        this.ShiftCar2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShiftCar2.addBox(0.5F, 4.5F, -6.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ShiftCar2, 0.0F, 0.0F, -0.7853981633974483F);
        
		this.DriverBaseMach = new ModelRenderer(this, 22, 43);
		this.DriverBaseMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBaseMach.addBox(-3.5F, 8.5F, -3.35F, 6, 2, 1, 0.0F);
        
		this.tire1.addChild(this.flare4);
		this.tire1.addChild(this.flare6);
		this.tire1.addChild(this.flare3);
		this.tire1.addChild(this.tire3);
		this.tire1.addChild(this.flare1);
		this.ShiftCar.addChild(this.ShiftCar2);
		this.tire1.addChild(this.flare5);
		this.tire1.addChild(this.tire2);
		this.tire1.addChild(this.flare2);
		this.LeftArmShift.addChild(this.ShiftCar); 
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(ArmorShiftFlare.DriverCheck==1) 
		{
			this.tire1.showModel=true;
			this.LeftArmShift.showModel=true;
			this.DriverBaseMach.showModel=false;
		}
		else if(ArmorShiftFlare.DriverCheck==2) 
		{
			this.tire1.showModel=true;
			this.LeftArmShift.showModel=false;
			this.DriverBaseMach.showModel=true;
		}
		else if(ArmorShiftFlare.DriverCheck==3) 
		{
			this.tire1.showModel=false;
			this.LeftArmShift.showModel=false;
			this.DriverBaseMach.showModel=true;
		}else {
			this.tire1.showModel=false;
			this.LeftArmShift.showModel=false;
			this.DriverBaseMach.showModel=false;
		}

		if (this.isChild) {	
			this.DriverBaseMach.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
			GlStateManager.popMatrix();
			this.LeftArmShift.render(f5);

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.LeftArmShift.render(f5);
			this.DriverBaseMach.render(f5);
			
			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.1F);
			}
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
			GlStateManager.popMatrix();


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
		setAngle(DriverBaseMach, this.bipedBody);
		setAngle(LeftArmShift, this.bipedLeftArm);

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
