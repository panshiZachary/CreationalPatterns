package com.example.creationalpatterns.prototype;

/**
 * Created by Zachary
 * on 2019/1/15.
 */
public class CompanyOrder implements IOrder {
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
        CompanyOrder companyOrder = new CompanyOrder();
        companyOrder.setOrderNumber(orderNumber);
        companyOrder.setOrderName(orderName);
        return companyOrder;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
