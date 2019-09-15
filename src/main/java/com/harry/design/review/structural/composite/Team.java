package com.harry.design.review.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * create by： harry
 * date:  2019/8/24 0024 下午 2:12
 **/
public class Team extends Node {

    private List<Node> nodeList = new ArrayList<>(16);

    public Team(String name){
        this.name = name;
    }

    @Override
    public Node addMember(Node node) {
        nodeList.add(node);
        return this;
    }

    @Override
    public void sendNotification(String content) {
        System.out.println("对组:" + name + ";下发通知:" + content );
        for (Node node : nodeList) {
            node.sendNotification(content);
        }
    }

    @Override
    public void removeMember(Node node) {
        nodeList.remove(node);
    }
}
