package com.harry.design.pattern.behavior.mediator;

/**
 * create by： harry
 * date:  2019/8/18 0018
 **/
public abstract class Pane {

    protected Mediator mediator;


    public void handleBehavior(){
        mediator.handleBehavior();
    }

    abstract void myBehavior();

}
