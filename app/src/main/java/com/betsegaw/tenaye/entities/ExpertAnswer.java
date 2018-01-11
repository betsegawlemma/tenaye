package com.betsegaw.tenaye.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.betsegaw.tenaye.converters.Converter;

import java.util.Date;

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
    @TypeConverters({Converter.class})
    private Date date;
    @ColumnInfo(name="student_question_id")
    private Long studentQuestionId;

    public ExpertAnswer() {
    }

    public ExpertAnswer(Long id, String expertFirstName, String expertMiddleName,
                        String expertLastName, String expertise, String answer, String phone,
                        String email, Date date, Long studentQuestionId) {
        this.id = id;
        this.expertFirstName = expertFirstName;
        this.expertMiddleName = expertMiddleName;
        this.expertLastName = expertLastName;
        this.expertise = expertise;
        this.answer = answer;
        this.phone = phone;
        this.email = email;
        this.date = date;
        this.studentQuestionId = studentQuestionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpertFirstName() {
        return expertFirstName;
    }

    public void setExpertFirstName(String expertFirstName) {
        this.expertFirstName = expertFirstName;
    }

    public String getExpertMiddleName() {
        return expertMiddleName;
    }

    public void setExpertMiddleName(String expertMiddleName) {
        this.expertMiddleName = expertMiddleName;
    }

    public String getExpertLastName() {
        return expertLastName;
    }

    public void setExpertLastName(String expertLastName) {
        this.expertLastName = expertLastName;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getStudentQuestionId() {
        return studentQuestionId;
    }

    public void setStudentQuestionId(Long studentQuestionId) {
        this.studentQuestionId = studentQuestionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
