package rider.wmod.rendering.models.items.exaid;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rider.wmod.items.armor.exaid.ArmorBuggleDriverZwei;

/**
 * ModelBuggleDriverZwei - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelBuggleDriverZwei extends ModelBiped {
	public ModelRenderer Belt;
	public ModelRenderer bugviser;
	public ModelRenderer top;
	public ModelRenderer sideR;
	public ModelRenderer sideL;

	public ModelBuggleDriverZwei() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.sideR = new ModelRenderer(this, 4, 52);
		this.sideR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.sideR.addBox(-2.7F, 9.0F, -3.2F, 1, 1, 1, 0.0F);
		this.bugviser = new ModelRenderer(this, 0, 58);
		this.bugviser.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bugviser.addBox(-2.0F, 8.5F, -3.25F, 4, 2, 1, 0.0F);
		this.sideL = new ModelRenderer(this, 4, 54);
		this.sideL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.sideL.addBox(2.0F, 9.0F, -3.2F, 1, 1, 1, 0.0F);
		this.Belt = new ModelRenderer(this, 16, 25);
		this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.top = new ModelRenderer(this, 0, 62);
		this.top.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.top.addBox(-1.0F, 7.5F, -3.25F, 2, 1, 1, 0.0F);
		this.Belt.addChild(this.sideR);
		this.Belt.addChild(this.sideL);
		this.Belt.addChild(this.top);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorBuggleDriverZwei.isInvisible==1) {
			this.bugviser.showModel=false;
			this.Belt.showModel=false;
		}else {
			this.bugviser.showModel=true;
			this.Belt.showModel=true;
		}

		if(ArmorBuggleDriverZwei.gashatIn==1) 
		{	
			this.bugviser.showModel=false;
		}else {
			this.bugviser.showModel=true;			
		}


		if (this.isChild) {
			this.bugviser.render(f5);
			this.Belt.render(f5);
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Belt.render(f5);
			this.bugviser.render(f5);

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

		setAngle(Belt, this.bipedBody);
		setAngle(bugviser, this.bipedBody);

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
