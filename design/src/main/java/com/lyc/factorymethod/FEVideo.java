package com.lyc.factorymethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 14:04
 * @Description:
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("播放FE课程视频");
    }
}
