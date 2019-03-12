package com.lyc.structural.composite;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/11 11:45
 * @Description:
 */
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name: "+name+ " Price:"+price);
    }
}
