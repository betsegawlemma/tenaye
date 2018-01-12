package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.Choice;

import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface ChoiceDao extends BaseDao<Choice> {
    @Query("SELECT * FROM choices WHERE question_id=:questionId")
    public Set<Choice> findByQuestionId(Long questionId);
    @Query("SELECT * FROM choices WHERE id = :id")
    public Optional<Choice> findById(Long id);
}