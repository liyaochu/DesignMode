package com.lyc.structural.adapter.classadapter;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/9 10:21
 * @Description:
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget 目标方法");
    }
}
