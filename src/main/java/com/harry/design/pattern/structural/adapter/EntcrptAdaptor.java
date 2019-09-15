package com.harry.design.pattern.structural.adapter;

import lombok.Setter;

import javax.xml.crypto.Data;

/**
 * create by： harry
 * date:  2019/7/30 0030
 **/
public class EntcrptAdaptor extends DataEntrypter implements EncryptService {

    private DataEntrypter dataEntrypter;

    public EntcrptAdaptor(){
        dataEntrypter = new DataEntrypter();
    }

    @Override
    public String encryptData(UserInfo userInfo) {
        return thirdDataEncryption(userInfo.getUsername(), userInfo.getPassword());
    }
}
