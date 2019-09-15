package com.harry.design.review.behavior.state;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:03
 **/
public class WeakState implements PlayerState {
    @Override
    public void shotHandler() {
        System.out.println("虚弱状态射不进");
    }
}
