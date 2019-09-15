package com.harry.design.pattern.creational.factorymethod.practice;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public class GIFReader implements ImageReader {
    @Override
    public void readImage() {
        System.out.println("读取gif图片");
    }
}
