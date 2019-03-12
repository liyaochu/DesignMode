package com.lyc.structural.composite;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/11 11:41
 * @Description: 组合模式
 *  课程目录
 */
public class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }
    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称的操作");
    }
    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
