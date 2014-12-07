package net.jumpingjaguar.letsmodreboot.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelLMRBMob extends ModelBase {
    //fields
    ModelRenderer Right_leg;
    ModelRenderer Left_leg;
    ModelRenderer Head;
    ModelRenderer Left_arm;
    ModelRenderer Right_arm;

    public ModelLMRBMob() {
        textureWidth = 64;
        textureHeight = 32;

        Right_leg = new ModelRenderer(this, 4, 28);
        Right_leg.addBox(0F, 0F, 0F, 1, 3, 1);
        Right_leg.setRotationPoint(-1F, 21F, 0F);
        Right_leg.setTextureSize(64, 32);
        Right_leg.mirror = true;
        setRotation(Right_leg, 0F, 0F, 0F);
        Left_leg = new ModelRenderer(this, 0, 28);
        Left_leg.addBox(0F, 0F, -1F, 1, 3, 1);
        Left_leg.setRotationPoint(1F, 21F, 1F);
        Left_leg.setTextureSize(64, 32);
        Left_leg.mirror = true;
        setRotation(Left_leg, 0F, 0F, 0F);
        Head = new ModelRenderer(this, 0, 18);
        Head.addBox(-2F, -4F, -2F, 4, 4, 4);
        Head.setRotationPoint(0.5F, 22F, 0.5F);
        Head.setTextureSize(64, 32);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Left_arm = new ModelRenderer(this, 6, 26);
        Left_arm.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
        Left_arm.setRotationPoint(2F, 20F, 0.5F);
        Left_arm.setTextureSize(64, 32);
        Left_arm.mirror = true;
        setRotation(Left_arm, 0F, 0F, -0.2443461F);
        Right_arm = new ModelRenderer(this, 0, 26);
        Right_arm.addBox(-2F, -0.5F, -0.5F, 2, 1, 1);
        Right_arm.setRotationPoint(-1F, 20F, 0.5F);
        Right_arm.setTextureSize(64, 32);
        Right_arm.mirror = true;
        setRotation(Right_arm, 0F, 0F, 0.2443461F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Right_leg.render(f5);
        Left_leg.render(f5);
        Head.render(f5);
        Left_arm.render(f5);
        Right_arm.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float f6 = (180F / (float) Math.PI);
        this.Right_leg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.Left_leg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
    }

}
