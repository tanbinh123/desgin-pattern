package com.harry.design.review.behavior.mediator;

/**
 * create by： harry
 * date:  2019/8/26 0026 下午 11:42
 **/
public class NoneTouchBallPlayer extends Player {


    public NoneTouchBallPlayer(RefereeMediator refereeMediator) {
        super(refereeMediator);
    }

    @Override
    void action() {
        System.out.println("没顶到球的玩家再顶一次");
    }
}
