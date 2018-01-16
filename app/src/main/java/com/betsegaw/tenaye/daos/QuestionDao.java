package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Question;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface QuestionDao extends BaseDao<Question> {
    @Query("SELECT * FROM questions")
    public List<Question> findAll();
    @Query("SELECT * FROM questions WHERE topic_id = :topicId")
    public List<Question> findByTopiId(Long topicId);
    @Query("SELECT * FROM questions WHERE id = :id")
    public Question findById(Long id);
}
