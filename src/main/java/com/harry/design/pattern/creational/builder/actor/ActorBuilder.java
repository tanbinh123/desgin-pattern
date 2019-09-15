package com.harry.design.pattern.creational.builder.actor;

/**
 *  抽象角色建造者
 * create by： harry
 * date:  2019/7/29 0029
 **/
public abstract class ActorBuilder {


    protected Actor actor = new Actor();

    public abstract void buildActorType();

    public abstract void buildActorSex();

    public abstract void buildActorFace();

    public abstract void buildActorCostume();

    public abstract void buildActorHairstyle();

    public Actor getActor(){
        return actor;
    }

    // 添加钩子方法
    public boolean isBareHead(){
        return false;
    }

    public Actor constructor(){
        this.buildActorType();
        this.buildActorCostume();
        this.buildActorFace();
        this.buildActorSex();
        this.buildActorHairstyle();
        return this.actor;
    }
    
}
