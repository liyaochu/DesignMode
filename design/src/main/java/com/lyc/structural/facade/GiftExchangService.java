package com.lyc.structural.facade;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:18
 * @Description: 外观模式
 */
public class GiftExchangService {
    private QualifyService qualifyService;
    private PointsPaymentService pointsPaymentService;
    private ShipingService shipingService;

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShipingService(ShipingService shipingService) {
        this.shipingService = shipingService;
    }

    public void giftExchange(PointsGift pointsGift){
        if (qualifyService.isAvailable(pointsGift)){
            if (pointsPaymentService.pay(pointsGift)){
                String s = shipingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是: "+s);
            }
        }
    }
}
