package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.betsegaw.tenaye.converters.Converter;

import java.util.Date;

/**
 * Created by betsegaw on 1/11/18.
 */

@Entity(foreignKeys ={@ForeignKey(entity = Story.class,
        parentColumns = "id",
        childColumns = "story_id")})
public class StoryComment {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    String comment;
    @TypeConverters({Converter.class})
    Date date;
    Long likes;
    Long dislikes;
    Long rank;
    @ColumnInfo(name = "story_id")
    Long storyId;

    public StoryComment() {
    }

    public StoryComment(Long id, String comment, Date date, Long likes, Long dislikes, Long rank, Long storyId) {
        this.id = id;
        this.comment = comment;
        this.date = date;
        this.likes = likes;
        this.dislikes = dislikes;
        this.rank = rank;
        this.storyId = storyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Long getStoryId() {
        return storyId;
    }

    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }
}
