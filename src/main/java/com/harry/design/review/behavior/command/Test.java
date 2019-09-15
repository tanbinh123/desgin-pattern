package com.harry.design.review.behavior.command;

/**
 *
 * 命令模式：普兰德利掌心朝外，向前一推，
 * 意大利全线压上；普兰德利掌心朝内，向后一拨，
 * 意大利全线退防。作为意大利主教练，普兰德利就是命令的发送者，
 * 手势就是命令对象，所有队员都是命令的接收者。不同的命令对象将对应不同的执行动作。
 *
 * 命令模式(Command): 将一个请求封装为一个对象，从而可用不同的请求对客户进行参数化；
 * 对请求排队或记录请求日志，以及支持可取消的操作。
 * create by： harry
 * date:  2019/8/25 0025 下午 4:19
 **/
public class Test {

    public static void main(String[] args) {
        CoachInvoker coachInvoker = new CoachInvoker("普兰德利");
        coachInvoker.setCommand(new HandInCommand(new Player()));
        coachInvoker.sendCommand();

        coachInvoker.setCommand(new HandOutCommand(new Player()));
        coachInvoker.sendCommand();
    }
}
