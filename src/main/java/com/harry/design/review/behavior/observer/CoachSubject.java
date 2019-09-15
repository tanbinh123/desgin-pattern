package com.harry.design.review.behavior.observer;

import java.util.Observable;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 10:18
 **/
public class CoachSubject extends Observable {

    public void handShow(){
        setChanged();
        this.notifyObservers("全员压上");
    }

    public void gameOver(){
        setChanged();
        this.notifyObservers("游戏结束");
    }
}
