package com.harry.design.review.behavior.interpreter;

import java.util.Objects;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 5:22
 **/
public class PassGesture implements CoachGesture {
    @Override
    public String interpreter(Context context) {
        if(!Objects.equals(context.currentToken(), "P")){
            return "非法命令";
        }
        return "快速传球";
    }
}
