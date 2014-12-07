package net.jumpingjaguar.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.jumpingjaguar.letsmodreboot.block.BlockFlag;
import net.jumpingjaguar.letsmodreboot.block.BlockLMRB;
import net.jumpingjaguar.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMRB flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock(flag, "flag");
    }
}
