package com.example.creationalpatterns.prototype;

/**
 * Created by Zachary
 * on 2019/1/15.
 */
public interface IOrder extends PrototypeClone{

    void setOrderNumber(int number);

    int getOrderNumber();
}
