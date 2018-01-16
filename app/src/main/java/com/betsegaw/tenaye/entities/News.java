package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.betsegaw.tenaye.converters.Converter;

import java.util.Date;

/**
 * Created by betsegaw on 1/11/18.
 */
@Entity(tableName = "newses")
public class News {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String description;
    @TypeConverters({Converter.class})
    private Date date;

    public News() {
    }

    public News(Long id, String description, Date date) {
        this.id = id;
        this.description = description;
        this.date = date;
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
}
