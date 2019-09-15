package com.harry.design.review.behavior.memento;

import lombok.Data;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 9:46
 **/
@Data
public class EuropeanCup {

    private String playerName;

    private Integer playerAge;

    public EuropeanCup(String name, Integer age){
        this.playerName = name;
        this.playerAge = age;
    }

    public EuropeanMemento save(){
        return new EuropeanMemento(this.playerName, this.playerAge);
    }

    public void restore(EuropeanMemento europeanMemento){
        this.playerAge = europeanMemento.getPlayerAge();
        this.playerName = europeanMemento.getPlayerName();
    }
}
