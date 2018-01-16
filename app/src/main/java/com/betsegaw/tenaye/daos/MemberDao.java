package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Member;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface MemberDao extends BaseDao<Member> {
    @Query("SELECT * FROM members")
    public List<Member> findAll();

    @Query("SELECT * FROM members WHERE first_name = :firstName")
    public List<Member> findByFirstName(String firstName);

    @Query("SELECT * FROM members WHERE first_name = :firstName AND middle_name=:middleName")
    public List<Member> findByFirstNameAndMiddleName(String firstName, String middleName);

    @Query("SELECT * FROM members WHERE first_name = :firstName AND middle_name = :middleName AND last_name =:lastName")
    public List<Member> findbyFirstNameANDMiddleNameAndLastName(String firstName, String middleName, String lastName);

    @Query("SELECT * FROM members WHERE phone = :phone")
    public Member findByPhone(String phone);

    @Query("SELECT * FROM members WHERE email = :email")
    public Member findByEmail(String email);

    @Query("SELECT * FROM members WHERE id = :id")
    public Member findById(Long id);
}
