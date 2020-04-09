package me.slimeyderp.newbeginnings.armor_weapons;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

import me.slimeyderp.newbeginnings.NewBeginnings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitTask;


import java.util.HashMap;
import java.util.List;
import java.util.UUID;


public class MythrilBlade extends NonDisenchantableSlimefunItem {

    private static HashMap<UUID, Integer> playerBladeCooldown = new HashMap<>();
    private static HashMap<UUID, BukkitTask> taskHashMap = new HashMap<>();

    public MythrilBlade(Category category, SlimefunItemStack item, RecipeType recipeType,
                        ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemUseHandler itemUseHandler = this::onItemRightClick;
        addItemHandler(itemUseHandler);
    }

    private void onItemRightClick(PlayerRightClickEvent e) {
        if (playerBladeCooldown.containsKey(e.getPlayer().getUniqueId())) {
            e.getPlayer().sendMessage(ChatColor.RED + "Can't use this ability yet! You need to wait " +
                (playerBladeCooldown.get(e.getPlayer().getUniqueId())) + " seconds.");
            e.cancel();
        } else {
            playerBladeCooldown.put(e.getPlayer().getUniqueId(), 10);
            List<Entity> entities = e.getPlayer().getNearbyEntities(5, 5, 5);
            for (Entity entity : entities) {
                if (entity instanceof LivingEntity) {
                    LivingEntity livingEntity = (LivingEntity) entity;
                    if (livingEntity.getHealth() > 10) {
                        livingEntity.damage(10);
                        livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,
                            200, 2));
                        livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,
                            200, 1));
                        livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER,
                            40, 2));
                    } else {
                        livingEntity.setHealth(0);
                    }
                }
            }
            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_GRAVEL_BREAK, 1, 1);
            spawnParticles(e.getPlayer());
            taskHashMap.put(e.getPlayer().getUniqueId(),
                Bukkit.getScheduler().runTaskTimer(NewBeginnings.getInstance(),
                    () -> timerCheck(e.getPlayer().getUniqueId()), 20, 20));
        }
    }

    private void spawnParticles(Player p) {
        for (float y = 0 ; y < 5 ; y += 0.5) {
            p.getWorld().spawnParticle(Particle.REDSTONE,
                p.getLocation().clone().add(5, y, 0), 1,
                new Particle.DustOptions(Color.LIME, 5));
            p.getWorld().spawnParticle(Particle.REDSTONE,
                p.getLocation().clone().add(-5, y, 0), 1,
                new Particle.DustOptions(Color.LIME, 5));
            p.getWorld().spawnParticle(Particle.REDSTONE,
                p.getLocation().clone().add(0, y, 5), 1,
                new Particle.DustOptions(Color.LIME, 5));
            p.getWorld().spawnParticle(Particle.REDSTONE,
                p.getLocation().clone().add(0, y, -5), 1,
                new Particle.DustOptions(Color.LIME, 5));
            p.getWorld().spawnParticle(Particle.REDSTONE,
                p.getLocation().clone().add(4, y, 4), 1,
                new Particle.DustOptions(Color.LIME, 5));
            p.getWorld().spawnParticle(Particle.REDSTONE,
                p.getLocation().clone().add(-4, y, -4), 1,
                new Particle.DustOptions(Color.LIME, 5));
            p.getWorld().spawnParticle(Particle.REDSTONE,
                p.getLocation().clone().add(4, y, -4), 1,
                new Particle.DustOptions(Color.LIME, 5));
            p.getWorld().spawnParticle(Particle.REDSTONE,
                p.getLocation().clone().add(-4, y, 4), 1,
                new Particle.DustOptions(Color.LIME, 5));
        }
    }

    private void timerCheck(UUID u) {
        if (playerBladeCooldown.get(u) != null) {
            playerBladeCooldown.replace(u, playerBladeCooldown.get(u) - 1);
            if (playerBladeCooldown.get(u) < 1) {
                playerBladeCooldown.remove(u);
                taskHashMap.get(u).cancel();
                taskHashMap.remove(u);
            }
        }
    }
}
