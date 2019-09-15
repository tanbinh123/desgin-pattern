package com.harry.design.review.behavior.visitor;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:49
 **/
@ToString
@AllArgsConstructor
public class JapanPlayer implements Player{

    private String name;

    private String finishNumber;

    private String height;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
