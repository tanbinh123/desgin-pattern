package com.harry.design.review.structural.decorator;

/**
 * create by： harry
 * date:  2019/8/24 0024 下午 6:23
 **/
public class AdidasAdvertisement extends UniformDecorator {

    @Override
    public void display() {
        super.display();
        addAdidasAdvertisement();
    }

    private void addAdidasAdvertisement(){
        System.out.println("添加阿迪达斯的广告");
    }
}
