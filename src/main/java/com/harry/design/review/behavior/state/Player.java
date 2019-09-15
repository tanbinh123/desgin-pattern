package com.harry.design.review.behavior.state;

import java.util.Currency;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 10:56
 **/
public class Player {

    private PlayerState currentState, dreamState, excitingState, weakState;

    public Player(){
        dreamState = new DreamState();
        excitingState = new ExcitingState();
        weakState = new WeakState();
        currentState = dreamState;
    }

    public void weak(){
        currentState = weakState;
    }

    public void dream(){
        currentState = dreamState;
    }

    public void exciting(){
        currentState = excitingState;
    }

    public void shot(){
        currentState.shotHandler();
    }
}
