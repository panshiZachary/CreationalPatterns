package com.example.creationalpatterns.build;

/**
 * Created by Zachary
 * on 2019/1/11.
 * 建造一个房子
 */
public class Room {

    private String window;

    private String floor;

    @Override
    public String toString() {
        return "Room{" +
                "window='" + window + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }

    public void apply(WorkerBuilder.RoomParams params) {
        window = params.window;
        floor = params.floor;
    }
}
