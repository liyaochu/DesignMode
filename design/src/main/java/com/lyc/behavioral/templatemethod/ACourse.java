package com.lyc.behavioral.templatemethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/12 12:00
 * @Description:  模板模式
 * ACourse 相当于模板
 */
public abstract class ACourse {
    protected final void makeCourse() {
        this.makeVideo();
        this.makePPT();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手籍");
    }

    //钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
