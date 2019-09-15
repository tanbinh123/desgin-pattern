package com.harry.design.review.creational.builder;

/**
 * create by： harry
 * date:  2019/8/22 0022
 **/
public class Seller {

    public FootballEquipment sellEquipment(EquipmentBuilder equipmentBuilder){
        equipmentBuilder.buildClothes();
        equipmentBuilder.buildPants();
        equipmentBuilder.buildSock();
        equipmentBuilder.buildShoes();
        return equipmentBuilder.getFootballEquipment();
    }

}
