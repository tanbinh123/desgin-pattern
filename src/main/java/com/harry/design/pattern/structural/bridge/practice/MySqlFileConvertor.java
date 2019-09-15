package com.harry.design.pattern.structural.bridge.practice;

/**
 * create by： harry
 * date:  2019/7/31 0031
 **/
public class MySqlFileConvertor extends DataBaseFileConvertor {

    @Override
    void convertToFile() {
        String data = "这是从mysql中读取的数据";
        dataBaseFileConvertorImpl.convertDataToFile(data);
        System.out.println("mysql数据转换文件完成");
    }
}
