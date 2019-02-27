package com.lyc.structural.facade;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 15:24
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift=new PointsGift("衣服");
        GiftExchangService giftExchangService=new GiftExchangService();
        giftExchangService.setQualifyService(new QualifyService());
        giftExchangService.setPointsPaymentService(new PointsPaymentService());
        giftExchangService.setShipingService(new ShipingService());
        giftExchangService.giftExchange(pointsGift);
    }
}
