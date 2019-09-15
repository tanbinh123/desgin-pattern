package com.harry.design.review.behavior.state;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:02
 **/
public class DreamState implements PlayerState {
    @Override
    public void shotHandler() {
        System.out.println("梦游状态思考人生");
    }
}
