package com.harry.design.review.behavior.command;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 4:25
 **/
public class CoachInvoker {

    private String name;

    public CoachInvoker(String name){
        this.name = name;
    }

    @Setter
    private Command command;

    public void sendCommand(){
        this.command.executeCommand();
    }
}
