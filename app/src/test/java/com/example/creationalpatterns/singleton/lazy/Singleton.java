package com.example.creationalpatterns.singleton.lazy;

/**
 * Created by Zachary
 * on 2019/1/11.
 * 静态内部类
 */
public class Singleton {
    
    private Singleton() {
    }
    private static class SingletonHolder{
        // 静态内部类的静态属性，实例化，是有虚拟机
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }


}
