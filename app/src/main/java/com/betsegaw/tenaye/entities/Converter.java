package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by betsegaw on 1/11/18.
 */

public class Converter {
    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
