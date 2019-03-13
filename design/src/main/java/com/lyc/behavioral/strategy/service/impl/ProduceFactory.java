package com.lyc.behavioral.strategy.service.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/13 12:03
 * @Description:
 */
public class ProduceFactory {
    private  static Map<String,Produce> produceMap=new HashMap<>();

    static{
        produceMap.put(produceKey.GO,new GoShiPin());
        produceMap.put(produceKey.JAVA,new JavaShiPin());
        produceMap.put(produceKey.PYTHON,new PythonShiPin());
    }

    private ProduceFactory() {
    }

    public static Produce getProduce(String key){
        Produce produce = produceMap.get(key);

        return produce;
    }

     private  interface   produceKey{
         String JAVA="JAVA";
         String PYTHON="PYTHON";
         String GO="GO";
    }
}
