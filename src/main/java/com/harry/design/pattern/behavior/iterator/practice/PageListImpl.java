package com.harry.design.pattern.behavior.iterator.practice;

import java.util.List;

/**
 * create by： harry
 * date:  2019/8/17 0017
 **/
public class PageListImpl extends PageList {

    public PageListImpl(List lists) {
        super(lists);
    }

    @Override
    PageIterator pageIterator(int pageSize) {
        return new PageIteratorImpl(pageSize, this);
    }
}
