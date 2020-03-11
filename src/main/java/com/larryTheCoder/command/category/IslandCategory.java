/*
 * Adapted from the Wizardry License
 *
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

package com.larryTheCoder.command.category;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import com.larryTheCoder.ASkyBlock;
import com.larryTheCoder.utils.BlockUtil;

import java.util.Arrays;
import java.util.List;

public class IslandCategory extends SubCategory {

    public IslandCategory(ASkyBlock plugin) {
        super(plugin);
    }

    @Override
    public List<String> getCommands() {
        return Arrays.asList("create", "reset", "home", "sethome", "teleport");
    }

    @Override
    public boolean canUse(CommandSender sender, String command) {
        switch (command) {
            case "create":
                return sender.hasPermission("is.create") && sender.isPlayer();
            case "reset":
                return sender.hasPermission("is.command.reset") && sender.isPlayer();
            case "home":
            case "sethome":
                return sender.hasPermission("is.command.home") && sender.isPlayer();
            case "teleport":
                return sender.hasPermission("is.command.teleport") && sender.isPlayer();
            default:break;
        }

        return false;
    }

    @Override
    public String getDescription(String commandName) {
        switch (commandName.toLowerCase()) {
            case "create":
                return "开始创建新岛屿.";
            case "reset":
                return "重置原始岛.";
            case "home":
            case "sethome":
                return "设置你的岛主出生点位置.";
            case "teleport":
                return "传送到你的岛屿出生点位置.";
            default:
                return "NaN";
        }
    }


    @Override
    public void execute(CommandSender sender, String commandLabel, String[] args) {
        Player p = sender.getServer().getPlayer(sender.getName());

        switch (args[0].toLowerCase()) {
            case "create":
                getPlugin().getPanel().addIslandFormOverlay(p);
                break;
            case "reset":
                getPlugin().getPanel().addDeleteFormOverlay(p);
                break;
            case "home":
                // Only one home? Don't worry. we wont open the form overlay
                if (getPlugin().getIslandsInfo(sender.getName()).size() == 1) {
                    getPlugin().getGrid().homeTeleport(p);
                    break;
                }

                getPlugin().getPanel().addHomeFormOverlay(p);
                break;
            case "sethome":
                getPlugin().getFastCache().getIslandData(p.getLocation(), pd ->{
                    // Check if the ground is an air
                    if (!BlockUtil.isBreathable(p.clone().add(p.down()).getLevelBlock())) {
                        p.sendMessage(getLocale(p).groundNoAir);
                        return;
                    }
                    // Check if the player on their own island or not
                    if (pd != null && pd.getPlotOwner().equalsIgnoreCase(sender.getName())) {
                        pd.setHomeLocation(p.getLocation());
                        pd.saveIslandData();

                        p.sendMessage(getLocale(p).setHomeSuccess);
                    } else {
                        p.sendMessage(getLocale(p).errorNotOnIsland);
                    }
                });
                break;
            case "teleport":
                if (args.length != 2) {
                    break;
                }

                getPlugin().getIslandManager().teleportPlayer(p, args[1]);
                break;
            default:break;
        }
    }
}
