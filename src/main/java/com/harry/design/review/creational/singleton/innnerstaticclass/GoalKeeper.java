package com.harry.design.review.creational.singleton.innnerstaticclass;

import lombok.Getter;
import lombok.Setter;

/**
 * create by： harry
 * date:  2019/8/21 0021
 **/
public class GoalKeeper {

    private GoalKeeper() {}

    @Setter
    @Getter
    private String name;

    private static class GoalKeeperHolder{
        private static GoalKeeper goalKeeper = new GoalKeeper();
    }

    public static GoalKeeper getInstance(){
        return GoalKeeperHolder.goalKeeper;
    }
}
