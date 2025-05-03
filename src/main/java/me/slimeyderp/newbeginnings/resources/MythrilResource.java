package me.slimeyderp.newbeginnings.resources;

import org.bukkit.NamespacedKey;
import org.bukkit.World.Environment;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import me.slimeyderp.newbeginnings.NewBeginnings;
import me.slimeyderp.newbeginnings.materials.ExtraItemStack;

public class MythrilResource implements GEOResource {

    private final NamespacedKey key = new NamespacedKey(NewBeginnings.getInstance(), "mythril_ore");

    // This resource's supply is given by an EventHandler. Check out the listener for more info why.
    @Override
    public int getDefaultSupply(Environment environment, Biome biome) {
        return 0;
    }

    @Override
    public NamespacedKey getKey() {
        return key;
    }

    @Override
    public int getMaxDeviation() {
        return 2;
    }

    @Override
    public String getName() {
        return "秘银矿";
    }

    @Override
    public ItemStack getItem() {
        return ExtraItemStack.MYTHRIL_ORE_STACK.clone();
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return true;
    }

}