package com.harry.design.pattern.behavior.iterator;

import java.util.*;

/**
 *
 * 在Sunny软件公司开发的某教务管理系统中，
 * 一个班级(Class in School)包含多个学生(Student)，
 * 使用Java内置迭代器实现对学生信息的遍历，要求按学生年龄由大到小的次序输出学生信息。
 * create by： harry
 * date:  2019/8/17 0017
 **/
public class Test {

    public static void main(String[] args) {
        List<Student> clazz = new ArrayList<>(16);
        clazz.add(new Student("harry", 23));
        clazz.add(new Student("jennifer", 21));
        clazz.add(new Student("winnie", 18));
        clazz.add(new Student("iris", 25));
        clazz.add(new Student("henry", 30));
        clazz.sort(Student::compareTo);
        Iterator<Student> iterator = clazz.iterator();
        while(iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }
    }
}
