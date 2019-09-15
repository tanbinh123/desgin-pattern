package com.harry.design.pattern.creational.builder.actor;

/**
 * create by： harry
 * date:  2019/7/29 0029
 **/
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildActorType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildActorSex() {
        actor.setSex("男");
    }

    @Override
    public void buildActorFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildActorCostume() {
        actor.setCostume("黑袍");
    }

    @Override
    public void buildActorHairstyle() {
        actor.setHairstyle("光头");
    }

    // 重写钩子方法
    public boolean isBareHead(){
        return true;
    }
}
