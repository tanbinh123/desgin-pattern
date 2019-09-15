package com.harry.design.pattern.behavior.observer;

import java.util.Observable;

/**Sunny软件公司欲开发一款实时在线股票软件，该软件需提供如下功能：
 * 当股票购买者所购买的某支股票价格变化幅度达到5%时，
 * 系统将自动发送通知（包括新价格）给购买该股票的所有股民。试使用观察者模式设计并实现该系统。
 * create by： harry
 * date:  2019/8/18 0018
 **/
public class Test {

    public static void main(String[] args) {
        Subject stockSubject = new StockSubject("吴小雪");

        Observer observer1, observer2, observer3, observer4, observer5, observer6;
        observer1 = new StockHolder("小米");
        observer2 = new StockHolder("小雷");
        observer3 = new StockHolder("小军");
        observer4 = new StockHolder("小马");
        observer5 = new StockHolder("小云");
        observer6 = new StockHolder("小徐");
        observer1.buyStock(stockSubject);
        observer2.buyStock(stockSubject);
        observer3.buyStock(stockSubject);
        observer4.buyStock(stockSubject);
        observer5.buyStock(stockSubject);
        System.out.println("-----------------------------");
        observer6.buyStock(stockSubject);
    }
}
