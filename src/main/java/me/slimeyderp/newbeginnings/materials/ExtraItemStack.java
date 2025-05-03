package me.slimeyderp.newbeginnings.materials;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

public class ExtraItemStack {

    //This area has all the Itemstacks of the items

    public static final SlimefunItemStack MYTHRIL_ORE_STACK = new SlimefunItemStack(
        "MYTHRIL_ORE",
        "6c12ff7dcad1a235a289bbb75541dc99fe3e5f4392fa16ee6c0a80fd19226a1",
        "&1秘银矿",
        "", "&b据说这是", "&b所有金属中最坚硬的。"
);
    public static final SlimefunItemStack MYTHRIL_STACK = new SlimefunItemStack(
        "MYTHRILNEW",
        Material.DIAMOND,
        "&1秘银",
        "", "&b据说这是", "&b所有金属中最坚硬的。"
);
    public static final SlimefunItemStack MYTHRIL_HELMET_STACK = new SlimefunItemStack(
        "MYTHRIL_HELMET",
        Material.DIAMOND_HELMET,
        "&1秘银头盔",
        "", "&b坚固到足以抵抗", "&b几乎所有伤害。"
);
    public static final SlimefunItemStack MYTHRIL_CHESTPLATE_STACK = new SlimefunItemStack(
        "MYTHRIL_CHESTPLATE",
        Material.DIAMOND_CHESTPLATE,
        "&1秘银胸甲（胸甲模式）",
        "", "&b坚固到足以抵抗", "&b几乎所有伤害。",
        "&a在主手中按住Shift右键", "&a切换到鞘翅模式"
);
    public static final SlimefunItemStack MYTHRIL_CHESTPLATE_ELYTRA_STACK = new SlimefunItemStack(
        "MYTHRIL_CHESTPLATE_ELYTRA",
        Material.ELYTRA,
        "&1秘银胸甲（鞘翅模式）",
        "", "&b坚固到足以抵抗", "&b几乎所有伤害。",
        "&a在主手中按住Shift右键", "&a切换到胸甲模式"
);
    public static final SlimefunItemStack MYTHRIL_LEGGINGS_STACK = new SlimefunItemStack(
        "MYTHRIL_LEGGINGS",
        Material.DIAMOND_LEGGINGS,
        "&1秘银护腿",
        "", "&b坚固到足以抵抗", "&b几乎所有伤害。"
);
    public static final SlimefunItemStack MYTHRIL_BOOTS_STACK = new SlimefunItemStack(
        "MYTHRIL_BOOTS",
        Material.DIAMOND_BOOTS,
        "&1秘银靴子",
        "", "&b坚固到足以抵抗", "&b几乎所有伤害。"
);
    public static final SlimefunItemStack MYTHRIL_BLADE_STACK = new SlimefunItemStack(
        "MYTHRIL_BLADE",
        Material.DIAMOND_SWORD,
        "&1秘银剑",
        "", "&b比千把地狱之刃还要锋利",
        "&a在主手中右键", "&a进行范围攻击", "&a（10秒冷却时间）"
);
    public static final SlimefunItemStack MYTHRIL_PICKAXE_STACK = new SlimefunItemStack(
        "MYTHRIL_PICKAXE",
        Material.DIAMOND_PICKAXE,
        "&1秘银镐",
        "", "&b石头的噩梦，这把工具", "&b可以摧毁一切！"
);
    public static final SlimefunItemStack MYTHRIL_BOW_STACK = new SlimefunItemStack(
        "MYTHRIL_BOW",
        Material.BOW,
        "&1秘银弓",
        "", "&b连莱戈拉斯都会为", "&b这件杰作感到骄傲！射倒他们！"
);
    public static final SlimefunItemStack INFINITE_FIREWORK_STACK = new SlimefunItemStack(
        "INFINITE_FIREWORK",
        Material.FIREWORK_ROCKET,
        "&1无尽火箭",
        "", "&b这种特殊的火箭似乎", "&b永远不会耗尽。搭配鞘翅使用！"
);
    public static final SlimefunItemStack ENDER_PEARL_GENERATOR_1_STACK = new SlimefunItemStack(
        "ENDER_PEARL_GENERATOR_1",
        "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730",
        "&1末影珍珠发电机",
        "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(128), LoreBuilder.powerPerSecond(30)
);
    public static final SlimefunItemStack ENDER_PEARL_GENERATOR_2_STACK = new SlimefunItemStack(
        "ENDER_PEARL_GENERATOR_2",
        "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730",
        "&1末影珍珠发电机 &7(&eII&7)",
        "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(64)
);
    public static final SlimefunItemStack NIGHTMARE_SHARD_STACK = new SlimefunItemStack(
        "NIGHTMARE_SHARD",
        Material.QUARTZ,
        "&8噩梦碎片",
        "", "&b一种惨淡的白色材料，", "&b蕴含着空洞的物质。"
);
    public static final SlimefunItemStack RADIANT_SHARD_STACK = new SlimefunItemStack(
        "RADIANT_SHARD",
        Material.QUARTZ,
        "&6光辉碎片",
        "", "&b一种惨淡的白色材料，", "&b蕴含着光辉的物质。"
);
    public static final SlimefunItemStack RADIANT_HELMET_STACK = new SlimefunItemStack(
        "RADIANT_HELMET",
        Material.DIAMOND_HELMET,
        "&6光辉头盔",
        "", "&b闪耀着", "&b千颗太阳的光芒。",
        "&a全套装备效果：使用剑击中目标将附加虚弱效果并额外造成+5伤害"
);
     static final SlimefunItemStack RADIANT_CHESTPLATE_STACK = new SlimefunItemStack(
        "RADIANT_CHESTPLATE",
        Material.DIAMOND_CHESTPLATE,
        "&6光辉胸甲（胸甲模式）",
        "", "&b闪耀着", "&b千颗太阳的光芒。",
        "&a全套装备效果：使用剑击中目标将附加虚弱效果并额外造成+5伤害"
);
    public static final SlimefunItemStack RADIANT_CHESTPLATE_ELYTRA_STACK = new SlimefunItemStack(
        "RADIANT_CHESTPLATE_ELYTRA",
        Material.ELYTRA,
        "&6光辉胸甲（鞘翅模式）",
        "", "&b闪耀着", "&b千颗太阳的光芒。",
        "&a全套装备效果：使用剑击中目标将附加虚弱效果并额外造成+5伤害"
);
    public static final SlimefunItemStack RADIANT_LEGGINGS_STACK = new SlimefunItemStack(
        "RADIANT_LEGGINGS",
        Material.DIAMOND_LEGGINGS,
        "&6光辉护腿",
        "", "&b闪耀着", "&b千颗太阳的光芒。",
        "&a全套装备效果：使用剑击中目标将附加虚弱效果并额外造成+5伤害"
);
    public static final SlimefunItemStack RADIANT_BOOTS_STACK = new SlimefunItemStack(
        "RADIANT_BOOTS",
        Material.DIAMOND_BOOTS,
        "&6光辉靴子",
        "", "&b闪耀着", "&b千颗太阳的光芒。",
        "&a全套装备效果：使用剑击中目标将附加虚弱效果并额外造成+5伤害"
);
    public static final SlimefunItemStack NIGHTMARE_HELMET_STACK = new SlimefunItemStack(
        "NIGHTMARE_HELMET",
        Material.DIAMOND_HELMET,
        "&8噩梦头盔",
        "", "&b吞噬周围所有", "&b的光线。",
        "&a全套装备效果：使用剑击中目标将附加凋零效果并额外造成+5伤害"
);
    public static final SlimefunItemStack NIGHTMARE_CHESTPLATE_STACK = new SlimefunItemStack(
        "NIGHTMARE_CHESTPLATE",
        Material.DIAMOND_CHESTPLATE,
        "&8噩梦胸甲（胸甲模式）",
        "", "&b吞噬周围所有", "&b的光线。",
        "&a全套装备效果：使用剑击中目标将附加凋零效果并额外造成+5伤害"
);
    public static final SlimefunItemStack NIGHTMARE_CHESTPLATE_ELYTRA_STACK = new SlimefunItemStack(
        "NIGHTMARE_CHESTPLATE_ELYTRA",
        Material.ELYTRA,
        "&8噩梦胸甲（鞘翅模式）",
        "", "&b吞噬周围所有", "&b的光线。",
        "&a全套装备效果：使用剑击中目标将附加凋零效果并额外造成+5伤害"
);
    public static final SlimefunItemStack NIGHTMARE_LEGGINGS_STACK = new SlimefunItemStack(
        "NIGHTMARE_LEGGINGS",
        Material.DIAMOND_LEGGINGS,
        "&8噩梦护腿",
        "", "&b吞噬周围所有", "&b的光线。",
        "&a全套装备效果：使用剑击中目标将附加凋零效果并额外造成+5伤害"
);
    public static final SlimefunItemStack NIGHTMARE_BOOTS_STACK = new SlimefunItemStack(
        "NIGHTMARE_BOOTS",
        Material.DIAMOND_BOOTS,
        "&8噩梦靴子",
        "", "&b吞噬周围所有", "&b的光线。",
        "&a全套装备效果：使用剑击中目标将附加凋零效果并额外造成+5伤害"
);
    public static final SlimefunItemStack NIGHTMARE_SUMMON_STACK = new SlimefunItemStack(
        "NIGHTMARE_SUMMON",
        Material.END_CRYSTAL,
        "&8召唤梦魇",
        "", "&c警告：制作此物品将", "&c召唤一个强大的梦魇Boss。",
        "&c请在开阔区域制作", "&c祝你好运，希望你能幸存下来。"
);
    public static final SlimefunItemStack DREAM_NAIL_STACK = new SlimefunItemStack(
        "DREAM_NAIL",
        Material.IRON_SWORD,
        "&6梦境之钉",
        "", "&b用这把武器打破", "&b梦境与现实之间的界限。",
        "&a在主手中右键", "&a进行影遁冲刺", "&a（5秒冷却时间）"
);
    public static final SlimefunItemStack PANDA_BAZOOKA_STACK = new SlimefunItemStack(
        "PANDA_BAZOOKA",
        Material.DIAMOND_HOE,
        "&8熊猫火箭筒",
        "", "&b向我的小朋友们问好吧！"
);
}
