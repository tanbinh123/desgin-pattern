package com.harry.design.review.structural.flyweight;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 1:37
 **/
public class ChineseMember extends NationalMember {

    private String name;

    public ChineseMember(String name){
        this.name = name;
    }

    @Override
    String getNationMember() {
        return name;
    }

}
