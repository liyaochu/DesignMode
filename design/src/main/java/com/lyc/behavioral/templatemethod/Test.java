package com.lyc.behavioral.templatemethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/12 12:06
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        ACourse  aCourse=new DesignPatternCourse();
        aCourse.makeCourse();
        System.out.println("后端设计模式课程end---");

        System.out.println("前端课程start---");
        ACourse  FECourse=new DesignPatternCourse();
        aCourse.makeCourse();
        System.out.println("前端课程end---");
    }
}
