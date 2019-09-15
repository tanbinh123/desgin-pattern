package com.harry.design.pattern.behavior.chainofresponsibility;

/**
 * Sunny软件公司的OA系统需要提供一个假条审批模块：
 * 如果员工请假天数小于3天，主任可以审批该假条；如果员工请假天数大于等于3天，
 * 小于10天，经理可以审批；如果员工请假天数大于等于10天，小于30天，
 * 总经理可以审批；如果超过30天，总经理也不能审批，
 * 提示相应的拒绝信息。试用职责链模式设计该假条审批模块。
 * 版权声明：本文为CSDN博主「Liuwei-Sunny」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/lovelion/article/details/7420902
 * create by： harry
 * date:  2019/8/11 0011
 **/
public class Test {

    public static void main(String[] args) {
        Approval director = new Director("jennifer");
        Approval manager = new Manager("iris");
        Approval generalManager = new GeneralManager("henry");
        director.setApproval(manager);
        manager.setApproval(generalManager);

        director.handleRequest("harry", 2);
        System.out.println("****************************");
        director.handleRequest("harry", 3);
        System.out.println("****************************");
        director.handleRequest("harry", 11);
        System.out.println("****************************");
        director.handleRequest("harry", 30);
        System.out.println("****************************");
    }
}
