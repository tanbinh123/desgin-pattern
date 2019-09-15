package com.harry.design.review.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * create by： harry
 * date:  2019/8/26 0026 下午 10:55
 **/
public abstract class FootballTeam {

    protected List<Player> playerList = new ArrayList<>(16);

    public void addPlayer(Player player){
        playerList.add(player);
    }

    public void remove(Player player){
        playerList.remove(player);
    }

    public List<Player> getPlayerList(){
        return playerList;
    }

    abstract public FootballTeamIterator iterator();
}
