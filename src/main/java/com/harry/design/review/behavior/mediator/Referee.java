package com.harry.design.review.behavior.mediator;

/**
 * create by： harry
 * date:  2019/8/26 0026 下午 11:49
 **/
public class Referee implements RefereeMediator {

    public HitPenisPlayer hitPenisPlayer;

    public NoneTouchBallPlayer noneTouchBallPlayer;

    public ShotBallPlayer shotBallPlayer;

    @Override
    public void handleBehavior(Player player) {
        if(hitPenisPlayer == player) {
            System.out.println("踢中要害——---");
            noneTouchBallPlayer.action();
            shotBallPlayer.action();
        }else if(noneTouchBallPlayer == player) {
            System.out.println("没有顶到球");
            noneTouchBallPlayer.action();
        }else if(shotBallPlayer == player) {
            System.out.println("射门------");
            hitPenisPlayer.action();
        }
    }
}
