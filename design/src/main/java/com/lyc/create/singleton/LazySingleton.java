package com.lyc.create.singleton;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 10:13
 * @Description: 懒汉模式,多线程模式不安全,可以加 synchronized
 */
public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private LazySingleton(){

    }
    public static LazySingleton getLazySingleton(){
        synchronized(LazySingleton.class){
            if (lazySingleton==null){
                lazySingleton=new LazySingleton();
            }
            return lazySingleton;
        }

    }
}
