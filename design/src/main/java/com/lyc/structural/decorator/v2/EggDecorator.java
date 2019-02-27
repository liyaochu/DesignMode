package com.lyc.structural.decorator.v2;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 16:27
 * @Description:
 */
public class EggDecorator  extends  AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }
}
