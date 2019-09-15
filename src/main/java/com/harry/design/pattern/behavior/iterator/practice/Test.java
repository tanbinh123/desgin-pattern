package com.harry.design.pattern.behavior.iterator.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计一个逐页迭代器，
 * 每次可返回指定个数（一页）元素，并将该迭代器用于对数据进行分页处理。
 * create by： harry
 * date:  2019/8/17 0017
 **/
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(16);
        for(int i = 0; i < 10; i++){
            list.add("张麻子:" + i);
        }
        for(int i = 0; i < 10; i++){
            list.add("徐齐斌:" + i);
        }
        for(int i = 0; i < 10; i++){
            list.add("吴小雪:" + i);
        }
        PageList pageList = new PageListImpl(list);
        PageIterator iterator = pageList.pageIterator(10);
        while (iterator.hasNextPage()){
            PageList page = iterator.nextPage();
            System.out.println("page:" + page.getLists());
        }
    }
}
