package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.ContactUs;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface ContactUsDao extends BaseDao<ContactUs>{
    @Query("SELECT * FROM contact_us")
    public List<ContactUs> findAll();
    @Query("SELECT * FROM contact_us WHERE id = :id")
    public ContactUs findById(Long id);
}
