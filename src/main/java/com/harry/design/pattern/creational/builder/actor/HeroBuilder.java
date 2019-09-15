package com.harry.design.pattern.creational.builder.actor;

/**
 * create by： harry
 * date:  2019/7/29 0029
 **/
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildActorType() {
        actor.setType("英雄");
    }

    @Override
    public void buildActorSex() {
        actor.setSex("男");
    }

    @Override
    public void buildActorFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildActorCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildActorHairstyle() {
        actor.setHairstyle("短发");
    }
}
