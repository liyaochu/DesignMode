package com.lyc.create.prototype;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 14:32
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setContent("初始化的模板");
        for (int i = 0; i <10 ; i++) {
            mail.setName("姓名"+i);
            mail.setEmailAddress("姓名"+i+"@163.com");
            mail.setName("恭喜您,此次慕课网活动中奖了");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
