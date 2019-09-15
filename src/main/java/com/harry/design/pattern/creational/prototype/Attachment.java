package com.harry.design.pattern.creational.prototype;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * create by： harry
 * date:  2019/7/29 0029
 **/
@Data
@ToString
public class Attachment implements Serializable {

    private String name;

    public Attachment(AttachmentBuilder attachmentBuilder){
        this.name = attachmentBuilder.name;
    }

    public void download(){
        System.out.println("下载附件");
    }

    public static AttachmentBuilder getAttachmentBuilder(){
        return new AttachmentBuilder();
    }
    public static class AttachmentBuilder{
        private String name;

        public AttachmentBuilder withName(String name){
            this.name = name;
            return this;
        }
        public Attachment build(){
            return new Attachment(this);
        }
    }
}
