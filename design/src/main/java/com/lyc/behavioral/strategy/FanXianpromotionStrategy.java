package com.lyc.behavioral.strategy;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 10:54
 * @Description:
 */
public class FanXianpromotionStrategy implements PromotionStrategy{
    @Override
    public void dopromotion() {
        System.out.println("返现金额,存到用户的钱包中");
    }
}
