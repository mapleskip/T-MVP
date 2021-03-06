package com.model;

import com.base.BaseBean;
import com.base.entity.Pointer;

/**
 * Created by baixiaokang on 16/12/24.
 */

public class Message extends BaseBean {

    public Pointer receiver;
    public String message;
    public String uId;
    public Pointer creater;

    public Message(Pointer receiver, String message, Pointer creater, String uId) {
        this.receiver = receiver;
        this.message = message;
        this.creater = creater;
        this.uId = uId;
    }
}