package com.lyc.structural.adapter.classadapter;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/9 10:22
 * @Description: 类的适配器模式是继承了类,然后是实现了接口
 */
public class Adapter extends Adaptee implements  Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
