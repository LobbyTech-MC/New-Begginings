package me.slimeyderp.newbeginnings.armor_weapons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.slimeyderp.newbeginnings.NewBeginnings;
import me.slimeyderp.newbeginnings.listeners.MainListener;


public class DreamNail extends NonDisenchantableSlimefunItem {

    private static HashSet<UUID> playerUsing = new HashSet<>();
    private static HashMap<UUID, Integer> cooldownPlayer = new HashMap<>();
    private byte cooldownTimer;

    public DreamNail(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
                     ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemUseHandler itemUseHandler = this::onItemRightClick;
        addItemHandler(itemUseHandler);
    }

    private void onItemRightClick(PlayerRightClickEvent e) {
        if (playerUsing.contains(e.getPlayer().getUniqueId())) {
            e.getPlayer().sendMessage(ChatColor.RED + "你还需等待 " + cooldownTimer +
                    " 秒，才可再次发动技能");
        } else {
            playerUsing.add(e.getPlayer().getUniqueId());
            for (Entity entity : e.getPlayer().getNearbyEntities(5, 5, 5)) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addPotionEffect
                            (new PotionEffect(PotionEffectType.BLINDNESS, 40, 1));
                    ((LivingEntity) entity).addPotionEffect
                            (new PotionEffect(PotionEffectType.WITHER, 60, 5));
                    if (entity instanceof Player) {
                        entity.sendMessage(ChatColor.DARK_GRAY + "虚无将你穿透");
                    }
                }
            }
            e.getPlayer().setVelocity(e.getPlayer().getLocation().getDirection().multiply(10));
            MainListener.disableDamageForPlayer.add(e.getPlayer().getUniqueId());
            cooldownTimer = 5;
            Bukkit.getScheduler().runTaskLater(NewBeginnings.getInstance(),
                    () -> FinishDash(e.getPlayer()), 5);
            cooldownPlayer.put(e.getPlayer().getUniqueId(),
                    Bukkit.getScheduler().runTaskTimer(NewBeginnings.getInstance(),
                            () -> Cooldown(e.getPlayer()), 20, 20).getTaskId());

        }
    }

    private void FinishDash(Player p) {
        MainListener.disableDamageForPlayer.remove(p.getUniqueId());
        p.setVelocity(p.getLocation().getDirection().multiply(1));
    }

    private void Cooldown(Player p) {
        cooldownTimer--;
        if (cooldownTimer < 1) {
            playerUsing.remove(p.getUniqueId());
            Bukkit.getScheduler().cancelTask(cooldownPlayer.get(p.getUniqueId()));
        }
    }
}
