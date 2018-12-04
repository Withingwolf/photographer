package com.withing.photographer.domain;

import java.util.*;

public class Picture {

    private int pictureId;

    private int belongsId;

    private String picturePath;

    private Date createTime;

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public int getBelongsId() {
        return belongsId;
    }

    public void setBelongsId(int belongsId) {
        this.belongsId = belongsId;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
