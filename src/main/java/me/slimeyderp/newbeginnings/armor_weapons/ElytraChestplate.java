package me.slimeyderp.newbeginnings.armor_weapons;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.slimeyderp.newbeginnings.NewBeginnings;

public class ElytraChestplate extends NonDisenchantableSlimefunItem {

    private final ItemStack replace;

    public ElytraChestplate(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
                            ItemStack[] recipe, boolean hidden, ItemStack replace) {
        super(category, item, recipeType, recipe);
        this.replace = replace;
        this.hidden = hidden;
    }

    @Override
    public void preRegister() {
        ItemUseHandler itemUseHandler = this::onItemRightClick;
        addItemHandler(itemUseHandler);
    }

    private void onItemRightClick(PlayerRightClickEvent e) {
        Player player = e.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        if (player.isSneaking()) {
            Bukkit.getScheduler().runTaskLater(NewBeginnings.getInstance(),
                    () -> handleShiftClick(player, item), 2);
        }
    }

    private void handleShiftClick(Player p, ItemStack i) {
        // If the player equipped the chestplate:

        if (p.getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
            p.getInventory().setChestplate(null);
        }

        if (replace.getType() == Material.ELYTRA) {
            p.sendMessage(ChatColor.YELLOW + "已启动鞘翅模式");
        } else {
            p.sendMessage(ChatColor.YELLOW + "已启动胸甲模式");
        }
        p.getInventory().setItemInMainHand(replace);

    }
}
