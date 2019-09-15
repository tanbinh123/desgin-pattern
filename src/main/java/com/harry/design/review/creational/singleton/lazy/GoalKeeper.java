package com.harry.design.review.creational.singleton.lazy;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class GoalKeeper {

    private volatile static GoalKeeper goalKeeper = null;

    @Setter
    @Getter
    private String name;

    private GoalKeeper(){};

    public static GoalKeeper getInstance(){
        if(goalKeeper == null){
            synchronized (GoalKeeper.class){
                if(goalKeeper == null){
                    return goalKeeper = new GoalKeeper();
                }
            }
        }
        return goalKeeper;
    }
}
