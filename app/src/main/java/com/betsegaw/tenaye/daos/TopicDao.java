package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Topic;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface TopicDao extends BaseDao<Topic> {
    @Query("SELECT * FROM topics")
    public List<Topic> findAll();
    @Query("SELECT * FROM topics WHERE id = :id")
    public Topic findById(Long id);
    @Query("SELECT * FROM topics WHERE category_id = :categoryId")
    public List<Topic> findByCategoryId(Long categoryId);
}
