package com.harry.design.review.behavior.visitor;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:48
 **/
public interface Visitor {

    void visit(ChinaPlayer chinaPlayer);

    void visit(JapanPlayer japanPlayer);
}
