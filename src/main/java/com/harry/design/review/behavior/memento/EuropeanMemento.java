package com.harry.design.review.behavior.memento;

import lombok.Data;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 9:48
 **/
@Data
public class EuropeanMemento {

    private String playerName;

    private Integer playerAge;

    public EuropeanMemento(String name, Integer age){
        this.playerName = name;
        this.playerAge = age;
    }
}
