/*
 * Copyright (c) 2016-2020 larryTheCoder and contributors
 *
 * Permission is hereby granted to any persons and/or organizations
 * using this software to copy, modify, merge, publish, and distribute it.
 * Said persons and/or organizations are not allowed to use the software or
 * any derivatives of the work for commercial use or any other means to generate
 * income, nor are they allowed to claim this software as their own.
 *
 * The persons and/or organizations are also disallowed from sub-licensing
 * and/or trademarking this software without explicit permission from larryTheCoder.
 *
 * Any persons and/or organizations using this software must disclose their
 * source code and have it publicly available, include this license,
 * provide sufficient credit to the original authors of the project (IE: larryTheCoder),
 * as well as provide a link to the original project.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,FITNESS FOR A PARTICULAR
 * PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE
 * USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.larryTheCoder.utils;

/**
 * @author tastybento
 */
public enum SettingsFlag {
    /**
     * Water is acid above sea level
     */
    ACID_DAMAGE("酸性伤害(酸雨酸水)", 1),
    /**
     * Anvil use
     * [Added]
     */
    ANVIL("使用铁砧", 2),
    /**
     * Armor stand use
     * [Not yet implemented]
     */
    ARMOR_STAND("使用盔甲架", 3),
    /**
     * Beacon use
     * [Not yet implemented]
     */
    BEACON("使用信标", 4),
    /**
     * Bed use
     * [Added]
     */
    BED("使用床", 5),
    /**
     * Can break blocks
     * [Added]
     */
    BREAK_BLOCKS("破坏方块", 6),
    /**
     * Can place blocks
     * [Added]
     */
    PLACE_BLOCKS("放置方块", 7),
    /**
     * Can breed animals
     * [No option to use]
     */
    BREEDING("繁殖动物(喂养)", 8),
    /**
     * Can use brewing stand
     * [Added]
     */
    BREWING("使用酿造台", 9),
    /**
     * Can empty or fill buckets
     * [Added]
     */
    BUCKET("填充/装满 桶", 10),
    /**
     * Can collect lava
     * [Added]
     */
    COLLECT_LAVA("收集岩浆", 11),
    /**
     * Can collect water
     * [Added]
     */
    COLLECT_WATER("收集水", 12),
    /**
     * Can open chests or hoppers or dispensers
     * [Added]
     */
    CHEST("使用箱子", 13),
    /**
     * Can use the work bench
     * [Added]
     */
    CRAFTING("使用工作台", 14),
    /**
     * Allow creepers to hurt players (but not damage blocks)
     */
    CREEPER_PAIN("苦力怕伤害", 15),
    /**
     * Can trample crops
     */
    CROP_TRAMPLE("践踏庄稼", 16),
    /**
     * Can open doors or trapdoors
     * [Added]
     */
    DOOR("使用门", 17),
    /**
     * Chicken eggs can be thrown
     * [Added]
     */
    EGGS("是否允许投掷鸡蛋", 18),
    /**
     * Can use the enchanting table
     * [Added]
     */
    ENCHANTING("使用附魔台", 19),
    /**
     * Can throw ender pearls
     */
    ENDER_PEARL("使用末影珍珠", 20),
    /**
     * Can toggle enter/exit names to island
     * [Added]
     */
    ENTER_EXIT_MESSAGES("加入退出岛是否提示", 21),
    /**
     * Fire use/placement in general
     * [Added]
     */
    FIRE("使用打火石放火", 22),
    /**
     * Can extinguish fires by punching them
     * [Added]
     */
    FIRE_EXTINGUISH("是否灭火", 23),
    /**
     * Allow fire spread
     * [No way to use]
     */
    FIRE_SPREAD("是否允许火蔓延", 24),
    /**
     * Can use furnaces
     * [Added]
     */
    FURNACE("使用熔炉", 25),
    /**
     * Can use gates
     * [Added]
     */
    GATE("使用栅栏门", 26),
    /**
     * Can hurt friendly mobs, e.g. cows
     */
    HURT_MOBS("伤害生物", 27),
    /**
     * Can hurt monsters
     */
    HURT_MONSTERS("伤害怪物", 28),
    /**
     * Can leash or unleash animals
     */
    LEASH("使用栓绳牵引生物", 29),
    /**
     * Can use buttons or levers
     * [Added]
     */
    LEVER_BUTTON("使用按钮", 30),
    /**
     * Animals, etc. can spawn
     */
    MILKING("使用奶牛?", 31),
    /**
     * Monsters can spawn
     */
    MONSTER_SPAWN("生成怪物", 32),
    /**
     * Can operate jukeboxes, note boxes etc.
     * [Added]
     */
    MUSIC("允许使用音乐盒", 33),
    /**
     * Will activate pressure plates
     * [Added]
     */
    PRESSURE_PLATE("使用压力板", 34),
    /**
     * Can do PVP in the overworld
     */
    PVP("允许PVP", 35),
    /**
     * Spawn eggs can be used
     * [Added]
     */
    SPAWN_EGGS("使用刷怪蛋", 36),
    /**
     * Can shear sheep
     */
    SHEARING("剪羊毛..", 37),
    /**
     * Can trade with villagers
     */
    VILLAGER_TRADING("与村民交易", 38),
    /**
     * Visitors can drop items
     * [Added]
     */
    VISITOR_ITEM_DROP("访客丢弃物品", 39),
    /**
     * Visitors can pick up items
     */
    VISITOR_ITEM_PICKUP("访客拾取物品", 40);

    private int id;
    private String name;

    /**
     * Create a value for the enum
     *
     * @param name The name for the enum
     * @param id The id for the enum
     */
    SettingsFlag(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static SettingsFlag getFlag(int name) {
        for (SettingsFlag flag : SettingsFlag.values()) {
            if (flag.getId() == name) {
                return flag;
            }
        }
        return null;
    }

    public static SettingsFlag getFlag(String name) {
        return getFlag(Integer.parseInt(name));
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }
}
