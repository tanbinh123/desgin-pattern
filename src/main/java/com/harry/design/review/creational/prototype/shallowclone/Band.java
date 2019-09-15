package com.harry.design.review.creational.prototype.shallowclone;

import lombok.Data;
import lombok.ToString;

/**
 * create by： harry
 * date:  2019/8/22 0022
 **/
@ToString
@Data
public class Band {

    private String name;

    public Band(String name){
        this.name = name;
    }
}
