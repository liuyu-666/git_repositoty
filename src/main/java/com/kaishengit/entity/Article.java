package com.kaishengit.entity;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private Date createtime;

    private Integer scannum;

    private Integer replynum;

    private Date lastreplytime;

    private Integer nodeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getScannum() {
        return scannum;
    }

    public void setScannum(Integer scannum) {
        this.scannum = scannum;
    }

    public Integer getReplynum() {
        return replynum;
    }

    public void setReplynum(Integer replynum) {
        this.replynum = replynum;
    }

    public Date getLastreplytime() {
        return lastreplytime;
    }

    public void setLastreplytime(Date lastreplytime) {
        this.lastreplytime = lastreplytime;
    }

    public Integer getNodeid() {
        return nodeid;
    }

    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }
}