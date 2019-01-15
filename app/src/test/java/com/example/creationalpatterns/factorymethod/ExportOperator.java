package com.example.creationalpatterns.factorymethod;

/**
 * Created by Zachary
 * on 2019/1/10.
 */
public abstract class ExportOperator {

    public boolean export(String data){
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    protected abstract ExportFileApi factoryMethod();


}
