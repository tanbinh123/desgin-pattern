package com.harry.design.review.structural.brige;

/**
 * create by： harry
 * date:  2019/8/22 0022 下午 11:26
 **/
public abstract class Player {

    protected Location location;

    public void setLocation(Location location) {
        this.location = location;
    }

    abstract public void roleInPlace();
}
