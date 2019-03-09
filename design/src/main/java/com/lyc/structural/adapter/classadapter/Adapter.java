package com.lyc.structural.adapter.classadapter;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/9 10:22
 * @Description:
 */
public class Adapter extends Adaptee implements  Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
