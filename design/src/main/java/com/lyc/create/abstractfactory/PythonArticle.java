package com.lyc.create.abstractfactory;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/26 17:06
 * @Description:
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("录制python课程的手记");
    }
}
