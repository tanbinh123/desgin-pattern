package com.harry.design.pattern.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： harry
 * date:  2019/7/17 0017
 **/
@Slf4j
public class FEVideo extends Video{

    @Override
    void produceVideo() {
        log.info("录制{}视频中", "前端");
    }
}
