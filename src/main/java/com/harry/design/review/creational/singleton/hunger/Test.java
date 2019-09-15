package com.harry.design.review.creational.singleton.hunger;

/**
 *   饿汉式
 *  单例模式：在比赛过程中（在场上的，替补不算）每个球队的守门员有且仅有一个，
 *  肯定不会有两个穿相同球衣的守门员同时上场，这不是单例吗？如果布冯或者卡西能出场，
 *  还有哪个意大利或者西班牙守门员敢去跟他们抢首发呢？？
 *  布冯你是唯一的！卡西，你也是！当然，皮尔洛也是，哈维也是，小法也是，巴神也是......原来有这么多单例。
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class Test {

    public static void main(String[] args) {
        GoalKeeper goalKeeper = GoalKeeper.getInstance();
        goalKeeper.setName("卡西");

        GoalKeeper goalKeeper1 = GoalKeeper.getInstance();
        goalKeeper1.setName("皮尔洛");

        System.out.println("守门员对象1:"  + goalKeeper.getName() + "; 守门员对象2:" + goalKeeper1.getName());

        System.out.println("两个守门员对象是否相等:" + (goalKeeper == goalKeeper1));
    }
}
