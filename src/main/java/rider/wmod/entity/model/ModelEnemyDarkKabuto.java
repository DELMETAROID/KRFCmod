package rider.wmod.entity.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelKabuto - Model Creator: DELMETAROID - Do not reuse this model.
 * Created using Tabula 7.0.1
 */
public class ModelEnemyDarkKabuto extends ModelBiped {
	public ModelRenderer RightLeg;
	public ModelRenderer RightArm;
	public ModelRenderer Body;
	public ModelRenderer Body2;
	public ModelRenderer LeftArm;
	public ModelRenderer LeftLeg;
	public ModelRenderer Head;
	public ModelRenderer Shoulder_R;
	public ModelRenderer Shoulder_L;
	public ModelRenderer AntenaBase;
	public ModelRenderer UpHorn;
	public ModelRenderer AntenaBase2;
	public ModelRenderer AntenaBase3;
	public ModelRenderer AntenaBase4;
	public ModelRenderer AntenaBase5;
	public ModelRenderer AntenaBase6;
	public ModelRenderer AntenaBase7;
	public ModelRenderer AntenaBase8;
	public ModelRenderer Antena2;
	public ModelRenderer AntenaShape1L;
	public ModelRenderer AntenaShape2L;
	public ModelRenderer AntenaShape3L;
	public ModelRenderer AntenaShape1R;
	public ModelRenderer AntenaShape2R;
	public ModelRenderer AntenaShape3R;
	public ModelRenderer AntenaShape4L;
	public ModelRenderer AntenaShape4R;
	public ModelRenderer AntenaShape5R;
	public ModelRenderer AntenaShape5L;
	public ModelRenderer UpHorn2;
	public ModelRenderer Antena1R;
	public ModelRenderer Antena1L;
	public ModelRenderer Antena1Centor;
	public ModelRenderer AntenaBase9;

	public ModelRenderer ZectorLeg1;
	public ModelRenderer ZectorLeg3;
	public ModelRenderer ZectorLeg2;
	public ModelRenderer ZectorOpen;
	public ModelRenderer ZectorHornUnderOpen;
	public ModelRenderer ZectorHornOpen1;
	public ModelRenderer ZectorHornOpen2;
	public ModelRenderer ZectorHornUpOpen;
	public ModelRenderer ZectorHornOpen3;
	
//	public ModelRenderer ZectorHornUnder_Masked;
//	public ModelRenderer ZectorHornSet_Masked;
//	public ModelRenderer ZectorClose_Masked;
//	public ModelRenderer ZectorHorn2_Masked;
//	public ModelRenderer ZectorHorn4_Masked;
//	public ModelRenderer ZectorHornUp_Masked;
//	public ModelRenderer ZectorHorn3_Masked;
	
	public ModelRenderer belt;
	public ModelRenderer driverbase;
	public ModelRenderer driverbase2;
	public ModelRenderer DriverEye;
	public ModelRenderer SideR;
	public ModelRenderer SideL;
	public ModelRenderer SideBack;

