package com.lyc.structural.adapter;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/9 11:10
 * @Description: 这是对象适配器模式,只实现了接口
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220=new AC220();
    @Override
    public int outputDC5v() {
        int adapterInput = ac220.outputAC220V();
        //变压器
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入Ac:"+adapterInput+"V"+"输出为DC:"+adapterOutput);
        return adapterOutput;
    }
}
