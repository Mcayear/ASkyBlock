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
package com.larryTheCoder.locales;

import cn.nukkit.utils.Config;
import cn.nukkit.utils.TextFormat;
import com.larryTheCoder.ASkyBlock;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * All the text strings in the game sent to players This version enables
 * different players to have different locales.
 * <p>
 * If the player are null such as Console. The 'default' will be used as main
 * language.
 *
 * @author larryTheCoder
 * @author tastybento
 */
public final class ASlocales {

    private final static Set<String> TITLE_COLORS = new HashSet<>(Arrays.asList(
            "black",
            "dark_blue",
            "dark_green",
            "dark_aqua",
            "dark_red",
            "dark_purple",
            "gold",
            "gray",
            "dark_gray",
            "blue",
            "green",
            "aqua",
            "red",
            "light_purple",
            "yellow",
            "white"
    ));

    public String firstIslandFree = "§a你的第一个岛屿是免费的!";
    public String nextIslandPrice = "§a你需要花费 $§e[price] 购买下一个岛屿";
    public String adminHelpGenerate = "尝试创建新的世界.";
    public String adminHelpKick = "从岛屿世界踢出玩家.";
    public String adminHelpRename = "尝试重命名其他玩家的岛。";
    public String adminHelpSpawn = "设置岛屿的出生点!";
    public String adminHelpDelete = "删除其他玩家岛屿";
    public String adminHelpMessage = "为所有空岛用户添加消息";
    public String adminHelpClear = "刷新插件中的所有内存";
    public String adminHelpInfo = "检查给定播放器的信息";
    public String challengesHelp1 = "§a使用 /c <name> 查看有关挑战的信息.";
    public String challengesHelp2 = "§使用 /c complete <name> 试图完成挑战.";
    public String challengesName = "§e挑战名称";
    public String challengesLevel = "§e等级";
    public String challengesItemTakeWarning = "§c当你完成这个任务时，所有必需的物品都会被拿走!";
    public String challengesNotRepeatable = "§c这个任务不可重复!";
    public String challengesFirstTimeRewards = "§a首次奖励";
    public String challengesRepeatRewards = "§a重复奖励";
    public String challengesExpReward = "§e经验奖励";
    public String challengesMoneyReward = "§e金钱奖励";
    public String challengesToCompleteUse = "§e要完成此挑战，请使用";
    public String challengesInvalidChallengeName = "§c无效的名称! 使用  /c help 查看更多信息";
    public String challengesErrorItemsNotThere = "§c所有必需的物品必须在您的岛上靠近您!";
    public String errorMaxReset = "§c你已经达到了岛屿的极限.";
    public String errorUnknownPlayer = "§c未知玩家.";
    public String errorNoPermission = "§c你没有执行此指令权限!";
    public String errorNoIsland = "§c你没有任何岛屿!";
    public String errorNoIslandOther = "§c这个玩家没有岛屿!";
    public String errorChallengeDoesNotExist = "挑战不存在或已完成";
    public String completeChallengeCompleted = "[challengename]已完成 [name]";
    public String inviteSuccess = "§a领取成功";
    public String resetChallengeReset = "[challengename] 已重置[name]";
    private String errorCommandNotReady = "§c你现在不能用那个命令.";
    public String errorCommandBlocked = "§c你不能用这个命令.";
    public String errorOfflinePlayer = "§c该玩家离线或不存在.";
    public String errorNotOnIsland = "§c你不在你/别人的岛上!";
    private String errorTooLong = "§c太大了。最大大小为 [length].";
    private String errorTooShort = "§c太小了 最小大小为 [length].";
    public String adminSetSpawnOverride = "§c有一个玩家拥有这个plot。管理员重写此命令";
    public String errorTooSoon = "§c你需要等待 [secs] 秒 [cmd] 你的岛屿";
    public String errorUseInGame = "§c请在游戏内执行此指令.";
    public String errorWrongWorld = "§c在这个世界上你不能那样做.";
    private String errorUnknownWorld = "§c未知的世界。可能的世界是:";
    public String errorMaxIsland = "§c抱歉，你不能再在这个世界上建立岛屿了";
    public String errorNotPending = "§c没有邀请！稍后再试";
    public String errorNotPending2 = "§c玩家[player]的邀请到期了..";
    public String errorInTeam = "§c这个玩家 [player] 已经在队伍中了!";
    public String errorBlockedByAPI = "§c使用API的插件阻止了此操作.";
    public String errorKickOwner = "§c你不能把自己踢出自己的小岛!";
    public String errorQuit = "§c你不能退出自己的小岛，请执行 /is reset 清空自己的岛屿!";
    public String successQuit = "§a你成功离开 [player] 的岛屿!";
    public String errorAdminOnly = "§c你不能把管理员从你的岛上踢出去!";
    public String errorFailedNormal = "§c无效或错误的参数";
    public String errorFailedCritical = "§c尝试此命令失败。联系管理员!";
    public String errorLevelGenerated = "§c级别已生成";
    public String errorNotEnoughMoney = "§c你没有足够的钱！默认价格: $[price]";
    public String errorIslandPC = "§c无法尝试生成级别。PC型原理图";
    public String kickSuccess = "§a已将玩家 [player] 从空岛世界踢出!";
    public String kickByLeader = "§a你被 [player] 从空岛世界踢出!";
    public String createSuccess = "§a成功地为您创建了一个岛!";
    public String resetSuccess = "§a成功清除您的岛!";
    public String renameSuccess = "§a已成功重命名岛!";
    private String setWorldSuccess = "§a成功更改岛屿世界位置!";
    public String setHomeSuccess = "§a已成功更改岛主位置!";
    public String generalSuccess = "§a成功!";
    public String biomeChangeComplete = "§a把你的岛屿生物群落改成: [biome]";
    public String teleportDelay = "§a你将要在 {0} 秒后传送.";
    public String teleportCancelled = "§c传送取消";
    public String adminOverride = "§a您可以重写此命令";
    public String adminDeleteIslandError = "§c使用 §ldelete confirm §r§c删除玩家 [player] 岛屿.";
    public String adminDeleteIslandnoid = "§c无法识别岛.";
    public String adminDeleteIslandUse = "§r使用 §ldelete [name] §r§c删除玩家岛屿.";
    public String adminSetSpawnOwnedBy = "§c这个岛上的空间归 [name]";
    public String teamChatStatusOff = "§a队伍聊天 关闭";
    public String teamChatStatusOn = "§a队伍聊天 开启";
    public String teamChatNoTeamAround = "§c你的团队都不在线!";
    public String hangInThere = "§e坚持住。找到你最好的安全传送位置...";
    public String deleteRemoving = "§c删除 [name] 的岛屿中..";
    public String kickedFromOwner = "§e你被踢出了属于 [name] 的岛";
    public String kickedFromAdmin = "§e你被管理员踢出.";
    public String kickedFromTeam = "§e你被 [name]'队伍踢出";
    public String newsHeadline = "§a在你 §e离线§a期间:";
    public String newsEmpty = "§a今天没有你的留言。稍后再查看!";
    public String newNews = "§e欢迎回来！今天有 [count] 条新的消息! 使用 /is messages 查看";
    public String newInvitation = "§a来自新的 [player] 空岛邀请";
    public String acceptedFrom = "§e[player] 接受了你的邀请";
    public String acceptedTo = "§e你接受了[player] 的邀请!";
    public String panelCancelled = "§c你取消了你的岛屿面板!";
    public String islandSubTitle = "&e又好又舒适";
    public String islandDonate = "§a源代码由 §e@larryTheCoder";
    public String islandURL = "§aLink: http://github.com/larryTheCoder/ASkyBlock-Nukkit";
    private String islandSupport = "§a喜欢这个? 去 Github点星吧 (来自翻译酱吐槽: 在GitHub都搜不到你啦，怎么点)!";
    public String islandTitle = "[player] 的空岛";
    public String groundNoAir = "§e你认真的吗? 你不能将空气设置为家!";
    public String islandProtected = "§c这个空岛被保护了";
    public String panelIslandHeader = "§e欢迎来到岛屿小组。请填写这些表格.";
    public String panelIslandHome = "§d你的家名称.";
    public String panelIslandTemplate = "§d空岛模板";
    public String panelIslandDefault = "§e这些是你的岛屿设置.";
    public String panelIslandWorld = "§d选择你的世界";
    public String panelChallengesHeader = "§a选择你的配料！所有这些都是你要完成的任务！你将获得一个令人惊叹的奖品!";
    public String panelHomeHeader = "§d这里显示的是所有岛屿 请点击按键 [function]";
    public String panelSettingHeader = "§e你可以为你的岛屿做一个简单的改变。你可以随时设置你的岛.";
    public String panelProtectionHeader = "§e设置您的岛屿保护设置，这适用于您的岛屿的所有访客。某些功能可能不可用";
    public String deleteIslandSure = "§a你确定要删除你的岛吗？这是不可逆转的!";
    public String deleteIslandCancelled = "§c你刚刚取消了删除岛确认";
    public String errorResponseUnknown = "§e刚刚发生了一个错误。稍后再试";
    // Localization Strings
    private Config locale = null;
    private File localeFile = null;
    private final ASkyBlock plugin;
    private Locale localeObject;
    private final String localeName;
    private final int index;

