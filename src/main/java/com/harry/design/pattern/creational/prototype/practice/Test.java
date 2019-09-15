package com.harry.design.pattern.creational.prototype.practice;

/**
 * 设计并实现一个客户类Customer，其中包含一个名为客户地址的成员变量，
 * 客户地址的类型为Address，用浅克隆和深克隆分别实现Customer对象的复制并比较这两种克隆方式的异同。
 * create by： harry
 * date:  2019/7/29 0029
 **/
public class Test {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Address address = new Address();
        address.setProvince("江西");
        address.setCity("鹰潭");
        address.setStreet("冶炼厂生活区");
        customer.setAddress(address);

        // 浅拷贝
        Customer shallowClone = customer.shallowClone();
        System.out.println("-----------浅拷贝---------------");
        System.out.println("customer:" + customer.toString());
        System.out.println("shallowClone:" + shallowClone.toString());
        System.out.println(customer == shallowClone);
        System.out.println(customer.getAddress() == shallowClone.getAddress());

        // 深拷贝
        Customer deepClone = customer.deepClone();
        System.out.println("-----------深拷贝---------------");
        System.out.println("customer:" + customer.toString());
        System.out.println("deepClone:" + deepClone.toString());
        System.out.println(customer == deepClone);
        System.out.println(customer.getAddress() == deepClone.getAddress());
    }
}
