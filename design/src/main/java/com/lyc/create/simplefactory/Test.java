package com.lyc.create.simplefactory;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 11:36
 * @Description: 测试类
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 注意这里非常依赖对应的类,不利于扩展
         */
     //1. Video javaVideo = new JavaVideo();
      //  javaVideo.produce();

      //2.使用简单工厂
      /*  VideoFactory videoFactory=new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video==null){
            return;
        }*/

      //3.使用反射,具有扩展性,从一定程度上满足开闭原则
        VideoFactory videoFactory=new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video==null){
            return;
        }
        video.produce();
    }
}
