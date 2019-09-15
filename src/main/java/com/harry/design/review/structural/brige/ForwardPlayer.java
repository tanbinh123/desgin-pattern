package com.harry.design.review.structural.brige;

/**
 * create by： harry
 * date:  2019/8/22 0022 下午 11:31
 **/
public class ForwardPlayer extends Player {
    @Override
    public void roleInPlace() {
        System.out.println("我是前锋, 我喜欢的位置是:" + location.location() + ";所以我是:" + location.location() +"前锋");
    }
}
