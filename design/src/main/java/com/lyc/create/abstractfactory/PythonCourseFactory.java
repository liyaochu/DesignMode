package com.lyc.create.abstractfactory;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 17:14
 * @Description:
 */
public class PythonCourseFactory implements  CourseFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
