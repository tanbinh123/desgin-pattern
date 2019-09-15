package com.harry.design.pattern.behavior.observer;

import java.util.ArrayList;

/**
 * create by： harry
 * date:  2019/8/18 0018
 **/
public abstract class Subject {

    protected String stockName;

    protected ArrayList<Observer> observers = new ArrayList<>(16);

    public void addHolder(Observer observer){
        System.out.println("股民:" + observer.getName() + "; 购买股票:" + this.stockName + ";当前购买人数:" + observers.size());
        observers.add(observer);
        if(observers.size() > 5){
            notifyObservers();
        }
    }

    public void removeHolder(Observer observer){
        observers.remove(observer);
    }

    abstract void notifyObservers();

}
