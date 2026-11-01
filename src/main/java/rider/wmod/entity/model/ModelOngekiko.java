package rider.wmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelOngekiko - Undefined
 * Created using Tabula 7.0.1
 */
public class ModelOngekiko extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape1_1;

    public ModelOngekiko() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.shape1_1 = new ModelRenderer(this, 0, 0);
        this.shape1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape1_1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 1, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 8);
        this.shape1.setRotationPoint(-0.5F, -0.5F, 1.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 7, 7, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape1_1.render(f5);
        this.shape1.render(f5);
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
