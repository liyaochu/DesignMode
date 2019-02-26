package com.lyc.builder;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 20:09
 * @Description:
 */
public class CourseActualBuilder extends CourseBuilder {
    private Course course=new Course();
    @Override
    public void buildCourseSeName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCourseSePTT(String coursePPT) {
        course.setCourseName(coursePPT);
    }

    @Override
    public void buildCourseSeVideo(String courseVideo) {
        course.setCourseName(courseVideo);
    }

    @Override
    public void buildCourseSeArticle(String courseArticle) {
        course.setCourseName(courseArticle);
    }

    @Override
    public void buildCourseSeQA(String courseQA) {
        course.setCourseName(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
