package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.Set;

/**
 * Created by betsegaw on 1/11/18.
 */

public class QuestionWithChoice {
    @Embedded
    public Question question;
    @Relation(parentColumn = "id", entityColumn = "question_id")
    public Set<Choice> choices;
}
