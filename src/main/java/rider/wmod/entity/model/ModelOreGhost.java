package rider.wmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelGhost - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelOreGhost extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Parka;
    public ModelRenderer HeadGhost;
    public ModelRenderer Shoulder_L;
    public ModelRenderer Shoulder_R;

    public ModelOreGhost() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.HeadGhost = new ModelRenderer(this, 18, 34);
        this.HeadGhost.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadGhost.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 2, 0.51F);
        this.Shoulder_R = new ModelRenderer(this, 0, 33);
        this.Shoulder_R.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.Shoulder_R.addBox(-3.5F, -2.3F, -2.5F, 4, 6, 5, 0.26F);
        this.Shoulder_L = new ModelRenderer(this, 0, 33);
        this.Shoulder_L.mirror = true;
        this.Shoulder_L.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.Shoulder_L.addBox(-0.5F, -2.3F, -2.5F, 4, 6, 5, 0.26F);
        this.Body = new ModelRenderer(this, 40, 32);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.36F);
        this.Parka = new ModelRenderer(this, 32, 0);
        this.Parka.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Parka.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.61F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.HeadGhost.render(f5);
        this.Shoulder_R.render(f5);
        this.Shoulder_L.render(f5);
        this.Body.render(f5);
        this.Parka.render(f5);
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
