package net.jumpingjaguar.letsmodreboot.client.settings;

import net.jumpingjaguar.letsmodreboot.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyBindings {
    public static KeyBinding openBackpack = new KeyBinding(Names.Keys.OPENBACKPACK, Keyboard.KEY_B, Names.Keys.CATEGORY);
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY);
}
