package com.harry.design.pattern.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： harry
 * date:  2019/7/18 0018
 **/
@Slf4j
public class PhythonArticle extends Article {
    @Override
    void produceArticle() {
        log.info("正在编写{}文件", "phython");
    }
}