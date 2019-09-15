package com.harry.design.review.creational.prototype.shallowclone;

/**
 * 浅拷贝
 * 原型模式：无论是足球还是球服，都是批量生产的，
 * 例如2012年欧洲杯的指定用球Adidas 探戈12（Tango 12），
 * 先做一个原型（模板），然后照着生产就好了，想要多少就生产多少。
 *
 * 原型模式(Prototype):用原型实例指定创建对象的种类，并且通过拷贝这个原型来创建新的对象。
 * create by： harry
 * date:  2019/8/22 0022
 **/
public class Test {

    public static void main(String[] args) {
        Football football = new Football();
        Band band = new Band("harry牌子");
        football.setBand(band);
        football.setColor("天蓝色");
        football.setSize("大号");
        Football clone = football.clone();
        System.out.println("football:" + football);
        System.out.println("clone:" + clone);
        System.out.println("football == clone:" + (football == clone));
        System.out.println("football.getBand == clone.getBand:" + (football.getBand() == clone.getBand()));
    }
}
