package com.harry.design.review.creational.builder;

/**
 * create by： harry
 * date:  2019/8/22 0022
 **/
public class SpainEquipmentBuilder extends EquipmentBuilder {

    @Override
    public void buildClothes() {
        footballEquipment.setClothes("红色");
    }

    @Override
    public void buildPants() {
        footballEquipment.setPants("红色");
    }

    @Override
    public void buildSock() {
        footballEquipment.setSock("红色");
    }

    @Override
    public void buildShoes() {
        footballEquipment.setShoes("红色");
    }
}
