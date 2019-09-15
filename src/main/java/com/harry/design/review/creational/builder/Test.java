package com.harry.design.review.creational.builder;

/**
 * 如果我要一套完整的意大利国家队足球装备（除球鞋，这个貌似没有统一）：
 * 包括球衣、球裤、球袜，只需跟某专卖店销售人员说一下（想象，想象......）：
 * 我要一套意大利队的足球装备，大小为XL，返回给你的是一套经典的蓝色意大利国家队队服，包
 * 括蓝色的足球袜；当然你的朋友可以说他要一套西班牙队的足球装备，
 * 返回给他的是一套红色的斗牛士足球装备，袜子，当然也是红的。
 * 在此，销售人员相当于建造者模式中的指挥者(Director)，他向用户返回一个复杂产品(足球装备)，
 * 该复杂产品由多个部件组成(球衣、球裤、球袜等)，用户无须关心具体组装过程即可得到一个完整的复杂产品。
 *
 * 建造者模式(Builder): 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * create by： harry
 * date:  2019/8/22 0022
 **/
public class Test {

    public static void main(String[] args) {
        Seller seller = new Seller();
        FootballEquipment footballEquipment = seller.sellEquipment(new ItalyEquipmentBuilder());
        System.out.println(footballEquipment);

        System.out.println("-------------------------------");

        FootballEquipment footballEquipment1 = seller.sellEquipment(new SpainEquipmentBuilder());
        System.out.println(footballEquipment1);
    }
}
