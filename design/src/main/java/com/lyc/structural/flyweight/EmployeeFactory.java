package com.lyc.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/11 09:58
 * @Description:
 */
public class EmployeeFactory  {
    private  static final Map<String,Employee> EMPLOYEE_MAP=new HashMap<String,Employee>();
    public static  Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager==null){
            manager=   new Manager(department);
            System.out.println("创建部门经理"+department);
            manager.setReportContent(department+"部门汇报.......");
            EMPLOYEE_MAP.put(department,manager);
            System.out.println("创建报告"+department);
        }
        return manager;
    }
}
