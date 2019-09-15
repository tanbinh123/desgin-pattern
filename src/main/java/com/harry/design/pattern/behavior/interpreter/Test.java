package com.harry.design.pattern.behavior.interpreter;

/**
 *  Sunny软件公司欲为数据库备份和同步开发一套简单的数据库同步指令，
 *  通过指令可以对数据库中的数据和结构进行备份，
 *  例如，输入指令“COPY VIEW FROM srcDB TO desDB”表示将数据库srcDB中的所有视图(View)对象都拷贝至数据库desDB；
 *  输入指令“MOVE TABLE Student FROM srcDB TO desDB”表示将数据库srcDB中的Student表移动至数据库desDB。
 *  试使用解释器模式来设计并实现该数据库同步指令。
 *
 *  Sunny软件公司欲为某玩具公司开发一套机器人控制程序，在该机器人控制程序中包含一些简单的英文控制指令，
 *  每一个指令对应一个表达式(expression)，该表达式可以是简单表达式也可以是复合表达式，
 *  每一个简单表达式由移动方向(direction)， 移动方式(action)和移动距离(distance)三部分组成，
 *  其中移动方向包括上(up)、下(down)、左(left)、右(right)；
 *  移动方式包括移动(move)和快速移动(run)；
 *  移动距离为一个正整数。
 *  两个表达式之间可以通过与(and)连接，形成复合(composite)表达式。
 *  例如输入控制指令：up move 5，则“向上移动5个单位”；
 *  输入控制指令：down run 10 and left move 20，
 *  则“向下快速移动10个单位再向左移动20个单位”。
 * create by： harry
 * date:  2019/8/13 0013
 **/
public class Test {

    public static void main(String[] args) {
        String instruction = "move up 5 and run down 10 and move left 5";
        RabbitHandler handler = new RabbitHandler();
        handler.handle(instruction);
        String outString;
        outString = handler.output();
        System.out.println(outString);
    }
}
