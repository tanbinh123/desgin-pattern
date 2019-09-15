package com.harry.design.pattern.creational.prototype.prototypemanager;

/**
 * 原型管理器(Prototype Manager)是将多个原型对象存储在一个集合中供客户端使用，
 * 它是一个专门负责克隆对象的工厂，其中定义了一个集合用于存储原型对象，如果需要某个原型对象的一个克隆，
 * 可以通过复制集合中对应的原型对象来获得。在原型管理器中针对抽象原型类进行编程，
 * create by： harry
 * date:  2019/7/29 0029
 **/
public class Test {

    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getPrototypeManager();
        OfficialDocument far = pm.getOfficialDocument("far");
        OfficialDocument far1 = pm.getOfficialDocument("far");
        far.display();
        far1.display();
        System.out.println(far == far1);

        OfficialDocument srs = pm.getOfficialDocument("srs");
        OfficialDocument srs1 = pm.getOfficialDocument("srs");
        srs.display();
        srs1.display();
        System.out.println(srs == srs1);

        PPR ppr = new PPR();
        pm.addOfficialDocument("ppr", ppr);

        OfficialDocument ppr1 = pm.getOfficialDocument("ppr");
        OfficialDocument ppr2 = pm.getOfficialDocument("ppr");
        ppr.display();
        ppr2.display();
        System.out.println(ppr == ppr1);
        System.out.println(ppr == ppr2);
        System.out.println(ppr1 == ppr2);

    }
}
