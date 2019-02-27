package com.lyc.create.factorymethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 14:00
 * @Description:
 */
public class PythonVideoFactory extends  VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
