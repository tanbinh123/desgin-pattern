package com.harry.design.review.behavior.mediator;

/**
 * create by： harry
 * date:  2019/8/26 0026 下午 11:47
 **/
public class HitPenisPlayer extends Player {

    public HitPenisPlayer(RefereeMediator refereeMediator) {
        super(refereeMediator);
    }

    @Override
    void action() {
        System.out.println("我被踢中要害，快速拨打119");
    }
}
