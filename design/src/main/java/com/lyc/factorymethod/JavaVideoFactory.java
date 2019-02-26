package com.lyc.factorymethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 14:00
 * @Description:
 */
public class JavaVideoFactory extends  VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
