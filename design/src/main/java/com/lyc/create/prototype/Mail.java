package com.lyc.create.prototype;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 14:26
 * @Description:   原型模式
 */
public class Mail {
    private String name;
    private String emailAddress;
    private String content;
    public Mail(){
        System.out.println("邮件");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
