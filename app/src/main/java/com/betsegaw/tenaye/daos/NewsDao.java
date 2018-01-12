package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.News;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface NewsDao extends BaseDao<News> {
    @Query("SELECT * FROM newses")
    public Set<News> findAll();
    @Query("SELECT * FROM newses WHERE date >= :date")
    public Set<News> findByDate(Date date);
    @Query("SELECT * FROM newses WHERE id = :id")
    public Optional<News> findById(Long id);
}
