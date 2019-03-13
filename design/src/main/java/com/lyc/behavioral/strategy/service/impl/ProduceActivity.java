package com.lyc.behavioral.strategy.service.impl;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 12:09
 * @Description:
 */
public class ProduceActivity {
    private Produce produce;

    public ProduceActivity(Produce produce) {
        this.produce = produce;
    }

    public void doProduceActivity(){
        produce.producrShiPin();
    }
}
