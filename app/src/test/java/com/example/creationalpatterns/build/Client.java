package com.example.creationalpatterns.build;

import org.junit.Test;

/**
 * Created by Zachary
 * on 2019/1/11.
 */
public class Client {

    @Test
    public void test(){
//        WorkerBuilder builder = new WorkerBuilder();
//        builder.makeWindow("法式窗户");
//        builder.makeFloor("实木地板");
//        Room room = builder.build();
        Room room = new WorkerBuilder()
                .makeWindow("法式窗户")
                .makeFloor("实木地板")
                .build();


        System.out.println(room);

    }
}
