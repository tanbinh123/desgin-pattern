package com.harry.design.review.structural.brige;

/**
 * 桥接模式：在足球比赛中，
 * 有人踢前锋、有人踢中场（前腰、中卫）、有人踢后卫；当然，
 * 有人习惯踢左边、有人习惯踢右边、也有人喜欢站在中间，
 * 因此诞生了左中卫、右前锋、中后卫、右后卫等名词，难道这不是两个变化维度的组合吗？
 *
 * 桥接模式(Bridge): 将抽象部分与实现部分分离，使它们都可以独立地变化。
 * create by： harry
 * date:  2019/8/22 0022 下午 11:24
 **/
public class Test {

    public static void main(String[] args) {
        Player player = new ForwardPlayer();
        player.setLocation(new LeftLocation());
        player.roleInPlace();
        player.setLocation(new RightLocation());
        player.roleInPlace();
        player.setLocation(new MiddleLocation());
        player.roleInPlace();

        System.out.println("---------------------------");
        Player player2 = new MiddlePlayer();
        player2.setLocation(new LeftLocation());
        player2.roleInPlace();
        player2.setLocation(new RightLocation());
        player2.roleInPlace();
        player2.setLocation(new MiddleLocation());
        player2.roleInPlace();

        System.out.println("---------------------------");
        Player player3 = new GuardPlayer();
        player3.setLocation(new LeftLocation());
        player3.roleInPlace();
        player3.setLocation(new RightLocation());
        player3.roleInPlace();
        player3.setLocation(new MiddleLocation());
        player3.roleInPlace();
    }
}
