package com.example.project01_lyjtalk.opentalk;

import java.io.Serializable;

public class OpenDTO implements Serializable {
    private String title, cnt;

    public OpenDTO(String title, String cnt) {
        this.title = title;
        this.cnt = cnt;
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
}
