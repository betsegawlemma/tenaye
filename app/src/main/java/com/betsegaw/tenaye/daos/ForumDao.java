package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Forum;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface ForumDao {
    @Query("SELECT * FROM forums WHERE date >= :date")
    public Set<Forum> findByDate(Date date);
    @Query("SELECT * FROM forums WHERE category_id = :categoryId")
    public Set<Forum> findByCategory(Long categoryId);
    @Query("SELECT * FROM forums WHERE rank >= :rank")
    public Set<Forum> findByRank(Long rank);
    @Query("SELECT * FROM forums WHERE id = :id")
    public Optional<Forum> findById(Long id);
    @Query("SELECT * FROM forums WHERE status IN (:statuses)")
    public Set<Forum> findByStatuses(Set<String> statuses);
}
