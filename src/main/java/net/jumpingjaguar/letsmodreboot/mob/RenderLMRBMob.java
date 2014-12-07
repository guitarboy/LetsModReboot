package net.jumpingjaguar.letsmodreboot.mob;

import net.jumpingjaguar.letsmodreboot.reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderLMRBMob extends RenderLiving {

    private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MOD_ID + ":textures/entity/LMRBMob.png");

    public RenderLMRBMob(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }


    protected ResourceLocation getEntityTexture(EntityLMRBMob entity) {
        return mobTextures;
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.getEntityTexture((EntityLMRBMob) entity);
    }

}
