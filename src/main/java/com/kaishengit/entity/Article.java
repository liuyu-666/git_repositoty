package com.kaishengit.entity;

import java.util.List;

/**
 * @author liuyu
 * @date 2017/10/26
 */
public class Article {
    private int id;
    private String title;
    private List<Label> labelList;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", labelList=" + labelList +
                '}';
    }

    public List<Label> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<Label> labelList) {
        this.labelList = labelList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
