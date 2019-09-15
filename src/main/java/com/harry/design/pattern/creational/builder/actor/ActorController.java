package com.harry.design.pattern.creational.builder.actor;

/**
 *  角色指挥者
 * create by： harry
 * date:  2019/7/29 0029
 **/
public class ActorController {

    public Actor construct(ActorBuilder actorBuilder){
        actorBuilder.buildActorType();
        actorBuilder.buildActorCostume();
        actorBuilder.buildActorFace();
        actorBuilder.buildActorSex();
        // 通过钩子方法来判断是否构建该部件
        if(!actorBuilder.isBareHead()){
            actorBuilder.buildActorHairstyle();
        }
        Actor actor = actorBuilder.getActor();
        return actor;
    }
}
