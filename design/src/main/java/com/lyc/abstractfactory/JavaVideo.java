package com.lyc.abstractfactory;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 15:41
 * @Description:
 */
public class JavaVideo extends  Video {
    @Override
    public void produce() {
        System.out.println("播放java课程视频");
    }
}
