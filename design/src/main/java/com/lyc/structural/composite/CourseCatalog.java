package com.lyc.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Jhon Li
 * @Date: 2019/3/11 11:48
 * @Description:
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> catalogComponents=new ArrayList<>();
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        catalogComponents.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        catalogComponents.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        for (CatalogComponent catalogComponent : catalogComponents) {
            catalogComponent.print();
        }
    }
}
