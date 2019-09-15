package com.harry.design.pattern.creational.abstractfactory.practice;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public class AndroidGameFactory extends GameFactory {
    @Override
    OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
