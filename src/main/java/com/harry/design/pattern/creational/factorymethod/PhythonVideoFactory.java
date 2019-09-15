package com.harry.design.pattern.creational.factorymethod;

/**
 * create by： harry
 * date:  2019/7/17 0017
 **/
public class PhythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PhythonVideo();
    }
}
