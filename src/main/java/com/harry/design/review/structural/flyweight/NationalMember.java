package com.harry.design.review.structural.flyweight;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 1:36
 **/
public abstract class NationalMember {

    abstract String  getNationMember();

    public void display(String number){
        System.out.println(getNationMember() + ";第:" + number + "号队员");
    }
}
