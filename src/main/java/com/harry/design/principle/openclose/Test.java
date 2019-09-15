package com.harry.design.principle.openclose;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import lombok.var;

import java.math.BigDecimal;

/**
 * create by： 徐齐斌
 * date:  2019/7/14 0014
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(99, "大话设计模式", new BigDecimal(55));
        if(course instanceof  JavaDiscountCourse){
            JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) course;

            log.info("课程id:{}, 课程名称:{}, 课程原价:{}, 课程折扣价:{}",
                    javaDiscountCourse.getId(), javaDiscountCourse.getName(),
                    javaDiscountCourse.getOriginPrice(),
                    javaDiscountCourse.getDisCountPrice().setScale(4,   BigDecimal.ROUND_HALF_UP).doubleValue());
        }
    }
}
