package com.harry.design.review.structural.facade;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 1:19
 **/
public class Member {

    public void talk(String topic){
        System.out.println(String.format("额，关于这个话题[%s],作为成员的我是这样看的", topic));
    }
}
