package com.lyc.behavioral.strategy.service.impl;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 11:59
 * @Description:
 */
public class GoShiPin  implements Produce{
    @Override
    public void producrShiPin() {
        System.out.println("生产Go语言视频");
    }
}
