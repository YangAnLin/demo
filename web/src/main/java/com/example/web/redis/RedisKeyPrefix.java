package com.example.web.redis;

public class RedisKeyPrefix {

    private final static String BUSINESS = "business:";

    private final static String CHANNEL_GAME = "CHANNEL_GAME:";

    public static String getKindName(Integer kindId) {
        return CHANNEL_GAME + kindId;
    }
    
    public static String getApiWalletSwitch(Integer agentId) {
        return "api:getApiWalletSwitch:" + agentId;
    }

    public static String getGrUserSaveScore(int userId) {
        return BUSINESS + "grUserSaveScore:" + userId;
    }

    public static String getWriteGameBet(String channelUniqueId) {
        return BUSINESS + "writeGameBet:" + channelUniqueId;
    }

    /**
     * 存款加锁
     *
     * @param userId
     * @return
     */
    public static String getDepositLock(Integer userId) {
        return BUSINESS + "deposit:" + userId;
    }

    public static String getEfficacyAccountsChat(String key) {
        return BUSINESS + "efficacyAccountsChat:" + key;
    }

}
