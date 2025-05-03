package me.slimeyderp.newbeginnings;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import me.slimeyderp.newbeginnings.listeners.MainListener;
import me.slimeyderp.newbeginnings.materials.ExtraItemStack;
import me.slimeyderp.newbeginnings.materials.ExtraItems;
import me.slimeyderp.newbeginnings.resources.MythrilResource;


public class NewBeginnings extends JavaPlugin implements SlimefunAddon {

    private static NewBeginnings instance;

    public static NewBeginnings getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {

        instance = this;

        //Registering and giving atributtes to the items.

        enchantItems();
        registerItems();
        registerResearches();

        // Calling the listener to kick into action.
        new MainListener(this);

        //Reporting everything went well. Hooray! :D
        getLogger().info("New-Beginnings has loaded Successfully!");
        getLogger().info("Enjoy the plugin!");
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/balugaq/New-Begginings/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    // Registers all resources into SF Guide and the Geo-Miner.
    private void registerItems() {
        new MythrilResource().register();
        ExtraItems.MYTHRIL_ORE.register(this);
        ExtraItems.MYTHRILNEW.register(this);
        ExtraItems.MYTHRIL_HELMET.register(this);
        ExtraItems.MYTHRIL_CHESTPLATE.register(this);
        ExtraItems.MYTHRIL_CHESTPLATE_ELYTRA.register(this);
        ExtraItems.MYTHRIL_LEGGINGS.register(this);
        ExtraItems.MYTHRIL_BOOTS.register(this);
        ExtraItems.MYTHRIL_BLADE.register(this);
        ExtraItems.MYTHRIL_PICKAXE.register(this);
        ExtraItems.MYTHRIL_BOW.register(this);
        ExtraItems.SHULKER_SHELL.register(this);
        ExtraItems.INFINITE_FIREWORK.register(this);
        ExtraItems.ENDER_PEARL_GENERATOR_1.register(this);
        ExtraItems.ENDER_PEARL_GENERATOR_2.register(this);
        ExtraItems.NIGHTMARE_SUMMON.register(this);
        ExtraItems.NIGHTMARE_SHARD.register(this);
        ExtraItems.RADIANT_SHARD.register(this);
        ExtraItems.RADIANT_HELMET.register(this);
        ExtraItems.RADIANT_CHESTPLATE.register(this);
        ExtraItems.RADIANT_CHESTPLATE_ELYTRA.register(this);
        ExtraItems.RADIANT_LEGGINGS.register(this);
        ExtraItems.RADIANT_BOOTS.register(this);
        ExtraItems.NIGHTMARE_HELMET.register(this);
        ExtraItems.NIGHTMARE_CHESTPLATE.register(this);
        ExtraItems.NIGHTMARE_CHESTPLATE_ELYTRA.register(this);
        ExtraItems.NIGHTMARE_LEGGINGS.register(this);
        ExtraItems.NIGHTMARE_BOOTS.register(this);
        ExtraItems.DREAM_NAIL.register(this);
        ExtraItems.PANDA_BAZOOKA.register(this);
    }

    //Enchants the items with their respective enchantments before registering.
    private void enchantItems() {

        ItemMeta mythrilHelmet = ExtraItemStack.MYTHRIL_HELMET_STACK.getItemMeta();
        mythrilHelmet.addEnchant(Enchantment.DURABILITY, 10, true);
        mythrilHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        mythrilHelmet.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        mythrilHelmet.addEnchant(Enchantment.OXYGEN, 5, true);
        mythrilHelmet.addEnchant(Enchantment.WATER_WORKER, 1, true);
        mythrilHelmet.setUnbreakable(true);
        ExtraItemStack.MYTHRIL_HELMET_STACK.setItemMeta(mythrilHelmet);

        ItemMeta mythrilChestplate = ExtraItemStack.MYTHRIL_CHESTPLATE_STACK.getItemMeta();
        mythrilChestplate.addEnchant(Enchantment.DURABILITY, 10, true);
        mythrilChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        mythrilChestplate.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        mythrilChestplate.setUnbreakable(true);
        ExtraItemStack.MYTHRIL_CHESTPLATE_STACK.setItemMeta(mythrilChestplate);

        ItemMeta mythrilChestplateElytra = ExtraItemStack.MYTHRIL_CHESTPLATE_ELYTRA_STACK.getItemMeta();
        mythrilChestplateElytra.addEnchant(Enchantment.DURABILITY, 10, true);
        mythrilChestplateElytra.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        mythrilChestplateElytra.setUnbreakable(true);
        ExtraItemStack.MYTHRIL_CHESTPLATE_ELYTRA_STACK.setItemMeta(mythrilChestplateElytra);

        ItemMeta mythrilLeggings = ExtraItemStack.MYTHRIL_LEGGINGS_STACK.getItemMeta();
        mythrilLeggings.addEnchant(Enchantment.DURABILITY, 10, true);
        mythrilLeggings.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        mythrilLeggings.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        mythrilLeggings.setUnbreakable(true);
        ExtraItemStack.MYTHRIL_LEGGINGS_STACK.setItemMeta(mythrilLeggings);

        ItemMeta mythrilBoots = ExtraItemStack.MYTHRIL_BOOTS_STACK.getItemMeta();
        mythrilBoots.addEnchant(Enchantment.DURABILITY, 10, true);
        mythrilBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        mythrilBoots.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        mythrilBoots.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
        mythrilBoots.setUnbreakable(true);
        ExtraItemStack.MYTHRIL_BOOTS_STACK.setItemMeta(mythrilBoots);

        ItemMeta mythrilBlade = ExtraItemStack.MYTHRIL_BLADE_STACK.getItemMeta();
        mythrilBlade.addEnchant(Enchantment.DURABILITY, 10, true);
        mythrilBlade.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
        mythrilBlade.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        mythrilBlade.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 3, true);
        mythrilBlade.setUnbreakable(true);
        ExtraItemStack.MYTHRIL_BLADE_STACK.setItemMeta(mythrilBlade);

        ItemMeta dreamNail = ExtraItemStack.DREAM_NAIL_STACK.getItemMeta();
        dreamNail.addEnchant(Enchantment.DURABILITY, 10, true);
        dreamNail.addEnchant(Enchantment.DAMAGE_ALL, 15, true);
        dreamNail.addEnchant(Enchantment.DAMAGE_UNDEAD, 15, true);
        dreamNail.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        dreamNail.setUnbreakable(true);
        ExtraItemStack.DREAM_NAIL_STACK.setItemMeta(dreamNail);

        ItemMeta mythrilPickaxe = ExtraItemStack.MYTHRIL_PICKAXE_STACK.getItemMeta();
        mythrilPickaxe.addEnchant(Enchantment.DURABILITY, 10, true);
        mythrilPickaxe.addEnchant(Enchantment.DIG_SPEED, 10, true);
        mythrilPickaxe.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
        mythrilPickaxe.setUnbreakable(true);
        ExtraItemStack.MYTHRIL_PICKAXE_STACK.setItemMeta(mythrilPickaxe);

        ItemMeta mythrilBow = ExtraItemStack.MYTHRIL_BOW_STACK.getItemMeta();
        mythrilBow.addEnchant(Enchantment.ARROW_DAMAGE, 7, true);
        mythrilBow.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        mythrilBow.addEnchant(Enchantment.DURABILITY, 10, true);
        mythrilBow.addEnchant(Enchantment.ARROW_FIRE, 3, true);
        mythrilBow.setUnbreakable(true);
        ExtraItemStack.MYTHRIL_BOW_STACK.setItemMeta(mythrilBow);

        ItemMeta infiniteFirework = ExtraItemStack.INFINITE_FIREWORK_STACK.getItemMeta();
        infiniteFirework.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        ExtraItemStack.INFINITE_FIREWORK_STACK.setItemMeta(infiniteFirework);

        ItemMeta radiantHelmet = ExtraItemStack.RADIANT_HELMET_STACK.getItemMeta();
        radiantHelmet.addEnchant(Enchantment.DURABILITY, 10, true);
        radiantHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        radiantHelmet.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
        radiantHelmet.addEnchant(Enchantment.OXYGEN, 10, true);
        radiantHelmet.addEnchant(Enchantment.WATER_WORKER, 1, true);
        radiantHelmet.setUnbreakable(true);
        ExtraItemStack.RADIANT_HELMET_STACK.setItemMeta(radiantHelmet);

        ItemMeta radiantChestplate = ExtraItemStack.RADIANT_CHESTPLATE_STACK.getItemMeta();
        radiantChestplate.addEnchant(Enchantment.DURABILITY, 10, true);
        radiantChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        radiantChestplate.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
        radiantChestplate.setUnbreakable(true);
        ExtraItemStack.RADIANT_CHESTPLATE_STACK.setItemMeta(radiantChestplate);

        ItemMeta radiantElytraChestplate = ExtraItemStack.RADIANT_CHESTPLATE_ELYTRA_STACK.getItemMeta();
        radiantElytraChestplate.addEnchant(Enchantment.DURABILITY, 10, true);
        radiantElytraChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 15, true);
        radiantElytraChestplate.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
        radiantElytraChestplate.setUnbreakable(true);
        ExtraItemStack.RADIANT_CHESTPLATE_ELYTRA_STACK.setItemMeta(radiantElytraChestplate);

