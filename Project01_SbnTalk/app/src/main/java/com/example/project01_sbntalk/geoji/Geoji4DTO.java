package com.example.project01_sbntalk.geoji;

public class Geoji4DTO {
    private int imvg_main, imgv_profile;
    private String tv_title, tv_hashtag, tv_cnt;

    public int getImvg_main() {
        return imvg_main;
    }

    public void setImvg_main(int imvg_main) {
        this.imvg_main = imvg_main;
    }

    public int getImgv_profile() {
        return imgv_profile;
    }

    public void setImgv_profile(int imgv_profile) {
        this.imgv_profile = imgv_profile;
    }

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public String getTv_hashtag() {
        return tv_hashtag;
    }

    public void setTv_hashtag(String tv_hashtag) {
        this.tv_hashtag = tv_hashtag;
    }

    public String getTv_cnt() {
        return tv_cnt;
    }

    public void setTv_cnt(String tv_cnt) {
        this.tv_cnt = tv_cnt;
    }

    public Geoji4DTO(int imvg_main, int imgv_profile, String tv_title, String tv_hashtag, String tv_cnt) {
        this.imvg_main = imvg_main;
        this.imgv_profile = imgv_profile;
        this.tv_title = tv_title;
        this.tv_hashtag = tv_hashtag;
        this.tv_cnt = tv_cnt;
    }
}
