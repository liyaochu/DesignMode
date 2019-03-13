package com.lyc.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 11:34
 * @Description: 促销工厂
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY = new HashMap<>();

    static {
        PROMOTION_STRATEGY.put(PromotionKey.LIJIAN, new LiJianpromotionStrategy());
        PROMOTION_STRATEGY.put(PromotionKey.FANXIN, new FanXianpromotionStrategy());
        PROMOTION_STRATEGY.put(PromotionKey.MANJIAN, new ManJianpromotionStrategy());
    }

    private static final PromotionStrategy NO_PROMOTION = new EmptyPromotionStragety();


    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String PromotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY.get(PromotionKey);

        return promotionStrategy == null ? NO_PROMOTION : promotionStrategy;
    }

    private interface  PromotionKey{
         String LIJIAN="LIJIAN";
        String FANXIN="FANXIAN";
        String MANJIAN="MANJINA";
    }

}
