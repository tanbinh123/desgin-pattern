package com.harry.design.pattern.structural.composite.practice;

/**
 * Sunny软件公司欲开发一个界面控件库，界面控件分为两大类，
 * 一类是单元控件，例如按钮、文本框等，
 * 一类是容器控件，例如窗体、中间面板等，
 * 试用组合模式设计该界面控件库。
 * create by： harry
 * date:  2019/8/6 0006
 **/
public class Test {

    public static void main(String[] args) {
        Component window, centerPanel, btn1, btn2, btn3, checkbox1, checkbox2;
        window = new Window("我的窗口");
        centerPanel = new CenterPanel("俺的中心面板");
        btn1 = new Button("按钮1");
        btn2 = new Button("按钮2");
        btn3 = new Button("按钮3");
        checkbox1 = new CheckBox("复选框1");
        checkbox2 = new CheckBox("复选框2");


        /*centerPanel.add(btn1);
        centerPanel.add(btn2);
        centerPanel.add(checkbox1);
        window.add(btn3);
        window.add(checkbox2);*/
        window.add(centerPanel);
        centerPanel.add(window);
        window.show();

    }
}
