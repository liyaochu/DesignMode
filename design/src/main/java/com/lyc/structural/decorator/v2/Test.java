package com.lyc.structural.decorator.v2;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 16:30
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake=new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake=  new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+" 销售价格: "+aBattercake.cost());
    }
}
