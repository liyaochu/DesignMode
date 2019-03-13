package com.lyc.behavioral.strategy;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 11:20
 * @Description: 促销活动
 */
public class PromotionActivity  {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {   //构造器注入
        this.promotionStrategy = promotionStrategy;
    }
    public  void executePromotionStrategy(){
        promotionStrategy.dopromotion();
    }
}
