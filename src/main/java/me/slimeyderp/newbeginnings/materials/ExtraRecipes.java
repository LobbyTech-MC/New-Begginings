package me.slimeyderp.newbeginnings.materials;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ExtraRecipes {

    //This area contains all the recipes for the items to be able to register.

    public static final ItemStack[] EMPTY_RECIPE = {
            null, null, null,
            null, null, null,
            null, null, null
    };
    public static final ItemStack[] MYTHRIL_RECIPE = {
            ExtraItemStack.MYTHRIL_ORE_STACK, new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.CHORUS_FRUIT),
            SlimefunItems.ENDER_LUMP_3, null, null,
            null, null, null
    };
    public static final ItemStack[] MYTHRIL_HELMET_RECIPE = {
            SlimefunItems.LEAD_INGOT, ExtraItemStack.MYTHRIL_STACK, SlimefunItems.LEAD_INGOT,
            ExtraItemStack.MYTHRIL_STACK, null, ExtraItemStack.MYTHRIL_STACK,
            null, null, null
    };
    public static final ItemStack[] MYTHRIL_CHESTPLATE_RECIPE = {
            ExtraItemStack.MYTHRIL_STACK, null, ExtraItemStack.MYTHRIL_STACK,
            SlimefunItems.LEAD_INGOT, new ItemStack(Material.ELYTRA), SlimefunItems.LEAD_INGOT,
            ExtraItemStack.MYTHRIL_STACK, SlimefunItems.LEAD_INGOT, ExtraItemStack.MYTHRIL_STACK
    };
    public static final ItemStack[] MYTHRIL_LEGGINGS_RECIPE = {
            ExtraItemStack.MYTHRIL_STACK, SlimefunItems.LEAD_INGOT, ExtraItemStack.MYTHRIL_STACK,
            SlimefunItems.LEAD_INGOT, null, SlimefunItems.LEAD_INGOT,
            ExtraItemStack.MYTHRIL_STACK, null, ExtraItemStack.MYTHRIL_STACK
    };
    public static final ItemStack[] MYTHRIL_BOOTS_RECIPE = {
            null, null, null,
            SlimefunItems.LEAD_INGOT, null, SlimefunItems.LEAD_INGOT,
            ExtraItemStack.MYTHRIL_STACK, null, ExtraItemStack.MYTHRIL_STACK
    };
    public static final ItemStack[] MYTHRIL_BLADE_RECIPE = {
            null, ExtraItemStack.MYTHRIL_STACK, null,
            null, ExtraItemStack.MYTHRIL_STACK, null,
            null, new ItemStack(Material.STICK), null
    };
    public static final ItemStack[] ENDERPEARL_GENERATOR_1_RECIPE = {
            null, new ItemStack(Material.ENDER_PEARL), null,
            SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL,
            SlimefunItems.CORINTHIAN_BRONZE_INGOT,
            new ItemStack(Material.ENDER_EYE), SlimefunItems.CORINTHIAN_BRONZE_INGOT
    };
    public static final ItemStack[] ENDERPEARL_GENERATOR_2_RECIPE = {
            null, new ItemStack(Material.ENDER_EYE), null,
            ExtraItemStack.MYTHRIL_STACK, ExtraItemStack.ENDER_PEARL_GENERATOR_1_STACK, ExtraItemStack.MYTHRIL_STACK,
            SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.DRAGON_BREATH),
            SlimefunItems.REINFORCED_ALLOY_INGOT
    };
    public static final ItemStack[] MYTHRIL_PICKAXE_RECIPE = {
            ExtraItemStack.MYTHRIL_STACK, ExtraItemStack.MYTHRIL_STACK, ExtraItemStack.MYTHRIL_STACK,
            null, new ItemStack(Material.STICK), null,
            null, new ItemStack(Material.STICK), null
    };
    public static final ItemStack[] MYTHRIL_BOW_RECIPE = {
            ExtraItemStack.MYTHRIL_STACK, new ItemStack(Material.STICK), null,
            new ItemStack(Material.STRING), null, new ItemStack(Material.STICK),
            ExtraItemStack.MYTHRIL_STACK, new ItemStack(Material.STICK), null
    };
    public static final ItemStack[] SHULKER_SHELL_RECIPE = {
            ExtraItemStack.MYTHRIL_STACK, new ItemStack(Material.ENDER_PEARL), ExtraItemStack.MYTHRIL_STACK,
            null, new ItemStack(Material.POPPED_CHORUS_FRUIT), null,
            null, null, null
    };
    public static final ItemStack[] RADIANT_SHARD_RECIPE = {
            ExtraItemStack.NIGHTMARE_SHARD_STACK, ExtraItemStack.MYTHRIL_ORE_STACK, null,
            null, null, null,
            null, null, null
    };
    public static final ItemStack[] RADIANT_HELMET_RECIPE = {
            null, null, null,
            ExtraItemStack.RADIANT_SHARD_STACK, SlimefunItems.GOLD_24K, ExtraItemStack.RADIANT_SHARD_STACK,
            SlimefunItems.GOLD_24K, ExtraItemStack.MYTHRIL_HELMET_STACK, SlimefunItems.GOLD_24K
    };
    public static final ItemStack[] RADIANT_CHESTPLATE_RECIPE = {
            ExtraItemStack.RADIANT_SHARD_STACK, ExtraItemStack.MYTHRIL_CHESTPLATE_ELYTRA_STACK,
            ExtraItemStack.RADIANT_SHARD_STACK,
            SlimefunItems.GOLD_24K, ExtraItemStack.RADIANT_SHARD_STACK, SlimefunItems.GOLD_24K,
            ExtraItemStack.RADIANT_SHARD_STACK, SlimefunItems.GOLD_24K, ExtraItemStack.RADIANT_SHARD_STACK
    };
    public static final ItemStack[] RADIANT_LEGGINGS_RECIPE = {
            ExtraItemStack.RADIANT_SHARD_STACK, SlimefunItems.GOLD_24K, ExtraItemStack.RADIANT_SHARD_STACK,
            SlimefunItems.GOLD_24K, ExtraItemStack.MYTHRIL_LEGGINGS_STACK, SlimefunItems.GOLD_24K,
            ExtraItemStack.RADIANT_SHARD_STACK, null, ExtraItemStack.RADIANT_SHARD_STACK
    };
    public static final ItemStack[] RADIANT_BOOTS_RECIPE = {
            null, null, null,
            SlimefunItems.GOLD_24K, ExtraItemStack.MYTHRIL_BOOTS_STACK, SlimefunItems.GOLD_24K,
            ExtraItemStack.RADIANT_SHARD_STACK, null, ExtraItemStack.RADIANT_SHARD_STACK
    };
    public static final ItemStack[] NIGHTMARE_HELMET_RECIPE = {
            null, null, null,
            ExtraItemStack.NIGHTMARE_SHARD_STACK, SlimefunItems.COMPRESSED_CARBON, ExtraItemStack.NIGHTMARE_SHARD_STACK,
            SlimefunItems.COMPRESSED_CARBON, ExtraItemStack.MYTHRIL_HELMET_STACK, SlimefunItems.COMPRESSED_CARBON
    };
    public static final ItemStack[] NIGHTMARE_CHESTPLATE_RECIPE = {
            ExtraItemStack.NIGHTMARE_SHARD_STACK, ExtraItemStack.MYTHRIL_CHESTPLATE_STACK,
            ExtraItemStack.NIGHTMARE_SHARD_STACK,
            SlimefunItems.COMPRESSED_CARBON, ExtraItemStack.NIGHTMARE_SHARD_STACK, SlimefunItems.COMPRESSED_CARBON,
            ExtraItemStack.NIGHTMARE_SHARD_STACK, SlimefunItems.COMPRESSED_CARBON, ExtraItemStack.NIGHTMARE_SHARD_STACK
    };
    public static final ItemStack[] NIGHTMARE_LEGGINGS_RECIPE = {
            ExtraItemStack.NIGHTMARE_SHARD_STACK, SlimefunItems.COMPRESSED_CARBON, ExtraItemStack.NIGHTMARE_SHARD_STACK,
            SlimefunItems.COMPRESSED_CARBON, ExtraItemStack.MYTHRIL_LEGGINGS_STACK, SlimefunItems.COMPRESSED_CARBON,
            ExtraItemStack.NIGHTMARE_SHARD_STACK, null, ExtraItemStack.NIGHTMARE_SHARD_STACK
    };
    public static final ItemStack[] NIGHTMARE_BOOTS_RECIPE = {
            null, null, null,
            SlimefunItems.COMPRESSED_CARBON, ExtraItemStack.MYTHRIL_BOOTS_STACK, SlimefunItems.COMPRESSED_CARBON,
            ExtraItemStack.NIGHTMARE_SHARD_STACK, null, ExtraItemStack.NIGHTMARE_SHARD_STACK
    };
    public static final ItemStack[] DREAM_NAIL_RECIPE = {
            null, ExtraItemStack.RADIANT_SHARD_STACK, null,
            null, ExtraItemStack.RADIANT_SHARD_STACK, null,
            ExtraItemStack.NIGHTMARE_SHARD_STACK, ExtraItemStack.MYTHRIL_BLADE_STACK, ExtraItemStack.NIGHTMARE_SHARD_STACK
    };
    public static final ItemStack[] NIGHTMARE_SUMMON_RECIPE = {
            SlimefunItems.GOLD_24K_BLOCK, ExtraItemStack.MYTHRIL_STACK, SlimefunItems.GOLD_24K_BLOCK,
            ExtraItemStack.MYTHRIL_STACK, new ItemStack(Material.NETHER_STAR), ExtraItemStack.MYTHRIL_STACK,
            SlimefunItems.GOLD_24K_BLOCK, ExtraItemStack.MYTHRIL_STACK, SlimefunItems.GOLD_24K_BLOCK
    };
    public static final ItemStack[] INFINITE_FIREWORK_RECIPE = {
            ExtraItemStack.MYTHRIL_STACK, new ItemStack(Material.GUNPOWDER), ExtraItemStack.MYTHRIL_STACK,
            new ItemStack(Material.PAPER), new ItemStack(Material.FIREWORK_ROCKET), new ItemStack(Material.PAPER),
            ExtraItemStack.MYTHRIL_STACK, new ItemStack(Material.GUNPOWDER), ExtraItemStack.MYTHRIL_STACK
    };
    public static final ItemStack[] PANDA_BAZOOKA_RECIPE = {
            ExtraItemStack.NIGHTMARE_SHARD_STACK, new ItemStack(Material.BAMBOO), ExtraItemStack.NIGHTMARE_SHARD_STACK,
            ExtraItemStack.RADIANT_SHARD_STACK, new ItemStack(Material.TNT), ExtraItemStack.RADIANT_SHARD_STACK,
            ExtraItemStack.NIGHTMARE_SHARD_STACK, ExtraItemStack.RADIANT_SHARD_STACK,
            ExtraItemStack.NIGHTMARE_SHARD_STACK
    };
    public static final ItemStack[] ELYTRA_RECIPE = {
            new ItemStack(Material.ELYTRA), new ItemStack(Material.ELYTRA), new ItemStack(Material.ELYTRA),
            new ItemStack(Material.ELYTRA), new ItemStack(Material.ELYTRA), new ItemStack(Material.ELYTRA),
            new ItemStack(Material.ELYTRA), new ItemStack(Material.ELYTRA), new ItemStack(Material.ELYTRA)
    };
}
