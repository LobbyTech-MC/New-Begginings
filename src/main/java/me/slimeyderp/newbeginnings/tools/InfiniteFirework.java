package me.slimeyderp.newbeginnings.tools;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.slimeyderp.newbeginnings.NewBeginnings;
import me.slimeyderp.newbeginnings.armor_weapons.NonDisenchantableSlimefunItem;
import me.slimeyderp.newbeginnings.materials.ExtraItemStack;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

public class InfiniteFirework extends NonDisenchantableSlimefunItem {

    public InfiniteFirework(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
                            ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemUseHandler itemUseHandler = this::onItemRightClick;
        addItemHandler(itemUseHandler);
    }

    private void onItemRightClick(PlayerRightClickEvent e) {
        Bukkit.getScheduler().runTaskLater(NewBeginnings.getInstance(),
                () -> e.getPlayer().getInventory().setItemInMainHand(ExtraItemStack.INFINITE_FIREWORK_STACK), 2);
    }
}
