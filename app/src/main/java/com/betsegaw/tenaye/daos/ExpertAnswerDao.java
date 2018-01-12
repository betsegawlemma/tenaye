package com.betsegaw.tenaye.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.betsegaw.tenaye.entities.ExpertAnswer;

import java.util.Optional;
import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */
@Dao
public interface ExpertAnswerDao extends BaseDao<ExpertAnswer> {
    @Query("SELECT * FROM expert_answers WHERE student_question_id=:studentQuestionId")
    public Set<ExpertAnswer> findByStudentQuestionId(Long studentQuestionId);
    @Query("SELECT * FROM expert_answers WHERE id = :id")
    public Optional<ExpertAnswer> findById(Long id);
}
