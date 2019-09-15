package com.harry.design.pattern.structural.bridge;

/**
 * create by： harry
 * date:  2019/7/31 0031
 **/
public class ImageMacImpl implements ImageOperateSystemImpl {
    @Override
    public void printImage(Matrix matrix) {
        System.out.println("在mac上显示图片");
    }
}
