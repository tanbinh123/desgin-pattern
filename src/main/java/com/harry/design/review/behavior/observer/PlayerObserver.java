package com.harry.design.review.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 10:29
 **/
public class PlayerObserver implements Observer {

    private String name;

    public PlayerObserver(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof CoachSubject){
            System.out.println( name + "收到教练的通知:" + arg);
        }
    }
}
