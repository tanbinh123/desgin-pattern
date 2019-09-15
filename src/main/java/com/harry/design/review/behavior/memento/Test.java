package com.harry.design.review.behavior.memento;

/**
 * 备忘录模式：足球是圆的，一切皆有可能发生。
 * 要是有后悔药的话，如果能回到昨晚2012年欧洲杯决赛的中场休息，我相信普兰德利一定不会用莫塔换下蒙托利沃；
 * 如果能回到昨晚比赛开始，我相信一开始就不会让基耶利尼上场，如果能回到......
 * （再回可能意大利就被德国淘汰了，微笑）能回到吗？
 * 回不到哦，要是能回到过去的话我还真想再过一次20岁（回忆那段青葱岁月），可惜人生没有后悔药啊。
 * 幸好软件系统中可以通过备忘录模式来实现对象的状态恢复，备忘录就是软件中的后悔药，它就是软件中的月光宝盒。Ctrl + Z，撤销随你！
 *
 * 备忘录模式(Memento): 在不破坏封装性的前提下，捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态，这样以后就可将该对象恢复到先前保存的状态。
 * create by： harry
 * date:  2019/8/27 0027 下午 9:32
 **/
public class Test {

    private static Integer index = -1;
    private static MementoCareTaker mementoCareTaker = new MementoCareTaker();

    public static void main(String[] args) {
        EuropeanCup europeanCup = new EuropeanCup("莫塔", 25);
        setPlayer(europeanCup);

        europeanCup.setPlayerName("蒙托利沃");
        europeanCup.setPlayerAge(28);
        setPlayer(europeanCup);

        europeanCup.setPlayerName("基耶利尼");
        europeanCup.setPlayerAge(30);
        setPlayer(europeanCup);

        regret(europeanCup);
        regret(europeanCup);
        unRegret(europeanCup);
        unRegret(europeanCup);

    }

    public static void setPlayer(EuropeanCup europeanCup){
        mementoCareTaker.addMemento(europeanCup.save());
        index++;
        System.out.println("角色:" + europeanCup.getPlayerName() + "; 年龄:" + europeanCup.getPlayerAge());
    }


    public static void regret(EuropeanCup europeanCup){
        System.out.println("后悔换人-----------");
        europeanCup.restore(mementoCareTaker.getMemento(--index));
        System.out.println("角色:" + europeanCup.getPlayerName() + "; 年龄:" + europeanCup.getPlayerAge());
    }

    public static void unRegret(EuropeanCup europeanCup){
        System.out.println("不后悔换人-----------");
        europeanCup.restore(mementoCareTaker.getMemento(++index));
        System.out.println("角色:" + europeanCup.getPlayerName() + "; 年龄:" + europeanCup.getPlayerAge());
    }
}
