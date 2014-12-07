package net.jumpingjaguar.letsmodreboot.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.jumpingjaguar.letsmodreboot.client.settings.KeyBindings;
import net.jumpingjaguar.letsmodreboot.reference.Key;
import net.jumpingjaguar.letsmodreboot.utility.LogHelper;

public class KeyInputEventHandler {
    private static Key getPressedKeyBinding() {
        if (KeyBindings.charge.isPressed()) {
            return Key.CHARGE;
        } else if (KeyBindings.release.isPressed()) {
            return Key.RELEASE;
        } else if (KeyBindings.openBackpack.isPressed()) {
            return Key.OPENBACKPACK;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        LogHelper.info(getPressedKeyBinding());
    }
}
