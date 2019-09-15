package com.harry.design.review.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 1:33
 **/
public class MemberFactory{

    private Map<String, NationalMember>  memberMap = new HashMap<String, NationalMember> (16);

    private MemberFactory(){}


    public NationalMember getNationalMember(String nationName){
        NationalMember nationalMember = memberMap.get(nationName);
        if(Objects.isNull(nationalMember)){
            if(Objects.equals(nationName, "中国")){
                nationalMember = new ChineseMember("中国国家队");
            } else if (Objects.equals(nationName, "美国")){
                nationalMember = new AmericanMember("美国国家队");
            }
            memberMap.put(nationName, nationalMember);
        }
        return nationalMember;
    }

    public static MemberFactory getInstance(){
        return MemberFactoryHolder.memberFactory;
    }

    private static class MemberFactoryHolder{
        private static MemberFactory memberFactory = new MemberFactory();
    }



}
