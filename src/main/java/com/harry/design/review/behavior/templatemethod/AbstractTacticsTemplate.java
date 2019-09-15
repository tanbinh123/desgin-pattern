package com.harry.design.review.behavior.templatemethod;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:30
 **/
public abstract class AbstractTacticsTemplate {

    public void templateMethod(){
        openBall();
        passBall();
        if(isGrabPoint()){
            grabPoint();
        }
        shot();
    }

    public void openBall(){
        System.out.println("开球");
    }

    public void passBall(){
        System.out.println("传球");
    }

    public void grabPoint(){
        System.out.println("抢点");
    }

    abstract public void shot();

    protected boolean isGrabPoint(){
        return true;
    }
}
