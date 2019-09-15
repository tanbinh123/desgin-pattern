package com.harry.design.pattern.creational.prototype.practice;

import lombok.Data;
import lombok.ToString;

import java.io.*;

/**
 * create by： harry
 * date:  2019/7/29 0029
 **/
@Data
@ToString
public class Customer implements Cloneable, Serializable {

    private Address address;

    public Customer shallowClone(){
        try {
            Object clone = super.clone();
            return (Customer) clone;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持拷贝");
            e.printStackTrace();
        }
        return null;
    }

    public Customer deepClone(){
        try {
            // 1.将当前对象写入输入流
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            // 2.从流中读取对象
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object object = objectInputStream.readObject();
            return (Customer) object;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
