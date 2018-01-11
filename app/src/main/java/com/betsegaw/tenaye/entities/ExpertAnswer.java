package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by betsegaw on 1/11/18.
 */
@Entity(foreignKeys ={@ForeignKey(entity = StudentQuestion.class,
        parentColumns = "id",
        childColumns = "student_question_id")})
public class ExpertAnswer {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    @ColumnInfo(name = "expert_first_name")
    private String expertFirstName;
    @ColumnInfo(name = "expert_middle_name")
    private String expertMiddleName;
    @ColumnInfo(name = "expert_last_name")
    private String expertLastName;
    private String expertise;
    private String answer;
    private String phone;
    private String email;
    @ColumnInfo(name="student_question_id")
    private Long studentQuestionId;


}
