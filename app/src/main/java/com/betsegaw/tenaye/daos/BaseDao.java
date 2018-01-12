package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.Set;

/**
 * Created by betsegaw on 1/12/18.
 */

public interface BaseDao<T> {
    @Insert
    public void insert(T... objects);
    @Update
    public void update(T... objects);
    @Delete
    public void delete(T... objects);
}
