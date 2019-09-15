package com.harry.design.pattern.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： 徐齐斌
 * date:  2019/7/16 0016
 **/
@Slf4j
public class JavaVideo extends Video {

    @Override
    void produceVideo() {
        log.info("录制{}课程中", "java");
    }
}
