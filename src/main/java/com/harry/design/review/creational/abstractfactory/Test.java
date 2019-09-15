package com.harry.design.review.creational.abstractfactory;

import com.harry.design.review.creational.abstractfactory.factory.AdidasFactory;
import com.harry.design.review.creational.abstractfactory.factory.Factory;
import com.harry.design.review.creational.abstractfactory.factory.NikeFactory;

/**
 * 抽象工厂模式：Adidas工厂除了生产Adidas足球外，还生产Adidas球鞋、球服、球袜（adidas is all in）；
 * Nike工厂也生产Nike足球、球鞋、球服、球袜等，在此，Adidas和Nike是工厂，
 * 同一品牌的足球、球鞋、球服、球袜构成了一个产品族，一个工厂可以生产一族产品，而不只是一种产品。
 *
 * 抽象工厂模式(Abstract Factory): 提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class Test {

    public static void main(String[] args) {
        Factory factory = new AdidasFactory();
        factory.getCloth().show();
        factory.getFootball().show();
        factory.getSock().show();

        Factory factory2 = new NikeFactory();
        factory2.getCloth().show();
        factory2.getFootball().show();
        factory2.getSock().show();
    }
}
