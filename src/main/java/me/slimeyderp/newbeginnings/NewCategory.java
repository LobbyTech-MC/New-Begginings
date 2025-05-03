package me.slimeyderp.newbeginnings;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public final class NewCategory {

    public static final ItemGroup CUSTOM_CATEGORY = new ItemGroup(
            new NamespacedKey(NewBeginnings.getInstance(), "new_beginnings"),
            new CustomItemStack(Material.END_CRYSTAL, "新生")
    );

    private NewCategory() {
    }
}
