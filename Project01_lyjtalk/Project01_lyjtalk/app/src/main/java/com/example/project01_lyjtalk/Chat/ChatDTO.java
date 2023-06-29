package com.example.project01_lyjtalk.Chat;

import java.io.Serializable;

public class ChatDTO implements Serializable {
    private int resImgId;
    private String name, msg;

    public int getResImgId() {
        return resImgId;
    }

    public void setResImgId(int resImgId) {
        this.resImgId = resImgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ChatDTO(int resImgId, String name, String msg) {
        this.resImgId = resImgId;
        this.name = name;
        this.msg = msg;
    }
}
