package com.harry.design.review.creational.singleton.hunger;

/**
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class GoalKeeper {

    private static GoalKeeper goalKeeper = new GoalKeeper();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private GoalKeeper(){}

    public static GoalKeeper getInstance(){
        return goalKeeper;
    }
}
