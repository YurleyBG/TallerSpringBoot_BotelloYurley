package com.example.taller.Publico;

import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String state_abbreviation;
    private Timestamp create_at,update_at;
    private String name_city;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="states_id",nullable = false)
    private States state;

    public Cities() {
    }

    public Cities(Long id, String state_abbreviation, Timestamp create_at, Timestamp update_at, String name_city) {
        this.id = id;
        this.state_abbreviation = state_abbreviation;
        this.create_at = create_at;
        this.update_at = update_at;
        this.name_city = name_city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState_abbreviation() {
        return state_abbreviation;
    }

    public void setState_abbreviation(String state_abbreviation) {
        this.state_abbreviation = state_abbreviation;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public String getName_city() {
        return name_city;
    }

    public void setName_city(String name_city) {
        this.name_city = name_city;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }

    

    

    
}
