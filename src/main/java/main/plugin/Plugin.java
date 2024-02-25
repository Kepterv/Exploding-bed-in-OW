package main.plugin;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import javax.swing.text.Position;

public final class Plugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Nether bed plugin");

        getServer().getPluginManager().registerEvents(this, this);

    }


    @EventHandler //Event during logic
    public void Plugin(PlayerBedEnterEvent event){

        Location loc = event.getPlayer().getLocation();

                World w = loc.getWorld();
                w.createExplosion(loc, 300);


    }



    @EventHandler


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
