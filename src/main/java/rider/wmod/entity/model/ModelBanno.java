package rider.wmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Model Creator: DELMETAROID - Do not reuse this model. 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ModelBanno extends ModelBase {
	private final ModelRenderer Belt;
	private final ModelRenderer DriverBase;
	private final ModelRenderer backle;
	private final ModelRenderer DriverTop;
	private final ModelRenderer DriverPlug;

	public ModelBanno() {
		textureWidth = 64;
		textureHeight = 64;

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, 12.5F, 2.0F);

		DriverBase = new ModelRenderer(this);
		DriverBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.addChild(DriverBase);
		DriverBase.cubeList.add(new ModelBox(DriverBase, 21, 41, -3.5F, 8.5F, -2.5F, 7, 2, 1, 0.0F, false));

		backle = new ModelRenderer(this);
		backle.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.addChild(backle);
		setRotationAngle(backle, 0.9599F, 0.0F, 0.0F);
		backle.cubeList.add(new ModelBox(backle, 27, 37, -2.5F, 2.8F, -10.0F, 5, 2, 2, 0.0F, false));

		DriverTop = new ModelRenderer(this);
		DriverTop.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.addChild(DriverTop);
		DriverTop.cubeList.add(new ModelBox(DriverTop, 29, 42, -1.5F, 7.75F, -2.2F, 3, 1, 1, 0.0F, false));

		DriverPlug = new ModelRenderer(this);
		DriverPlug.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.addChild(DriverPlug);
		setRotationAngle(DriverPlug, 0.0F, 0.0F, -0.5236F);
		DriverPlug.cubeList.add(new ModelBox(DriverPlug, 23, 42, -6.5F, 5.75F, -2.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Belt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}