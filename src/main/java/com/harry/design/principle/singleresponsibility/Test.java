package com.harry.design.principle.singleresponsibility;

/**
 *  单一职责原则
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
public class Test {

    // v1: 一个类负责多个事情，当判断选择逻辑增加时，该类将变得异常难以维护
    /*public static void main(String[] args) {
        Bird bird = new Bird();
        bird.MainMoveMethod("大雁");
        bird.MainMoveMethod("企鹅");
    }*/
    // v2: 将不同的场景进行拆分，不让一个类做过多的事情
    public static void main(String[] args) {
        Bird bird = new FlyBird();
        bird.MainMoveMethod("大雁");
        Bird bird2 = new WalkBird();
        bird2.MainMoveMethod("企鹅");
    }
}
