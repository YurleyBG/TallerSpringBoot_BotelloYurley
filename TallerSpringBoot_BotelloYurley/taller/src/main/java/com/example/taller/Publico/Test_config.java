package com.example.taller.Publico;



import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Test_config {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date end_date;
    private boolean is_active;
    private int score;
    private  Date start_date ;
    private String description;
    private String  test_summary;

    @OneToMany(mappedBy="test_config",fetch= FetchType.EAGER)
    private List<Exams> exams;

    @OneToMany(mappedBy="test_config",fetch= FetchType.EAGER)
    private List<Test_questions> test_questions;

    public Test_config() {
    }

    public Test_config(Long id, Date end_date, boolean is_active, int score, Date start_date, String description,
            String test_summary) {
        this.id = id;
        this.end_date = end_date;
        this.is_active = is_active;
        this.score = score;
        this.start_date = start_date;
        this.description = description;
        this.test_summary = test_summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTest_summary() {
        return test_summary;
    }

    public void setTest_summary(String test_summary) {
        this.test_summary = test_summary;
    }

    public List<Exams> getExams() {
        return exams;
    }

    public void setExams(List<Exams> exams) {
        this.exams = exams;
    }

    public List<Test_questions> getTest_questions() {
        return test_questions;
    }

    public void setTest_questions(List<Test_questions> test_questions) {
        this.test_questions = test_questions;
    }

    
    


}
