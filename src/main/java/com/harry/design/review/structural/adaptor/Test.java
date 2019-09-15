package com.harry.design.review.structural.adaptor;

/**
 *
 * 适配器模式：很多足球队都喜欢请外国教练
 * （其中有一支我们都非常熟悉的国家队，名字偶就不说了，大家都懂的，微笑），
 * 外国教练请回来通常很难跟队员直接交流（语言不通），因此需要配翻译，
 * 此时，翻译充当了教练和队员之间的适配器，负责协调教练和队员之间的交流。
 * 例如：pass --> shoot --> goal 转换 传球 --> 射门 --> 进球
 *
 * 适配器模式(Adapter): 将一个类的接口转换成用户希望的另一个接口，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * create by： harry
 * date:  2019/8/22 0022 下午 11:03
 **/
public class Test {

    public static void main(String[] args) {
        Coach coach = new Interpreter(new FootballTeam());
        coach.pass("please pass");
        coach.shoot("please pass");
        coach.goal("please pass");

    }
}
