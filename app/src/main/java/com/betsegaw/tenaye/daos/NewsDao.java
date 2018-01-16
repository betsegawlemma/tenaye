package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverters;

import com.betsegaw.tenaye.converters.Converter;
import com.betsegaw.tenaye.entities.News;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface NewsDao extends BaseDao<News> {
    @Query("SELECT * FROM newses")
    public List<News> findAll();
    @Query("SELECT * FROM newses WHERE date >= :date")
    public List<News> findByDate(@TypeConverters(Converter.class) Date date);
    @Query("SELECT * FROM newses WHERE id = :id")
    public News findById(Long id);
}
