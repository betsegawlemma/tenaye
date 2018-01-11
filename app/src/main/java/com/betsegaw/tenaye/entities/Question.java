package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by betsegaw on 1/11/18.
 */
@Entity
public class Question {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String description;
    private Byte[] picture;
    private String answer;
    private String path;

    public Question() {
    }

    public Question(Long id, String description, Byte[] picture, String path, String answer) {
        this.id = id;
        this.description = description;
        this.picture = picture;
        this.path = path;
        this.answer = answer;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
