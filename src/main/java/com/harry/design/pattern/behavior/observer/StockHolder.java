package com.harry.design.pattern.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Observable;

/**
 * create by： harry
 * date:  2019/8/18 0018
 **/
@AllArgsConstructor
public class StockHolder implements Observer {

    @Getter
    private String name;

    @Override
    public void OverFivePeople(String stockName) {
        System.out.println("亲爱的股民: " + this.name + ",您购买的股票:" + stockName + ";涨幅查过5%");
    }

    @Override
    public void buyStock(Subject subject) {
        subject.addHolder(this);
    }
}
