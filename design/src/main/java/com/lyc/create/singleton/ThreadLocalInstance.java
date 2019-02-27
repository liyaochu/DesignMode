package com.lyc.create.singleton;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 13:58
 * @Description: ThreadLocal 单列
 */
public class ThreadLocalInstance {
    private static final  ThreadLocal<ThreadLocalInstance> threadLocal=new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }
    public static ThreadLocalInstance getInstance(){
        return  threadLocal.get();
    }
}
