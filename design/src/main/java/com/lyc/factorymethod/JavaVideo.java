package com.lyc.factorymethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 11:34
 * @Description: java的视频类
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("播放java的视频");
    }
}
