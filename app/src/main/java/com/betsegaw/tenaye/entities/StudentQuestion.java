package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by betsegaw on 1/11/18.
 */

@Entity
public class StudentQuestion {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String description;
    private String email;
    private String phone;

    public StudentQuestion() {
    }

    public StudentQuestion(Long id, String description, String email, String phone) {
        this.id = id;
        this.description = description;
        this.email = email;
        this.phone = phone;
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
}