package com.lyc.factorymethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 11:36
 * @Description: 测试类
 */
public class Test {
    public static void main(String[] args) {
       VideoFactory videoFactory= new JavaVideoFactory();
        VideoFactory PythonVideoFactory= new PythonVideoFactory();
        VideoFactory FEVideoFactory= new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
