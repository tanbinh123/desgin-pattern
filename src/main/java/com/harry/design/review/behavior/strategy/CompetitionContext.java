package com.harry.design.review.behavior.strategy;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/8/27 0027 下午 11:18
 **/
public class CompetitionContext {

    @Setter
    private TeamFormation teamFormation;

    private String teamName;

    private String teamRank;

    public void showFormation(){
        System.out.println("敌军还有30秒到达战场，阵容应对中");
        teamFormation.showFormation();
    }
}
