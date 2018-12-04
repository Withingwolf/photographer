package com.withing.photographer.domain;

public class Album {

    private int albumId;

    private int belongsId;

    private String name;

    private int albumStatus;

    private String description;

    private int lovers;

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getBelongsId() {
        return belongsId;
    }

    public void setBelongsId(int belongsId) {
        this.belongsId = belongsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlbumStatus() {
        return albumStatus;
    }

    public void setAlbumStatus(int albumStatus) {
        this.albumStatus = albumStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLovers() {
        return lovers;
    }

    public void setLovers(int lovers) {
        this.lovers = lovers;
    }
}
