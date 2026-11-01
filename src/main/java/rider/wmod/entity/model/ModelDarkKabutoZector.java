package rider.wmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelKabutoZector - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelDarkKabutoZector extends ModelBase{
    public ModelRenderer body;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer sideL;
    public ModelRenderer UpHorn;
    public ModelRenderer leg2_1;
    public ModelRenderer leg2_2;
    public ModelRenderer leg1_1;
    public ModelRenderer leg1_2;
    public ModelRenderer horn2;
    public ModelRenderer horn3;
    public ModelRenderer horn3_1;
    public ModelRenderer horn3_2;
    public ModelRenderer sideR;
    public ModelRenderer body2;
    public ModelRenderer horn2_1;

    public ModelDarkKabutoZector() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.horn3_1 = new ModelRenderer(this, 0, 3);
        this.horn3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn3_1.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 1, 0.0F);
        this.leg1_1 = new ModelRenderer(this, 0, 9);
        this.leg1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1_1.addBox(2.0F, 2.0F, 1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leg1_1, -0.0036651914291880917F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 9);
        this.leg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1.addBox(2.0F, 2.0F, -1.0F, 1, 1, 2, 0.0F);
        this.leg2_1 = new ModelRenderer(this, 0, 9);
        this.leg2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg2_1.addBox(-3.0F, 2.0F, -3.5F, 1, 1, 2, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.body.addBox(-2.0F, 0.0F, -3.0F, 4, 3, 6, 0.0F);
        this.horn3_2 = new ModelRenderer(this, 7, 10);
        this.horn3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn3_2.addBox(-2.5F, -1.0F, -8.0F, 5, 1, 1, 0.0F);
        this.horn2_1 = new ModelRenderer(this, 20, 10);
        this.horn2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn2_1.addBox(-1.5F, 0.5F, -4.0F, 3, 1, 1, 0.0F);
        this.sideR = new ModelRenderer(this, 0, 13);
        this.sideR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.sideR.addBox(-2.5F, 0.5F, -3.5F, 1, 1, 4, 0.0F);
        this.body2 = new ModelRenderer(this, 14, 0);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addBox(-2.0F, 1.0F, 3.0F, 4, 2, 1, 0.0F);
        this.leg1_2 = new ModelRenderer(this, 0, 9);
        this.leg1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1_2.addBox(2.0F, 2.0F, -3.5F, 1, 1, 2, 0.0F);
        this.horn2 = new ModelRenderer(this, 0, 3);
        this.horn2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn2.addBox(-0.5F, 0.5F, -5.0F, 1, 1, 1, 0.0F);
        this.UpHorn = new ModelRenderer(this, 0, 0);
        this.UpHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpHorn.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 1, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 9);
        this.leg2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg2.addBox(-3.0F, 2.0F, 1.5F, 1, 1, 2, 0.0F);
        this.sideL = new ModelRenderer(this, 2, 13);
        this.sideL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.sideL.addBox(1.5F, 0.5F, -3.5F, 1, 1, 4, 0.0F);
        this.leg2_2 = new ModelRenderer(this, 0, 9);
        this.leg2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg2_2.addBox(-3.0F, 2.0F, -1.0F, 1, 1, 2, 0.0F);
        this.horn3 = new ModelRenderer(this, 0, 3);
        this.horn3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn3.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 1, 0.0F);
        this.body.addChild(this.horn3_1);
        this.body.addChild(this.leg1_1);
        this.body.addChild(this.leg1);
        this.body.addChild(this.leg2_1);
        this.body.addChild(this.horn3_2);
        this.body.addChild(this.horn2_1);
        this.body.addChild(this.sideR);
        this.body.addChild(this.body2);
        this.body.addChild(this.leg1_2);
        this.body.addChild(this.horn2);
        this.body.addChild(this.UpHorn);
        this.body.addChild(this.leg2);
        this.body.addChild(this.sideL);
        this.body.addChild(this.leg2_2);
        this.body.addChild(this.horn3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
		GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
		GlStateManager.scale(0.5D, 0.5D, 0.5D);
		GlStateManager.translate(-this.body.offsetX, -this.body.offsetY, -this.body.offsetZ);
		GlStateManager.translate(-this.body.rotationPointX * f5, -this.body.rotationPointY * f5, -this.body.rotationPointZ * f5);
    	this.body.render(f5);
		GlStateManager.popMatrix();
    }
    

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {

        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    }
}
