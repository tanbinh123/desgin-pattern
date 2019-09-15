package com.harry.design.review.creational.abstractfactory.factory;

import com.harry.design.review.creational.abstractfactory.product.*;

/**
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class NikeFactory extends Factory {
    @Override
    public Football getFootball() {
        return new NikeFootball();
    }

    @Override
    public Cloth getCloth() {
        return new NikeCloth();
    }

    @Override
    public Sock getSock() {
        return new NikeSock();
    }
}
