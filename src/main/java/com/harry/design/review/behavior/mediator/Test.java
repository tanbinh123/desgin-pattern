package com.harry.design.review.behavior.mediator;

/**
 *  中介者模式：比赛摔倒怎么办？
 *  看裁判；没顶到球怎么办？看裁判；被踢中要害部位怎么办？
 *  看裁判；球到底进没进，看裁判！。裁判经常是足球赛场的主角，
 *  当两队队员发生冲突时，裁判还是很重要滴，他充当了球员之间的中介者（调停者）。
 *  一切需服从裁判，他才是球场的老大！
 *
 * 中介者模式(Mediator): 用一个中介对象来封装一系列的对象交互；
 * 中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * create by： harry
 * date:  2019/8/26 0026 下午 11:27
 **/
public class Test {

    public static void main(String[] args) {
        Referee refereeMediator = new Referee();
        HitPenisPlayer player1 = new HitPenisPlayer(refereeMediator);
        NoneTouchBallPlayer player2 = new NoneTouchBallPlayer(refereeMediator);
        ShotBallPlayer player3 = new ShotBallPlayer(refereeMediator);
        refereeMediator.hitPenisPlayer = player1;
        refereeMediator.noneTouchBallPlayer = player2;
        refereeMediator.shotBallPlayer = player3;

        player1.handleEvent();
        System.out.println("**********************************");
        player2.handleEvent();
        System.out.println("**********************************");
        player3.handleEvent();
    }
}
