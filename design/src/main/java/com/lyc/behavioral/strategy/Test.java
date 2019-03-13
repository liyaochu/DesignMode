package com.lyc.behavioral.strategy;

import org.apache.commons.lang.StringUtils;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 11:22
 * @Description:
 */
public class Test {
   /* public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianpromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianpromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }*/

   /* public static void main(String[] args) {  //改善

        PromotionActivity promotionActivity = null;
        String promotionKey = "LIJIAN";
        if (StringUtils.equals(promotionKey, "LIJIAN")) {
            promotionActivity = new PromotionActivity(new LiJianpromotionStrategy());
        } else if (StringUtils.equals(promotionKey, "FANXIAN")) {
            promotionActivity = new PromotionActivity(new FanXianpromotionStrategy());
        }
        //为了避免频繁创造对象,这里结合促销的策略工厂,来使代码更合理
        promotionActivity.executePromotionStrategy();
    }*/


    public static void main(String[] args) {
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
