package com.harry.design.pattern.creational.factorymethod.practice;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public abstract class ImageReaderFactory {
    abstract ImageReader createImageReader();

    public void readImage(){
        ImageReader imageReader = this.createImageReader();
        imageReader.readImage();
    }
}
