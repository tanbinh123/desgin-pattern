package com.harry.design.pattern.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： 徐齐斌
 * date:  2019/7/16 0016
 **/
@Slf4j
public class PhythonVideo extends Video {

    @Override
    void produceVideo() {
        log.info("录制{}课程中", "phython");
    }
}
