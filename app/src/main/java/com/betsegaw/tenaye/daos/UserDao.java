package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.User;

import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface UserDao extends BaseDao<User>{
    @Query("SELECT * FROM users")
    public Set<User> findAll();

    @Query("SELECT * FROM users WHERE first_name = :firstName")
    public Set<User> findByFirstName(String firstName);

    @Query("SELECT * FROM users WHERE first_name = :firstName AND middle_name=:middleName")
    public Set<User> findByFirstNameAndMiddleName(String firstName, String middleName);

    @Query("SELECT * FROM users WHERE first_name = :firstName AND middle_name = :middleName AND last_name =:lastName")
    public Set<User> findbyFirstNameANDMiddleNameAndLastName(String firstName, String middleName, String lastName);

    @Query("SELECT * FROM users WHERE phone = :phone")
    public Optional<User> findByPhone(String phone);

    @Query("SELECT * FROM users WHERE email = :email")
    public Optional<User> findByEmail(String email);

    @Query("SELECT * FROM users WHERE id = :id")
    public Optional<User> findById(Long id);
}
