package com.lyc.structural.flyweight;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/11 09:56
 * @Description:
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }
    private String department;
    private String reportContent;
    public Manager(String department){
        this.department=department;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
