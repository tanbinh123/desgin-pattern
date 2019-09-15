package com.harry.design.review.behavior.chainofresponsibility;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 3:36
 **/
public abstract class Player {

    protected String name;

    @Setter
    protected Player successor;

    public void setSuccessor(Player successor) {
        this.successor = successor;
    }

    abstract void passBall(String name);
}
