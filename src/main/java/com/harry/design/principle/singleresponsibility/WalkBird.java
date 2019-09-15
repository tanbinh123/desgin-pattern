package com.harry.design.principle.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
@Slf4j
public class WalkBird implements Bird {
    @Override
    public void MainMoveMethod(String birdName) {
        log.info("{}用脚走", birdName);
    }
}
