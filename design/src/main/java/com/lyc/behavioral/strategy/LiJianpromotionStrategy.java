package com.lyc.behavioral.strategy;

import java.util.ArrayList;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 10:54
 * @Description:
 */
public class LiJianpromotionStrategy implements  PromotionStrategy {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();

        for (int i = 0,len =arrayList.size() ;i<len; i++) {

        }
    }

    @Override
    public void dopromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