        ItemMeta radiantLeggings = ExtraItemStack.RADIANT_LEGGINGS_STACK.getItemMeta();
        radiantLeggings.addEnchant(Enchantment.DURABILITY, 10, true);
        radiantLeggings.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        radiantLeggings.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
        radiantLeggings.setUnbreakable(true);
        ExtraItemStack.RADIANT_LEGGINGS_STACK.setItemMeta(radiantLeggings);

        ItemMeta radiantBoots = ExtraItemStack.RADIANT_BOOTS_STACK.getItemMeta();
        radiantBoots.addEnchant(Enchantment.DURABILITY, 10, true);
        radiantBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        radiantBoots.addEnchant(Enchantment.PROTECTION_FALL, 10, true);
        radiantBoots.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
        radiantBoots.setUnbreakable(true);
        ExtraItemStack.RADIANT_BOOTS_STACK.setItemMeta(radiantBoots);

        ItemMeta nightmareHelmet = ExtraItemStack.NIGHTMARE_HELMET_STACK.getItemMeta();
        nightmareHelmet.addEnchant(Enchantment.DURABILITY, 10, true);
        nightmareHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        nightmareHelmet.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
        nightmareHelmet.addEnchant(Enchantment.OXYGEN, 10, true);
        nightmareHelmet.addEnchant(Enchantment.WATER_WORKER, 1, true);
        nightmareHelmet.setUnbreakable(true);
        ExtraItemStack.NIGHTMARE_HELMET_STACK.setItemMeta(nightmareHelmet);

