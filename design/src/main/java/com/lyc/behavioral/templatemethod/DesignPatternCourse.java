package com.lyc.behavioral.templatemethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/12 12:04
 * @Description:
 */
public class DesignPatternCourse extends  ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
