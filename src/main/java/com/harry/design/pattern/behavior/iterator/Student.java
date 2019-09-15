package com.harry.design.pattern.behavior.iterator;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * create by： harry
 * date:  2019/8/17 0017
 **/
@AllArgsConstructor
@ToString
public class Student implements Comparable {

    private String name;

    private Integer age;

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student stu = (Student)o;
            return  stu.age - this.age;
        }
        throw new RuntimeException("不能比较的类型");
    }
}
