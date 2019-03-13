package com.lyc.behavioral.templatemethod;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/12 12:05
 * @Description:
 */
public class FECourse extends  ACourse {
    private boolean  needWriteArticleFlag=false;
    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticleFlag;
    }
}
