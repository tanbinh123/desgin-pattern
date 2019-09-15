package com.harry.design.review.behavior.mediator;

/**
 * create by： harry
 * date:  2019/8/26 0026 下午 11:48
 **/
public class ShotBallPlayer extends Player {

    public ShotBallPlayer(RefereeMediator refereeMediator) {
        super(refereeMediator);
    }

    @Override
    void action() {
        System.out.println("射门，球讲道理，有没有进?");
    }
}
