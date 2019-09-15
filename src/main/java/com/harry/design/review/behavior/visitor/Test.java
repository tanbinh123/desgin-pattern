package com.harry.design.review.behavior.visitor;

/**
 * 访问者模式：有些从事足球比赛研究的人很喜欢数据。
 * 有的专门研究一场比赛中每个球员的跑动距离，有的研究每个球员的抢断次数，有的研究每个球员的射门次数，
 * 有的研究球员传球次数，有的研究球员传球成功率......如果将每一种研究类型看成一个访问者，
 * 那么球队就是一个包含多个队员元素的对象结构，以供不同访问者来研究，微笑，当然，我们还可以很方便地增加新的访问者（研究者），
 * 例如，研究每个球员在比赛中吐口水的次数，研究每个球员在比赛中与对方球员“亲密接触”次数......
 *
 * 访问者模式(Visitor): 表示一个作用于某对象结构中的各元素的操作，可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * create by： harry
 * date:  2019/8/27 0027 下午 11:36
 **/
public class Test {

    public static void main(String[] args) {
        Visitor visitor = new FuckVisitor();
        Player player = new ChinaPlayer("徐齐斌", "1斤", "178cm");
        Player player2 = new JapanPlayer("harry", "2斤", "172cm");
        player.accept(visitor);
        System.out.println("---------------------------");
        player2.accept(visitor);

        System.out.println("*********************************");

        Visitor visitor2 = new SalivavVisitor();
        player.accept(visitor2);
        System.out.println("---------------------------");
        player2.accept(visitor2);
    }
}
