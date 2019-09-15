package com.harry.design.pattern.structural.proxy.practice;

/**
 * create by： harry
 * date:  2019/8/10 0010
 **/
public class Test {

    public static void main(String[] args) {
        NodeService nodeService = new NodeServiceProxy(new NodeServiceImpl());
        nodeService.createNode("嘻嘻嘻啦啦");
    }
}
