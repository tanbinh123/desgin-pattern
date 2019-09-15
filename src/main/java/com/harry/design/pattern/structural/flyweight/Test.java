package com.harry.design.pattern.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * Sunny软件公司欲开发一个多功能文档编辑器，在文本文档中可以插入图片、动画、视频等多媒体资料，
 * 为了节约系统资源，相同的图片、
 * 动画和视频在同一个文档中只需保存一份，但是可以多次重复出现，
 * 而且它们每次出现时位置和大小均可不同。试使用享元模式设计该文档编辑器。
 * create by： harry
 * date:  2019/8/8 0008
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        MediaFactory mediaFactory = MediaFactory.getMediaFactory();
        MediaResource jpg1 = mediaFactory.getMediaResource("/home/harry/alfresco/123.jpg");
        jpg1.display(0, 0, 200, 200);
        MediaResource jpg2 = mediaFactory.getMediaResource("/home/harry/alfresco/123.jpg");
        jpg1.display(1, 1, 300, 300);
        log.info("jpg1, jpg2是否为同意对象: {}", jpg1 == jpg2);

        MediaResource gif1 = mediaFactory.getMediaResource("哈哈.gif");
        gif1.display(0, 0, 100, 100);
        MediaResource gif2 = mediaFactory.getMediaResource("哈哈.gif");
        gif2.display(0, 0, 300, 200);
        log.info("gif1, gif2是否为同意对象: {}", gif1 == gif2);

        MediaResource av1 = mediaFactory.getMediaResource("fbiwarning.avi");
        av1.display(0, 0, 100, 100);
        MediaResource av2 = mediaFactory.getMediaResource("fbiwarning.avi");
        av2.display(0, 0, 200, 500);
        log.info("av1, av2是否为同意对象: {}", av1 == av2);

    }
}
