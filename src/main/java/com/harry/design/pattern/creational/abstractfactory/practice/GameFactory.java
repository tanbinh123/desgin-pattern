package com.harry.design.pattern.creational.abstractfactory.practice;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public abstract class GameFactory {

    abstract  OperationController createOperationController();

    abstract InterfaceController createInterfaceController();
}
