package com.lyc.create.factorymethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 11:40
 * @Description: video 的工厂
 * 工厂方法所有的实现都交给子类实现,videofactory只产生约定契约,并不产生那一种类的视频
 */
public abstract class VideoFactory {




    public abstract Video getVideo();
    /**
     *
     * @param type
     * @return 因为如果有其他的视频来,就需要修改.所以,不满足开闭原则.
     */
   /* public Video getVideo(String type){
        if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }else{
            return null;
        }

    }*/
    /**
     * 使用反射来创建
     *
     */
   /* public Video getVideo(Class c){
        Video video=null;
        try {
            video=(Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }*/
}
