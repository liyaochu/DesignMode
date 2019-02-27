package com.lyc.create.singleton;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 10:16
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        Thread t1 = new Thread(new ThreadDemo());
        Thread t2 = new Thread(new ThreadDemo());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
