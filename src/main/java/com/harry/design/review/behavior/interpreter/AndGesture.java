package com.harry.design.review.behavior.interpreter;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 5:23
 **/
public class AndGesture implements CoachGesture{

    private CoachGesture left;

    private CoachGesture right;

    public AndGesture(CoachGesture left, CoachGesture right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpreter(Context context) {
        return left.interpreter(context) + "-And-" + right.interpreter(context);
    }
}
