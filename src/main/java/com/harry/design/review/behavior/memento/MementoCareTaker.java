package com.harry.design.review.behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 9:49
 **/
public class MementoCareTaker {

    private List<EuropeanMemento> europeanMementoList = new ArrayList<>(16);

    public void addMemento(EuropeanMemento europeanMemento){
        europeanMementoList.add(europeanMemento);
    }

    public EuropeanMemento getMemento(int i){
        return europeanMementoList.get(i);
    }

}
