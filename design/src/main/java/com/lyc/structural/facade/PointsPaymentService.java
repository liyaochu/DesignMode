package com.lyc.structural.facade;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:13
 * @Description:
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");

        return true;
    }
}
