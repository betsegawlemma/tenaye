package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverters;

import com.betsegaw.tenaye.converters.Converter;
import com.betsegaw.tenaye.entities.Forum;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface ForumDao {
    @Query("SELECT * FROM forums WHERE date >= :date")
    public List<Forum> findByDate(@TypeConverters(Converter.class) Date date);
    @Query("SELECT * FROM forums WHERE category_id = :categoryId")
    public List<Forum> findByCategory(Long categoryId);
    @Query("SELECT * FROM forums WHERE rank >= :rank")
    public List<Forum> findByRank(Long rank);
    @Query("SELECT * FROM forums WHERE id = :id")
    public Forum findById(Long id);
    @Query("SELECT * FROM forums WHERE status IN (:statuses)")
    public List<Forum> findByStatuses(Set<String> statuses);
}
