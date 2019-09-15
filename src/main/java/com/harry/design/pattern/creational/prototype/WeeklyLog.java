package com.harry.design.pattern.creational.prototype;

import lombok.Data;
import lombok.ToString;

import java.io.*;
import java.util.Date;

/**
 * create by： harry
 * date:  2019/7/29 0029
 **/
@Data
@ToString
public class WeeklyLog implements Cloneable, Serializable {

    private String name;

    private Date date;

    private String content;

    private Attachment attachment;

    public WeeklyLog shallowClone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (WeeklyLog) object;
    }

    public WeeklyLog deepClone(){
        try {
            //将对象写入流中
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);
            //将对象从流中读取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object object = ois.readObject();
            return (WeeklyLog) object;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
