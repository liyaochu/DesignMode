package com.lyc.structural.decorator.v1;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:47
 * @Description: 装饰者
 * 煎饼类
 */
public class Battercake {
    protected String getDesc(){
        return "煎饼";
    }
    protected int cost(){
        return 8;
    }
}
