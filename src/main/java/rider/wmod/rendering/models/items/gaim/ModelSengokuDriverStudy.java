package rider.wmod.rendering.models.items.gaim;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverGAIM;

/**
 * ModelSengokuDriverStudy - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelSengokuDriverStudy extends ModelBiped {
	public ModelRenderer buckle;
	public ModelRenderer buckleL;
	public ModelRenderer buckleR;

	public ModelRenderer Belt;
	public ModelRenderer CuttingBlade2;
	public ModelRenderer beltL;
	public ModelRenderer beltR;

	public ModelSengokuDriverStudy() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Belt = new ModelRenderer(this, 16, 32);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.beltL = new ModelRenderer(this, 24, 40);
		this.beltL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltL.addBox(-3.25F, 8.5F, -2.7F, 1, 2, 1, 0.0F);
		this.beltR = new ModelRenderer(this, 24, 40);
		this.beltR.mirror = true;
		this.beltR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.beltR.addBox(2.25F, 8.5F, -2.7F, 1, 2, 1, 0.0F);

		this.CuttingBlade2 = new ModelRenderer(this, 20, 42);
		this.CuttingBlade2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CuttingBlade2.addBox(-2.1F, 9.0F, -6.3F, 1, 1, 1, 0.0F);
	
        this.buckle = new ModelRenderer(this, 30, 37);
        this.buckle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.buckle.addBox(-1.0F, 8.0F, -3.0F, 2, 3, 1, 0.2F);
        this.buckleL = new ModelRenderer(this, 24, 37);
        this.buckleL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.buckleL.addBox(-2.25F, 8.5F, -3.0F, 1, 2, 1, 0.1F);
        this.buckleR = new ModelRenderer(this, 27, 37);
        this.buckleR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.buckleR.addBox(1.25F, 8.5F, -3.0F, 1, 2, 1, 0.15F);
        
		this.Belt.addChild(this.beltL);
		this.Belt.addChild(this.beltR);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 

		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorSengokuDriverGAIM.isInvisible==0)
		{
			this.Belt.showModel=true;
			this.CuttingBlade2.showModel=true;		
			this.buckleL.showModel=true;		
			this.buckleR.showModel=true;		
			this.buckle.showModel=true;		


		}else {
		
			this.Belt.showModel=false;	
			this.CuttingBlade2.showModel=false;		
			this.buckleL.showModel=false;		
			this.buckleR.showModel=false;		
			this.buckle.showModel=false;		
		}

		if (this.isChild) {
		this.Belt.render(f5); 
		
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.CuttingBlade2.offsetX, this.CuttingBlade2.offsetY, this.CuttingBlade2.offsetZ);
        GlStateManager.translate(this.CuttingBlade2.rotationPointX * f5, this.CuttingBlade2.rotationPointY * f5, this.CuttingBlade2.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.5D);
        GlStateManager.translate(-this.CuttingBlade2.offsetX, -this.CuttingBlade2.offsetY, -this.CuttingBlade2.offsetZ);
        GlStateManager.translate(-this.CuttingBlade2.rotationPointX * f5, -this.CuttingBlade2.rotationPointY * f5, -this.CuttingBlade2.rotationPointZ * f5);
        this.CuttingBlade2.render(f5);
        GlStateManager.popMatrix();
		
		this.buckleR.render(f5);
		this.buckle.render(f5);
		this.buckleL.render(f5);
		
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
		
			this.Belt.render(f5);    
			this.buckleR.render(f5);
			this.buckle.render(f5);
			this.buckleL.render(f5);
			
			if (entity.isSneaking())
			{
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.3F, 0.35F);
			}
			
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(this.CuttingBlade2.offsetX, this.CuttingBlade2.offsetY, this.CuttingBlade2.offsetZ);
	        GlStateManager.translate(this.CuttingBlade2.rotationPointX * f5, this.CuttingBlade2.rotationPointY * f5, this.CuttingBlade2.rotationPointZ * f5);
	        GlStateManager.scale(1.0D, 1.0D, 0.5D);
	        GlStateManager.translate(-this.CuttingBlade2.offsetX, -this.CuttingBlade2.offsetY, -this.CuttingBlade2.offsetZ);
	        GlStateManager.translate(-this.CuttingBlade2.rotationPointX * f5, -this.CuttingBlade2.rotationPointY * f5, -this.CuttingBlade2.rotationPointZ * f5);
	        this.CuttingBlade2.render(f5);
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
		setAngle(Belt, this.bipedBody);
		setAngle(buckle, this.bipedBody);
		setAngle(buckleL, this.bipedBody);
		setAngle(buckleR, this.bipedBody);
//		setAngle(CuttingBlade, this.bipedBody);
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
