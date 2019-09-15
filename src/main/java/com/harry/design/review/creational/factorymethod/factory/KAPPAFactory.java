package com.harry.design.review.creational.factorymethod.factory;

import com.harry.design.review.creational.factorymethod.product.Football;
import com.harry.design.review.creational.factorymethod.product.KAPPAFootBALL;

/**
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class KAPPAFactory extends FootballFactory {
    @Override
    public Football getFootball() {
        return new KAPPAFootBALL();
    }
}
