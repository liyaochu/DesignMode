package com.lyc.structural.facade;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 14:54
 * @Description: 积分礼物
 * 外观模式
 */
public class PointsGift {
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
