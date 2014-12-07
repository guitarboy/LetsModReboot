package net.jumpingjaguar.letsmodreboot.mob;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.jumpingjaguar.letsmodreboot.LetsModReboot;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLMRB {

    public static void init() {
        RegisterEntity();
    }

    public static void RegisterEntity() {

        CreateEntity(EntityLMRBMob.class, "LMRBMob", 0x886A08, 0x0000FF);
    }

    public static void CreateEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, LetsModReboot.instance, 64, 1, true);
        EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);

        createEgg(randomId, solidColor, spotColor);
    }

    private static void createEgg(int randomId, int solidColor, int spotColor) {
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }
}
