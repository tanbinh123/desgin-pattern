package com.harry.design.review.behavior.visitor;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:56
 **/
public class FuckVisitor implements Visitor {
    @Override
    public void visit(ChinaPlayer chinaPlayer) {
        System.out.println("中国队员基本信息:" + chinaPlayer.toString() + ";得出每场比赛亲密接触次数:" + 5);
    }

    @Override
    public void visit(JapanPlayer japanPlayer) {
        System.out.println("中国队员基本信息:" + japanPlayer.toString() + ";得出每场比赛亲密接触次数:" + 10);
    }
}
