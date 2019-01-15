package com.example.creationalpatterns.factorymethod;

/**
 * Created by Zachary
 * on 2019/1/10.
 */
public class ExportTextOperator extends ExportOperator {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTextFile();
    }
}
