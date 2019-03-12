package com.lyc.structural.flyweight;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/11 10:03
 * @Description:
 */
public class Test {
    private static  final String departments[]={"RD","QA","PM","BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
           String department=departments[(int)(Math.random()*departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
