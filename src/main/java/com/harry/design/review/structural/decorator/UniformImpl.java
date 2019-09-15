package com.harry.design.review.structural.decorator;

/**
 * create by： harry
 * date:  2019/8/24 0024 下午 6:19
 **/
public class UniformImpl implements FootballUniform {

    private String name;

    public UniformImpl(String name){
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("展示足球服:"  + name);
    }
}
