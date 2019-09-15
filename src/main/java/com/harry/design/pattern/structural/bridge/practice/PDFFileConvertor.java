package com.harry.design.pattern.structural.bridge.practice;

/**
 * create by： harry
 * date:  2019/7/31 0031
 **/
public class PDFFileConvertor implements DataBaseFileConvertorImpl {

    @Override
    public void convertDataToFile(String data) {
        System.out.println("转换数据{" + data +"}成pdf");
    }
}
