package com.kaishengit.entity;

/**
 * @author liuyu
 * @date 2017/10/26
 */
public class Label {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
