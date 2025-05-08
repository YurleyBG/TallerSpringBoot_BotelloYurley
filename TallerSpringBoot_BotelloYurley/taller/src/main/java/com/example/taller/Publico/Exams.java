package com.example.taller.Publico;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Exams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date_presentation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="testconf_id",nullable = false)
    private Test_config test_config;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id",nullable = false)
    private Students students;

    public Exams() {
    }

    public Exams(Long id, Date date_presentation) {
        this.id = id;
        this.date_presentation = date_presentation;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDate_presentation() {
        return date_presentation;
    }
    public void setDate_presentation(Date date_presentation) {
        this.date_presentation = date_presentation;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Test_config getTest_config() {
        return test_config;
    }

    public void setTest_config(Test_config test_config) {
        this.test_config = test_config;
    }
    
    

}
