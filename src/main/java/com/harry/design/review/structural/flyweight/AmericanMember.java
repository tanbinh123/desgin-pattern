package com.harry.design.review.structural.flyweight;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 1:42
 **/
public class AmericanMember extends NationalMember {

    private String name;

    public AmericanMember(String name){
        this.name = name;
    }

    @Override
    String getNationMember() {
        return name;
    }
}
