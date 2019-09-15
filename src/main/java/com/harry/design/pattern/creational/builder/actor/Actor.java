package com.harry.design.pattern.creational.builder.actor;

import lombok.Data;
import lombok.ToString;

/**
 *  角色
 * create by： harry
 * date:  2019/7/29 0029
 **/
@Data
@ToString
public class Actor {
    private  String type; //角色类型
    private  String sex; //性别
    private  String face; //脸型
    private  String costume; //服装
    private  String hairstyle; //发型
}
