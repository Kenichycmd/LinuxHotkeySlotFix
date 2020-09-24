package dev.kenichy.ubuntuslotfix;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

@Mod(modid = "ubuntuslotfix", name = "Linux Slot Hotkey Fix", version = "1.0", acceptedMinecraftVersions = "[1.7.10]")
public class LinuxSlotHotkeyFix {

    private Minecraft mc;

    @EventHandler
    public void init(FMLInitializationEvent e) {
        mc = Minecraft.getMinecraft();
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void keyPress(InputEvent.KeyInputEvent e) {
        if (Keyboard.isKeyDown(145)) {
            if (mc.gameSettings.keyBindsHotbar[1].getKeyCode()==3 ? true : false) mc.thePlayer.inventory.currentItem = 1;
        }
        if (Keyboard.isKeyDown(144)) {
            if (mc.gameSettings.keyBindsHotbar[5].getKeyCode()==7 ? true : false) mc.thePlayer.inventory.currentItem = 5;
        }
    }
}