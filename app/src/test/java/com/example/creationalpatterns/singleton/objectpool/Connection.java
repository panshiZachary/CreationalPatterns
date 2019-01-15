package com.example.creationalpatterns.singleton.objectpool;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zachary
 * on 2019/1/14.
 *  链接对象
 *
 */
public class Connection {
    // 只能存在五个对象
    private final static int MAX = 5;

    // 把所有的对象存放在map中
    private static Map<Integer,Connection> map = new HashMap<>();

    private static int key = 1;

    public static Connection getConnection(){
        Connection connection = map.get(key);
        if (connection==null){
            connection = new Connection();
            map.put(key,connection);
        }
        key ++;
        if (key>MAX){
            key = 1;
        }
        return connection;
    }


}
