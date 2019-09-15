package com.harry.design.review.creational.factorymethod;

import com.harry.design.review.creational.factorymethod.factory.AdidasFactory;
import com.harry.design.review.creational.factorymethod.factory.FootballFactory;
import com.harry.design.review.creational.factorymethod.factory.KAPPAFactory;
import com.harry.design.review.creational.factorymethod.factory.NikeFactory;
import com.harry.design.review.creational.factorymethod.product.Football;

/**
 *
 * 工厂方法模式：近年来大型足球比赛（世界杯和欧洲杯）的指定用球都是阿迪达斯的（据说是签了合同的），
 * 当然Adidas足球是由Adidas公司生产的，除此之外，Nike公司也生产Nike足球，
 * KAPPA（背靠背）
 * 公司也生产背靠背足球，足球生产商是工厂，
 * 足球是产品。增加一种新的足球品牌，对应需要增加一个新的生产商。
 *
 * 工厂方法模式(Factory Method)：
 * 定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式使一个类的实例化延迟到其子类。
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class Test {

    public static void main(String[] args) {
        FootballFactory footballFactory = new AdidasFactory();
        Football football = footballFactory.getFootball();
        football.playFootBall();

        FootballFactory footballFactory2 = new NikeFactory();
        Football football2 = footballFactory2.getFootball();
        football2.playFootBall();

        FootballFactory footballFactory3 = new KAPPAFactory();
        Football football3 = footballFactory3.getFootball();
        football3.playFootBall();
    }
}
