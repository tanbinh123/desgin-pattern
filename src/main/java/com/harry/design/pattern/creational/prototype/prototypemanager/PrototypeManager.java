package com.harry.design.pattern.creational.prototype.prototypemanager;

import java.util.Hashtable;

/**
 *  原型管理器
 * create by： harry
 * date:  2019/7/29 0029
 **/
public class PrototypeManager {

    private Hashtable<String, OfficialDocument> hashtable = new Hashtable();

    private static PrototypeManager prototypeManager = new PrototypeManager();

    private PrototypeManager(){
        hashtable.put("far", new FAR());
        hashtable.put("srs", new SRS());
    }

    public void addOfficialDocument(String key, OfficialDocument officialDocument){
        hashtable.put(key, officialDocument);
    }

    public OfficialDocument getOfficialDocument(String key){
        return hashtable.get(key).clone();
    }

    public  static PrototypeManager getPrototypeManager(){
        return prototypeManager;
    }
}
