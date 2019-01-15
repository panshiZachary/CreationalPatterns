package com.example.creationalpatterns.abstractfactory;

import org.junit.Test;

/**
 * Created by Zachary
 * on 2019/1/10.
 */
public class Client {
    @Test
    public void testAbstractFactroy(){
        ConCreteCreator1 conCreteCreator1 = new ConCreteCreator1();
        ProductA1 productA1 = (ProductA1) conCreteCreator1.factoryA();
        ProductB1 productB1 = (ProductB1) conCreteCreator1.factoryB();

        ConCreteCerator2 conCreteCerator2 = new ConCreteCerator2();
        ProductA2 productA2 = (ProductA2) conCreteCerator2.factoryA();
        ProductB2 productB2 = (ProductB2) conCreteCerator2.factoryB();

    }
}
