package com.harry.design.review.structural.proxy;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *  代理模式：足球场外，球员转会是一个热门话题。
 *  转会当然离不开球员的经纪人，经纪人将球员的想法传递给另一家俱乐部。
 *  经纪人就是球员的代理，球员是目标对象，而经纪人是代理对象
 *  ，经纪人隔离了球员和“客户端”，“拍广告，请找我的经纪人”，“采访，请找我的经纪人”......
 *
 *  代理模式(Proxy)：为其他对象提供一个代理以控制对这个对象的访问。
 * create by： harry
 * date:  2019/8/25 0025 下午 1:58
 **/
public class Test {

    public static void main(String[] args) {
        Player player = new PlayerProxy(new PlayerImpl());
        player.advertisement(BigDecimal.valueOf(5000));

        System.out.println("******************************");
        player.advertisement(BigDecimal.valueOf(50000));
        System.out.println("******************************");

        player.interview(LocalDate.of(2018, 8, 15));
        System.out.println("******************************");
        player.interview(LocalDate.now());
    }
}
