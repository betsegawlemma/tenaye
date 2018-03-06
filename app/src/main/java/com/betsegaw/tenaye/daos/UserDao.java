package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface UserDao extends BaseDao<User>{
    @Query("SELECT * FROM users")
    public List<User> findAll();

    @Query("SELECT * FROM users WHERE first_name LIKE :firstName")
    public List<User> findByFirstName(String firstName);

    @Query("SELECT * FROM users WHERE first_name LIKE :firstName AND middle_name LIKE :middleName")
    public List<User> findByFirstNameAndMiddleName(String firstName, String middleName);

    @Query("SELECT * FROM users WHERE first_name LIKE :firstName AND middle_name LIKE :middleName AND last_name LIKE :lastName")
    public List<User> findbyFirstNameANDMiddleNameAndLastName(String firstName, String middleName, String lastName);

    @Query("SELECT * FROM users WHERE phone = :phone")
    public User findByPhone(String phone);

    @Query("SELECT * FROM users WHERE email = :email")
    public User findByEmail(String email);

    @Query("SELECT * FROM users WHERE id = :id")
    public User findById(Long id);
}