        ItemMeta nightmareChestplate =
                ExtraItemStack.NIGHTMARE_CHESTPLATE_STACK.getItemMeta();
        nightmareChestplate.addEnchant(Enchantment.DURABILITY, 10, true);
        nightmareChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        nightmareChestplate.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
        nightmareChestplate.setUnbreakable(true);
        ExtraItemStack.NIGHTMARE_CHESTPLATE_STACK.setItemMeta(nightmareChestplate);

        ItemMeta nightmareElytraChestplate = ExtraItemStack.NIGHTMARE_CHESTPLATE_ELYTRA_STACK.getItemMeta();
        nightmareElytraChestplate.addEnchant(Enchantment.DURABILITY, 10, true);
        nightmareElytraChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 15, true);
        nightmareElytraChestplate.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
        nightmareElytraChestplate.setUnbreakable(true);
        ExtraItemStack.NIGHTMARE_CHESTPLATE_ELYTRA_STACK.setItemMeta(nightmareElytraChestplate);

        ItemMeta nightmareLeggings = ExtraItemStack.NIGHTMARE_LEGGINGS_STACK.getItemMeta();
        nightmareLeggings.addEnchant(Enchantment.DURABILITY, 10, true);
        nightmareLeggings.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        nightmareLeggings.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
        nightmareLeggings.setUnbreakable(true);
        ExtraItemStack.NIGHTMARE_LEGGINGS_STACK.setItemMeta(nightmareLeggings);

        ItemMeta nightmareBoots = ExtraItemStack.NIGHTMARE_BOOTS_STACK.getItemMeta();
        nightmareBoots.addEnchant(Enchantment.DURABILITY, 10, true);
        nightmareBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        nightmareBoots.addEnchant(Enchantment.PROTECTION_FALL, 10, true);
        nightmareBoots.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
        nightmareBoots.setUnbreakable(true);
        ExtraItemStack.NIGHTMARE_BOOTS_STACK.setItemMeta(nightmareBoots);

    }

    private void registerResearches() {
        Research MYTHRIL_FORGING_RESEARCH = new Research(new NamespacedKey(this, "mythril_forging"),
                875094722, "秘银锻造", 32);
        MYTHRIL_FORGING_RESEARCH.addItems(
                ExtraItems.MYTHRILNEW, ExtraItems.MYTHRIL_ORE, ExtraItems.MYTHRIL_BLADE, ExtraItems.MYTHRIL_HELMET,
                ExtraItems.MYTHRIL_CHESTPLATE, ExtraItems.MYTHRIL_LEGGINGS, ExtraItems.MYTHRIL_BOOTS,
                ExtraItems.MYTHRIL_PICKAXE, ExtraItems.MYTHRIL_BOW, ExtraItems.SHULKER_SHELL);
        MYTHRIL_FORGING_RESEARCH.register();

        Research INFINITE_FIREWORK_RESEARCH = new Research(new NamespacedKey(this, "infinite_firework_research"),
                775043302, "无尽的烟花", 24);
        INFINITE_FIREWORK_RESEARCH.addItems(ExtraItems.INFINITE_FIREWORK);
        INFINITE_FIREWORK_RESEARCH.register();

        Research NIGHTMARE_BEINGS_RESEARCH = new Research(new NamespacedKey(this, "nightmare_beings"),
                949294955, "噩梦生物", 35);
        NIGHTMARE_BEINGS_RESEARCH.addItems(ExtraItems.RADIANT_SHARD, ExtraItems.NIGHTMARE_SHARD,
                ExtraItems.NIGHTMARE_SUMMON);
        NIGHTMARE_BEINGS_RESEARCH.register();

        Research END_GAME_EQUIPPEMENT_RESEARCH = new Research(new NamespacedKey(this, "end_game_equippement"),
                394842349, "终极游戏装备", 38);
        END_GAME_EQUIPPEMENT_RESEARCH.addItems(
                ExtraItems.DREAM_NAIL, ExtraItems.PANDA_BAZOOKA, ExtraItems.NIGHTMARE_BOOTS, ExtraItems.NIGHTMARE_LEGGINGS,
                ExtraItems.NIGHTMARE_CHESTPLATE, ExtraItems.NIGHTMARE_HELMET, ExtraItems.RADIANT_BOOTS,
                ExtraItems.RADIANT_LEGGINGS, ExtraItems.RADIANT_CHESTPLATE, ExtraItems.RADIANT_HELMET);
        END_GAME_EQUIPPEMENT_RESEARCH.register();

        Research ENDER_PEARL_GENERATOR_RESEARCH = new Research(new NamespacedKey(this,
                "ender_pearl_generator_research"),
                437465549, "末影珍珠发电机", 24);
        ENDER_PEARL_GENERATOR_RESEARCH.addItems(ExtraItems.ENDER_PEARL_GENERATOR_1, ExtraItems.ENDER_PEARL_GENERATOR_2);
        ENDER_PEARL_GENERATOR_RESEARCH.register();
    }
}
