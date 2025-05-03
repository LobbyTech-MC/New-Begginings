package me.slimeyderp.newbeginnings.materials;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.slimeyderp.newbeginnings.NewBeginnings;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class ExtraRecipetellers {

    public static final RecipeType NIGHTMARE_SHARD_RECIPETYPE = new RecipeType(
            new NamespacedKey(NewBeginnings.getInstance(), "nightmare_recipe"),
            new SlimefunItemStack("NIGHTMARE_RECIPE", Material.WITHER_SKELETON_SKULL,
                    "&f通过击败梦魇Boss获得此物品")
    );

}
