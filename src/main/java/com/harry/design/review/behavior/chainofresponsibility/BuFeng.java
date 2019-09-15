package com.harry.design.review.behavior.chainofresponsibility;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 3:39
 **/
public class BuFeng extends Player {

    public BuFeng(String name){
        this.name = name;
    }

    @Override
    void passBall(String name) {
        System.out.println(this.name + "收到球，准备传递给下一位");
        this.successor.passBall(name);
    }
}
