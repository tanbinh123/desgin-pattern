package com.harry.design.review.behavior.visitor;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:55
 **/
public class SalivavVisitor implements Visitor {
    @Override
    public void visit(ChinaPlayer chinaPlayer) {
        System.out.println("中国队员基本信息:" + chinaPlayer.toString() + ";得出每场比赛吐口水次数:" + 10);
    }

    @Override
    public void visit(JapanPlayer japanPlayer) {
        System.out.println("日本队员基本信息:" + japanPlayer.toString() + ";得出每场比赛吐口水次数:" + 5);
    }
}
