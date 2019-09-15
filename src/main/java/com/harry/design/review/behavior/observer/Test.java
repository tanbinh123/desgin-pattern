package com.harry.design.review.behavior.observer;

/**
 * 观察者模式：教练大手一挥，全线压上。
 * 此时，教练是观察目标，球员是观察者，观察目标与观察者之间有一对多的联动，
 * 当然裁判也可以看成是球员的观察目标，终场哨一吹
 * ，西班牙乐成一片，意大利哭成一片，不同的观察者反应还真的有所不同，大笑。
 *
 * 观察者模式(Observer): 定义对象间的一种一对多的依赖关系，
 * 以便当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并自动更新。
 * create by： harry
 * date:  2019/8/27 0027 下午 10:10
 **/
public class Test {

    public static void main(String[] args) {
        CoachSubject coachSubject = new CoachSubject();

        PlayerObserver playerObserver = new PlayerObserver("小米");
        PlayerObserver playerObserver1 = new PlayerObserver("vivo");
        PlayerObserver playerObserver2 = new PlayerObserver("oppo");
        PlayerObserver playerObserver3 = new PlayerObserver("huawei");

        coachSubject.addObserver(playerObserver);
        coachSubject.addObserver(playerObserver1);
        coachSubject.addObserver(playerObserver2);
        coachSubject.addObserver(playerObserver3);

        coachSubject.handShow();

        System.out.println("*******************");
        coachSubject.gameOver();
    }
}
