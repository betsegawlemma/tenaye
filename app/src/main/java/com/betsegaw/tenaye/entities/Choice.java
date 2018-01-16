package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by betsegaw on 1/11/18.
 */
@Entity(foreignKeys ={
        @ForeignKey(entity = Question.class,
                parentColumns = "id",
                childColumns = "question_id",
                onDelete = CASCADE)
},tableName = "choices")
public class Choice {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String letter;
    private String description;
    private String picture;
    private String path;
    @ColumnInfo(name="question_id")
    private Long questionId;

    public Choice() {
    }

    public Choice(Long id, String letter, String description, String picture, String path, Long questionId) {
        this.id = id;
        this.letter = letter;
        this.description = description;
        this.picture = picture;
        this.path = path;
        this.questionId = questionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
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

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}
