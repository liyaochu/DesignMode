package com.lyc.structural.adapter;



/**
 * @Auther: Jhon Li
 * @Date: 2019/3/9 11:07
 * @Description:这是对象适配器模式.只实现了接口
 */
public class AC220 {
    public int outputAC220V(){
        int output=220;
        System.out.println("输出交流电"+output+"v");
        return output;
    }
}
