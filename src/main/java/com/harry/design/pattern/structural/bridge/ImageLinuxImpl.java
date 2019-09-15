package com.harry.design.pattern.structural.bridge;

/**
 * create by： harry
 * date:  2019/7/31 0031
 **/
public class ImageLinuxImpl implements ImageOperateSystemImpl {
    @Override
    public void printImage(Matrix matrix) {
        System.out.println("在Linux上显示图片");
    }
}
