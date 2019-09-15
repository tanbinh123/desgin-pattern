package com.harry.design.pattern.creational.prototype.practice;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * create by： harry
 * date:  2019/7/29 0029
 **/
@Data
@ToString
public class Address implements  Cloneable, Serializable {

    public String province;

    private String city;

    private String street;
}
