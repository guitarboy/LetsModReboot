package net.jumpingjaguar.letsmodreboot;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.jumpingjaguar.letsmodreboot.client.handler.KeyInputEventHandler;
import net.jumpingjaguar.letsmodreboot.handler.ConfigurationHandler;
import net.jumpingjaguar.letsmodreboot.init.ModBlocks;
import net.jumpingjaguar.letsmodreboot.init.ModItems;
import net.jumpingjaguar.letsmodreboot.init.Recipes;
import net.jumpingjaguar.letsmodreboot.mob.EntityLMRB;
import net.jumpingjaguar.letsmodreboot.proxy.ClientProxy;
import net.jumpingjaguar.letsmodreboot.proxy.IProxy;
import net.jumpingjaguar.letsmodreboot.reference.Reference;
import net.jumpingjaguar.letsmodreboot.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();
        ClientProxy.registerRendering();

        ModItems.init();
        ModBlocks.init();
        EntityLMRB.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialization Complete!");
    }
}
