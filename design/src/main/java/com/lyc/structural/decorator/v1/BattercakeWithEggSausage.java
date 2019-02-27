package com.lyc.structural.decorator.v1;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:50
 * @Description:
 */
public class BattercakeWithEggSausage extends Battercake {
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
