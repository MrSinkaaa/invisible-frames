package ru.mrsinkaaa.invisibleframes.listeners;

import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class PlayerInteractEntityHandler implements Listener {

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        Player p = event.getPlayer();

        if (event.getRightClicked() instanceof ItemFrame itemFrame && p.isSneaking()) {

            boolean wasEmpty = itemFrame.getItem().getType().isAir();
            if (!wasEmpty) {
                itemFrame.setVisible(!itemFrame.isVisible());
                itemFrame.setRotation(itemFrame.getRotation().rotateCounterClockwise());
            }
        }
    }

    @EventHandler
    public void onPlayerInteractEntity(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof ItemFrame itemFrame) {
            itemFrame.setVisible(true);

        }
    }

}
