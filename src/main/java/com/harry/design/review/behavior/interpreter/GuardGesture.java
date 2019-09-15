package com.harry.design.review.behavior.interpreter;


import java.util.Objects;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 5:11
 **/
public class GuardGesture implements CoachGesture {
    @Override
    public String interpreter(Context context) {
        if(!Objects.equals(context.currentToken(), "G")){
            return "非法命令";
        }
        context.nextToken();
        return "全员防守";
    }
}
