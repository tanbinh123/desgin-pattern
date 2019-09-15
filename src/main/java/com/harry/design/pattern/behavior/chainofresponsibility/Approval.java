package com.harry.design.pattern.behavior.chainofresponsibility;

/**
 * create by： harry
 * date:  2019/8/11 0011
 **/
public abstract class Approval {

    protected Approval approval;

    protected String name;

    public void setApproval(Approval approval) {
        this.approval = approval;
    }

    public abstract void handleRequest(String name, int day);
}
