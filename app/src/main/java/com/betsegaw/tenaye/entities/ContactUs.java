package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import java.util.Date;

/**
 * Created by betsegaw on 1/11/18.
 */

@Entity
public class ContactUs {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    @ColumnInfo(name = "first_name")
    private String firstName;
    @ColumnInfo(name = "middle_name")
    private String middleName;
    @ColumnInfo(name = "last_name")
    private String lastName;
    @TypeConverters({Converter.class})
    private Date date;
    private String message;
    private String phone;
    private String email;

    public ContactUs() {
    }

    public ContactUs(Long id, String firstName, String middleName, String lastName, Date date,
                     String message, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.date = date;
        this.message = message;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

