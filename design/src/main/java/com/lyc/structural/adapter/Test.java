package com.lyc.structural.adapter;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/9 11:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        DC5 powerAdapter = new PowerAdapter();
        powerAdapter.outputDC5v();
    }
}
