package com.harry.design.review.behavior.chainofresponsibility;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 3:42
 **/
public class JiYeLiEr extends Player {


    public JiYeLiEr(String name){
        this.name = name;
    }

    @Override
    void passBall(String name) {
        if(name.equalsIgnoreCase("基耶利尼")){
            System.out.println("基耶利尼收到求，准备进行射门");
        }else {
            System.out.println("基耶利尼收到球，准备传给下一位");
            this.successor.passBall(name);
        }
    }
}
