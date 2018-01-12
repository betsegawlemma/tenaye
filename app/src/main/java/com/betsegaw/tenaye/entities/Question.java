package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by betsegaw on 1/11/18.
 */
@Entity(foreignKeys ={@ForeignKey(entity = Topic.class,
        parentColumns = "id",
        childColumns = "topic_id", onDelete = CASCADE)},tableName = "questions")
public class Question {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String description;
    private Byte[] picture;
    private String answer;
    private String path;
    @ColumnInfo(name = "topic_id")
    private Long topicId;
    public Question() {
    }

    public Question(Long id, String description, Byte[] picture, String answer, String path, Long topicId) {
        this.id = id;
        this.description = description;
        this.picture = picture;
        this.answer = answer;
        this.path = path;
        this.topicId = topicId;
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

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }
}
