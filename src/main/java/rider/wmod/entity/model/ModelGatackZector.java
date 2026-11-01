package rider.wmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelGatackZector - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelGatackZector extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer UpHorn;
    public ModelRenderer leg2_1;
    public ModelRenderer leg2_2;
    public ModelRenderer leg1_1;
    public ModelRenderer leg1_2;
    public ModelRenderer horn3;
    public ModelRenderer horn3_1;
    public ModelRenderer horn2;
    public ModelRenderer body_1;
    public ModelRenderer UpHorn_1;
    public ModelRenderer leg1_3;
    public ModelRenderer leg1_4;
    public ModelRenderer horn3_2;
    public ModelRenderer horn3_3;

    public ModelGatackZector() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.leg1_2 = new ModelRenderer(this, 0, 9);
        this.leg1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1_2.addBox(2.0F, 2.0F, -3.5F, 1, 1, 2, 0.0F);
        this.leg2_1 = new ModelRenderer(this, 0, 9);
        this.leg2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg2_1.addBox(-3.0F, 2.0F, -3.5F, 1, 1, 2, 0.0F);
        this.horn2 = new ModelRenderer(this, 20, 6);
        this.horn2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn2.addBox(-2.0F, 0.0F, -4.0F, 4, 1, 1, 0.0F);
        this.horn3_3 = new ModelRenderer(this, 0, 1);
        this.horn3_3.mirror = true;
        this.horn3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn3_3.addBox(0.25F, 0.2F, -7.0F, 1, 1, 1, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.body.addBox(-2.0F, 0.5F, -3.0F, 4, 2, 6, 0.0F);
        this.leg2_2 = new ModelRenderer(this, 0, 9);
        this.leg2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg2_2.addBox(-3.0F, 2.0F, -1.0F, 1, 1, 2, 0.0F);
        this.leg1_1 = new ModelRenderer(this, 0, 9);
        this.leg1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1_1.addBox(2.0F, 2.0F, 1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leg1_1, -0.0036651914291880917F, 0.0F, 0.0F);
        this.horn3_2 = new ModelRenderer(this, 0, 3);
        this.horn3_2.mirror = true;
        this.horn3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn3_2.addBox(-1.75F, 0.2F, -6.0F, 1, 1, 2, 0.0F);
        this.leg1_4 = new ModelRenderer(this, 0, 9);
        this.leg1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1_4.addBox(-1.75F, 1.0F, 2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leg1_4, -0.0036651914291880917F, 0.0F, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 9);
        this.leg2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg2.addBox(-3.0F, 2.0F, 1.5F, 1, 1, 2, 0.0F);
        this.horn3_1 = new ModelRenderer(this, 0, 3);
        this.horn3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn3_1.addBox(0.75F, 0.2F, -6.0F, 1, 1, 2, 0.0F);
        this.UpHorn = new ModelRenderer(this, 0, 0);
        this.UpHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpHorn.addBox(-2.25F, -0.05F, -3.0F, 1, 1, 1, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 9);
        this.leg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1.addBox(2.0F, 2.0F, -1.0F, 1, 1, 2, 0.0F);
        this.body_1 = new ModelRenderer(this, 14, 0);
        this.body_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_1.addBox(-1.5F, 0.0F, -3.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(body_1, 0.0F, 0.0F, 0.003839724354387525F);
        this.horn3 = new ModelRenderer(this, 0, 1);
        this.horn3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.horn3.addBox(-1.25F, 0.2F, -7.0F, 1, 1, 1, 0.0F);
        this.UpHorn_1 = new ModelRenderer(this, 0, 0);
        this.UpHorn_1.mirror = true;
        this.UpHorn_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpHorn_1.addBox(1.25F, -0.05F, -3.0F, 1, 1, 1, 0.0F);
        this.leg1_3 = new ModelRenderer(this, 0, 9);
        this.leg1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1_3.addBox(0.75F, 1.0F, 2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leg1_3, -0.0036651914291880917F, 0.0F, 0.0F);
        this.body.addChild(this.leg1_2);
        this.body.addChild(this.leg2_1);
        this.body.addChild(this.horn2);
        this.body.addChild(this.horn3_3);
        this.body.addChild(this.leg2_2);
        this.body.addChild(this.leg1_1);
        this.body.addChild(this.horn3_2);
        this.body.addChild(this.leg1_4);
        this.body.addChild(this.leg2);
        this.body.addChild(this.horn3_1);
        this.body.addChild(this.UpHorn);
        this.body.addChild(this.leg1);
        this.body.addChild(this.body_1);
        this.body.addChild(this.horn3);
        this.body.addChild(this.UpHorn_1);
        this.body.addChild(this.leg1_3);
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
}
