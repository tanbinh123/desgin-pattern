package com.harry.design.review.structural.composite;

/**
 *
 * 2012年欧洲杯一共分为四个组，每个组四个队，每个队有23名球员，
 * 如果要用一个图来表示2012年欧洲杯全体球员及各国分组情况，不用说，一定是个树状图，
 * 组里有队，队里有人，
 * 如果想要召开B组（赛前公认的死亡之组）队员大会，
 * 在B组的节点上写下通知：“下午3点，召开重要会议，事关出线！”，
 * 想必荷兰、德国、葡萄牙、丹麦队员都会积极响应，随叫这几个“苦逼”队位于同一个节点的分支上呢？微笑
 *
 * 组合模式(Composite):
 * 将对象组合成树形结构以表示“部分-整体”的层次结构，它使得客户对单个对象和复合对象的使用具有一致性。
 * create by： harry
 * date:  2019/8/24 0024 下午 1:47
 **/
public class Test {

    public static void main(String[] args) {
        Node m1, m2, m3, m4, aGroup, bGroup, cGroup,dGroup, hollandTeam, germanyTeam, portugalTeam, chinaTeam;

        Node wordCup = new Team("世界组");

        aGroup = new Team("A组");
        bGroup = new Team("B组");
        cGroup = new Team("C组");
        dGroup = new Team("D组");

        wordCup.addMember(aGroup).addMember(bGroup).addMember(cGroup).addMember(dGroup);

        hollandTeam = new Team("荷兰队");
        germanyTeam = new Team("德国队");
        portugalTeam = new Team("葡萄牙队");
        chinaTeam = new Team("中国队");

        bGroup.addMember(hollandTeam).addMember(germanyTeam).addMember(portugalTeam).addMember(chinaTeam);

        m1 = new Member("harry");
        m2 = new Member("iris");
        m3 = new Member("winnie");
        m4 = new Member("jennifer");

        chinaTeam.addMember(m1).addMember(m2).addMember(m3).addMember(m4);

        wordCup.sendNotification("下午3点，召开重要会议，事关出线！");

    }
}
