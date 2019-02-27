package com.lyc.structural.decorator.v2;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:47
 * @Description: 装饰者
 * 煎饼类
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
