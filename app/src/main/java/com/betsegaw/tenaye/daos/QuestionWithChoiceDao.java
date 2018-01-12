package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.QuestionWithChoice;

import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface QuestionWithChoiceDao {
    @Query("SELECT * from questions where topic_id = :topicId")
    public Set<QuestionWithChoice> getQuestionsWithChoices(Long topicId);
}
