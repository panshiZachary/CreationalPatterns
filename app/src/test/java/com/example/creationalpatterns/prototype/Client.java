package com.example.creationalpatterns.prototype;

import org.junit.Test;

/**
 * Created by Zachary
 * on 2019/1/15.
 */
public class Client {
    @Test
    public void test(){
        // 个人订单 测试
//        PersonalOrder personalOrder = new PersonalOrder();
//        personalOrder.setOrderName("玩具");
//        personalOrder.setOrderNumber(3200);
//
//        DealOrder.deal(personalOrder);
        // 再来一个公司订单测试
        CompanyOrder companyOrder = new CompanyOrder();
        companyOrder.setOrderName("公司订单");
        companyOrder.setOrderNumber(3500);
        DealOrder.deal(companyOrder);

    }
}
