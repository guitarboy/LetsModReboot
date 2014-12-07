package net.jumpingjaguar.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.jumpingjaguar.letsmodreboot.item.ItemBackpack;
import net.jumpingjaguar.letsmodreboot.item.ItemLMRB;
import net.jumpingjaguar.letsmodreboot.item.ItemMapleLeaf;
import net.jumpingjaguar.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMRB backpack = new ItemBackpack();
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(backpack, "backpack");
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
