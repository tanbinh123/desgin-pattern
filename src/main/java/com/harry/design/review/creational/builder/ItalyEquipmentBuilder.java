package com.harry.design.review.creational.builder;

/**
 * create by： harry
 * date:  2019/8/22 0022
 **/
public class ItalyEquipmentBuilder extends EquipmentBuilder {
    @Override
    public void buildClothes() {
        footballEquipment.setClothes("蓝色");
    }

    @Override
    public void buildPants() {
        footballEquipment.setPants("蓝色");
    }

    @Override
    public void buildSock() {
        footballEquipment.setSock("蓝色");
    }

    @Override
    public void buildShoes() {
        footballEquipment.setShoes("蓝色");
    }
}
