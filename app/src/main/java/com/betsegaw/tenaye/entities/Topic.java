package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by betsegaw on 1/11/18.
 */

@Entity(foreignKeys ={@ForeignKey(entity = Category.class,
        parentColumns = "id",
        childColumns = "category_id")},tableName = "topics")
public class Topic {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    String description;
    private String picture;
    private String path;
    @ColumnInfo(name="category_id")
    private Long categoryId;

    public Topic() {
    }

    public Topic(Long id, String description, String picture, String path) {
        this.id = id;
        this.description = description;
        this.picture = picture;
        this.path = path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
