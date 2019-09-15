package com.harry.design.pattern.behavior.iterator.practice;

/**
 * create by： harry
 * date:  2019/8/17 0017
 **/
public interface PageIterator<T> {

    PageList<T> nextPage();

    boolean hasNextPage();

}
