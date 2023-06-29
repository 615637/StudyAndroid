package com.example.project01_sbntalk.geoji;

public class Geoji1DTO {
    private String tv_geoji1_id, tv_geoji1_content, tv_geoji1_update;

    public String getTv_geoji1_id() {
        return tv_geoji1_id;
    }

    public void setTv_geoji1_id(String tv_geoji1_id) {
        this.tv_geoji1_id = tv_geoji1_id;
    }

    public String getTv_geoji1_content() {
        return tv_geoji1_content;
    }

    public void setTv_geoji1_content(String tv_geoji1_content) {
        this.tv_geoji1_content = tv_geoji1_content;
    }

    public String getTv_geoji1_update() {
        return tv_geoji1_update;
    }

    public void setTv_geoji1_update(String tv_geoji1_update) {
        this.tv_geoji1_update = tv_geoji1_update;
    }

    public Geoji1DTO(String tv_geoji1_id, String tv_geoji1_content, String tv_geoji1_update) {
        this.tv_geoji1_id = tv_geoji1_id;
        this.tv_geoji1_content = tv_geoji1_content;
        this.tv_geoji1_update = tv_geoji1_update;
    }
}
