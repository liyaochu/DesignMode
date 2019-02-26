package com.lyc.builder;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 20:30
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java设计模式精讲", "java设计模式PPT精讲", "java设计模式精讲视频", "java设计模式精讲手记", "java设计模式精讲问答");
        System.out.println(course);
    }
}
