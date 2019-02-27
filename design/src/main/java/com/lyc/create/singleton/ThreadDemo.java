package com.lyc.create.singleton;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 10:17
 * @Description:
 */
public class ThreadDemo implements Runnable {
    @Override
    public void run() {
        //LazySingleton lazySingleton = LazySingleton.getLazySingleton();
       // LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getLazySingleton();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"lazySingleton"+instance);
    }
}
