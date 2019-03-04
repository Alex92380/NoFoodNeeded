package fr.alex92380.nofoodneeded;

import org.bukkit.Bukkit;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class NOFoodNeeded implements Listener {
@EventHandler
public void onLostFood(FoodLevelChangeEvent event) {
	HumanEntity player = event.getEntity();
	event.setCancelled(true);
	((Player) player).setFoodLevel(20);
	
}
}
