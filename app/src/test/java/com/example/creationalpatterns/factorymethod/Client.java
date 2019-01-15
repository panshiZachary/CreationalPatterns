package com.example.creationalpatterns.factorymethod;

import org.junit.Test;

/**
 * Created by Zachary
 * on 2019/1/10.
 */
public class Client {
    @Test
    public void testFactoryMethod(){
        // 1 .导出文本根式
       ExportOperator operator = new ExportTextOperator();
       operator.export("今天的财务报表");
       // 2 .导出数据库格式
        ExportOperator operator2 = new ExportDBOperator();
        operator2.export("上个月的财务报表");
    }
}
