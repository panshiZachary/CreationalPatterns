package com.example.creationalpatterns.singleton.hungry;

/**
 * Created by Zachary
 * on 2019/1/11.
 *
 */
public class Singleton {

    private final static  Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton(){

    }
}
