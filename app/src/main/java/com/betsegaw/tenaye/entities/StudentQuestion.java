package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.betsegaw.tenaye.converters.Converter;

/**
 * Created by betsegaw on 1/11/18.
 */

@Entity(tableName = "student_questions")
public class StudentQuestion {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String description;
    @TypeConverters({Converter.class})
    private String date;
    private String email;
    private String phone;
    private String status;

    public StudentQuestion() {
    }

    public StudentQuestion(Long id, String description, String date, String email, String phone, String status) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.email = email;
        this.phone = phone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
