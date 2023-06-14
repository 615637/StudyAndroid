package com.example.and07_activityintent;

import java.io.Serializable;

public class TestDTO implements Serializable {
    private String str;
    private int i;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public TestDTO(String str, int i) {
        this.str = str;
        this.i = i;
    }
}
