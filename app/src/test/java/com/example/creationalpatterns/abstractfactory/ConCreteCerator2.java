package com.example.creationalpatterns.abstractfactory;

/**
 * Created by Zachary
 * on 2019/1/10.
 */
public class ConCreteCerator2 implements Creator {
    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}
