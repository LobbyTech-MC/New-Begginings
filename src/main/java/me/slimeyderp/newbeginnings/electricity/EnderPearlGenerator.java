package me.slimeyderp.newbeginnings.electricity;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;

public class EnderPearlGenerator extends AGenerator {

    public EnderPearlGenerator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    public int getEnergyProduction() {
        return 0;
    }

    public int getCapacity() {
        return 0;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(4,
                new ItemStack(Material.ENDER_PEARL)));
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.ENDER_EYE);
    }

    @Override
    public String getInventoryTitle() {
        return "&c末影珍珠发电机";
    }

}
