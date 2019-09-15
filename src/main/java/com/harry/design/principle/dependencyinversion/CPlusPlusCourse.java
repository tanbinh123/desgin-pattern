package com.harry.design.principle.dependencyinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
@Slf4j
public class CPlusPlusCourse implements  ICourse {

    @Override
    public void studyImoocCourse() {
        log.info("学习C++课程----");
    }
}
