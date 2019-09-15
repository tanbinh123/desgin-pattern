package com.harry.design.pattern.creational.simplefactory;


import lombok.extern.slf4j.Slf4j;

import java.rmi.registry.Registry;
import java.sql.Connection;

/** 简单工程类，通过传入的参数，来获取所需要的对象，不关注对象创建的细节
 * create by： 徐齐斌
 * date:  2019/7/16 0016
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        //v1: 原始的对象创建方法，应用层需要知道对象的创建细节
        /*Video video = new JavaVideo();
        video.produceVideo();
        Video video1 = new PhythonVideo();
        video1.produceVideo();*/

        // v2: 通过简单工程类，传入的对象参数,来获取相应的产品实例(局限: 每次新增一个新的产品需要去修改工厂类，违背开闭原则)
        /*Video video = VideoFactory.getVideo("java");
        video.produceVideo();*/

        // v3: 通过反射,以达到创建产品时不需要去修改工厂类
        Video video = VideoFactory.getVideo(JavaVideo.class);
        if(video != null){
            video.produceVideo();
        }
    }
}
