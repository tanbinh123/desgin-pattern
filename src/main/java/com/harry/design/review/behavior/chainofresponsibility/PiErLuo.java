package com.harry.design.review.behavior.chainofresponsibility;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 3:45
 **/
public class PiErLuo extends Player {


    public PiErLuo(String name){
        this.name = name;
    }

    @Override
    void passBall(String name) {
        if(name.equalsIgnoreCase(this.name)){
            System.out.println(this.name + "收到求，准备进行射门");
        }else {
            System.out.println(this.name + "收到球，准备传给下一位");
            this.successor.passBall(name);
        }
    }
}
