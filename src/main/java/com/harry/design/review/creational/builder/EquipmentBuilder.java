package com.harry.design.review.creational.builder;

/**
 * create by： harry
 * date:  2019/8/22 0022
 **/
public abstract class EquipmentBuilder {

    protected FootballEquipment footballEquipment = new FootballEquipment();

    public FootballEquipment getFootballEquipment() {
        return footballEquipment;
    }
    abstract public void buildClothes();

    abstract public void buildPants();

    abstract public void buildSock();

    abstract public void buildShoes();

}
