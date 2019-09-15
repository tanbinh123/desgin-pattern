package com.harry.design.pattern.behavior.iterator.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * create by： harry
 * date:  2019/8/17 0017
 **/
public class PageIteratorImpl<T> implements PageIterator {

    private Integer pageSize;

    private Integer currentPage;

    private PageList<T> pageList;

    private List<T>  lists;

    public PageIteratorImpl(int pageSize, PageList<T> pageList){
        this.pageSize = pageSize;
        this.pageList = pageList;
        lists = pageList.getLists();
        currentPage = 0;
    }

    @Override
    public PageList<T> nextPage() {
        int start = currentPage * pageSize;
        int end = Math.min((currentPage + 1) * pageSize, lists.size());
        if(!hasNextPage()){
            throw new RuntimeException("读取超出边界异常");
        }

        List<T> list = new ArrayList<>(16);
        PageList<T> pageList = new PageListImpl(list);
        for (int i = start; i < end; i++) {
            list.add(lists.get(i));
        }
        currentPage++;
        return pageList;
    }

    @Override
    public boolean hasNextPage() {
        int start = currentPage * pageSize;
        if(start >= lists.size()){
            return false;
        }
        return true;
    }
}
