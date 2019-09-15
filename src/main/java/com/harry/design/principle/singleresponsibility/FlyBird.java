package com.harry.design.principle.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
@Slf4j
public class FlyBird implements  Bird {

    @Override
    public void MainMoveMethod(String birdName) {
        log.info("{}用翅膀飞", birdName);
    }
}
