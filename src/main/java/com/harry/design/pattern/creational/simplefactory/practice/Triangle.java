package com.harry.design.pattern.creational.simplefactory.practice;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public class Triangle extends GeometricShape {
    @Override
    void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    void erase() {
        System.out.println("擦除三角形");
    }
}
