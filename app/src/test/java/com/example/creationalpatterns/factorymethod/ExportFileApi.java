package com.example.creationalpatterns.factorymethod;

/**
 * Created by Zachary
 * on 2019/1/10.
 * 导出数据文件  数据文件 可能有 数据库 ，文本 ，xml ,excel , 未来
 */
public interface ExportFileApi {
    /**
     *
     * @param data  文件数据
     * @return 导出文件是否成功
     */
    public boolean export(String data);
}
