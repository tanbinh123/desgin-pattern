package com.harry.design.pattern.creational.simplefactory.practice;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public class UnSupportedShapeException extends RuntimeException {

    public UnSupportedShapeException(String message) {
        super(message);
    }
}
