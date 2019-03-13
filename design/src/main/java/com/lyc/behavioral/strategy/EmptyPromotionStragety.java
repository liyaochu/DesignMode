package com.lyc.behavioral.strategy;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 11:39
 * @Description: 策略模式
 */
public class EmptyPromotionStragety implements PromotionStrategy {
    @Override
    public void dopromotion() {
        System.out.println("无促销");
    }
}
