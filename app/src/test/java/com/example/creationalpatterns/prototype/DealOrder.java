package com.example.creationalpatterns.prototype;

/**
 * Created by Zachary
 * on 2019/1/15.
 */
public class DealOrder {

    public static void deal(IOrder iOrder){
        int number = iOrder.getOrderNumber();

        while (number>0){
            System.out.println("原订单"+iOrder.hashCode());
            IOrder newOrder = (IOrder) iOrder.clone();
            newOrder.setOrderNumber(number>1000?1000:number);
            System.out.println(newOrder.hashCode()+" "+newOrder.getOrderNumber());
            number -=1000;
        }


    }
}
