package com.lyc.structural.facade;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:08
 * @Description:
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验礼物的名字"+pointsGift.getName()+"积分资格通过");
        return  true;
    }
}
