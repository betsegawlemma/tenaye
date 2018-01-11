package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by betsegaw on 1/11/18.
 */
@Entity
public class Service {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String longitude;
    private String latitude;
    @ColumnInfo(name = "location_name")
    private String locationName;
    private String description;

    public Service() {
    }

    public Service(Long id, String longitude, String latitude, String locationName,
                   String description) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationName = locationName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
