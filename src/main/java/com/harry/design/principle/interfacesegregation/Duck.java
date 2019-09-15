package com.harry.design.principle.interfacesegregation;

/**
 *  细粒度的接口可以进行组装
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
public class Duck implements IEatAnimal, IFlyAnimal, ISwimAnimal {
    @Override
    public void eat() {

    }
    @Override
    public void swim() {

    }

    @Override
    public void Fly() {

    }
}
