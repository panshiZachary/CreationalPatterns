package com.example.creationalpatterns.build;

/**
 * Created by Zachary
 * on 2019/1/11.
 */
public class WorkerBuilder {
    RoomParams params;

    public WorkerBuilder() {
        params = new RoomParams();

    }

    public WorkerBuilder makeWindow(String window){
        params.window = window;
        return this;

    }

    public WorkerBuilder makeFloor(String floor){
        params.floor = floor;
        return this;

    }
    public Room build(){
        Room room = new Room();
        room.apply(params);
        return room;
    }


    class RoomParams {

        public String window;

        public String floor;
    }



}
