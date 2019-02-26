package com.lyc.builder;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 20:05
 * @Description: 建造者模式
 */
public abstract class CourseBuilder {
    public abstract  void buildCourseSeName(String courseName);
    public abstract  void buildCourseSePTT(String coursePPT);
    public abstract  void buildCourseSeVideo(String courseVideo);
    public abstract  void buildCourseSeArticle(String courseArticle);
    public abstract  void buildCourseSeQA(String courseQA);

    public abstract  Course makeCourse();
}
