package com.lyc.structural.adapter.objectadapter;


/**
 * @Auther: Jhon Li
 * @Date: 2019/3/9 10:22
 * @Description:
 */
public class Adapter implements  Target {
    private  Adaptee adaptee=new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
