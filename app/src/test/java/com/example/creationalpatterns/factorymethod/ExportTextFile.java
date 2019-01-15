package com.example.creationalpatterns.factorymethod;

/**
 * Created by Zachary
 * on 2019/1/10.
 */
public class ExportTextFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出文本格式："+data);
        return true;
    }
}
