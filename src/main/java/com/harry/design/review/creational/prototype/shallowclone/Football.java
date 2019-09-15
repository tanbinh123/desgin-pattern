package com.harry.design.review.creational.prototype.shallowclone;

import lombok.Data;
import lombok.ToString;

/**
 * create by： harry
 * date:  2019/8/22 0022
 **/
@Data
@ToString
public class Football implements Cloneable {

    private String size;

    private String color;

    private Band band;

    @Override
    protected Football clone()  {
        try {
            Object clone = super.clone();
            return (Football) clone;
        }catch (CloneNotSupportedException e){
            System.out.println("不支持的克隆异常");
            e.printStackTrace();
        }
        return  null;
    }
}
