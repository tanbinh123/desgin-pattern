package com.harry.design.review.structural.facade;

/**
 * 外观模式：为了给记者和球队（球员、教练等）提供一个交流的平台，
 * 欧洲杯组委会在每场足球比赛前后都安排了新闻发布会，
 * 记者可以通过新闻发布会来与球队进行沟通交流（虽然不是每个队员会出现在新闻发布会上），
 * 在此，新闻发布会充当了记者（客户端）和队员、教练（子系统）之间的外观角色。
 * 当然，新闻发布会并不会影响某位记者单独采访某位球员（这一点也与外观类的定义一致，微笑）。
 *
 * 外观模式(Facade): 子系统中的一组接口提供一个一致的界面，定义一个高层接口，这个接口使得这一子系统更加容易使用。
 * create by： harry
 * date:  2019/8/24 0024 下午 6:34
 **/
public class Test {

    public static void main(String[] args) {
        NewsPublish newsPublish = new NewsPublishImpl(new Member(), new Coach());

        newsPublish.talkToCoach("如何看待训练队员的方法");
        newsPublish.talkToMember("如何规划未来的运动生涯");

    }
}
