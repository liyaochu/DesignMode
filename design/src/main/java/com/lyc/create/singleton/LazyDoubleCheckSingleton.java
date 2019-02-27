package com.lyc.create.singleton;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 10:31
 * @Description:双重检查
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton=null;
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getLazySingleton(){
            if (lazyDoubleCheckSingleton==null){
                synchronized (LazyDoubleCheckSingleton.class){
                    if (lazyDoubleCheckSingleton==null){
                        lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
                        //1.分布内存
                        //2.初始化这个对象
                        //设置lazyDoubleCheckSingleton,指向刚分配好的内存地址
                    }
                }
            }
            return lazyDoubleCheckSingleton;
    }
}
