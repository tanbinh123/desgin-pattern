package com.harry.design.review.creational.prototype.deepclone;

import lombok.Data;

import java.io.*;

/**
 * create by： harry
 * date:  2019/8/22 0022 下午 10:51
 **/
@Data
public class Football implements Serializable, Cloneable {

    private String name;

    private String color;

    private Band band;

    @Override
    public Football clone(){
        try {
            // 1.将对象写入到字节数组输出流中
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            // 2.将对象从流中读出
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (Football) objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("对象克隆失败, io异常");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("对象克隆失败,类未找到");
            e.printStackTrace();
        }
        return null;
    }
}