    /**
     * Creates a locale object full of localized strings for a language
     *
     * @param plugin     ASkyBlock class
     * @param localeName - name of the yml file that will be used
     * @param index      The count of the file processed
     */
    public ASlocales(ASkyBlock plugin, String localeName, int index) {
        this.plugin = plugin;
        this.index = index;
        this.localeName = localeName;
        getLocale(localeName);
        loadLocale();
        if (!localeName.equalsIgnoreCase("locale")) {
            localeObject = new Locale(localeName.substring(0, 2), localeName.substring(3, 5));
        }
    }

    /**
     * @param localeName Locale name
     * @return locale Config object
     */
    private void getLocale(String localeName) {
        if (this.locale == null) {
            reloadLocale(localeName);
        }
    }

    /**
     * Reloads the locale file
     *
     * @param localeName Locale name
     */
    private void reloadLocale(String localeName) {
        // Make directory if it doesn't exist
        File localeDir = new File(plugin.getDataFolder() + File.separator + "locale");
        if (localeFile == null) {
            localeFile = new File(localeDir.getPath(), localeName + ".yml");
        }
        if (localeFile.exists()) {
            //plugin.getLogger().info("DEBUG: File exists!");
            locale = new Config(localeFile, Config.YAML);
        } else // Look for defaults in the jar
            if (plugin.getResource("locale/" + localeName + ".yml") != null) {
                plugin.saveResource("locale/" + localeName + ".yml", true);
                localeFile = new File(plugin.getDataFolder() + File.separator + "locale", localeName + ".yml");
                locale = new Config(localeFile, Config.YAML);
                //locale.setDefaults(defLocale);
            } else {
                // Use the default file
                localeFile = new File(plugin.getDataFolder() + File.separator + "locale", "locale.yml");
                if (localeFile.exists()) {
                    locale = new Config(localeFile, Config.YAML);
                } else // Look for defaults in the jar
                    if (plugin.getResource("locale/locale.yml") != null) {
                        plugin.saveResource("locale/locale.yml", true);
                        localeFile = new File(plugin.getDataFolder() + File.separator + "locale", "locale.yml");
                        locale = new Config(localeFile, Config.YAML);
                    } else {
                        plugin.getLogger().emergency("Could not find any locale file!");
                    }
            }
    }

