package com.example.taller.Publico;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Type_options {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description ,tag_option;
    

    @OneToMany(mappedBy="type_options",fetch= FetchType.EAGER)
    private List<Questions> questions;
    
    public Type_options() {
    }
    
    public Type_options(Long id, String description, String tag_option) {
        this.id = id;
        this.description = description;
        this.tag_option = tag_option;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTag_option() {
        return tag_option;
    }
    public void setTag_option(String tag_option) {
        this.tag_option = tag_option;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }


    

    

}
