package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverters;

import com.betsegaw.tenaye.converters.Converter;
import com.betsegaw.tenaye.entities.Story;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface StoryDao extends BaseDao<Story> {
    @Query("SELECT * FROM stories")
    public List<Story> findAll();
    @Query("SELECT * FROM stories WHERE id = :id")
    public Story findById(Long id);
    @Query("SELECT * FROM stories WHERE status IN (:statuses)")
    public List<Story> findByStauses(Set<String> statuses);
    @Query("SELECT * FROM stories WHERE rank >= :rank")
    public List<Story> findByRank(Long rank);
    @Query("SELECT * FROM stories WHERE date >= :date")
    public List<Story> findByDate(@TypeConverters(Converter.class) Date date);
}
