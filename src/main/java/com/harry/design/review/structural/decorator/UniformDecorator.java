package com.harry.design.review.structural.decorator;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/8/24 0024 下午 6:20
 **/
public abstract class UniformDecorator implements FootballUniform {


    @Setter
    protected FootballUniform footballUniform;

    @Setter
    protected String name;

    @Override
    public void display() {
        footballUniform.display();
    }
}
