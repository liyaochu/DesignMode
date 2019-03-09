package com.lyc.structural.adapter.classadapter;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/9 10:25
 * @Description: 这是
 */
public class Test {
    public static void main(String[] args) {
       Target target= new ConcreteTarget();  //这个是目标方法
       target.request();

        Target target1=new  Adapter(); //这个是被适配者的方法
        target1.request();
    }
}
