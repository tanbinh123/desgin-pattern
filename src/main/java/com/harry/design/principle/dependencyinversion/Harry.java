package com.harry.design.principle.dependencyinversion;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;

/**
 *
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
@Slf4j
public class Harry {

    private ICourse iCourse;

    /*public Harry(ICourse iCourse){
        this.iCourse = iCourse;
    }*/

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyImoocCourse();
    }
}
