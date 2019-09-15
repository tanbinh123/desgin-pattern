package com.harry.design.pattern.creational.factorymethod.practice;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public class PNGReaderFactory extends ImageReaderFactory {
    @Override
    ImageReader createImageReader() {
        return new PNGReader();
    }
}
