package com.lyc.create.builder;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 20:12
 * @Description:
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder=courseBuilder;
    }
    public Course makeCourse(String courseName,String coursePPT,String courseVideo, String curseArticle,String courseQA){
        this.courseBuilder.buildCourseSeName(courseName);
        this.courseBuilder.buildCourseSeArticle(curseArticle);
        this.courseBuilder.buildCourseSePTT(coursePPT);
        this.courseBuilder.buildCourseSeQA(courseQA);
        this.courseBuilder.buildCourseSeVideo(courseVideo);
        return this.courseBuilder.makeCourse();
    }
}
