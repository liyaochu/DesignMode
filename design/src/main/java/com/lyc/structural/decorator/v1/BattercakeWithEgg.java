package com.lyc.structural.decorator.v1;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:48
 * @Description:
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加拉一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }

}
