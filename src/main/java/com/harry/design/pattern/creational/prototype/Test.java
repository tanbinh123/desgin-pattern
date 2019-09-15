package com.harry.design.pattern.creational.prototype;

import java.util.Date;

/**
 *  浅克隆: 拷贝基本数据类型的值, 直接复制引用类型的地址
 *  深克隆: 拷贝基本数据类型的值, 引用类型也将创建一块新的内存区域,并拷贝给克隆对象
 * create by： harry
 * date:  2019/7/29 0029
 **/
public class Test {

    public static void main(String[] args) {
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setName("harry");
        weeklyLog.setContent("harry and winnie");
        weeklyLog.setDate(new Date());
        weeklyLog.setAttachment(Attachment.getAttachmentBuilder().withName("建筑工程附件").build());
        WeeklyLog clone = weeklyLog.shallowClone();
        System.out.println("-------------浅拷贝--------------------");
        System.out.println("weeklyLog:" + weeklyLog);
        System.out.println("clone:" + clone);
        System.out.println(weeklyLog == clone);
        System.out.println(weeklyLog.getContent() == clone.getContent());
        System.out.println(weeklyLog.getName() == clone.getName());
        System.out.println(weeklyLog.getDate() == clone.getDate());
        System.out.println(weeklyLog.getAttachment() == clone.getAttachment());
        System.out.println("-------------深拷贝-----------------------");
        WeeklyLog deepClone = weeklyLog.deepClone();
        System.out.println("weeklyLog:" + weeklyLog);
        System.out.println("deepClone:" + clone);
        System.out.println(weeklyLog == deepClone);
        System.out.println(weeklyLog.getContent() == deepClone.getContent());
        System.out.println(weeklyLog.getName() == deepClone.getName());
        System.out.println(weeklyLog.getDate() == deepClone.getDate());
        System.out.println(weeklyLog.getAttachment() == deepClone.getAttachment());
    }
}
