package com.harry.design.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 * create by： harry
 * date:  2019/8/18 0018
 **/
public class StockSubject extends Subject {

    public StockSubject(String stockName){
        this.stockName = stockName;
    }

    @Override
    void notifyObservers() {
        for (Observer observer : observers) {
            observer.OverFivePeople(this.stockName);
        }
    }
}
