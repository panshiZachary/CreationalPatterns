package com.example.creationalpatterns.singleton.innerclass;

/**
 * Created by Zachary
 * on 2019/1/11.
 */
public class Singleton {
    private static final Singleton ourInstance =null;

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }

}
