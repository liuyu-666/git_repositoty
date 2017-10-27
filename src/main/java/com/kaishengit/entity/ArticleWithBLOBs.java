package com.kaishengit.entity;

public class ArticleWithBLOBs extends Article {
    private String simplecontent;

    private String picture;

    private String content;

    public String getSimplecontent() {
        return simplecontent;
    }

    public void setSimplecontent(String simplecontent) {
        this.simplecontent = simplecontent;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}