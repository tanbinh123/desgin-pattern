package com.harry.design.review.structural.composite;

/**
 * create by： harry
 * date:  2019/8/24 0024 下午 1:58
 **/
public abstract class Node {

    protected String name;

    abstract public Node addMember(Node node);

    abstract public void sendNotification(String content);

    abstract public void removeMember(Node node);
}
