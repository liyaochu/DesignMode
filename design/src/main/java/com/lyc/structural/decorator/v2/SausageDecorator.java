package com.lyc.structural.decorator.v2;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 16:28
 * @Description:
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
