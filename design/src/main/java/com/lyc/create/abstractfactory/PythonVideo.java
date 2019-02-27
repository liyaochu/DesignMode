package com.lyc.create.abstractfactory;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 16:51
 * @Description:
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制python课程视频");
    }
}
