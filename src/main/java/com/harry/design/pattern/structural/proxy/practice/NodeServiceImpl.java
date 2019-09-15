package com.harry.design.pattern.structural.proxy.practice;

/**
 * create by： harry
 * date:  2019/8/10 0010
 **/
public class NodeServiceImpl implements NodeService {
    @Override
    public void createNode(String name) {
        System.out.println(String.format("创建节点%s", name));
    }
}
