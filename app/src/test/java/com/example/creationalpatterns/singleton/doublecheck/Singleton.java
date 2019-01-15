package com.example.creationalpatterns.singleton.doublecheck;

/**
 * Created by Zachary
 * on 2019/1/11.
 */
public class Singleton {
    private volatile static  Singleton ourInstance ;

    public static Singleton getInstance() {
        if (ourInstance == null){
            synchronized (Singleton.class){
                if (ourInstance == null){
                    ourInstance = new Singleton();
                }
            }
        }
        return ourInstance;
    }

    private Singleton() {
    }
}
