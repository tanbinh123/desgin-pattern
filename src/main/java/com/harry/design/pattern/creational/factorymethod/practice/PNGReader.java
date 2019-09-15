package com.harry.design.pattern.creational.factorymethod.practice;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public class PNGReader implements ImageReader {
    @Override
    public void readImage() {
        System.out.println("读取png图片");
    }
}
