package com.lyc.behavioral.strategy;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 10:53
 * @Description:
 */
public class ManJianpromotionStrategy implements  PromotionStrategy{
    @Override
    public void dopromotion() {
        System.out.println("满200-20");
    }
}
