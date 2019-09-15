package com.harry.design.principle.openclose;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * create by： 徐齐斌
 * date:  2019/7/14 0014
 **/
@AllArgsConstructor
public class JavaCourse implements ICourse {

    private Integer id;

    private String name;

    private BigDecimal price;

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
