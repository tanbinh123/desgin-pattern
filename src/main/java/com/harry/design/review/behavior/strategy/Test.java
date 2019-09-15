package com.harry.design.review.behavior.strategy;

/**
 *  策略模式：据说1863年足球刚开始的时候流行
 *  1-0-9阵型，1个后卫，9个前锋，木有越位，惊讶。
 *  随着足球的发展，现代足球阵型的变化越来越多，面对防守型球队，可以选择3-5-3阵型，面对攻击性强的球队，可以选择5-4-1阵型，
 *  当然还有经典的4-4-2。每一种阵型都是一种策略，面对不同的对手可以选择不同的策略。
 *
 * 策略模式(Strategy): 定义一系列的算法,把它们一个个封装起来，并且使它们可相互替换，策略模式使得算法的变化可独立于使用它的客户。
 * create by： harry
 * date:  2019/8/27 0027 下午 11:07
 **/
public class Test {

    public static void main(String[] args) {
        CompetitionContext competitionContext = new CompetitionContext();
        competitionContext.setTeamFormation(new FiveFourOne());
        competitionContext.showFormation();

        competitionContext.setTeamFormation(new OneONineFormation());
        competitionContext.showFormation();

        competitionContext.setTeamFormation(new FourFourOne());
        competitionContext.showFormation();

        competitionContext.setTeamFormation(new ThreeFiveThreeFormation());
        competitionContext.showFormation();
    }
}
