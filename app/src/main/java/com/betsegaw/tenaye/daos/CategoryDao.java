package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Category;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */

@Dao
public interface CategoryDao extends BaseDao<Category>{
    @Query("SELECT * FROM categories")
    public List<Category> findAll();
    @Query("SELECT * FROM categories where id=:id")
    public Category findById(Long id);
}
