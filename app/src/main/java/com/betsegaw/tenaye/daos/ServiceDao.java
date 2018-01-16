package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface ServiceDao extends BaseDao<Service>{
    @Query("SELECT * FROM services")
    public List<Service> findAll();

    @Query("SELECT * FROM services WHERE id = :id")
    public Service findById(Long id);

    @Query("SELECT * FROM services WHERE location_name = :locationName")
    public List<Service> findByLocationName(String locationName);
}
