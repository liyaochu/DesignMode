package com.lyc.structural.facade;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:15
 * @Description:
 */
public class ShipingService {
    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"进入物流系统");
       String shippingOrderNo="666";
       return shippingOrderNo;
    }
}
