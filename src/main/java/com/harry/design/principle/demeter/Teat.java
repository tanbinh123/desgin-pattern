package com.harry.design.principle.demeter;

/**
 *  迪米特原则， 一个类只与它直接的类打交道，不依赖不必要的类
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
public class Teat {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.checkCourseNumber(new TeamLeader());
    }
}
