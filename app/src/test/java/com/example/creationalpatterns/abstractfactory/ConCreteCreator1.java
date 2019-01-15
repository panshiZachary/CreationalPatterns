package com.example.creationalpatterns.abstractfactory;

/**
 * Created by Zachary
 * on 2019/1/10.
 * 具体的工厂
 */
public class ConCreteCreator1 implements Creator  {
    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}
