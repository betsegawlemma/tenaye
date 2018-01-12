package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Story;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface StoryDao extends BaseDao<Story> {
    @Query("SELECT * FROM stories")
    public Set<Story> findAll();
    @Query("SELECT * FROM stories WHERE id = :id")
    public Optional<Story> findById(Long id);
    @Query("SELECT * FROM stories WHERE status IN (:statuses)")
    public Set<Story> findByStauses(Set<String> statuses);
    @Query("SELECT * FROM stories WHERE rank >= :rank")
    public Set<Story> findByRank(Long rank);
    @Query("SELECT * FROM stories WHERE date >= :date")
    public Set<Story> findByDate(Date date);
}
