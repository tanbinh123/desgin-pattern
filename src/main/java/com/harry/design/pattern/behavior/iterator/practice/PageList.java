package com.harry.design.pattern.behavior.iterator.practice;

import java.util.List;

/**
 * create by： harry
 * date:  2019/8/17 0017
 **/
public abstract class PageList<T> {

    private List<T> lists;

    public PageList(List lists){
        this.lists = lists;
    }

    public void add(T object){
        lists.add(object);
    }

    public void remove(T object){
        lists.remove(object);
    }

    public List<T> getLists(){
        return lists;
    }

    abstract PageIterator pageIterator(int pageSize);
}
