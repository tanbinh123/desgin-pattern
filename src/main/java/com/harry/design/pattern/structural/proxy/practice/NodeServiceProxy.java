package com.harry.design.pattern.structural.proxy.practice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Date;

/**
 * create by： harry
 * date:  2019/8/10 0010
 **/
public class NodeServiceProxy implements NodeService {

    private NodeService nodeService;

    public NodeServiceProxy(NodeService nodeService){
        this.nodeService = nodeService;
    }

    @Override
    public void createNode(String name) {
        System.out.println(String.format("方法createNode(%s)被调用,调用时间为:%s", name, new Date()));
        nodeService.createNode(name);
        System.out.println("方法调用成功");
    }
}