    /**
     * Reloads the locale file
     */
    private void loadLocale() {
        this.firstIslandFree = TextFormat.colorize('&', this.locale.getString("firstIslandFree", firstIslandFree));
        this.nextIslandPrice = TextFormat.colorize('&', this.locale.getString("nextIslandPrice", nextIslandPrice));
        this.adminHelpGenerate = TextFormat.colorize('&', this.locale.getString("adminHelpGenerate", adminHelpGenerate));
        this.adminHelpKick = TextFormat.colorize('&', this.locale.getString("adminHelpKick", adminHelpKick));
        this.adminHelpRename = TextFormat.colorize('&', this.locale.getString("adminHelpRename", adminHelpRename));
        this.adminHelpSpawn = TextFormat.colorize('&', this.locale.getString("adminHelpSpawn", adminHelpSpawn));
        this.adminHelpDelete = TextFormat.colorize('&', this.locale.getString("adminHelpDelete", adminHelpDelete));
        this.errorMaxReset = TextFormat.colorize('&', this.locale.getString("errorMaxReset", errorMaxReset));
        this.errorUnknownPlayer = TextFormat.colorize('&', this.locale.getString("errorUnknownPlayer", errorUnknownPlayer));
        this.errorNoPermission = TextFormat.colorize('&', this.locale.getString("errorNoPermission", errorNoPermission));
        this.errorNoIsland = TextFormat.colorize('&', this.locale.getString("errorNoIsland", errorNoIsland));
        this.errorNoIslandOther = TextFormat.colorize('&', this.locale.getString("errorNoIslandOther", errorNoIslandOther));
        this.errorCommandNotReady = TextFormat.colorize('&', this.locale.getString("errorCommandNotReady", errorCommandNotReady));
        this.errorCommandBlocked = TextFormat.colorize('&', this.locale.getString("errorCommandBlocked", errorCommandBlocked));
        this.errorOfflinePlayer = TextFormat.colorize('&', this.locale.getString("errorOfflinePlayer", errorOfflinePlayer));
        this.errorNotOnIsland = TextFormat.colorize('&', this.locale.getString("errorNotOnIsland", errorNotOnIsland));
        this.errorTooLong = TextFormat.colorize('&', this.locale.getString("errorTooLong", errorTooLong));
        this.errorTooShort = TextFormat.colorize('&', this.locale.getString("errorTooShort", errorTooShort));
        this.adminSetSpawnOverride = TextFormat.colorize('&', this.locale.getString("adminSetSpawnOverride", adminSetSpawnOverride));
        this.errorTooSoon = TextFormat.colorize('&', this.locale.getString("errorTooSoon", errorTooSoon));
        this.errorUseInGame = TextFormat.colorize('&', this.locale.getString("errorUseInGame", errorUseInGame));
        this.errorWrongWorld = TextFormat.colorize('&', this.locale.getString("errorWrongWorld", errorWrongWorld));
        this.errorUnknownWorld = TextFormat.colorize('&', this.locale.getString("errorUnknownWorld", errorUnknownWorld));
        this.errorMaxIsland = TextFormat.colorize('&', this.locale.getString("errorMaxIsland", errorMaxIsland));
        this.errorNotPending = TextFormat.colorize('&', this.locale.getString("errorNotPending", errorNotPending));
        this.errorInTeam = TextFormat.colorize('&', this.locale.getString("errorInTeam", errorInTeam));
        this.errorBlockedByAPI = TextFormat.colorize('&', this.locale.getString("errorBlockedByAPI", errorBlockedByAPI));
        this.errorKickOwner = TextFormat.colorize('&', this.locale.getString("errorKickOwner", errorKickOwner));
        this.errorAdminOnly = TextFormat.colorize('&', this.locale.getString("errorAdminOnly", errorAdminOnly));
        this.errorFailedNormal = TextFormat.colorize('&', this.locale.getString("errorFailedNormal", errorFailedNormal));
        this.errorFailedCritical = TextFormat.colorize('&', this.locale.getString("errorFailedCritical", errorFailedCritical));
        this.errorLevelGenerated = TextFormat.colorize('&', this.locale.getString("errorLevelGenerated", errorLevelGenerated));
        this.errorNotEnoughMoney = TextFormat.colorize('&', this.locale.getString("errorNotEnoughMoney", errorNotEnoughMoney));
        this.errorIslandPC = TextFormat.colorize('&', this.locale.getString("errorIslandPC", errorIslandPC));
        this.kickSuccess = TextFormat.colorize('&', this.locale.getString("kickSuccess", kickSuccess));
        this.createSuccess = TextFormat.colorize('&', this.locale.getString("createSuccess", createSuccess));
        this.resetSuccess = TextFormat.colorize('&', this.locale.getString("resetSuccess", resetSuccess));
        this.renameSuccess = TextFormat.colorize('&', this.locale.getString("renameSuccess", renameSuccess));
        this.setWorldSuccess = TextFormat.colorize('&', this.locale.getString("setWorldSuccess", setWorldSuccess));
        this.setHomeSuccess = TextFormat.colorize('&', this.locale.getString("setHomeSuccess", setHomeSuccess));
        this.generalSuccess = TextFormat.colorize('&', this.locale.getString("generalSuccess", generalSuccess));
        this.biomeChangeComplete = TextFormat.colorize('&', this.locale.getString("biomeChangeComplete", biomeChangeComplete));
        this.teleportDelay = TextFormat.colorize('&', this.locale.getString("teleportDelay", teleportDelay));
        this.teleportCancelled = TextFormat.colorize('&', this.locale.getString("teleportCancelled", teleportCancelled));
        this.adminOverride = TextFormat.colorize('&', this.locale.getString("adminOverride", adminOverride));
        this.adminDeleteIslandError = TextFormat.colorize('&', this.locale.getString("adminDeleteIslandError", adminDeleteIslandError));
        this.adminDeleteIslandnoid = TextFormat.colorize('&', this.locale.getString("adminDeleteIslandnoid", adminDeleteIslandnoid));
        this.adminDeleteIslandUse = TextFormat.colorize('&', this.locale.getString("adminDeleteIslandUse", adminDeleteIslandUse));
        this.adminSetSpawnOwnedBy = TextFormat.colorize('&', this.locale.getString("adminSetSpawnOwnedBy", adminSetSpawnOwnedBy));
        this.teamChatStatusOff = TextFormat.colorize('&', this.locale.getString("teamChatStatusOff", teamChatStatusOff));
        this.teamChatStatusOn = TextFormat.colorize('&', this.locale.getString("teamChatStatusOn", teamChatStatusOn));
        this.teamChatNoTeamAround = TextFormat.colorize('&', this.locale.getString("teamChatNoTeamAround", teamChatNoTeamAround));
        this.hangInThere = TextFormat.colorize('&', this.locale.getString("hangInThere", hangInThere));
        this.deleteRemoving = TextFormat.colorize('&', this.locale.getString("deleteRemoving", deleteRemoving));
        this.kickedFromOwner = TextFormat.colorize('&', this.locale.getString("kickedFromOwner", kickedFromOwner));
        this.kickedFromAdmin = TextFormat.colorize('&', this.locale.getString("kickedFromAdmin", kickedFromAdmin));
        this.kickedFromTeam = TextFormat.colorize('&', this.locale.getString("kickedFromTeam", kickedFromTeam));
        this.newsHeadline = TextFormat.colorize('&', this.locale.getString("newsHeadline", newsHeadline));
        this.newsEmpty = TextFormat.colorize('&', this.locale.getString("newsEmpty", newsEmpty));
        this.newNews = TextFormat.colorize('&', this.locale.getString("newNews", newNews));
        this.newInvitation = TextFormat.colorize('&', this.locale.getString("newInvitation", newInvitation));
        this.acceptedFrom = TextFormat.colorize('&', this.locale.getString("acceptedFrom", acceptedFrom));
        this.acceptedTo = TextFormat.colorize('&', this.locale.getString("acceptedTo", acceptedTo));
        this.panelCancelled = TextFormat.colorize('&', this.locale.getString("panelCancelled", panelCancelled));
        this.islandSubTitle = TextFormat.colorize('&', this.locale.getString("islandSubTitle", islandSubTitle));
        this.islandDonate = TextFormat.colorize('&', this.locale.getString("islandDonate", islandDonate));
        this.islandURL = TextFormat.colorize('&', this.locale.getString("islandURL", islandURL));
        this.islandSupport = TextFormat.colorize('&', this.locale.getString("islandSupport", islandSupport));
        this.islandTitle = TextFormat.colorize('&', this.locale.getString("islandTitle", islandTitle));
        this.groundNoAir = TextFormat.colorize('&', this.locale.getString("groundNoAir", groundNoAir));
        this.islandProtected = TextFormat.colorize('&', this.locale.getString("islandProtected", islandProtected));
        this.panelIslandHeader = TextFormat.colorize('&', this.locale.getString("panelIslandHeader", panelIslandHeader));
        this.panelIslandHome = TextFormat.colorize('&', this.locale.getString("panelIslandHome", panelIslandHome));
        this.panelIslandTemplate = TextFormat.colorize('&', this.locale.getString("panelIslandTemplate", panelIslandTemplate));
        this.panelIslandDefault = TextFormat.colorize('&', this.locale.getString("panelIslandDefault", panelIslandDefault));
        this.panelIslandWorld = TextFormat.colorize('&', this.locale.getString("panelIslandWorld", panelIslandWorld));
        this.panelChallengesHeader = TextFormat.colorize('&', this.locale.getString("panelChallengesHeader", panelChallengesHeader));
        this.panelHomeHeader = TextFormat.colorize('&', this.locale.getString("panelHomeHeader", panelHomeHeader));
        this.panelSettingHeader = TextFormat.colorize('&', this.locale.getString("panelSettingHeader", panelSettingHeader));
        this.deleteIslandSure = TextFormat.colorize('&', this.locale.getString("deleteIslandSure", deleteIslandSure));
        this.deleteIslandCancelled = TextFormat.colorize('&', this.locale.getString("deleteIslandCancelled", deleteIslandCancelled));
        this.errorResponseUnknown = TextFormat.colorize('&', this.locale.getString("errorResponseUnknown", errorResponseUnknown));
    }

    /**
     * @return the languageName
     */
    public String getLanguageName() {
        if (localeObject == null) {
            return "unknown";
        }
        return localeObject.getDisplayLanguage(localeObject);
    }

    public String getCountryName() {
        if (localeObject == null) {
            return "unknown";
        }
        return localeObject.getDisplayCountry(localeObject);
    }

    public String getLocaleName() {
        return this.localeName;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }
}
