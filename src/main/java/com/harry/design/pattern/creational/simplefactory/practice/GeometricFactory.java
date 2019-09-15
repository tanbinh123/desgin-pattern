package com.harry.design.pattern.creational.simplefactory.practice;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public class GeometricFactory {

    public static GeometricShape getGeometricShape(String shapeType){
        if("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        if("triangle".equalsIgnoreCase(shapeType)){
            return new Triangle();
        }
        if("square".equalsIgnoreCase(shapeType)){
            return new Triangle();
        }
        throw new UnSupportedShapeException("不支持的形状:" + shapeType);
    }
}
