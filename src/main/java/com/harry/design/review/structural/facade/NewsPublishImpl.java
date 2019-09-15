package com.harry.design.review.structural.facade;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 1:18
 **/
public class NewsPublishImpl implements NewsPublish {

    @Setter
    private Member member;
    @Setter
    private Coach coach;

    public NewsPublishImpl(Member member, Coach coach){
        this.coach = coach;
        this.member = member;
    }

    @Override
    public void talkToMember(String topic) {
        member.talk(topic);
    }

    @Override
    public void talkToCoach(String topic) {
        coach.talk(topic);
    }
}
