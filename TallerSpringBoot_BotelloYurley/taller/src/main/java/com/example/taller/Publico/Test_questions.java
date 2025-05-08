package com.example.taller.Publico;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Test_questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="questions_id",nullable = false)
    private Questions question;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="testconf_id",nullable = false)
    private Test_config test_config;

    public Test_questions() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }

    public Test_config getTest_config() {
        return test_config;
    }

    public void setTest_config(Test_config test_config) {
        this.test_config = test_config;
    }


    
}
