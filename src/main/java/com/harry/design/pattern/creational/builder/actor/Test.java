package com.harry.design.pattern.creational.builder.actor;

/**
 * ActorController充当指挥者，ActorBuilder充当抽象建造者，
 * HeroBuilder、AngelBuilder和DevilBuilder充当具体建造者，Actor充当复杂产品。完整代码如下所示：
 * //Actor角色类：复杂产品，考虑到代码的可读性，只列出部分成员属性，且成员属性的类型均为String，
 * 真实情况下，有些成员属性的类型需自定义
 * create by： harry
 * date:  2019/7/29 0029
 **/
public class Test {

    public static void main(String[] args) {
        // 1.带指挥者模式的建造
        System.out.println("------------带指挥者模式的建造---------------");
        ActorController actorController = new ActorController();
        Actor devil = actorController.construct(new DevilBuilder());
        System.out.println(devil);
        Actor angle = actorController.construct(new AngleBuilder());
        System.out.println(angle);
        Actor hero = actorController.construct(new HeroBuilder());
        System.out.println(hero);

        // 2.去除指挥者模式的建造
        System.out.println("------------构造者直接建造---------------");
        ActorBuilder devilBuilder = new DevilBuilder();
        Actor devil2 = devilBuilder.constructor();
        System.out.println(devil2);
        ActorBuilder angleBuilder = new AngleBuilder();
        Actor angle2 = angleBuilder.constructor();
        System.out.println(angle2);
        ActorBuilder heroBuilder = new HeroBuilder();
        Actor heroBuilder2 = heroBuilder.constructor();
        System.out.println(heroBuilder2);

    }
}
