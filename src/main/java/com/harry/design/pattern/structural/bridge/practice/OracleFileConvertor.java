package com.harry.design.pattern.structural.bridge.practice;

/**
 * create by： harry
 * date:  2019/7/31 0031
 **/
public class OracleFileConvertor extends DataBaseFileConvertor {
    @Override
    void convertToFile() {
        String data = "这是从oracle中读取的数据";
        dataBaseFileConvertorImpl.convertDataToFile(data);
        System.out.println("oracle数据转换文件完成");
    }
}
