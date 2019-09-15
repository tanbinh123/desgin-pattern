package com.harry.design.review.behavior.iterator;

import java.util.List;

/**
 * create by： harry
 * date:  2019/8/26 0026 下午 11:05
 **/
public class SpainTeamIterator implements FootballTeamIterator {

    private FootballTeam footballTeam;

    private Integer currentIndex;

    private List<Player> playerList;

    public SpainTeamIterator(FootballTeam footballTeam){
        this.footballTeam = footballTeam;
        currentIndex = 0;
        playerList =  footballTeam.getPlayerList();
    }

    @Override
    public Player next() {
        if(hasNext()){
            return playerList.get(currentIndex++);
        }
        throw new RuntimeException("读取越界——-");
    }

    @Override
    public boolean hasNext() {
        if(currentIndex < playerList.size()){
            return true;
        }
        return false;
    }
}
