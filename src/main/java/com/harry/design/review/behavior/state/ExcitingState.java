package com.harry.design.review.behavior.state;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:03
 **/
public class ExcitingState implements PlayerState {
    @Override
    public void shotHandler() {
        System.out.println("亢奋状态，全场包赢");
    }
}
