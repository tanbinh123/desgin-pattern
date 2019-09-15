package com.harry.design.review.behavior.iterator;

/**
 *
 * 迭代器模式：下面出场的是西班牙队：1号守门员卡西利亚斯、3号后卫皮克、6号中场球员伊内斯塔、8号哈维、9号托雷斯......
 * 一个个来，不急，这次是按照球衣号码，下次再按照位置从前到后、从左到右介绍一次。
 * 西班牙队是一个包含多个队员的聚合对象，可以提供一个迭代器来遍历其中的队员。
 *
 * 迭代器模式(Iterator): 提供一种方法顺序访问一个聚合对象中各个元素，而又不需暴露该对象的内部表示。
 * create by： harry
 * date:  2019/8/26 0026 下午 10:51
 **/
public class Test {

    public static void main(String[] args) {
        FootballTeam footballTeam = new SpainTeam();
        footballTeam.addPlayer(new Player("守门员卡西利亚斯", "1号"));
        footballTeam.addPlayer(new Player("后卫皮克", "3号"));
        footballTeam.addPlayer(new Player("中场球员伊内斯塔", "6号"));
        footballTeam.addPlayer(new Player("哈维", "8号"));
        footballTeam.addPlayer(new Player("托雷斯", "9号"));

        FootballTeamIterator iterator = footballTeam.iterator();
        while (iterator.hasNext()){
            Player next = iterator.next();
            System.out.println(next);
        }
    }
}
