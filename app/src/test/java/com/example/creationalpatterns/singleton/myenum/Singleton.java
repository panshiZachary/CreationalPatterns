package com.example.creationalpatterns.singleton.myenum;

/**
 * Created by Zachary
 * on 2019/1/14.
 * 采用枚举的方式
 */
public enum  Singleton {



    RED(1,"红色");

    private int index;
    private String color;

    public int getIndex() {
        return index;
    }

    public String getColor() {
        return color;
    }

    Singleton(int index, String color){
       this.index = index;
       this.color = color;
    }



}
