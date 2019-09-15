package com.harry.design.review.behavior.chainofresponsibility;

/**
 *
 * 职责链模式：布冯手抛球给基耶利尼、基耶利尼传给皮尔洛、皮尔洛带球过人之后将球直塞给快速插上的巴洛特利，
 * 巴洛特利倒钩射门，球进了，球进了，又是巴洛特利，巴洛特利立功了，伟大的意大利前锋！
 * 他继承了意大利的光荣传统，巴乔、因扎吉、皮耶罗在这一刻灵魂附体！
 * 巴洛特利代表了意大利足球悠久的历史和传统，在这一刻他不是一个人在战斗，他不是一个人！大笑
 * 在此，足球就是一个请求，而球员就是请求的处理者，足球在球员间不断进行传递，构成了一条传递链。
 *
 * 职责链模式(Chain of Responsibility):
 * 为解除请求的发送者和接收者之间耦合，而使多个对象都有机会处理这个请求；
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它。
 * create by： harry
 * date:  2019/8/25 0025 下午 3:32
 **/
public class Test {

    public static void main(String[] args) {
        Player p1, p2, p3, p4;

        p1 = new BuFeng("布冯");
        p2 = new JiYeLiEr("基耶利尼");
        p3 = new PiErLuo("皮尔洛");
        p4 = new BaLuoErTe("巴洛特利");
        p1.setSuccessor(p2);
        p2.setSuccessor(p3);
        p3.setSuccessor(p4);

        p1.passBall("巴洛特利");
    }
}
