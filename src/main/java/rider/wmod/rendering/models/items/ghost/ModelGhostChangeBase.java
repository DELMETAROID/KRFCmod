package rider.wmod.rendering.models.items.ghost;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.ghost.ArmorGhostMusashi;

/**
 * ModelGhost - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGhostChangeBase extends ModelBiped {
	public ModelRenderer LeftArmT;
	public ModelRenderer RightArmT;
	public ModelRenderer RightLeg;
	public ModelRenderer LeftLeg;
	public ModelRenderer BodyT;
	public ModelRenderer HeadGhost;

	public ModelRenderer Body;
	public ModelRenderer Parka;
	public ModelRenderer HeadT;

	public ModelGhostChangeBase() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Body = new ModelRenderer(this, 40, 32);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.36F);
		this.LeftArmT = new ModelRenderer(this, 32, 48);
		this.LeftArmT.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArmT.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArmT = new ModelRenderer(this, 40, 16);
		this.RightArmT.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArmT.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.BodyT = new ModelRenderer(this, 16, 16);
		this.BodyT.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyT.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.HeadT = new ModelRenderer(this, 0, 0);
		this.HeadT.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadT.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
		this.Parka = new ModelRenderer(this, 32, 0);
		this.Parka.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Parka.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.61F);
		this.HeadGhost = new ModelRenderer(this, 18, 34);
		this.HeadGhost.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadGhost.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 2, 0.51F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorGhostMusashi.isInvisible==0) 
		{
			if(ArmorGhostMusashi.DriverCheck==1)
			{
				this.LeftArmT.showModel=false;
				this.RightArmT.showModel=false;
				this.RightLeg.showModel=false;
				this.LeftLeg.showModel=false;
				this.HeadGhost.showModel=false;
				this.BodyT.showModel=false;

				if(ArmorGhostMusashi.EyeconIn==1 && ArmorGhostMusashi.HaveEyecon==0)
				{
					this.Body.showModel=true;
					this.HeadT.showModel=true;
					this.Parka.showModel=true;	
				}
				else if(ArmorGhostMusashi.HaveEyecon==1)
				{
					this.Body.showModel=false;
					this.HeadT.showModel=false;
					this.Parka.showModel=false;					
				}else {
					this.Body.showModel=false;
					this.HeadT.showModel=false;
					this.Parka.showModel=false;	
				}
			}else {
				//ゴースト体

				this.LeftArmT.showModel=true;
				this.RightArmT.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftLeg.showModel=true;
				this.HeadGhost.showModel=true;
				this.BodyT.showModel=true;
				this.Parka.showModel=true;
				this.Body.showModel=true;
				
				this.HeadT.showModel=false;
			}
		}
		else
		{
			this.LeftArmT.showModel=false;
			this.RightArmT.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftLeg.showModel=false;
			this.HeadGhost.showModel=false;
			this.BodyT.showModel=false;

			this.Body.showModel=false;
			this.HeadT.showModel=false;
			this.Parka.showModel=false;			
		}

		if (this.isChild) {

			this.Body.render(f5);
			this.LeftArmT.render(f5);
			this.RightArmT.render(f5);
			this.LeftLeg.render(f5);
			this.BodyT.render(f5);
			this.HeadT.render(f5);
			this.Parka.render(f5);
			this.HeadGhost.render(f5);
			this.RightLeg.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.Body.render(f5);
			this.LeftArmT.render(f5);
			this.RightArmT.render(f5);
			this.LeftLeg.render(f5);
			this.BodyT.render(f5);
			this.HeadT.render(f5);
			this.Parka.render(f5);
			this.HeadGhost.render(f5);
			this.RightLeg.render(f5);

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

		setAngle(HeadGhost, this.bipedHead);
		setAngle(HeadT, this.bipedHead);
		setAngle(Parka, this.bipedHead);
		setAngle(Body, this.bipedBody);
		setAngle(BodyT, this.bipedBody);
		setAngle(RightArmT, this.bipedRightArm);
		setAngle(LeftArmT, this.bipedLeftArm);
		setAngle(RightLeg, this.bipedRightLeg);
		setAngle(LeftLeg, this.bipedLeftLeg);

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


