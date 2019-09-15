package com.harry.design.review.structural.composite;

/**
 * create by： harry
 * date:  2019/8/24 0024 下午 2:01
 **/
public class Member extends Node {

    public Member(String name){
        this.name = name;
    }

    @Override
    public Node addMember(Node node) {
        System.out.println("成员无此功能");
        return this;
    }

    @Override
    public void sendNotification(String content) {
        System.out.println("成员:" + this.name +"; 接收到通知:" + content);
    }

    @Override
    public void removeMember(Node node) {
        System.out.println("成员无此功能");
    }
}
