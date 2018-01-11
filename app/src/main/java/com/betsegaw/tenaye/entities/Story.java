package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.betsegaw.tenaye.converters.Converter;

import java.util.Date;

/**
 * Created by betsegaw on 1/11/18.
 */
@Entity
public class Story {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String description;
    @TypeConverters({Converter.class})
    private Date date;
    private Long likes;
    private Long dislikes;
    private Long rank;
    private String status;

    public Story() {
    }

    public Story(Long id, String description, Date date, Long likes, Long dislikes, Long rank,
                 String status) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.likes = likes;
        this.dislikes = dislikes;
        this.rank = rank;
        this.status = status;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Long getDislikes() {
        return dislikes;
    }

    public void setDislikes(Long dislikes) {
        this.dislikes = dislikes;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
