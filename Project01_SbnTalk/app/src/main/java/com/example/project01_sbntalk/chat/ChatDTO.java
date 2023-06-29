package com.example.project01_sbntalk.chat;

public class ChatDTO {

    private int resImgId;

    public int getResImgId() {
        return resImgId;
    }

    public void setResImgId(int resImgId) {
        this.resImgId = resImgId;
    }

    public int getChatCnt() {
        return chatCnt;
    }

    public void setChatCnt(int chatCnt) {
        this.chatCnt = chatCnt;
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

    public ChatDTO(int resImgId, int chatCnt, String name, String msg) {
        this.resImgId = resImgId;
        this.chatCnt = chatCnt;
        this.name = name;
        this.msg = msg;
    }

    private int chatCnt;
    private String name, msg;
}
