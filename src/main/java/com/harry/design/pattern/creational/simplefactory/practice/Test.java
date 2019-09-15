package com.harry.design.pattern.creational.simplefactory.practice;

/**
 * 使用简单工厂模式设计一个可以创建不同几何形状（如圆形、方形和三角形等）的绘图工具，每个几何图形都具有绘制draw()和擦除erase()两个方法，
 * 要求在绘制不支持的几何图形时，提示一个UnSupportedShapeException
 * create by： harry
 * date:  2019/7/28 0028
 **/
public class Test {

    public static void main(String[] args) {
        GeometricShape circle = GeometricFactory.getGeometricShape("circle");
        circle.draw();
        circle.erase();
        GeometricShape triangle = GeometricFactory.getGeometricShape("triangle");
        triangle.draw();
        triangle.erase();

        GeometricShape square = GeometricFactory.getGeometricShape("square");
        square.draw();
        square.erase();

        GeometricShape ellipse = GeometricFactory.getGeometricShape("ellipse");
        ellipse.draw();
        ellipse.erase();
    }
}
