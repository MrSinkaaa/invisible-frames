package ru.mrsinkaaa.invisibleframes;

import org.bukkit.plugin.java.JavaPlugin;
import ru.mrsinkaaa.invisibleframes.listeners.PlayerInteractEntityHandler;

public final class InvisibleFrames extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new PlayerInteractEntityHandler(), this);
    }

}
