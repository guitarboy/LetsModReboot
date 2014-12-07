package net.jumpingjaguar.letsmodreboot.mob;

import net.jumpingjaguar.letsmodreboot.init.ModItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityLMRBMob extends EntityAnimal {

    public EntityLMRBMob(World par1World) {
        super(par1World);
        this.setSize(0.3F, 0.4F);
        this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(2, new EntityAITempt(this, 0.7D, ModItems.mapleLeaf, false));
    }

    public boolean isAIEnabled() {
        return true;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0F);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entityAgeable) {
        return new EntityLMRBMob(worldObj);
    }
}
