package com.harry.design.review.structural.brige;

/**
 * create by： harry
 * date:  2019/8/22 0022 下午 11:34
 **/
public class GuardPlayer extends Player {
    @Override
    public void roleInPlace() {
        System.out.println("我是后卫, 我喜欢的位置是:" + location.location() + ";所以我是:" + location.location() +"后卫");
    }
}
