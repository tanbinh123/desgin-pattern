package com.harry.design.review.behavior.templatemethod;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:35
 **/
public class ConcreteTactic extends AbstractTacticsTemplate {

    @Override
    protected boolean isGrabPoint() {
        return false;
    }


    @Override
    public void shot() {
        System.out.println("射门");
    }
}
