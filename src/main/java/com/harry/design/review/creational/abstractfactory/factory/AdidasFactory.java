package com.harry.design.review.creational.abstractfactory.factory;

import com.harry.design.review.creational.abstractfactory.product.*;

/**
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class AdidasFactory extends Factory {
    @Override
    public Football getFootball() {
        return new AdidasFootball();
    }

    @Override
    public Cloth getCloth() {
        return new AdidasCloth();
    }

    @Override
    public Sock getSock() {
        return new AdidasSock();
    }
}
