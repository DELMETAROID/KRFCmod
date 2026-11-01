package rider.wmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelMusashi - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelMusashiGhost extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Parka;
    public ModelRenderer HeadGhost;
    public ModelRenderer Shoulder_R3;
    public ModelRenderer Shoulder_R2;
    public ModelRenderer Shoulder_R1;
    public ModelRenderer Shoulder_RBase;
    public ModelRenderer Shoulder_LBase;
    public ModelRenderer Shoulder_L1;
    public ModelRenderer Shoulder_L2;
    public ModelRenderer Shoulder_L3;
    public ModelRenderer Shoulder_L4;
    public ModelRenderer Shoulder_R4;
    public ModelRenderer RightSword;
    public ModelRenderer LeftSword;
    public ModelRenderer mage1;
    public ModelRenderer mage2;

    public ModelMusashiGhost() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Shoulder_R3 = new ModelRenderer(this, 0, 54);
        this.Shoulder_R3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_R3.addBox(-5.25F, 1.0F, -2.75F, 1, 1, 1, 0.26F);
        this.Body = new ModelRenderer(this, 40, 32);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.36F);
        this.Shoulder_L1 = new ModelRenderer(this, 0, 54);
        this.Shoulder_L1.mirror = true;
        this.Shoulder_L1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_L1.addBox(2.75F, 1.0F, -2.75F, 1, 1, 1, 0.26F);
        this.LeftSword = new ModelRenderer(this, 48, 48);
        this.LeftSword.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftSword.addBox(5.0F, 3.0F, 0.0F, 1, 15, 1, 0.26F);
        this.setRotateAngle(LeftSword, 0.0F, 0.0F, -0.2617993877991494F);
        this.mage2 = new ModelRenderer(this, 8, 0);
        this.mage2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.mage2.addBox(-1.5F, -11.0F, -4.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(mage2, -0.6981317007977318F, 0.0F, 0.0F);
        this.Shoulder_R1 = new ModelRenderer(this, 0, 54);
        this.Shoulder_R1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_R1.addBox(-3.75F, 1.0F, -2.75F, 1, 1, 1, 0.26F);
        this.Shoulder_L3 = new ModelRenderer(this, 0, 54);
        this.Shoulder_L3.mirror = true;
        this.Shoulder_L3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_L3.addBox(4.25F, 1.25F, -2.75F, 1, 1, 1, 0.26F);
        this.Shoulder_LBase = new ModelRenderer(this, 0, 33);
        this.Shoulder_LBase.mirror = true;
        this.Shoulder_LBase.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.Shoulder_LBase.addBox(-0.5F, -2.0F, -2.5F, 1, 3, 5, 0.26F);
        this.Shoulder_L2 = new ModelRenderer(this, 0, 54);
        this.Shoulder_L2.mirror = true;
        this.Shoulder_L2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_L2.addBox(2.75F, 2.0F, -2.75F, 1, 1, 1, 0.26F);
        this.Shoulder_R4 = new ModelRenderer(this, 0, 54);
        this.Shoulder_R4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_R4.addBox(-6.25F, -0.75F, -2.75F, 1, 2, 1, 0.26F);
        this.HeadGhost = new ModelRenderer(this, 18, 34);
        this.HeadGhost.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadGhost.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 2, 0.51F);
        this.RightSword = new ModelRenderer(this, 48, 48);
        this.RightSword.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightSword.addBox(-6.0F, 3.0F, 0.0F, 1, 15, 1, 0.26F);
        this.setRotateAngle(RightSword, 0.0F, 0.0F, 0.2617993877991494F);
        this.Parka = new ModelRenderer(this, 32, 0);
        this.Parka.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Parka.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.61F);
        this.Shoulder_R2 = new ModelRenderer(this, 0, 54);
        this.Shoulder_R2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_R2.addBox(-3.75F, 2.0F, -2.75F, 1, 1, 1, 0.26F);
        this.Shoulder_RBase = new ModelRenderer(this, 4, 33);
        this.Shoulder_RBase.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.Shoulder_RBase.addBox(-0.5F, -2.0F, -2.5F, 1, 3, 5, 0.26F);
        this.Shoulder_L4 = new ModelRenderer(this, 0, 54);
        this.Shoulder_L4.mirror = true;
        this.Shoulder_L4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_L4.addBox(5.25F, -0.75F, -2.75F, 1, 2, 1, 0.26F);
        this.mage1 = new ModelRenderer(this, 8, 0);
        this.mage1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.mage1.addBox(-0.5F, -14.0F, -3.5F, 1, 6, 2, 0.0F);
        this.setRotateAngle(mage1, -0.6981317007977318F, 0.0F, 0.0F);
        this.Parka.addChild(this.mage2);
        this.Parka.addChild(this.mage1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Shoulder_R3.render(f5);
        this.Body.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Shoulder_L1.offsetX, this.Shoulder_L1.offsetY, this.Shoulder_L1.offsetZ);
        GlStateManager.translate(this.Shoulder_L1.rotationPointX * f5, this.Shoulder_L1.rotationPointY * f5, this.Shoulder_L1.rotationPointZ * f5);
        GlStateManager.scale(0.75D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Shoulder_L1.offsetX, -this.Shoulder_L1.offsetY, -this.Shoulder_L1.offsetZ);
        GlStateManager.translate(-this.Shoulder_L1.rotationPointX * f5, -this.Shoulder_L1.rotationPointY * f5, -this.Shoulder_L1.rotationPointZ * f5);
        this.Shoulder_L1.render(f5);
        GlStateManager.popMatrix();
        this.LeftSword.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Shoulder_R1.offsetX, this.Shoulder_R1.offsetY, this.Shoulder_R1.offsetZ);
        GlStateManager.translate(this.Shoulder_R1.rotationPointX * f5, this.Shoulder_R1.rotationPointY * f5, this.Shoulder_R1.rotationPointZ * f5);
        GlStateManager.scale(0.75D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Shoulder_R1.offsetX, -this.Shoulder_R1.offsetY, -this.Shoulder_R1.offsetZ);
        GlStateManager.translate(-this.Shoulder_R1.rotationPointX * f5, -this.Shoulder_R1.rotationPointY * f5, -this.Shoulder_R1.rotationPointZ * f5);
        this.Shoulder_R1.render(f5);
        GlStateManager.popMatrix();
        this.Shoulder_L3.render(f5);
        this.Shoulder_LBase.render(f5);
        this.Shoulder_L2.render(f5);
        this.Shoulder_R4.render(f5);
        this.HeadGhost.render(f5);
        this.RightSword.render(f5);
        this.Parka.render(f5);
        this.Shoulder_R2.render(f5);
        this.Shoulder_RBase.render(f5);
        this.Shoulder_L4.render(f5);
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
