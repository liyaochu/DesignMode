package com.lyc.behavioral.observe;
/**
 * 观察者模式
 */

import java.util.Observable;
//这个就是被观察者对象：
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question) {
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"提交了一个问题 ");
        setChanged();
        notifyObservers(question);
    }
}
