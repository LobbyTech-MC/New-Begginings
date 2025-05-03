package me.slimeyderp.newbeginnings.armor_weapons;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Panda;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.slimeyderp.newbeginnings.NewBeginnings;
import me.slimeyderp.newbeginnings.tasks.PandaBazookaTask;

public class PandaBazooka extends NonDisenchantableSlimefunItem {

    public static final HashMap<UUID, Integer> pandaShootCooldown = new HashMap<>();

    public PandaBazooka(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
                        ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemUseHandler itemUseHandler = this::onItemRightClick;
        addItemHandler(itemUseHandler);
    }

    public void onItemRightClick(PlayerRightClickEvent e) {
        if (pandaShootCooldown.containsKey(e.getPlayer().getUniqueId())) {
            e.getPlayer().sendMessage(ChatColor.RED + "请稍等片刻。");
        } else {
            e.getPlayer().getWorld().playSound(e.getPlayer().getLocation(),
                    Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 1, 1);
            Panda flyingCrapPanda = (Panda) e.getPlayer().getWorld().spawnEntity(e.getPlayer().getLocation()
                            .add(e.getPlayer().getEyeLocation().getDirection().normalize())
                    , EntityType.PANDA);
            flyingCrapPanda.setCustomName(ChatColor.WHITE + "熊猫猫猫猫猫猫!!!!!!");
            flyingCrapPanda.setCustomNameVisible(true);
            Vector direction = e.getPlayer().getEyeLocation().getDirection().normalize();
            long secondsPassed = (System.currentTimeMillis() + 3000);
            pandaShootCooldown.put(e.getPlayer().getUniqueId(),
                    Bukkit.getScheduler().scheduleSyncRepeatingTask(NewBeginnings.getInstance(), new
                            PandaBazookaTask(flyingCrapPanda, e.getPlayer(), secondsPassed, e.getPlayer().getEyeLocation()
                            , direction), 0, 0));
        }
        e.cancel();
    }


}
