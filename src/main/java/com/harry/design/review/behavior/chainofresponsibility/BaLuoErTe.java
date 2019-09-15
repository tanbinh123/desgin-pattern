package com.harry.design.review.behavior.chainofresponsibility;

import java.util.Objects;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 3:46
 **/
public class BaLuoErTe extends Player {


    public BaLuoErTe(String name){
        this.name = name;
    }

    @Override
    void passBall(String name) {
        if(name.equalsIgnoreCase(this.name)){
            System.out.println(this.name + "收到求，准备进行射门");
        }else {
            System.out.println( this.name + "收到球，不存在:" + name + "队员，只能由" + this.name +"自己射门");
        }
    }
}
