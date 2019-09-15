package com.harry.design.review.structural.proxy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 2:05
 **/
public class PlayerImpl implements Player {
    @Override
    public void advertisement(BigDecimal money) {
        System.out.println("我是陈小春,是兄弟就来砍我; 获取报酬:" + money);
    }

    @Override
    public void interview(LocalDate date) {
        System.out.println("额，今天是:" + date + "就只有今天有空; 很荣幸能够接受央视的专访");
    }
}
