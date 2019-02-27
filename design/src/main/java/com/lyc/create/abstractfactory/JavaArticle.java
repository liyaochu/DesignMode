package com.lyc.create.abstractfactory;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 15:42
 * @Description:
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("录制java课程的手记");
    }
}
