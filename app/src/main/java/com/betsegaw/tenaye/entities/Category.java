package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by betsegaw on 1/11/18.
 */
@Entity
public class Category {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String title;
    private Byte[] picture;
    private String path;

    public Category() {
    }

    public Category(Long id, String title, Byte[] picture, String path) {
        this.id = id;
        this.title = title;
        this.picture = picture;
        this.path = path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Byte[] getPicture() {
        return picture;
    }

    public void setPicture(Byte[] picture) {
        this.picture = picture;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
