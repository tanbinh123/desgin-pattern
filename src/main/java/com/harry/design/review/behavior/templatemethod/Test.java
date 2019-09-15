package com.harry.design.review.behavior.templatemethod;

/**
 * 模板方法模式：“角球！这是意大利的机会，
 * 今天意大利面对全面占优的西班牙办法不多，定位球可能是最有效的破门方式了。
 * 皮尔洛开出一个战术角球，传给卡萨诺，卡萨诺传前点，马尔基西奥头球抢点，球顶高了。
 * 不过这次角球配合设计得很精妙，给西班牙带来了威胁，可惜整场比赛这种机会不多啊！！”。
 * 在战术角球中，A开球、B传球、C抢点再射门，这是一个战术的框架，当然C到底是抢前点还是抢后点可以根据实际情况来选择，
 * 如果将踢战术角球设计为一个模板方法，那么每一个步骤就是其中要调用的基本方法了，而且在不同战术中某些具体步骤的实施还各不相同。
 * Perfect！真是模板方法模式的非典型应用！
 *
 * 模板方法模式(Template Method): 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，
 * 使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * create by： harry
 * date:  2019/8/27 0027 下午 11:22
 **/
public class Test {

    public static void main(String[] args) {
        AbstractTacticsTemplate abstractTacticsTemplate = new ConcreteTactic();
        abstractTacticsTemplate.templateMethod();
    }
}
