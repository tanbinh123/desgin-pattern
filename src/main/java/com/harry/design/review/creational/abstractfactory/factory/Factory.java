package com.harry.design.review.creational.abstractfactory.factory;

import com.harry.design.review.creational.abstractfactory.product.Cloth;
import com.harry.design.review.creational.abstractfactory.product.Football;
import com.harry.design.review.creational.abstractfactory.product.Sock;

/**
 * create by： harry
 * date:  2019/8/21 0021
 **/
public abstract class Factory {

    abstract public Football getFootball();

    abstract public Cloth getCloth();

    abstract public Sock getSock();

}
