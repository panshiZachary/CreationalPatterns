package com.example.creationalpatterns.prototype;

/**
 * Created by Zachary
 * on 2019/1/15.
 */
public class PersonalOrder implements IOrder {
    private int orderNumber;
    private String orderName;

    @Override
    public void setOrderNumber(int number) {
         this.orderNumber = number;
    }

    @Override
    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public PrototypeClone clone() {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderNumber(orderNumber);
        personalOrder.setOrderName(orderName);
        return personalOrder;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
