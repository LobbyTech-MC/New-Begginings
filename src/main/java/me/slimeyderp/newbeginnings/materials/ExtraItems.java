package me.slimeyderp.newbeginnings.materials;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;
import me.slimeyderp.newbeginnings.NewCategory;
import me.slimeyderp.newbeginnings.armor_weapons.DreamNail;
import me.slimeyderp.newbeginnings.armor_weapons.ElytraChestplate;
import me.slimeyderp.newbeginnings.armor_weapons.MythrilBlade;
import me.slimeyderp.newbeginnings.armor_weapons.NonDisenchantableSlimefunItem;
import me.slimeyderp.newbeginnings.armor_weapons.PandaBazooka;
import me.slimeyderp.newbeginnings.electricity.EnderPearlGenerator;
import me.slimeyderp.newbeginnings.tools.InfiniteFirework;

public class ExtraItems {

    //This is the area where items are made, ready to be registered.

    public static final SlimefunItem MYTHRIL_ORE = new SlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_ORE_STACK,
            RecipeType.GEO_MINER,
            ExtraRecipes.EMPTY_RECIPE
    );
    public static final SlimefunItem MYTHRILNEW = new SlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_STACK,
            RecipeType.SMELTERY,
            ExtraRecipes.MYTHRIL_RECIPE
    );
    public static final NonDisenchantableSlimefunItem MYTHRIL_HELMET = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_HELMET_STACK,
            RecipeType.ARMOR_FORGE,
            ExtraRecipes.MYTHRIL_HELMET_RECIPE
    );
    public static final ElytraChestplate MYTHRIL_CHESTPLATE = new ElytraChestplate(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_CHESTPLATE_STACK,
            RecipeType.ARMOR_FORGE,
            ExtraRecipes.MYTHRIL_CHESTPLATE_RECIPE,
            false,
            ExtraItemStack.MYTHRIL_CHESTPLATE_ELYTRA_STACK
    );
    public static final ElytraChestplate MYTHRIL_CHESTPLATE_ELYTRA = new ElytraChestplate(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_CHESTPLATE_ELYTRA_STACK,
            RecipeType.NULL,
            ExtraRecipes.ELYTRA_RECIPE,
            true,
            ExtraItemStack.MYTHRIL_CHESTPLATE_STACK
    );
    public static final NonDisenchantableSlimefunItem MYTHRIL_LEGGINGS = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_LEGGINGS_STACK,
            RecipeType.ARMOR_FORGE,
            ExtraRecipes.MYTHRIL_LEGGINGS_RECIPE
    );
    public static final NonDisenchantableSlimefunItem MYTHRIL_BOOTS = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_BOOTS_STACK,
            RecipeType.ARMOR_FORGE,
            ExtraRecipes.MYTHRIL_BOOTS_RECIPE
    );
    public static final EnderPearlGenerator ENDER_PEARL_GENERATOR_1 = new EnderPearlGenerator(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.ENDER_PEARL_GENERATOR_1_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.ENDERPEARL_GENERATOR_1_RECIPE
    ) {
        @Override
        public int getEnergyProduction() {
            return 15;
        }

        @Override
        public int getCapacity() {
            return 128;
        }
    };
    public static final EnderPearlGenerator ENDER_PEARL_GENERATOR_2 = new EnderPearlGenerator(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.ENDER_PEARL_GENERATOR_2_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.ENDERPEARL_GENERATOR_2_RECIPE
    ) {
        @Override
        public int getEnergyProduction() {
            return 32;
        }

        @Override
        public int getCapacity() {
            return 256;
        }
    };
    public static final MythrilBlade MYTHRIL_BLADE = new MythrilBlade(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_BLADE_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.MYTHRIL_BLADE_RECIPE
    );
    public static final NonDisenchantableSlimefunItem MYTHRIL_PICKAXE = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_PICKAXE_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.MYTHRIL_PICKAXE_RECIPE
    );
    public static final NonDisenchantableSlimefunItem MYTHRIL_BOW = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.MYTHRIL_BOW_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.MYTHRIL_BOW_RECIPE
    );
    public static final VanillaItem SHULKER_SHELL = new VanillaItem(
            NewCategory.CUSTOM_CATEGORY,
            new ItemStack(Material.SHULKER_SHELL),
            "shulker_shell",
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.SHULKER_SHELL_RECIPE
    );
    public static final InfiniteFirework INFINITE_FIREWORK = new InfiniteFirework(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.INFINITE_FIREWORK_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.INFINITE_FIREWORK_RECIPE
    );
    public static final SlimefunItem NIGHTMARE_SUMMON = new SlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.NIGHTMARE_SUMMON_STACK,
            RecipeType.ANCIENT_ALTAR,
            ExtraRecipes.NIGHTMARE_SUMMON_RECIPE
    );
    public static final SlimefunItem NIGHTMARE_SHARD = new SlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.NIGHTMARE_SHARD_STACK,
            ExtraRecipetellers.NIGHTMARE_SHARD_RECIPETYPE,
            ExtraRecipes.EMPTY_RECIPE
    );
    public static final SlimefunItem RADIANT_SHARD = new SlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.RADIANT_SHARD_STACK,
            RecipeType.MAGIC_WORKBENCH,
            ExtraRecipes.RADIANT_SHARD_RECIPE
    );
    public static final NonDisenchantableSlimefunItem RADIANT_HELMET = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.RADIANT_HELMET_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.RADIANT_HELMET_RECIPE
    );
    public static final ElytraChestplate RADIANT_CHESTPLATE = new ElytraChestplate(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.RADIANT_CHESTPLATE_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.RADIANT_CHESTPLATE_RECIPE,
            false,
            ExtraItemStack.RADIANT_CHESTPLATE_ELYTRA_STACK
    );
    public static final ElytraChestplate RADIANT_CHESTPLATE_ELYTRA = new ElytraChestplate(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.RADIANT_CHESTPLATE_ELYTRA_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.ELYTRA_RECIPE,
            true,
            ExtraItemStack.RADIANT_CHESTPLATE_STACK
    );
    public static final NonDisenchantableSlimefunItem RADIANT_LEGGINGS = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.RADIANT_LEGGINGS_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.RADIANT_LEGGINGS_RECIPE
    );
    public static final NonDisenchantableSlimefunItem RADIANT_BOOTS = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.RADIANT_BOOTS_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.RADIANT_BOOTS_RECIPE
    );
    public static final NonDisenchantableSlimefunItem NIGHTMARE_HELMET = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.NIGHTMARE_HELMET_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.NIGHTMARE_HELMET_RECIPE
    );
    public static final ElytraChestplate NIGHTMARE_CHESTPLATE = new ElytraChestplate(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.NIGHTMARE_CHESTPLATE_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.NIGHTMARE_CHESTPLATE_RECIPE,
            false,
            ExtraItemStack.NIGHTMARE_CHESTPLATE_ELYTRA_STACK
    );
    public static final ElytraChestplate NIGHTMARE_CHESTPLATE_ELYTRA = new ElytraChestplate(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.NIGHTMARE_CHESTPLATE_ELYTRA_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.ELYTRA_RECIPE,
            true,
            ExtraItemStack.NIGHTMARE_CHESTPLATE_STACK
    );
    public static final NonDisenchantableSlimefunItem NIGHTMARE_LEGGINGS = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.NIGHTMARE_LEGGINGS_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.NIGHTMARE_LEGGINGS_RECIPE
    );
    public static final NonDisenchantableSlimefunItem NIGHTMARE_BOOTS = new NonDisenchantableSlimefunItem(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.NIGHTMARE_BOOTS_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.NIGHTMARE_BOOTS_RECIPE
    );
    public static final DreamNail DREAM_NAIL = new DreamNail(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.DREAM_NAIL_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.DREAM_NAIL_RECIPE
    );
    public static final PandaBazooka PANDA_BAZOOKA = new PandaBazooka(
            NewCategory.CUSTOM_CATEGORY,
            ExtraItemStack.PANDA_BAZOOKA_STACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ExtraRecipes.PANDA_BAZOOKA_RECIPE
    );
}
