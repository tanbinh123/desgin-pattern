package com.harry.design.review.structural.decorator;

/**
 * create by： harry
 * date:  2019/8/24 0024 下午 6:29
 **/
public class BenzAdvertisement extends UniformDecorator {

    @Override
    public void display() {
        super.display();
        addBenzAdvertisement();
    }

    private void addBenzAdvertisement(){
        System.out.println("添加上奔驰的广告");
    }
}
