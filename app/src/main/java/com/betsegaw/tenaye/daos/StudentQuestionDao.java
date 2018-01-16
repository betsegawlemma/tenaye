package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverters;

import com.betsegaw.tenaye.converters.Converter;
import com.betsegaw.tenaye.entities.StudentQuestion;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface StudentQuestionDao extends BaseDao<StudentQuestion>{
    @Query("SELECT * FROM student_questions")
    public List<StudentQuestion> findAll();
    @Query("SELECT * FROM student_questions WHERE date >= :date")
    public List<StudentQuestion> findByDate(@TypeConverters(Converter.class) Date date);
    @Query("SELECT * FROM student_questions WHERE status IN (:statuses)")
    public List<StudentQuestion> findByStatuses(Set<String> statuses);
    @Query("SELECT * FROM student_questions WHERE id = :id")
    public StudentQuestion findById(Long id);
}
