package com.harry.design.review.structural.proxy;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 2:08
 **/
public class PlayerProxy implements Player {

    private Player player;

    public PlayerProxy(Player player){
        this.player = player;
    }

    @Override
    public void advertisement(BigDecimal money) {
        System.out.println("经纪人:对比片酬报价是否满足要求");
        if(money.compareTo(new BigDecimal("10000")) != 1){
            System.out.println("片酬太少，请不到小春");
            return;
        }
        System.out.println("--------------------");
        player.advertisement(money);
        System.out.println("--------------------");
        System.out.println("经纪人:广告拍完，准备结算片酬");
    }

    @Override
    public void interview(LocalDate localDate) {
        System.out.println("经纪人: 查看:" + localDate + ";球员是否有空");
        if(localDate.isBefore(LocalDate.of(2018, 8, 25))){
            System.out.println("经纪人:球员没空，拒绝本次采访");
            return;
        }
        System.out.println("--------------------");
        player.interview(localDate);
        System.out.println("--------------------");

        System.out.println("经纪人:采访结束，安排下次会谈");
    }

}
