package com.example.project01_sbntalk.food;

public class ChinaDTO {
    private int imgRes;
    private String title, cnt;

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public ChinaDTO(int imgRes, String title, String cnt) {
        this.imgRes = imgRes;
        this.title = title;
        this.cnt = cnt;
    }
}
