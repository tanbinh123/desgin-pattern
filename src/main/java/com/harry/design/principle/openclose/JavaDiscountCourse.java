package com.harry.design.principle.openclose;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

/**
 *  java课程折扣类，扩展java课程
 * create by： 徐齐斌
 * date:  2019/7/14 0014
 **/
public class JavaDiscountCourse extends JavaCourse {


    public JavaDiscountCourse(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }
    /**
     *  获得原价
     * @return
     */
    public BigDecimal getOriginPrice(){
        return super.getPrice();
    }

    /**
     * 对原价打八折
     * @return  八折后的价格
     */
    public BigDecimal getDisCountPrice() {
        return super.getPrice().multiply(new BigDecimal(0.8));
    }
}
