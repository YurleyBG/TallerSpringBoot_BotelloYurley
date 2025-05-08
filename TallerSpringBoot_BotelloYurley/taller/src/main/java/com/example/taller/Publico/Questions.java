package com.example.taller.Publico;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int score;
    private String description;

    @OneToMany(mappedBy="question",fetch= FetchType.EAGER)
    private List<Test_questions> test_questions ;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="typeoption_id",nullable = false)
    private Type_options type_options;

    public Questions() {
    }

    public Questions(Long id, int score, String description) {
        this.id = id;
        this.score = score;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type_options getType_options() {
        return type_options;
    }

    public void setType_options(Type_options type_options) {
        this.type_options = type_options;
    }

    public List<Test_questions> getTest_questions() {
        return test_questions;
    }

    public void setTest_questions(List<Test_questions> test_questions) {
        this.test_questions = test_questions;
    }

   

   

    
    

}
