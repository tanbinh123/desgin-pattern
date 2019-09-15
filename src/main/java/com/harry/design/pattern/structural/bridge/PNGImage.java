package com.harry.design.pattern.structural.bridge;

/**
 * create by： harry
 * date:  2019/7/31 0031
 **/
public class PNGImage extends Image {

    @Override
    void showImage(String fileName) {
        Matrix matrix = new Matrix();
        imageOperateSystemImpl.printImage(matrix);
        System.out.println(fileName +"格式为PNG");
    }
}
