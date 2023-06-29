package com.example.project01_sbntalk.main;

import java.io.Serializable;

public class OpenDTO {
    private int imgv_chip1;
    private String tv1_chip1, tv2_chip1;

    public int getImgv_chip1() {
        return imgv_chip1;
    }

    public void setImgv_chip1(int imgv_chip1) {
        this.imgv_chip1 = imgv_chip1;
    }

    public String getTv1_chip1() {
        return tv1_chip1;
    }

    public void setTv1_chip1(String tv1_chip1) {
        this.tv1_chip1 = tv1_chip1;
    }

    public String getTv2_chip1() {
        return tv2_chip1;
    }

    public void setTv2_chip1(String tv2_chip1) {
        this.tv2_chip1 = tv2_chip1;
    }

    public OpenDTO(int imgv_chip1, String tv1_chip1, String tv2_chip1) {
        this.imgv_chip1 = imgv_chip1;
        this.tv1_chip1 = tv1_chip1;
        this.tv2_chip1 = tv2_chip1;
    }
}
