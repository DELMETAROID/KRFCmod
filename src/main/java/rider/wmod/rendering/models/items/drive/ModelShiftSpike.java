package rider.wmod.rendering.models.items.drive;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.drive.ArmorShiftSpike;

/**
 * ModelShiftSpike - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelShiftSpike extends ModelBiped {
	public ModelRenderer tire1;
	public ModelRenderer ShiftCar;
	public ModelRenderer tire2;
	public ModelRenderer tire3;
	public ModelRenderer spike1;
	public ModelRenderer spike2;
	public ModelRenderer spike3;
	public ModelRenderer spike4;
	public ModelRenderer spike5;
	public ModelRenderer spike6;
	public ModelRenderer spike7;
	public ModelRenderer spike8;
	public ModelRenderer spike9;
	public ModelRenderer spike10;
	public ModelRenderer spike11;
	public ModelRenderer spike12;
	public ModelRenderer spike13;
	public ModelRenderer spike14;
	public ModelRenderer spike15;
	public ModelRenderer spike16;
	public ModelRenderer spike17;
	public ModelRenderer spike18;
	public ModelRenderer ShiftCar2;
	public ModelRenderer LeftArmShift;
	public ModelRenderer DriverBaseMach;

	public ModelShiftSpike() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.spike15 = new ModelRenderer(this, 0, 0);
		this.spike15.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike15.addBox(2.5F, -4.75F, 0.75F, 1, 1, 1, 0.0F);
		this.spike11 = new ModelRenderer(this, 0, 0);
		this.spike11.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike11.addBox(2.5F, -3.5F, 1.5F, 1, 1, 1, 0.0F);
		this.spike14 = new ModelRenderer(this, 0, 0);
		this.spike14.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike14.addBox(2.5F, -4.75F, -0.5F, 1, 1, 1, 0.0F);
		this.spike7 = new ModelRenderer(this, 0, 0);
		this.spike7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike7.addBox(2.5F, 3.0F, 2.0F, 1, 1, 1, 0.0F);
		this.spike3 = new ModelRenderer(this, 0, 0);
		this.spike3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike3.addBox(2.5F, 3.0F, -3.0F, 1, 1, 1, 0.0F);
		this.spike1 = new ModelRenderer(this, 0, 0);
		this.spike1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike1.addBox(2.5F, -1.4F, -3.0F, 1, 1, 1, 0.0F);
		this.spike9 = new ModelRenderer(this, 0, 0);
		this.spike9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike9.addBox(2.5F, -3.5F, -2.5F, 1, 1, 1, 0.0F);
		this.spike10 = new ModelRenderer(this, 0, 0);
		this.spike10.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike10.addBox(2.5F, 7.0F, -2.5F, 1, 1, 1, 0.0F);
		this.spike5 = new ModelRenderer(this, 0, 0);
		this.spike5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike5.addBox(2.5F, -1.5F, 2.0F, 1, 1, 1, 0.0F);
		this.spike6 = new ModelRenderer(this, 0, 0);
		this.spike6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike6.addBox(2.5F, 0.7F, 2.0F, 1, 1, 1, 0.0F);
		this.spike16 = new ModelRenderer(this, 0, 0);
		this.spike16.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike16.addBox(2.5F, 8.0F, -1.75F, 1, 1, 1, 0.0F);
		this.spike4 = new ModelRenderer(this, 0, 0);
		this.spike4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike4.addBox(2.5F, 5.2F, -3.0F, 1, 1, 1, 0.0F);
		this.tire2 = new ModelRenderer(this, 50, 0);
		this.tire2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire2.addBox(2.0F, -1.75F, -2.5F, 2, 8, 5, 0.0F);
		this.spike12 = new ModelRenderer(this, 0, 0);
		this.spike12.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike12.addBox(2.5F, 7.0F, 1.5F, 1, 1, 1, 0.0F);
		this.tire1 = new ModelRenderer(this, 38, 0);
		this.tire1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire1.addBox(2.0F, -3.75F, -2.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(tire1, 0.0F, 0.0F, 0.8726646259971648F);
        this.ShiftCar = new ModelRenderer(this, 58, 17);
        this.ShiftCar.mirror = true;
        this.ShiftCar.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShiftCar.addBox(3.25F, 3.25F, -6.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(ShiftCar, 0.7853981633974483F, 0.0F, 0.0F);        
        this.ShiftCar2 = new ModelRenderer(this, 58, 15);
        this.ShiftCar2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShiftCar2.addBox(0.5F, 4.5F, -6.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ShiftCar2, 0.0F, 0.0F, -0.7853981633974483F);
		this.spike13 = new ModelRenderer(this, 0, 0);
		this.spike13.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike13.addBox(2.5F, -4.75F, -1.75F, 1, 1, 1, 0.0F);
		this.spike2 = new ModelRenderer(this, 0, 0);
		this.spike2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike2.addBox(2.5F, 0.7F, -3.0F, 1, 1, 1, 0.0F);
		this.tire3 = new ModelRenderer(this, 38, 6);
		this.tire3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tire3.addBox(2.0F, 6.25F, -2.0F, 2, 2, 4, 0.0F);
		this.spike18 = new ModelRenderer(this, 0, 0);
		this.spike18.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike18.addBox(2.5F, 8.0F, 0.75F, 1, 1, 1, 0.0F);
		this.spike8 = new ModelRenderer(this, 0, 0);
		this.spike8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike8.addBox(2.5F, 5.2F, 2.0F, 1, 1, 1, 0.0F);
		this.spike17 = new ModelRenderer(this, 0, 0);
		this.spike17.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.spike17.addBox(2.5F, 8.0F, -0.5F, 1, 1, 1, 0.0F);
		this.LeftArmShift = new ModelRenderer(this, 32, 48);
		this.LeftArmShift.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmShift.addBox(-1.0F, -1.75F, -2.0F, 1, 1, 1, 0.26F);
		
		this.DriverBaseMach = new ModelRenderer(this, 22, 43);
		this.DriverBaseMach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverBaseMach.addBox(-3.5F, 8.5F, -3.35F, 6, 2, 1, 0.0F);
		
		this.LeftArmShift.addChild(this.ShiftCar);  
		this.tire1.addChild(this.spike15);
		this.tire1.addChild(this.spike11);
		this.tire1.addChild(this.spike14);
		this.tire1.addChild(this.spike7);
		this.tire1.addChild(this.spike3);
		this.tire1.addChild(this.spike1);
		this.tire1.addChild(this.spike9);
		this.tire1.addChild(this.spike10);
		this.tire1.addChild(this.spike5);
		this.tire1.addChild(this.spike6);
		this.tire1.addChild(this.spike16);
		this.tire1.addChild(this.spike4);
		this.tire1.addChild(this.tire2);
		this.tire1.addChild(this.spike12);
		this.ShiftCar.addChild(this.ShiftCar2);
		this.tire1.addChild(this.spike13);
		this.tire1.addChild(this.spike2);
		this.tire1.addChild(this.tire3);
		this.tire1.addChild(this.spike18);
		this.tire1.addChild(this.spike8);
		this.tire1.addChild(this.spike17);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(ArmorShiftSpike.DriverCheck==1) 
		{
			this.tire1.showModel=true;
			this.LeftArmShift.showModel=true;
			this.DriverBaseMach.showModel=false;
		}
		else if(ArmorShiftSpike.DriverCheck==2) 
		{
			this.tire1.showModel=true;
			this.LeftArmShift.showModel=false;
			this.DriverBaseMach.showModel=true;
		}
		else if(ArmorShiftSpike.DriverCheck==3) 
		{
			this.tire1.showModel=false;
			this.LeftArmShift.showModel=false;
			this.DriverBaseMach.showModel=true;
		}
		else {
			this.tire1.showModel=false;
			this.LeftArmShift.showModel=false;
			this.DriverBaseMach.showModel=false;
		}

		if (this.isChild) {	
			this.DriverBaseMach.render(f5);
			this.LeftArmShift.render(f5);			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.tire1.offsetX, this.tire1.offsetY, this.tire1.offsetZ);
			GlStateManager.translate(this.tire1.rotationPointX * f5, this.tire1.rotationPointY * f5, this.tire1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 2.0D);
			GlStateManager.translate(-this.tire1.offsetX, -this.tire1.offsetY, -this.tire1.offsetZ);
			GlStateManager.translate(-this.tire1.rotationPointX * f5, -this.tire1.rotationPointY * f5, -this.tire1.rotationPointZ * f5);
			this.tire1.render(f5);
	        GlStateManager.popMatrix();
			
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

		setAngle(LeftArmShift, this.bipedLeftArm);
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
