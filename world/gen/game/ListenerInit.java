package game;
import core.support.observer.ObServer;
import core.support.function.*;
import core.gen.GofGenFile;

@GofGenFile
public final class ListenerInit{
	public static <K,P> void init(ObServer<K, P> ob){
		ob.reg("12292", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.seam.account.AccountManager.class))::_listener_HumanLoginFinish, 1);  
		ob.reg("8199", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.turnbasedsrv.combat.CombatManager.class))::_listener_StageHumanShow, 1);  
		ob.reg("28710", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_CompeteRankHighest, 1);  
		ob.reg("81921", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_DrawCard, 1);  
		ob.reg("24594", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_EquipAdvanced, 1);  
		ob.reg("4151", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_HumanDataLoadAllFinish, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12353", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_HumanLineUpCombatChange, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_HumanLvUp, 1);  
		ob.reg("33024", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_JoinLootMap, 1);  
		ob.reg("32787", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_JoinWorldBoss, 1);  
		ob.reg("102401", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_MainCityFightNum, 1);  
		ob.reg("98305", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_MainCityMaster, 1);  
		ob.reg("16388", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_PartnerUnlocked, 1);  
		ob.reg("28708", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_TowerPass, 1);  
		ob.reg("32788", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_WorldBossDamage, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_checkLimitTitle, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_initAchieveTitle, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achieveTitle.AchieveTitleManager.class))::_listener_initByHumanLevelUp, 1);  
		ob.reg("28710", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_CompeteRankHighest, 1);  
		ob.reg("81921", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_DrawCard, 1);  
		ob.reg("24594", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_EquipAdvanced, 1);  
		ob.reg("24593", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_EquipIntensify, 1);  
		ob.reg("24597", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_EquipRefineUp, 1);  
		ob.reg("94210", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_GodsLvUp, 1);  
		ob.reg("94211", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_GodsStarUp, 1);  
		ob.reg("94209", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_GodsUnlock, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_HumanLvUp, 1);  
		ob.reg("12328", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_HumanMoneyReduce, 1);  
		ob.reg("12337", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_HumanSkillTrain, 1);  
		ob.reg("12329", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_HumanSkillUp, 1);  
		ob.reg("28677", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_InstAnyPass, 1);  
		ob.reg("32787", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_JoinWorldBoss, 1);  
		ob.reg("32789", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_KillWorldBoss, 1);  
		ob.reg("16390", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_PartnerAdvanced, 1);  
		ob.reg("16389", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_PartnerLvUp, 1);  
		ob.reg("16391", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_PartnerStartUp, 1);  
		ob.reg("16388", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_PartnerUnlocked, 1);  
		ob.reg("28708", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::_listener_TowerPass, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::initAchievement, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.achievement.AchievementManager.class))::onHumanLevelUp, 1);  
		ob.reg("36867", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_ActConsumeGold, 1);  
		ob.reg("81921", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_ActDrawCard, 1);  
		ob.reg("81922", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_ActDrawCard_GoldTen, 1);  
		ob.reg("12290", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_ActHumanFirstLogin, 1);  
		ob.reg("12293", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_ActLoginFristToday, 1);  
		ob.reg("1", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_EVERY_MIN, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("4151", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_HumanDataLoadOther2, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_HumanLvUp, 1);  
		ob.reg("1376259", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_PayNotify, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_ResetDailyHourResetToFrist, 1);  
		ob.reg("65537", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activity.ActivityManager.class))::_listener_VipLvChange, 1);  
		ob.reg("28710", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_CompeteRankHighest, 1);  
		ob.reg("24594", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_EquipAdvanced, 1);  
		ob.reg("24593", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_EquipIntensify, 1);  
		ob.reg("94210", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_GodsLvUp, 1);  
		ob.reg("4151", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_HumanDataLoadAllFinish, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12329", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_HumanSkillUp, 1);  
		ob.reg("28677", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_InstAnyPass, 1);  
		ob.reg("16390", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_PartnerAdvanced, 1);  
		ob.reg("16391", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_PartnerStartUp, 1);  
		ob.reg("16388", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_PartnerUnlocked, 1);  
		ob.reg("1376259", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_PayNotify, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("28708", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_TowerPass, 1);  
		ob.reg("36868", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_UpdateSeviceActivity, 1);  
		ob.reg("12293", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::_listener_loginFirstToday, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::initActivitySeven, 1);  
		ob.reg("1376262", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::onEventChargeGold, 1);  
		ob.reg("24596", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::onEventHumanEquipRefine, 1);  
		ob.reg("12337", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::onEventHumanSkillTrainSave, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.activitySeven.ActivitySevenManager.class))::onHumanUpgrade, 1);  
		ob.reg("4097", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.common.GameServiceManager.class))::_listener_GameStartUpBefore, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.compete.CompeteManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12294", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.compete.CompeteManager.class))::_listener_HumanLogout, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.drawCard.DrawCardManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.drawCard.DrawCardManager.class))::_listener_StageHumanEnter, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.drawCard.DrawCardManager.class))::initDrawCardData, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.drop.DropManager.class))::_listener_StageHumanEnter, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.drop.DropManager.class))::initDropData, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.fashion.FashionManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("24582$312", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.fashion.FashionManager.class))::_listener_ItemUseFashionHenshin, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.fashion.FashionManager.class))::initFashionInfo, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.friend.FriendManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.friend.FriendManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("12290", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.friend.FriendManager.class))::friendLogin, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.friend.FriendManager.class))::humanChange, 1);  
		ob.reg("12353", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.friend.FriendManager.class))::humanChange, 1);  
		ob.reg("65537", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.friend.FriendManager.class))::humanChange, 1);  
		ob.reg("12322", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.friend.FriendManager.class))::humanChange, 1);  
		ob.reg("12294", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.friend.FriendManager.class))::onHumanLogout, 1);  
		ob.reg("12292", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.guild.GuildInstManager.class))::onHumanLoginFinish, 1);  
		ob.reg("12353", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.guild.GuildManager.class))::_listener_HumanCombatChange, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.guild.GuildManager.class))::_listener_HumanLvUp, 1);  
		ob.reg("12322", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.guild.GuildManager.class))::_listener_HumanNameChange, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.guild.GuildManager.class))::_listener_ResetDaily, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.guild.GuildManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("12294", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.guild.GuildManager.class))::humanLogOut, 1);  
		ob.reg("12291", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.guild.GuildManager.class))::loginOperate, 1);  
		ob.reg("28677", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanGlobalManager.class))::_listener_InstAnyPass, 1);  
		ob.reg("4148", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadBacklog, 1);  
		ob.reg("4129", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadBeginOne, 1);  
		ob.reg("4147", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadBuff, 1);  
		ob.reg("4145", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadExtInfo, 1);  
		ob.reg("4130", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadFinishOne, 1);  
		ob.reg("4133", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadOther2Begin, 1);  
		ob.reg("4134", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadOther2Finish, 1);  
		ob.reg("4131", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadOtherBegin, 1);  
		ob.reg("4132", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadOtherFinish, 1);  
		ob.reg("4146", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanDataLoadUnitProp, 1);  
		ob.reg("12294", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanLogout, 1);  
		ob.reg("12326", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_HumanMoneyChange, 1);  
		ob.reg("3211270", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_LoadHumanCultureTimes, 1);  
		ob.reg("20482", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_MonsterHpLoss, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("8197", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.human.HumanManager.class))::_listener_StageHumanEnter, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.humanSkill.HumanSkillManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.humanSkill.HumanSkillManager.class))::_listener_HumanLvUp, 1);  
		ob.reg("28678", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.humanSkill.HumanSkillManager.class))::_listener_PassInst, 1);  
		ob.reg("65537", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.humanSkill.HumanSkillManager.class))::_listener_VipLvUp, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.humanSkill.HumanSkillManager.class))::initHumanSkill, 1);  
		ob.reg("4151", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.immortalCave.CaveManager.class))::_listener_HumanDataLoadAllFinish, 1);  
		ob.reg("4099", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.immortalCave.CaveManager.class))::_listener_MergeOption, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.immortalCave.CaveManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.immortalCave.CaveManager.class))::_listener_StageHumanEnter, 1);  
		ob.reg("8197", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.instLootMap.InstLootMapManager.class))::_lisenter_LootMapEnter, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.instResource.InstResManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.instResource.InstResManager.class))::_listener_ResetDaily, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.instResource.InstResManager.class))::initInstRes, 1);  
		ob.reg("8197", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.instWorldBoss.InstWorldBossManager.class))::_listener_StageHumanEnter, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.instance.InstanceManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.instance.InstanceManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("73729$addWhileList", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::addWhileList, 1);  
		ob.reg("73729$closeOperateActivity", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::closeOperateActivity, 1);  
		ob.reg("73729$unSendFillMail", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::deleteFillMail, 1);  
		ob.reg("73729$deleteWhileList", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::deleteWhileList, 1);  
		ob.reg("73729$humanInfo", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::findHumanInfo, 1);  
		ob.reg("73729$getWhileList", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::getWhileList, 1);  
		ob.reg("73729$gmOpen", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::gmOpen, 1);  
		ob.reg("73729$gmStop", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::gmStop, 1);  
		ob.reg("73729$setVIP", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::humanVipLvUp, 1);  
		ob.reg("73729$inputCommand", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::inputCommand, 1);  
		ob.reg("73729$openOperateActivity", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::openOperateActivity, 1);  
		ob.reg("73729$seal", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::seal, 1);  
		ob.reg("73729$sendFillMail", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::sendFillMail, 1);  
		ob.reg("73729$sendMail", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::sendMail, 1);  
		ob.reg("73729$sendNotice", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::sendNotice, 1);  
		ob.reg("73729$setMaxOnline", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::setMaxOnline, 1);  
		ob.reg("73729$setWhileListStatus", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::setWhileListKey, 1);  
		ob.reg("73729$test", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::test, 1);  
		ob.reg("73729$unSeal", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_GM_Manager.class))::unSeal, 1);  
		ob.reg("77825", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.integration.PF_PAY_Manager.class))::onPay, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.item.ItemBagManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("24578", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.item.ItemBagManager.class))::_listener_ItemChangeAdd, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.item.ItemBodyManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.item.ItemBodyManager.class))::initDeafultHumanEquips, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.mail.MailManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12292", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.mail.MailManager.class))::onHumanLoginFinish, 1);  
		ob.reg("4150", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.maincity.MainCityManager.class))::_listener_HumanDataLoadOther2, 1);  
		ob.reg("32789", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.maincity.MainCityManager.class))::_listener_worldbossCastellan, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.maincity.MainCityManager.class))::cleanRedPacket, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.maincity.MainCityManager.class))::laodRedPack, 1);  
		ob.reg("4098", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.merge.MergeManager.class))::_listener_GameStartUpFinish, 1);  
		ob.reg("1", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.offline.OffilineGlobalManager.class))::updateHumanSimple, 1);  
		ob.reg("4151", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.partner.PartnerManager.class))::_listener_HumanDataLoadAllFinish, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.partner.PartnerManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.partner.PartnerManager.class))::openServantLock, 1);  
		ob.reg("28677", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.partner.PartnerManager.class))::openServantLock, 1);  
		ob.reg("12325", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.partner.PartnerPlusManager.class))::_listener_HumanCombatChange, 1);  
		ob.reg("24582$401", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.partner.PartnerPlusManager.class))::_listener_ItemUse, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.payment.PaymentManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12290", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.payment.PaymentManager.class))::_listener_HumanFirstLogin, 1);  
		ob.reg("1376259", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.payment.PaymentManager.class))::_listener_PAY, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.payment.PaymentManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("65537", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.payment.PaymentManager.class))::humanVipLevelChange, 1);  
		ob.reg("12292", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.payment.PaymentManager.class))::onHumanLoginFinish, 1);  
		ob.reg("24582", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.payment.PaymentManager.class))::onItemHpUse, 1);  
		ob.reg("1376262", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.payment.PaymentManager.class))::onPayNotifyHttps, 1);  
		ob.reg("36866", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_ActShopBuy, 1);  
		ob.reg("28709", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_CompeteStart, 1);  
		ob.reg("65553", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_DailyActBuy, 1);  
		ob.reg("65554", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_DailyCoinBuy, 1);  
		ob.reg("81921", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_DrawCard, 1);  
		ob.reg("24596", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_EquipRefine, 1);  
		ob.reg("94212", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_GodsLvUp, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_HumanLvUp, 1);  
		ob.reg("12328", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_HumanMoneyReduce, 1);  
		ob.reg("12336", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_HumanSkillTrain, 1);  
		ob.reg("12329", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_HumanSkillUp, 1);  
		ob.reg("33024", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_JoinLootMap, 1);  
		ob.reg("102401", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_MainCityFightNum, 1);  
		ob.reg("28677", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_RepPassAny, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("28707", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_TowerEnter, 1);  
		ob.reg("32787", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::_listener_WorldBoss, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.quest.QuestDailyManager.class))::initQuestDaily, 1);  
		ob.reg("12325", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.rank.RankManager.class))::_listener_HumanCombatChange, 1);  
		ob.reg("12292", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.rank.RankManager.class))::_listener_HumanLoginFinish, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.rank.RankManager.class))::_listener_HumanLvUp, 1);  
		ob.reg("12322", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.rank.RankManager.class))::_listener_HumanNameChange, 1);  
		ob.reg("28677", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.rank.RankManager.class))::_listener_InstAnyPass, 1);  
		ob.reg("65537", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.rank.RankManager.class))::_listener_VipChange, 1);  
		ob.reg("32772", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.rank.RankManager.class))::updateGuildRank, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.recharge.ActivityTimeRechargeManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("12289", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.recharge.ActivityTimeRechargeManager.class))::initData, 1);  
		ob.reg("1376259", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.recharge.ActivityTimeRechargeManager.class))::payEevent, 1);  
		ob.reg("12321", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.recharge.ActivityTimeRechargeManager.class))::startCountDown, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.rune.RuneManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("4149", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.shop.ShopManager.class))::_listener_HumanDataLoadOther, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.shop.ShopManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("4097", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.stage.StageManager.class))::_listener_GameStartUpBefore, 1);  
		ob.reg("12291", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.team.TeamManager.class))::_listener_HumanLogin, 1);  
		ob.reg("12294", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.team.TeamManager.class))::_listener_HumanLogout, 1);  
		ob.reg("4150", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.tower.TowerManager.class))::_listener_HumanDataLoadOther2, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.tower.TowerManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("10001", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.vip.VipManager.class))::_listener_ResetDailyHour, 1);  
		ob.reg("12292", (GofFunction1<core.support.Param>)(ob.getTargetBean(game.worldsrv.vip.VipManager.class))::onHumanLoginFinish, 1);  
	}
}
