package com.harry.design.pattern.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： harry
 * date:  2019/8/8 0008
 **/
@Slf4j
public abstract class MediaResource {

    abstract String getMessage();

    /** 坐标与大小是实际享元对象的外部状态 **/
    public void display(int x, int y, int width, int height){
        log.info("坐标:({}, {}), 大小({}, {}), 信息({})", x, y, width, height, getMessage());
    }
}
