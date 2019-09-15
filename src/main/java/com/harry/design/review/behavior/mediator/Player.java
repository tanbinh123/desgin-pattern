package com.harry.design.review.behavior.mediator;

/**
 * create by： harry
 * date:  2019/8/26 0026 下午 11:38
 **/
public abstract class Player {

    private RefereeMediator refereeMediator;

    public Player(RefereeMediator refereeMediator){
        this.refereeMediator = refereeMediator;
    }

    public void handleEvent(){
        refereeMediator.handleBehavior(this);
    }

    abstract void action();

}
