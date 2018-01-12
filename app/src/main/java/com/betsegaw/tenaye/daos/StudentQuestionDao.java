package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.StudentQuestion;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface StudentQuestionDao extends BaseDao<StudentQuestion>{
    @Query("SELECT * FROM student_questions")
    public Set<StudentQuestion> findAll();
    @Query("SELECT * FROM student_questions WHERE date >= :date")
    public Set<StudentQuestion> findByDate(Date date);
    @Query("SELECT * FROM student_questions WHERE status IN (:statuses)")
    public Set<StudentQuestion> findByStatuses(Set<String> statuses);
    @Query("SELECT * FROM student_questions WHERE id = :id")
    public Optional<StudentQuestion> findById(Long id);
}
