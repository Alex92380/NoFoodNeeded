package fr.alex92380.nofoodneeded;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
@Override
public void onEnable() {
getServer().getPluginManager().registerEvents(new NOFoodNeeded(), this);
}
}
