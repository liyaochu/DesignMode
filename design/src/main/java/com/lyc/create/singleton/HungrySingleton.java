package com.lyc.create.singleton;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 11:19
 * @Description: 饿汉单利模式
 */
public class HungrySingleton {
    private final static HungrySingleton  hungrySingleton;

    static{
        //内加载的时候就初始好了
        hungrySingleton=new HungrySingleton();
    }
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
