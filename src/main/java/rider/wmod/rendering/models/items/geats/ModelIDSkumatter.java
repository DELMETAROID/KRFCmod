package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.geats.ArmorIDSkumatter;

/**
 * ModelSkumatter - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelIDSkumatter extends ModelBiped {
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer RightArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer RightLeg;
	public ModelRenderer BlankHead;
	public ModelRenderer Body2;
	public ModelRenderer Head;
	public ModelRenderer id;
	public ModelRenderer Head2;

	public ModelIDSkumatter() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.BlankHead = new ModelRenderer(this, 32, 31);
		this.BlankHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlankHead.addBox(-4.0F, -7.0F, -4.0F, 8, 7, 8, 0.21F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.id = new ModelRenderer(this, 18, 39);
		this.id.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.id.addBox(-0.5F, 9.0F, -3.1F, 1, 1, 1, 0.0F);
		this.Body2 = new ModelRenderer(this, 16, 16);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 5, 4, 0.5F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Head = new ModelRenderer(this, 0, 1);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.5F, -7.5F, -4.5F, 9, 5, 9, 0.51F);
		this.Head2 = new ModelRenderer(this, 3, 1);
		this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head2.addBox(-3.5F, -9.5F, -3.3F, 7, 1, 7, 0.51F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorIDSkumatter.isInvisible==0 && ArmorIDSkumatter.DriverCheck==1)
		{
			this.id.showModel=true;		

			if(ArmorIDSkumatter.isHenshin==1)
			{
				this.Head.showModel=true;
				this.Head2.showModel=true;
				this.Body.showModel=true;
				this.RightArm.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftArm.showModel=true;

				if(ArmorIDSkumatter.UpperBuckleIn==2) 
				{
					this.Body.showModel=false;
					this.RightArm.showModel=false;
					this.LeftArm.showModel=false;
					this.Body2.showModel=false;
					this.BlankHead.showModel=false;
				}else if(ArmorIDSkumatter.UpperBuckleIn==1) 
				{
					this.Body.showModel=true;
					this.RightArm.showModel=true;
					this.LeftArm.showModel=true;
					this.Body2.showModel=false;
					this.BlankHead.showModel=false;
				}else {	
					this.Body.showModel=true;
					this.RightArm.showModel=true;
					this.LeftArm.showModel=true;
					this.Body2.showModel=true;
					this.BlankHead.showModel=true;
				}


				if(ArmorIDSkumatter.LowerBuckleIn==2) 
				{
					this.LeftLeg.showModel=false;
					this.RightLeg.showModel=false;
				}
				else if(ArmorIDSkumatter.LowerBuckleIn==1) 
				{
					this.RightLeg.showModel=true;
					this.LeftLeg.showModel=false;
				}else {	
					this.RightLeg.showModel=true;
					this.LeftLeg.showModel=true;
				}
			}
			else
			{
				this.Head.showModel=false;
				this.Head2.showModel=false;
				this.Body.showModel=false;
				this.RightArm.showModel=false;
				this.RightLeg.showModel=false;
				this.LeftArm.showModel=false;
				this.LeftLeg.showModel=false;
				this.Body2.showModel=false;
				this.BlankHead.showModel=false;
			}
		}
		else
		{
			this.Head.showModel=false;
			this.Head2.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Body2.showModel=false;
			this.BlankHead.showModel=false;
			this.id.showModel=false;
		}


		if (this.isChild) {
			this.BlankHead.render(f5);
			this.Head2.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);
			this.id.render(f5);
			this.Body2.render(f5);
			this.LeftLeg.render(f5);
			this.Body.render(f5);
			this.Head.render(f5);
		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.BlankHead.render(f5);
			this.Head2.render(f5);
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
			this.RightArm.render(f5);
			this.Body2.render(f5);
			this.LeftLeg.render(f5);
			this.Body.render(f5);
			this.Head.render(f5);

			if (entity.isSneaking()) {
				GlStateManager.popMatrix();
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.23F, -0.05F);
			}

			this.id.render(f5);

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
			setAngle(Head2, this.bipedHead);
			setAngle(BlankHead, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(id, this.bipedBody);
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
