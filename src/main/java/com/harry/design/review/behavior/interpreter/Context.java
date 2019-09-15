package com.harry.design.review.behavior.interpreter;

import lombok.Getter;

import java.util.StringTokenizer;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 5:01
 **/
public class Context {

    @Getter
    private StringTokenizer stringTokenizer; //将一句字符串命令转换成更小的单个指令

    private String currentToken;

    public Context(String command){
        this.stringTokenizer = new StringTokenizer(command);
        nextToken();
    }

    // 返回当前token
    public String nextToken(){
        if(stringTokenizer.hasMoreTokens()){
            this.currentToken = stringTokenizer.nextToken();
        }else {
            currentToken = null;
        }
        return currentToken;
    }

    // 返回当前的标记
    public String currentToken() {
        return currentToken;
    }
}
