package com.lyc.behavioral.strategy.service.impl;

import com.lyc.behavioral.strategy.PromotionActivity;
import com.lyc.behavioral.strategy.service.ProductService;


/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 11:57
 * @Description:
 */
public class ProductServiceImpl implements ProductService {
    @Override
    public void produce(String key) {
        ProduceActivity produceActivity = new ProduceActivity(ProduceFactory.getProduce(key));
        produceActivity.doProduceActivity();
    }
}
