package net.jumpingjaguar.letsmodreboot.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.jumpingjaguar.letsmodreboot.client.settings.KeyBindings;
import net.jumpingjaguar.letsmodreboot.mob.EntityLMRBMob;
import net.jumpingjaguar.letsmodreboot.mob.ModelLMRBMob;
import net.jumpingjaguar.letsmodreboot.mob.RenderLMRBMob;

public class ClientProxy extends CommonProxy {

    public static void registerRendering() {
        RenderingRegistry.registerEntityRenderingHandler(EntityLMRBMob.class, new RenderLMRBMob(new ModelLMRBMob(), 0));
    }

    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
        ClientRegistry.registerKeyBinding(KeyBindings.openBackpack);
    }
}
