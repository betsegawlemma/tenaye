package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Topic;

import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface TopicDao extends BaseDao<Topic> {
    @Query("SELECT * FROM topics")
    public Set<Topic> findAll();
    @Query("SELECT * FROM topics WHERE id = :id")
    public Optional<Topic> findById(Long id);
    @Query("SELECT * FROM topics WHERE category_id = :categoryId")
    public Set<Topic> findByCategoryId(Long categoryId);
}
