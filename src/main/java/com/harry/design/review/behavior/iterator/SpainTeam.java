package com.harry.design.review.behavior.iterator;

/**
 * create by： harry
 * date:  2019/8/26 0026 下午 11:03
 **/
public class SpainTeam extends FootballTeam {

    @Override
    public FootballTeamIterator iterator() {
        return new SpainTeamIterator(this);
    }
}
