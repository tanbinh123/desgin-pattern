package com.harry.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * create by： harry
 * date:  2019/7/23 0023
 **/
@Slf4j
public class Test {
    public static void main(String[] args) {
       Course course = new Course.CourseBuilder().buildName("java设计模式精讲")
                .buildPpt("java设计模式ppt").buildQa("java设计模式问答").build();
        //log.info(course.toString());
        int a = 23;
        ImmutableList<Integer> list = ImmutableList.of(a, 12);
        List<Integer> list2 = new ArrayList<>();
        list2.add(a);
        list2.add(12);
        log.info("list:{}; list2:{};", list, list2);
        a = 232;
        log.info("list:{}; list2:{};", list, list2);
    }
}
