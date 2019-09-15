package com.harry.design.pattern.behavior.observer;

/**
 * create by： harry
 * date:  2019/8/18 0018
 **/
public interface Observer {

    String getName();

    void OverFivePeople(String stockName);

    void buyStock(Subject subject);
}
