package com.harry.design.pattern.creational.abstractfactory;


import java.sql.Connection;

/**
 *  抽象工厂: 通过创建一个抽象的产品工厂，对应一个产品族，子工厂可以很容易的水平扩展产品等级，但是要新增一个产品难度却很大
 * create by： harry
 * date:  2019/7/18 0018
 **/
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.getArticle().produceArticle();
        courseFactory.getVideo().produceVideo();
        CourseFactory phythonFactory = new PhythonCourseFactory();
        phythonFactory.getVideo().produceVideo();
        phythonFactory.getArticle().produceArticle();

    }
}
