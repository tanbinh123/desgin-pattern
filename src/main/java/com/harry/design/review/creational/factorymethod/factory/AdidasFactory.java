package com.harry.design.review.creational.factorymethod.factory;

import com.harry.design.review.creational.factorymethod.product.AdidasFootBall;
import com.harry.design.review.creational.factorymethod.product.Football;

/**
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class AdidasFactory extends FootballFactory {
    @Override
    public Football getFootball() {
        return new AdidasFootBall();
    }
}
