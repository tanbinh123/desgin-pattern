package com.harry.design.pattern.creational.builder.actor;

/**
 * create by： harry
 * date:  2019/7/29 0029
 **/
public class AngleBuilder extends ActorBuilder {
    @Override
    public void buildActorType() {
        actor.setType("天使");
    }

    @Override
    public void buildActorSex() {
        actor.setSex("女");
    }

    @Override
    public void buildActorFace() {
        actor.setFace("美丽");
    }

    @Override
    public void buildActorCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void buildActorHairstyle() {
        actor.setHairstyle("长发齐腰");
    }
}
