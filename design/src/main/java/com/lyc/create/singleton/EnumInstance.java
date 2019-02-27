package com.lyc.create.singleton;

/**
 * @Auther: Jhon Li
 * @Date: 2019/2/27 12:04
 * @Description:枚举单利
 */
public enum EnumInstance {
    INSTANCE{
        //枚举类写方法的


        protected  void printTest(){
            System.out.println("test");
        }
    };
    protected  abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
