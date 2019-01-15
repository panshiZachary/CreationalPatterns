package com.example.creationalpatterns;

import com.example.creationalpatterns.simplefactory.A;
import com.example.creationalpatterns.simplefactory.Api;
import com.example.creationalpatterns.simplefactory.B;
import com.example.creationalpatterns.simplefactory.Factory;
import com.example.creationalpatterns.singleton.myenum.Singleton;
import com.example.creationalpatterns.singleton.objectpool.Connection;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void myTest(){
        // 1.1 简单工厂 第一种实现方式
        Api api = Factory.create(1);
        api.operator();

        // 1.2 简单工厂 第一种实现方式 通过反射
        Api api2 = Factory.cteateApi(B.class);
        api2.operator();

        // 测试单例  枚举
        System.out.println(Singleton.RED.getIndex());


        // 测试对象池
        for (int i = 0; i < 20; i++) {
            System.out.println(Connection.getConnection());
        }


    }
}