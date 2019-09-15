package com.harry.design.pattern.behavior.chainofresponsibility;

/**
 * create by： harry
 * date:  2019/8/11 0011
 **/
public class GeneralManager extends Approval {

    public GeneralManager(String name) {
        this.name = name;
    }

    @Override
    public void handleRequest(String name, int day) {
        if (day >= 10 && day < 30) {
            System.out.println(String.format("经理:%s审批请假条,请假人:%s, 请假天数:%s;", this.name, name, day));
        } else {
            System.out.println("拜拜嘞您嘞!");
        }
    }
}
