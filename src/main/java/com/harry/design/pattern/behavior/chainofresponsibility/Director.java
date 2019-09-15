package com.harry.design.pattern.behavior.chainofresponsibility;

/**
 * create by： harry
 * date:  2019/8/11 0011
 **/
public class Director extends Approval {

    public Director(String name){
        this.name = name;
    }

    @Override
    public void handleRequest(String name, int day) {
        if(day < 3){
            System.out.println(String.format("主任:%s审批请假条,请假人:%s, 请假天数:%s;", this.name, name, day));
        }else{
            this.approval.handleRequest(name, day);
        }
    }
}
