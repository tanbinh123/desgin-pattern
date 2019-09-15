package com.harry.design.pattern.behavior.interpreter;

import java.util.Stack;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
public class RabbitHandler {


    private Command command;

    public void handle(String instruction){
        String[] commandArray = instruction.split(" ");
        for(int i = 0; i < commandArray.length; i++){
            if("and".equalsIgnoreCase(commandArray[i])){
                Command action = new ActionCommand(commandArray[++i]);
                Command direction = new DirectionCommand(commandArray[++i]);
                Command distance = new DistanceCommand(commandArray[++i]);
                Command sentence = new SentenceCommand(action, direction, distance);
                Command and = new AndCommand(command, sentence);
                command = and;
                continue;
            }
            Command action = new ActionCommand(commandArray[i]);
            Command direction = new DirectionCommand(commandArray[++i]);
            Command distance = new DistanceCommand(commandArray[++i]);
            Command sentence = new SentenceCommand(action, direction, distance);
            command = sentence;
        }
    }

    public String output(){
        String interpret = command.interpret();
        return interpret;
    }

}
