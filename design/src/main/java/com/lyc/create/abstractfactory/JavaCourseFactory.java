package com.lyc.create.abstractfactory;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 15:41
 * @Description:
 */
public class JavaCourseFactory implements  CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
