package com.example.project01_sbntalk.geoji;

public class Geoji2DTO {
    private int imgv_geoji2;
    private String tv_geoji2_title, tv_geoji2_cnt;

    public int getImgv_geoji2() {
        return imgv_geoji2;
    }

    public void setImgv_geoji2(int imgv_geoji2) {
        this.imgv_geoji2 = imgv_geoji2;
    }

    public String getTv_geoji2_title() {
        return tv_geoji2_title;
    }

    public void setTv_geoji2_title(String tv_geoji2_title) {
        this.tv_geoji2_title = tv_geoji2_title;
    }

    public String getTv_geoji2_cnt() {
        return tv_geoji2_cnt;
    }

    public void setTv_geoji2_cnt(String tv_geoji2_cnt) {
        this.tv_geoji2_cnt = tv_geoji2_cnt;
    }

    public Geoji2DTO(int imgv_geoji2, String tv_geoji2_title, String tv_geoji2_cnt) {
        this.imgv_geoji2 = imgv_geoji2;
        this.tv_geoji2_title = tv_geoji2_title;
        this.tv_geoji2_cnt = tv_geoji2_cnt;
    }
}