	public ModelEnemyDarkKabuto() {

        this.textureWidth = 64;
        this.textureHeight = 64;
        this.AntenaShape3L = new ModelRenderer(this, 0, 41);
        this.AntenaShape3L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape3L.addBox(2.5F, -4.5F, -4.25F, 1, 1, 2, 0.0F);
        this.setRotateAngle(AntenaShape3L, 0.0F, 0.6108652381980153F, 0.0F);
        this.ZectorHornUnderOpen = new ModelRenderer(this, 53, 8);
        this.ZectorHornUnderOpen.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ZectorHornUnderOpen.addBox(-1.5F, 20.0F, -8.0F, 2, 1, 1, 0.0F);
        this.ZectorHornOpen3 = new ModelRenderer(this, 52, 0);
        this.ZectorHornOpen3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ZectorHornOpen3.addBox(-3.7F, 17.0F, -9.0F, 1, 4, 1, 0.0F);
        this.ZectorHornOpen1 = new ModelRenderer(this, 56, 0);
        this.ZectorHornOpen1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ZectorHornOpen1.addBox(-3.0F, 8.5F, -8.5F, 1, 2, 1, 0.0F);

        this.Antena1L = new ModelRenderer(this, 18, 33);
        this.Antena1L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Antena1L.addBox(1.0F, -10.7F, -7.5F, 2, 1, 1, 0.0F);
        this.AntenaBase6 = new ModelRenderer(this, 0, 42);
        this.AntenaBase6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaBase6.addBox(-0.5F, -4.5F, -6.0F, 1, 1, 2, 0.0F);
        this.AntenaShape2R = new ModelRenderer(this, 0, 42);
        this.AntenaShape2R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape2R.addBox(-3.75F, -5.5F, -4.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(AntenaShape2R, 0.0F, -0.6108652381980153F, 0.0F);
        this.Antena1R = new ModelRenderer(this, 18, 33);
        this.Antena1R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Antena1R.addBox(-3.0F, -10.7F, -7.5F, 2, 1, 1, 0.0F);
        this.AntenaShape2L = new ModelRenderer(this, 0, 42);
        this.AntenaShape2L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape2L.addBox(2.75F, -5.5F, -4.75F, 1, 1, 2, 0.0F);
        this.setRotateAngle(AntenaShape2L, 0.0F, 0.6108652381980153F, 0.0F);
        this.UpHorn = new ModelRenderer(this, 24, 0);
        this.UpHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpHorn.addBox(-0.5F, -9.5F, -2.5F, 1, 1, 2, 0.0F);
        this.AntenaBase9 = new ModelRenderer(this, 0, 42);
        this.AntenaBase9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaBase9.addBox(-0.5F, -1.6F, -5.25F, 1, 2, 1, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.5F, 2.5F, 0.0F);
        this.RightArm.addBox(-3.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
        this.Shoulder_L = new ModelRenderer(this, 0, 33);
        this.Shoulder_L.mirror = true;
        this.Shoulder_L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_L.addBox(-1.25F, -2.5F, -2.5F, 5, 4, 5, 0.0F);
        this.Antena2 = new ModelRenderer(this, 20, 35);
        this.Antena2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Antena2.addBox(-1.5F, -9.5F, -7.25F, 3, 1, 1, 0.0F);
        this.AntenaShape4L = new ModelRenderer(this, 0, 41);
        this.AntenaShape4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape4L.addBox(2.25F, -3.5F, -4.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(AntenaShape4L, 0.0F, 0.6108652381980153F, 0.0F);
        this.AntenaBase5 = new ModelRenderer(this, 0, 41);
        this.AntenaBase5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaBase5.addBox(-0.5F, -5.5F, -6.25F, 1, 1, 2, 0.0F);
        this.AntenaBase8 = new ModelRenderer(this, 0, 42);
        this.AntenaBase8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaBase8.addBox(-0.5F, -2.5F, -5.5F, 1, 1, 1, 0.0F);
        this.Shoulder_R = new ModelRenderer(this, 0, 33);
        this.Shoulder_R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoulder_R.addBox(-3.75F, -2.5F, -2.5F, 5, 4, 5, 0.0F);
        this.UpHorn2 = new ModelRenderer(this, 24, 0);
        this.UpHorn2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpHorn2.addBox(-0.5F, -10.0F, -3.0F, 1, 1, 2, 0.0F);
        this.Body2 = new ModelRenderer(this, 39, 35);
        this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body2.addBox(-4.0F, 0.6F, -2.6F, 8, 3, 4, 0.0F);
        this.ZectorLeg2 = new ModelRenderer(this, 44, 4);
        this.ZectorLeg2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ZectorLeg2.addBox(-0.4F, 9.65F, -6.5F, 1, 3, 1, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 16, 48);
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-1.8F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
        this.AntenaShape1L = new ModelRenderer(this, 0, 42);
        this.AntenaShape1L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape1L.addBox(3.0F, -6.5F, -5.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(AntenaShape1L, 0.0F, 0.6108652381980153F, 0.0F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.26F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.2F, 0.0F, -2.0F, 4, 12, 4, 0.26F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.51F);
        this.setRotateAngle(Head, 0.0F, -0.0030636248309382106F, 0.0F);
        this.AntenaShape4R = new ModelRenderer(this, 0, 42);
        this.AntenaShape4R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape4R.addBox(-3.25F, -3.5F, -4.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(AntenaShape4R, 0.0F, -0.6108652381980153F, 0.0F);
        this.AntenaBase4 = new ModelRenderer(this, 0, 42);
        this.AntenaBase4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaBase4.addBox(-0.5F, -6.5F, -6.5F, 1, 1, 2, 0.0F);
        this.AntenaBase = new ModelRenderer(this, 0, 46);
        this.AntenaBase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaBase.addBox(-1.0F, -0.25F, -5.0F, 2, 1, 1, 0.0F);
        this.ZectorLeg1 = new ModelRenderer(this, 44, 4);
        this.ZectorLeg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ZectorLeg1.addBox(0.8F, 9.65F, -6.5F, 1, 3, 1, 0.0F);
        this.ZectorHornUpOpen = new ModelRenderer(this, 48, 8);
        this.ZectorHornUpOpen.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ZectorHornUpOpen.addBox(-1.5F, 16.9F, -8.0F, 2, 1, 1, 0.0F);
        this.AntenaShape1R = new ModelRenderer(this, 0, 42);
        this.AntenaShape1R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape1R.addBox(-4.0F, -6.5F, -5.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(AntenaShape1R, 0.0F, -0.6108652381980153F, 0.0F);
        this.AntenaBase2 = new ModelRenderer(this, 0, 42);
        this.AntenaBase2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaBase2.addBox(-1.0F, -8.5F, -7.0F, 2, 1, 1, 0.0F);
        this.AntenaShape5L = new ModelRenderer(this, 0, 42);
        this.AntenaShape5L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape5L.addBox(2.75F, -7.5F, -4.75F, 1, 1, 2, 0.0F);
        this.setRotateAngle(AntenaShape5L, 0.0F, 0.6108652381980153F, 0.0F);
        this.ZectorLeg3 = new ModelRenderer(this, 44, 4);
        this.ZectorLeg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ZectorLeg3.addBox(-1.6F, 9.65F, -6.5F, 1, 3, 1, 0.0F);
        this.ZectorOpen = new ModelRenderer(this, 48, 5);
        this.ZectorOpen.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ZectorOpen.addBox(-2.5F, 9.5F, -3.7F, 5, 2, 1, 0.0F);
        this.ZectorHornOpen2 = new ModelRenderer(this, 44, 2);
        this.ZectorHornOpen2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ZectorHornOpen2.addBox(-2.8F, 18.5F, -8.5F, 1, 1, 1, 0.0F);
        this.LeftArm = new ModelRenderer(this, 32, 48);
        this.LeftArm.setRotationPoint(5.5F, 2.5F, 0.0F);
        this.LeftArm.addBox(-1.0F, -1.75F, -2.0F, 4, 12, 4, 0.26F);
        this.AntenaShape3R = new ModelRenderer(this, 0, 42);
        this.AntenaShape3R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape3R.addBox(-3.5F, -4.5F, -4.25F, 1, 1, 2, 0.0F);
        this.setRotateAngle(AntenaShape3R, 0.0F, -0.6108652381980153F, 0.0F);
        this.AntenaShape5R = new ModelRenderer(this, 0, 42);
        this.AntenaShape5R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaShape5R.addBox(-3.75F, -7.5F, -4.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(AntenaShape5R, 0.0F, -0.6108652381980153F, 0.0F);
        this.AntenaBase3 = new ModelRenderer(this, 0, 42);
        this.AntenaBase3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaBase3.addBox(-0.5F, -7.5F, -6.75F, 1, 1, 3, 0.0F);
        this.Antena1Centor = new ModelRenderer(this, 24, 33);
        this.Antena1Centor.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Antena1Centor.addBox(-1.0F, -10.5F, -7.5F, 2, 1, 1, 0.0F);
        this.AntenaBase7 = new ModelRenderer(this, 0, 42);
        this.AntenaBase7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AntenaBase7.addBox(-0.5F, -3.5F, -5.75F, 1, 1, 2, 0.0F);
/*
		this.ZectorHorn3_Masked = new ModelRenderer(this, 48, 0);
		this.ZectorHorn3_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ZectorHorn3_Masked.addBox(3.3F, 17.0F, -8.5F, 1, 4, 1, 0.0F);
		this.ZectorHornSet_Masked = new ModelRenderer(this, 35, 1);
		this.ZectorHornSet_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ZectorHornSet_Masked.addBox(1.0F, 5.62F, -7.0F, 1, 1, 1, 0.0F);
		this.ZectorHorn2_Masked = new ModelRenderer(this, 44, 0);
		this.ZectorHorn2_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ZectorHorn2_Masked.addBox(2.8F, 18.5F, -8.0F, 1, 1, 1, 0.0F);
		this.ZectorHorn4_Masked = new ModelRenderer(this, 44, 0);
		this.ZectorHorn4_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ZectorHorn4_Masked.addBox(2.0F, 18.5F, -7.5F, 1, 1, 1, 0.0F);
		this.ZectorHornUp_Masked = new ModelRenderer(this, 35, 0);
		this.ZectorHornUp_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ZectorHornUp_Masked.addBox(-0.5F, 16.9F, -7.2F, 3, 1, 1, 0.0F);
		this.ZectorClose_Masked = new ModelRenderer(this, 33, 5);
		this.ZectorClose_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ZectorClose_Masked.addBox(-2.2F, 9.5F, -3.7F, 4, 2, 1, 0.0F);
		this.ZectorHornUnder_Masked = new ModelRenderer(this, 35, 0);
		this.ZectorHornUnder_Masked.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ZectorHornUnder_Masked.addBox(-0.5F, 20.0F, -7.2F, 3, 1, 1, 0.0F);
        */
        this.AntenaBase.addChild(this.AntenaShape3L);
        this.ZectorHornUnderOpen.addChild(this.ZectorHornOpen3);
        this.AntenaBase2.addChild(this.Antena1L);
        this.Head.addChild(this.AntenaBase6);
        this.AntenaBase.addChild(this.AntenaShape2R);
        this.AntenaBase2.addChild(this.Antena1R);
        this.AntenaBase.addChild(this.AntenaShape2L);
        this.Head.addChild(this.UpHorn);
        this.AntenaBase2.addChild(this.AntenaBase9);
        this.LeftArm.addChild(this.Shoulder_L);
        this.Head.addChild(this.Antena2);
        this.AntenaBase.addChild(this.AntenaShape4L);
        this.Head.addChild(this.AntenaBase5);
        this.Head.addChild(this.AntenaBase8);
        this.RightArm.addChild(this.Shoulder_R);
        this.UpHorn.addChild(this.UpHorn2);
        this.ZectorLeg1.addChild(this.ZectorLeg2);
        this.AntenaBase.addChild(this.AntenaShape1L);
        this.AntenaBase.addChild(this.AntenaShape4R);
        this.Head.addChild(this.AntenaBase4);
        this.Head.addChild(this.AntenaBase);
        this.ZectorHornUnderOpen.addChild(this.ZectorHornUpOpen);
        this.AntenaBase.addChild(this.AntenaShape1R);
        this.Head.addChild(this.AntenaBase2);
        this.AntenaBase.addChild(this.AntenaShape5L);
        this.ZectorLeg1.addChild(this.ZectorLeg3);
        this.ZectorHornUnderOpen.addChild(this.ZectorHornOpen2);
        this.AntenaBase.addChild(this.AntenaShape3R);
        this.AntenaBase.addChild(this.AntenaShape5R);
        this.Head.addChild(this.AntenaBase3);
        this.AntenaBase2.addChild(this.Antena1Centor);
        this.Head.addChild(this.AntenaBase7);
        
		this.SideL = new ModelRenderer(this, 27, 39);
		this.SideL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.SideL.addBox(-4.9F, 5.85F, -0.5F, 1, 1, 1, 0.0F);
		this.belt = new ModelRenderer(this, 16, 25);
		this.belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.belt.addBox(-4.0F, 9.0F, -2.0F, 8, 1, 4, 0.27F);
		this.DriverEye = new ModelRenderer(this, 37, 12);
		this.DriverEye.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.DriverEye.addBox(7.0F, 7.6F, -12.25F, 1, 2, 1, 0.0F);
		this.driverbase2 = new ModelRenderer(this, 33, 12);
		this.driverbase2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbase2.addBox(1.6F, 8.5F, -6.5F, 1, 2, 1, 0.0F);
		this.SideR = new ModelRenderer(this, 27, 39);
		this.SideR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.SideR.addBox(3.9F, 5.85F, -0.5F, 1, 1, 1, 0.0F);
        this.SideBack = new ModelRenderer(this, 27, 39);
        this.SideBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideBack.addBox(-0.5F, 5.85F, 2.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(SideBack, 0.0F, 1.5707963267948966F, 0.0F);
		this.driverbase = new ModelRenderer(this, 33, 8);
		this.driverbase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.driverbase.addBox(-2.4F, 8.5F, -2.75F, 5, 2, 1, 0.0F);
		this.belt.addChild(this.driverbase);
        
//		this.ZectorHornUnder_Masked.addChild(this.ZectorHorn3_Masked);
//		this.ZectorHornUnder_Masked.addChild(this.ZectorHorn2_Masked);
//		this.ZectorHornUnder_Masked.addChild(this.ZectorHorn4_Masked);
//		this.ZectorHornUnder_Masked.addChild(this.ZectorHornUp_Masked);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (this.isChild)
		{
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorHornUnderOpen.offsetX, this.ZectorHornUnderOpen.offsetY, this.ZectorHornUnderOpen.offsetZ);
			GlStateManager.translate(this.ZectorHornUnderOpen.rotationPointX * f5, this.ZectorHornUnderOpen.rotationPointY * f5, this.ZectorHornUnderOpen.rotationPointZ * f5);
			GlStateManager.scale(0.8D, 0.5D, 0.5D);
			GlStateManager.translate(-this.ZectorHornUnderOpen.offsetX, -this.ZectorHornUnderOpen.offsetY, -this.ZectorHornUnderOpen.offsetZ);
			GlStateManager.translate(-this.ZectorHornUnderOpen.rotationPointX * f5, -this.ZectorHornUnderOpen.rotationPointY * f5, -this.ZectorHornUnderOpen.rotationPointZ * f5);
			this.ZectorHornUnderOpen.render(f5);
			GlStateManager.popMatrix();
			this.RightLeg.render(f5);
			this.LeftArm.render(f5);
	        this.Body2.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorLeg1.offsetX, this.ZectorLeg1.offsetY, this.ZectorLeg1.offsetZ);
			GlStateManager.translate(this.ZectorLeg1.rotationPointX * f5, this.ZectorLeg1.rotationPointY * f5, this.ZectorLeg1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.85D, 0.5D);
			GlStateManager.translate(-this.ZectorLeg1.offsetX, -this.ZectorLeg1.offsetY, -this.ZectorLeg1.offsetZ);
			GlStateManager.translate(-this.ZectorLeg1.rotationPointX * f5, -this.ZectorLeg1.rotationPointY * f5, -this.ZectorLeg1.rotationPointZ * f5);
			this.ZectorLeg1.render(f5);
			GlStateManager.popMatrix();
			this.Body.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorOpen.offsetX, this.ZectorOpen.offsetY, this.ZectorOpen.offsetZ);
			GlStateManager.translate(this.ZectorOpen.rotationPointX * f5, this.ZectorOpen.rotationPointY * f5, this.ZectorOpen.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.9D, 1.0D);
			GlStateManager.translate(-this.ZectorOpen.offsetX, -this.ZectorOpen.offsetY, -this.ZectorOpen.offsetZ);
			GlStateManager.translate(-this.ZectorOpen.rotationPointX * f5, -this.ZectorOpen.rotationPointY * f5, -this.ZectorOpen.rotationPointZ * f5);
			this.ZectorOpen.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorHornOpen1.offsetX, this.ZectorHornOpen1.offsetY, this.ZectorHornOpen1.offsetZ);
			GlStateManager.translate(this.ZectorHornOpen1.rotationPointX * f5, this.ZectorHornOpen1.rotationPointY * f5, this.ZectorHornOpen1.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 0.5D);
			GlStateManager.translate(-this.ZectorHornOpen1.offsetX, -this.ZectorHornOpen1.offsetY, -this.ZectorHornOpen1.offsetZ);
			GlStateManager.translate(-this.ZectorHornOpen1.rotationPointX * f5, -this.ZectorHornOpen1.rotationPointY * f5, -this.ZectorHornOpen1.rotationPointZ * f5);
			this.ZectorHornOpen1.render(f5);
			GlStateManager.popMatrix();
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);
			
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.SideL.offsetX, this.SideL.offsetY, this.SideL.offsetZ);
			GlStateManager.translate(this.SideL.rotationPointX * f5, this.SideL.rotationPointY * f5, this.SideL.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.5D, 1.5D);
			GlStateManager.translate(-this.SideL.offsetX, -this.SideL.offsetY, -this.SideL.offsetZ);
			GlStateManager.translate(-this.SideL.rotationPointX * f5, -this.SideL.rotationPointY * f5, -this.SideL.rotationPointZ * f5);
			this.SideL.render(f5);
			GlStateManager.popMatrix();
			this.belt.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.DriverEye.offsetX, this.DriverEye.offsetY, this.DriverEye.offsetZ);
			GlStateManager.translate(this.DriverEye.rotationPointX * f5, this.DriverEye.rotationPointY * f5, this.DriverEye.rotationPointZ * f5);
			GlStateManager.scale(0.3D, 1.1D, 0.25D);
			GlStateManager.translate(-this.DriverEye.offsetX, -this.DriverEye.offsetY, -this.DriverEye.offsetZ);
			GlStateManager.translate(-this.DriverEye.rotationPointX * f5, -this.DriverEye.rotationPointY * f5, -this.DriverEye.rotationPointZ * f5);
			this.DriverEye.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.driverbase2.offsetX, this.driverbase2.offsetY, this.driverbase2.offsetZ);
			GlStateManager.translate(this.driverbase2.rotationPointX * f5, this.driverbase2.rotationPointY * f5, this.driverbase2.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.driverbase2.offsetX, -this.driverbase2.offsetY, -this.driverbase2.offsetZ);
			GlStateManager.translate(-this.driverbase2.rotationPointX * f5, -this.driverbase2.rotationPointY * f5, -this.driverbase2.rotationPointZ * f5);
			this.driverbase2.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.SideR.offsetX, this.SideR.offsetY, this.SideR.offsetZ);
			GlStateManager.translate(this.SideR.rotationPointX * f5, this.SideR.rotationPointY * f5, this.SideR.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.5D, 1.5D);
			GlStateManager.translate(-this.SideR.offsetX, -this.SideR.offsetY, -this.SideR.offsetZ);
			GlStateManager.translate(-this.SideR.rotationPointX * f5, -this.SideR.rotationPointY * f5, -this.SideR.rotationPointZ * f5);
			this.SideR.render(f5);
			GlStateManager.popMatrix();
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(this.SideBack.offsetX, this.SideBack.offsetY, this.SideBack.offsetZ);
	        GlStateManager.translate(this.SideBack.rotationPointX * f5, this.SideBack.rotationPointY * f5, this.SideBack.rotationPointZ * f5);
	        GlStateManager.scale(1.5D, 1.5D, 1.0D);
	        GlStateManager.translate(-this.SideBack.offsetX, -this.SideBack.offsetY, -this.SideBack.offsetZ);
	        GlStateManager.translate(-this.SideBack.rotationPointX * f5, -this.SideBack.rotationPointY * f5, -this.SideBack.rotationPointZ * f5);
	        this.SideBack.render(f5);
	        GlStateManager.popMatrix();
	        /*
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorClose_Masked.offsetX, this.ZectorClose_Masked.offsetY, this.ZectorClose_Masked.offsetZ);
			GlStateManager.translate(this.ZectorClose_Masked.rotationPointX * f5, this.ZectorClose_Masked.rotationPointY * f5, this.ZectorClose_Masked.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.9D, 1.0D);
			GlStateManager.translate(-this.ZectorClose_Masked.offsetX, -this.ZectorClose_Masked.offsetY, -this.ZectorClose_Masked.offsetZ);
			GlStateManager.translate(-this.ZectorClose_Masked.rotationPointX * f5, -this.ZectorClose_Masked.rotationPointY * f5, -this.ZectorClose_Masked.rotationPointZ * f5);
			this.ZectorClose_Masked.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorHornUnder_Masked.offsetX, this.ZectorHornUnder_Masked.offsetY, this.ZectorHornUnder_Masked.offsetZ);
			GlStateManager.translate(this.ZectorHornUnder_Masked.rotationPointX * f5, this.ZectorHornUnder_Masked.rotationPointY * f5, this.ZectorHornUnder_Masked.rotationPointZ * f5);
			GlStateManager.scale(0.8D, 0.5D, 0.5D);
			GlStateManager.translate(-this.ZectorHornUnder_Masked.offsetX, -this.ZectorHornUnder_Masked.offsetY, -this.ZectorHornUnder_Masked.offsetZ);
			GlStateManager.translate(-this.ZectorHornUnder_Masked.rotationPointX * f5, -this.ZectorHornUnder_Masked.rotationPointY * f5, -this.ZectorHornUnder_Masked.rotationPointZ * f5);
			this.ZectorHornUnder_Masked.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorHornSet_Masked.offsetX, this.ZectorHornSet_Masked.offsetY, this.ZectorHornSet_Masked.offsetZ);
			GlStateManager.translate(this.ZectorHornSet_Masked.rotationPointX * f5, this.ZectorHornSet_Masked.rotationPointY * f5, this.ZectorHornSet_Masked.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.55D, 0.5D);
			GlStateManager.translate(-this.ZectorHornSet_Masked.offsetX, -this.ZectorHornSet_Masked.offsetY, -this.ZectorHornSet_Masked.offsetZ);
			GlStateManager.translate(-this.ZectorHornSet_Masked.rotationPointX * f5, -this.ZectorHornSet_Masked.rotationPointY * f5, -this.ZectorHornSet_Masked.rotationPointZ * f5);
			this.ZectorHornSet_Masked.render(f5);
			GlStateManager.popMatrix();
			*/
		}else {
			if (entity.isSneaking())
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.Head.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorHornUnderOpen.offsetX, this.ZectorHornUnderOpen.offsetY, this.ZectorHornUnderOpen.offsetZ);
			GlStateManager.translate(this.ZectorHornUnderOpen.rotationPointX * f5, this.ZectorHornUnderOpen.rotationPointY * f5, this.ZectorHornUnderOpen.rotationPointZ * f5);
			GlStateManager.scale(0.8D, 0.5D, 0.5D);
			GlStateManager.translate(-this.ZectorHornUnderOpen.offsetX, -this.ZectorHornUnderOpen.offsetY, -this.ZectorHornUnderOpen.offsetZ);
			GlStateManager.translate(-this.ZectorHornUnderOpen.rotationPointX * f5, -this.ZectorHornUnderOpen.rotationPointY * f5, -this.ZectorHornUnderOpen.rotationPointZ * f5);
			this.ZectorHornUnderOpen.render(f5);
			GlStateManager.popMatrix();
			this.RightLeg.render(f5);
	        this.Body2.render(f5);
			this.LeftArm.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorLeg1.offsetX, this.ZectorLeg1.offsetY, this.ZectorLeg1.offsetZ);
			GlStateManager.translate(this.ZectorLeg1.rotationPointX * f5, this.ZectorLeg1.rotationPointY * f5, this.ZectorLeg1.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.85D, 0.5D);
			GlStateManager.translate(-this.ZectorLeg1.offsetX, -this.ZectorLeg1.offsetY, -this.ZectorLeg1.offsetZ);
			GlStateManager.translate(-this.ZectorLeg1.rotationPointX * f5, -this.ZectorLeg1.rotationPointY * f5, -this.ZectorLeg1.rotationPointZ * f5);
			this.ZectorLeg1.render(f5);
			GlStateManager.popMatrix();
			this.Body.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorOpen.offsetX, this.ZectorOpen.offsetY, this.ZectorOpen.offsetZ);
			GlStateManager.translate(this.ZectorOpen.rotationPointX * f5, this.ZectorOpen.rotationPointY * f5, this.ZectorOpen.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.9D, 1.0D);
			GlStateManager.translate(-this.ZectorOpen.offsetX, -this.ZectorOpen.offsetY, -this.ZectorOpen.offsetZ);
			GlStateManager.translate(-this.ZectorOpen.rotationPointX * f5, -this.ZectorOpen.rotationPointY * f5, -this.ZectorOpen.rotationPointZ * f5);
			this.ZectorOpen.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorHornOpen1.offsetX, this.ZectorHornOpen1.offsetY, this.ZectorHornOpen1.offsetZ);
			GlStateManager.translate(this.ZectorHornOpen1.rotationPointX * f5, this.ZectorHornOpen1.rotationPointY * f5, this.ZectorHornOpen1.rotationPointZ * f5);
			GlStateManager.scale(0.5D, 1.0D, 0.5D);
			GlStateManager.translate(-this.ZectorHornOpen1.offsetX, -this.ZectorHornOpen1.offsetY, -this.ZectorHornOpen1.offsetZ);
			GlStateManager.translate(-this.ZectorHornOpen1.rotationPointX * f5, -this.ZectorHornOpen1.rotationPointY * f5, -this.ZectorHornOpen1.rotationPointZ * f5);
			this.ZectorHornOpen1.render(f5);
			GlStateManager.popMatrix();
			this.LeftLeg.render(f5);
			this.RightArm.render(f5);
			/*
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorClose_Masked.offsetX, this.ZectorClose_Masked.offsetY, this.ZectorClose_Masked.offsetZ);
			GlStateManager.translate(this.ZectorClose_Masked.rotationPointX * f5, this.ZectorClose_Masked.rotationPointY * f5, this.ZectorClose_Masked.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 0.9D, 1.0D);
			GlStateManager.translate(-this.ZectorClose_Masked.offsetX, -this.ZectorClose_Masked.offsetY, -this.ZectorClose_Masked.offsetZ);
			GlStateManager.translate(-this.ZectorClose_Masked.rotationPointX * f5, -this.ZectorClose_Masked.rotationPointY * f5, -this.ZectorClose_Masked.rotationPointZ * f5);
			this.ZectorClose_Masked.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorHornUnder_Masked.offsetX, this.ZectorHornUnder_Masked.offsetY, this.ZectorHornUnder_Masked.offsetZ);
			GlStateManager.translate(this.ZectorHornUnder_Masked.rotationPointX * f5, this.ZectorHornUnder_Masked.rotationPointY * f5, this.ZectorHornUnder_Masked.rotationPointZ * f5);
			GlStateManager.scale(0.8D, 0.5D, 0.5D);
			GlStateManager.translate(-this.ZectorHornUnder_Masked.offsetX, -this.ZectorHornUnder_Masked.offsetY, -this.ZectorHornUnder_Masked.offsetZ);
			GlStateManager.translate(-this.ZectorHornUnder_Masked.rotationPointX * f5, -this.ZectorHornUnder_Masked.rotationPointY * f5, -this.ZectorHornUnder_Masked.rotationPointZ * f5);
			this.ZectorHornUnder_Masked.render(f5);
			GlStateManager.popMatrix();

			GlStateManager.pushMatrix();
			GlStateManager.translate(this.ZectorHornSet_Masked.offsetX, this.ZectorHornSet_Masked.offsetY, this.ZectorHornSet_Masked.offsetZ);
			GlStateManager.translate(this.ZectorHornSet_Masked.rotationPointX * f5, this.ZectorHornSet_Masked.rotationPointY * f5, this.ZectorHornSet_Masked.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.55D, 0.5D);
			GlStateManager.translate(-this.ZectorHornSet_Masked.offsetX, -this.ZectorHornSet_Masked.offsetY, -this.ZectorHornSet_Masked.offsetZ);
			GlStateManager.translate(-this.ZectorHornSet_Masked.rotationPointX * f5, -this.ZectorHornSet_Masked.rotationPointY * f5, -this.ZectorHornSet_Masked.rotationPointZ * f5);
			this.ZectorHornSet_Masked.render(f5);
			GlStateManager.popMatrix();
			*/
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.SideL.offsetX, this.SideL.offsetY, this.SideL.offsetZ);
			GlStateManager.translate(this.SideL.rotationPointX * f5, this.SideL.rotationPointY * f5, this.SideL.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.5D, 1.5D);
			GlStateManager.translate(-this.SideL.offsetX, -this.SideL.offsetY, -this.SideL.offsetZ);
			GlStateManager.translate(-this.SideL.rotationPointX * f5, -this.SideL.rotationPointY * f5, -this.SideL.rotationPointZ * f5);
			this.SideL.render(f5);
			GlStateManager.popMatrix();
			this.belt.render(f5);
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.DriverEye.offsetX, this.DriverEye.offsetY, this.DriverEye.offsetZ);
			GlStateManager.translate(this.DriverEye.rotationPointX * f5, this.DriverEye.rotationPointY * f5, this.DriverEye.rotationPointZ * f5);
			GlStateManager.scale(0.3D, 1.1D, 0.25D);
			GlStateManager.translate(-this.DriverEye.offsetX, -this.DriverEye.offsetY, -this.DriverEye.offsetZ);
			GlStateManager.translate(-this.DriverEye.rotationPointX * f5, -this.DriverEye.rotationPointY * f5, -this.DriverEye.rotationPointZ * f5);
			this.DriverEye.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.driverbase2.offsetX, this.driverbase2.offsetY, this.driverbase2.offsetZ);
			GlStateManager.translate(this.driverbase2.rotationPointX * f5, this.driverbase2.rotationPointY * f5, this.driverbase2.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.0D, 0.5D);
			GlStateManager.translate(-this.driverbase2.offsetX, -this.driverbase2.offsetY, -this.driverbase2.offsetZ);
			GlStateManager.translate(-this.driverbase2.rotationPointX * f5, -this.driverbase2.rotationPointY * f5, -this.driverbase2.rotationPointZ * f5);
			this.driverbase2.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.translate(this.SideR.offsetX, this.SideR.offsetY, this.SideR.offsetZ);
			GlStateManager.translate(this.SideR.rotationPointX * f5, this.SideR.rotationPointY * f5, this.SideR.rotationPointZ * f5);
			GlStateManager.scale(1.0D, 1.5D, 1.5D);
			GlStateManager.translate(-this.SideR.offsetX, -this.SideR.offsetY, -this.SideR.offsetZ);
			GlStateManager.translate(-this.SideR.rotationPointX * f5, -this.SideR.rotationPointY * f5, -this.SideR.rotationPointZ * f5);
			this.SideR.render(f5);
			GlStateManager.popMatrix();
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(this.SideBack.offsetX, this.SideBack.offsetY, this.SideBack.offsetZ);
	        GlStateManager.translate(this.SideBack.rotationPointX * f5, this.SideBack.rotationPointY * f5, this.SideBack.rotationPointZ * f5);
	        GlStateManager.scale(1.5D, 1.5D, 1.0D);
	        GlStateManager.translate(-this.SideBack.offsetX, -this.SideBack.offsetY, -this.SideBack.offsetZ);
	        GlStateManager.translate(-this.SideBack.rotationPointX * f5, -this.SideBack.rotationPointY * f5, -this.SideBack.rotationPointZ * f5);
	        this.SideBack.render(f5);
	        GlStateManager.popMatrix();
			
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

		setAngle(Head, this.bipedHeadwear);
		setAngle(Body, this.bipedBody);
		setAngle(Body2, this.bipedBody);
		setAngle(RightArm, this.bipedRightArm);
		setAngle(LeftArm, this.bipedLeftArm);
		setAngle(RightLeg, this.bipedRightLeg);
		setAngle(LeftLeg, this.bipedLeftLeg);
		setAngle(belt, this.bipedBody);
		setAngle(SideL, this.bipedBody);
		setAngle(SideR, this.bipedBody);
		setAngle(SideBack, this.bipedBody);

		//		setAngle(ZectorOpen, this.bipedBody);
		//		setAngle(ZectorHornUnderOpen, this.bipedBody);
		//		setAngle(ZectorLeg1, this.bipedBody);
		//		setAngle(ZectorHornOpen1, this.bipedBody);


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
