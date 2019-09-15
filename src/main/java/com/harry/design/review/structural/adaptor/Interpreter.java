package com.harry.design.review.structural.adaptor;

import com.harry.design.review.creational.factorymethod.product.Football;

/**
 * create by： harry
 * date:  2019/8/22 0022 下午 11:14
 **/
public class Interpreter implements Coach {

    private FootballTeam footballTeam;

    public Interpreter(FootballTeam footballTeam){
        this.footballTeam = footballTeam;
    }


    @Override
    public void pass(String englishCommand) {
        footballTeam.pass(translate(englishCommand));
    }

    @Override
    public void shoot(String englishCommand) {
        footballTeam.shoot(translate(englishCommand));
    }

    @Override
    public void goal(String englishCommand) {
        footballTeam.goal(translate(englishCommand));
    }
    
    private String translate(String english){
        String chinese = "这是中文(" +  english.toUpperCase() + ")";
        return chinese;
    }
}
