package com.example.creationalpatterns.factorymethod;

/**
 * Created by Zachary
 * on 2019/1/10.
 */
public class ExportDBOperator extends ExportOperator {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDBFile();
    }
}
