package com.harry.design.review.structural.flyweight;

/**
 *
 * 享元模式：同一个国家队的队员，他们都共享着一个伟大的称谓，
 * 即"XXX国家队队员"，例如“意大利国家队队员”、“西班牙国家队队员”
 * （一说到“中国国家队队员”就伤心，还是不说了，难过），
 * 因此，"XXX国家队队员"是一个可以共享的内部状态。但是在比赛过程中，
 * 每个队员身披不同号码的球衣，球衣号码是不能共享的
 * ，同一个国家队的队员每个人都拥有不同的号码，
 * 因此，球衣号码是不能够共享的外部状态。在享元模式中区分了对象的内部状态和外部状态。
 *
 * 享元模式(Flyweight): 运用共享技术有效地支持大量细粒度的对象。
 * create by： harry
 * date:  2019/8/25 0025 下午 1:27
 **/
public class Test {

    public static void main(String[] args) {
        MemberFactory memberFactory = MemberFactory.getInstance();
        NationalMember nationalMember = memberFactory.getNationalMember("中国");
        nationalMember.display("7527");

        NationalMember nationalMember1 =  memberFactory.getNationalMember("中国");
        nationalMember1.display("3306");
        System.out.println("nationalMember == nationalMember1 ?" + (nationalMember == nationalMember1));
        NationalMember nationalMember3 = memberFactory.getNationalMember("美国");
        nationalMember3.display("7527");
        NationalMember nationalMember4 = memberFactory.getNationalMember("美国");
        nationalMember4.display("3306");
    }
}
