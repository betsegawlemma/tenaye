package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Member;

import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface MemberDao extends BaseDao<Member> {
    @Query("SELECT * FROM members")
    public Set<Member> findAll();

    @Query("SELECT * FROM members WHERE first_name = :firstName")
    public Set<Member> findByFirstName(String firstName);

    @Query("SELECT * FROM members WHERE first_name = :firstName AND middle_name=:middleName")
    public Set<Member> findByFirstNameAndMiddleName(String firstName, String middleName);

    @Query("SELECT * FROM members WHERE first_name = :firstName AND middle_name = :middleName AND last_name =:lastName")
    public Set<Member> findbyFirstNameANDMiddleNameAndLastName(String firstName, String middleName, String lastName);

    @Query("SELECT * FROM members WHERE phone = :phone")
    public Optional<Member> findByPhone(String phone);

    @Query("SELECT * FROM members WHERE email = :email")
    public Optional<Member> findByEmail(String email);

    @Query("SELECT * FROM members WHERE id = :id")
    public Optional<Member> findById(Long id);
}
