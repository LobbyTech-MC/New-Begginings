package me.slimeyderp.newbeginnings.mobs;


import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Wither;

public class Nightmare {

    // I mean, it was obvious what was going on. It's just a tough af wither, with added health.

    public static void createNightmare(Location l) {

        Wither nightmare = (Wither) l.getWorld().spawnEntity(l, EntityType.WITHER);
        nightmare.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(2048);
        nightmare.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(55);
        nightmare.getAttribute(Attribute.GENERIC_ARMOR).setBaseValue(5);
        nightmare.setHealth(2048);
        nightmare.setCustomName(ChatColor.DARK_GRAY + "梦魇");
        nightmare.setCustomNameVisible(true);
    }
}