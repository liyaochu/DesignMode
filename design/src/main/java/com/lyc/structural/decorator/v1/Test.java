package com.lyc.structural.decorator.v1;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:51
 * @Description:  不易于扩展
 *
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake=new Battercake();
        System.out.println(battercake.getDesc()+" 销售价格: "+battercake);

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 销售价格: "+battercakeWithEgg);

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+" 销售价格: "+battercakeWithEggSausage);
    }
}
