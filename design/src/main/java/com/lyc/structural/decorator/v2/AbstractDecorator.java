package com.lyc.structural.decorator.v2;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 16:25
 * @Description:
 */
public class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
