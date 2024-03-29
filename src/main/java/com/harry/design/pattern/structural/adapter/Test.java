package com.harry.design.pattern.structural.adapter;

/**
 * Sunny软件公司OA系统需要提供一个加密模块，将用户机密信息（如口令、邮箱等）加密之后再存储在数据库中，
 * 系统已经定义好了数据库操作类。为了提高开发效率，现需要重用已有的加密算法，这些算法封装在一些由第三方提供的类中，
 * 有些甚至没有源代码。试使用适配器模式设计该加密模块，实现在不修改现有类的基础上重用第三方加密方法。
 * create by： harry
 * date:  2019/7/30 0030
 **/
public class Test {

    public static void main(String[] args) {
        EncryptService encryptService = new EntcrptAdaptor();
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("harry");
        userInfo.setPassword("123456");
        String encrypt = encryptService.encryptData(userInfo);
        System.out.println("encrypt:" + encrypt);
    }
}
