package rider.wmod.rendering.models.items.geats;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import rider.wmod.items.armor.geats.ArmorIDNago;

/**
 * ModelNago - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelIDNago extends ModelBiped {
	public ModelRenderer Body;
	public ModelRenderer LeftArm;
	public ModelRenderer RightArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer RightLeg;
	public ModelRenderer BlankHead;
	public ModelRenderer Body2;
	public ModelRenderer id;
	public ModelRenderer Head;
	public ModelRenderer Antena3L;
	public ModelRenderer BungleL;
	public ModelRenderer BungleR;
	public ModelRenderer Antena1;
	public ModelRenderer Antena3;
	public ModelRenderer Antena4;
	public ModelRenderer Antena5;
	public ModelRenderer Antena1L;
	public ModelRenderer Antena2L;
	public ModelRenderer Antena3L_1;
	public ModelRenderer Antena4L;
	public ModelRenderer Antena5L;
	public ModelRenderer Antena2;
	public ModelRenderer EarL;
	public ModelRenderer EarR;
	public ModelRenderer HeadPhone;

	public ModelIDNago() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Antena5 = new ModelRenderer(this, 24, 0);
		this.Antena5.mirror = true;
		this.Antena5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena5.addBox(3.2F, -12.0F, 0.0F, 1, 4, 1, 0.0F);
		this.RightArm = new ModelRenderer(this, 40, 16);
		this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Body2 = new ModelRenderer(this, 16, 17);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-4.0F, 0.6F, -2.0F, 8, 5, 4, 0.5F);
		this.Antena3L = new ModelRenderer(this, 30, 0);
		this.Antena3L.mirror = true;
		this.Antena3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3L.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		this.RightLeg = new ModelRenderer(this, 0, 16);
		this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.Antena5L = new ModelRenderer(this, 24, 0);
		this.Antena5L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena5L.addBox(-4.2F, -12.0F, 0.0F, 1, 4, 1, 0.0F);
		this.Antena2 = new ModelRenderer(this, 28, 3);
		this.Antena2.mirror = true;
		this.Antena2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2.addBox(1.2F, -10.0F, -3.0F, 1, 2, 1, 0.0F);
		this.EarL = new ModelRenderer(this, 32, 5);
		this.EarL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.EarL.addBox(-5.5F, -6.0F, -1.5F, 1, 3, 3, 0.0F);
		this.Body = new ModelRenderer(this, 16, 16);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
		this.Antena3L_1 = new ModelRenderer(this, 34, 0);
		this.Antena3L_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3L_1.addBox(-2.7F, -11.0F, -2.0F, 1, 3, 1, 0.0F);
		this.id = new ModelRenderer(this, 18, 39);
		this.id.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.id.addBox(-0.5F, 9.0F, -3.0F, 1, 1, 1, 0.0F);
		this.Antena4 = new ModelRenderer(this, 28, 0);
		this.Antena4.mirror = true;
		this.Antena4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4.addBox(2.5F, -11.5F, -1.0F, 1, 3, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 1);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -7.5F, -4.0F, 8, 5, 8, 0.51F);
		this.LeftLeg = new ModelRenderer(this, 16, 48);
		this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
		this.LeftArm = new ModelRenderer(this, 32, 48);
		this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
		this.Antena4L = new ModelRenderer(this, 28, 0);
		this.Antena4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena4L.addBox(-3.5F, -11.5F, -1.0F, 1, 3, 1, 0.0F);
		this.EarR = new ModelRenderer(this, 32, 5);
		this.EarR.mirror = true;
		this.EarR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.EarR.addBox(4.5F, -6.0F, -1.5F, 1, 3, 3, 0.0F);
		this.HeadPhone = new ModelRenderer(this, 40, 1);
		this.HeadPhone.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadPhone.addBox(-5.0F, -8.7F, -1.0F, 10, 3, 2, 0.0F);
		this.BungleL = new ModelRenderer(this, 40, 0);
		this.BungleL.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.BungleL.addBox(-0.5F, 7.0F, -2.5F, 4, 1, 4, 0.06F);
		this.BungleR = new ModelRenderer(this, 40, 0);
		this.BungleR.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.BungleR.addBox(-3.5F, 7.0F, -2.5F, 4, 1, 4, 0.06F);

		this.BlankHead = new ModelRenderer(this, 32, 31);
		this.BlankHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BlankHead.addBox(-4.0F, -7.0F, -4.0F, 8, 7, 8, 0.21F);
		this.Antena1L = new ModelRenderer(this, 24, 2);
		this.Antena1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1L.addBox(-1.7F, -9.0F, -4.0F, 1, 1, 1, 0.0F);
		this.Antena1 = new ModelRenderer(this, 24, 2);
		this.Antena1.mirror = true;
		this.Antena1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena1.addBox(0.7F, -9.0F, -4.0F, 1, 1, 1, 0.0F);
		this.Antena3 = new ModelRenderer(this, 34, 0);
		this.Antena3.mirror = true;
		this.Antena3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena3.addBox(1.7F, -11.0F, -2.0F, 1, 3, 1, 0.0F);
		this.Antena2L = new ModelRenderer(this, 28, 3);
		this.Antena2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Antena2L.addBox(-2.2F, -10.0F, -3.0F, 1, 2, 1, 0.0F);
		this.Head.addChild(this.Antena5);
		this.Head.addChild(this.Antena5L);
		this.Head.addChild(this.Antena2);
		this.Head.addChild(this.EarL);
		this.Head.addChild(this.Antena3L_1);
		this.Head.addChild(this.Antena4);
		this.Head.addChild(this.Antena4L);
		this.Head.addChild(this.EarR);
		this.Head.addChild(this.HeadPhone);
		this.Head.addChild(this.Antena1L);
		this.Head.addChild(this.Antena1);
		this.Head.addChild(this.Antena3);
		this.Head.addChild(this.Antena2L);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if(ArmorIDNago.isInvisible==0 && ArmorIDNago.DriverCheck==1)
		{
			this.id.showModel=true;		

			if(ArmorIDNago.isHenshin==1)
			{
				this.Head.showModel=true;
				this.Body.showModel=true;
				this.RightArm.showModel=true;
				this.RightLeg.showModel=true;
				this.LeftArm.showModel=true;
				this.BungleL.showModel=true;
				this.BungleR.showModel=true;

				if(ArmorIDNago.UpperBuckleIn==2) 
				{
					this.Body.showModel=false;
					this.RightArm.showModel=false;
					this.LeftArm.showModel=false;
					this.Body2.showModel=false;
					this.BlankHead.showModel=false;
				}else if(ArmorIDNago.UpperBuckleIn==1) 
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


				if(ArmorIDNago.LowerBuckleIn==2) 
				{
					this.LeftLeg.showModel=false;
					this.RightLeg.showModel=false;
				}
				else if(ArmorIDNago.LowerBuckleIn==1) 
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
				this.Body.showModel=false;
				this.RightArm.showModel=false;
				this.RightLeg.showModel=false;
				this.LeftArm.showModel=false;
				this.LeftLeg.showModel=false;
				this.Body2.showModel=false;
				this.BlankHead.showModel=false;
				this.BungleL.showModel=false;
				this.BungleR.showModel=false;
			}
		}
		else
		{
			this.Head.showModel=false;
			this.Body.showModel=false;
			this.RightArm.showModel=false;
			this.RightLeg.showModel=false;
			this.LeftArm.showModel=false;
			this.LeftLeg.showModel=false;
			this.Body2.showModel=false;
			this.BlankHead.showModel=false;
			this.id.showModel=false;
			this.BungleL.showModel=false;
			this.BungleR.showModel=false;
		}

		if (this.isChild) {
			this.RightArm.render(f5);
			this.Body2.render(f5);
			this.Antena3L.render(f5);
			this.BungleR.render(f5);
			this.RightLeg.render(f5);
			this.Body.render(f5);
			this.id.render(f5);
			this.Head.render(f5);
			this.LeftLeg.render(f5);
			this.LeftArm.render(f5);
			this.BungleL.render(f5);
			this.BlankHead.render(f5);

		}else {

			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			this.RightArm.render(f5);
			this.Body2.render(f5);
			this.Antena3L.render(f5);
			this.BungleR.render(f5);
			this.RightLeg.render(f5);
			this.Body.render(f5);
			this.id.render(f5);
			this.Head.render(f5);
			this.LeftLeg.render(f5);
			this.LeftArm.render(f5);
			this.BungleL.render(f5);
			this.BlankHead.render(f5);

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
			setAngle(BlankHead, this.bipedHead);
			setAngle(Body, this.bipedBody);
			setAngle(Body2, this.bipedBody);
			setAngle(id, this.bipedBody);
			setAngle(RightArm, this.bipedRightArm);
			setAngle(LeftArm, this.bipedLeftArm);
			setAngle(RightLeg, this.bipedRightLeg);
			setAngle(LeftLeg, this.bipedLeftLeg);
			setAngle(BungleR, this.bipedRightArm);
			setAngle(BungleL, this.bipedLeftArm);
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
