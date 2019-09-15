package com.harry.design.pattern.creational.factorymethod;


import lombok.extern.slf4j.Slf4j;

/** 简单工程类，通过传入的参数，来获取所需要的对象，不关注对象创建的细节
 * create by： 徐齐斌
 * date:  2019/7/16 0016
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new PhythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produceVideo();
        VideoFactory videoFactory1 = new FEVideoFactory();
        videoFactory1.getVideo().produceVideo();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        videoFactory2.getVideo().produceVideo();
    }
}
