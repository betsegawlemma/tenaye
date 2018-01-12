package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.ContactUs;

import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface ContactUsDao extends BaseDao<ContactUs>{
    @Query("SELECT * FROM contact_us")
    public Set<ContactUs> findAll();
    @Query("SELECT * FROM contact_us WHERE id = :id")
    public Optional<ContactUs> findById(Long id);
}
