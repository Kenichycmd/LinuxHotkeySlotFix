package dev.kenichy.ubuntuslotfix;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

@Mod(modid = "ubuntuslotfix", name = "Linux Hotkey Slot Fix", version = "1.0", clientSideOnly = true, acceptedMinecraftVersions = "[1.8.9]")
public class LinuxHotkeySlotFix {

    private Minecraft mc;

    @EventHandler
    public void init(FMLInitializationEvent e) {
        mc = Minecraft.getMinecraft();
        MinecraftForge.EVENT_BUS.register(this);
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