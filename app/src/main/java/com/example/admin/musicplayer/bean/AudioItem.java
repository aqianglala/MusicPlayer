package com.example.admin.musicplayer.bean;

import android.database.Cursor;

import java.io.Serializable;


public class AudioItem implements Serializable {

    // Media._ID, Media.TITLE, Media.ARTIST, Media.DATA
    private String title;
    private String artist;
    private String path;
    private String songId;

    public static AudioItem fromCursor(Cursor cursor) {
        AudioItem item = new AudioItem();
        item.setTitle(cursor.getString(1));
        item.setArtist(cursor.getString(2));
        item.setPath(cursor.getString(3));
        return item;
    }

    public static AudioItem fromBean(HotBean.ShowapiResBodyEntity.PagebeanEntity
            .SonglistEntity data) {
        AudioItem item = new AudioItem();
        item.setTitle(data.getSongname());
        item.setArtist(data.getSingername());
        item.setPath(data.getUrl());
        item.setSongId(data.getSongid()+"");
        return item;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }
}
