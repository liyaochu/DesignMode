package com.lyc.abstractfactory;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 17:21
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        article.produce();
        video.produce();
    }
}
