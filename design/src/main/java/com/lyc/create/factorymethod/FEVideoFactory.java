package com.lyc.create.factorymethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 14:10
 * @Description:
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
