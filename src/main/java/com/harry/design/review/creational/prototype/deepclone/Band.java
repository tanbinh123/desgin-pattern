package com.harry.design.review.creational.prototype.deepclone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * create by： harry
 * date:  2019/8/22 0022 下午 10:52
 **/
@AllArgsConstructor
@Data
@ToString
public class Band implements Serializable{

    private String name;

}
