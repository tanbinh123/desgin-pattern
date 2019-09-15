package com.harry.design.pattern.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： harry
 * date:  2019/7/18 0018
 **/
@Slf4j
public class PhythonVideo extends Video  {
    @Override
    void produceVideo() {
        log.info("正在录制{}视频", "phython");
    }
}