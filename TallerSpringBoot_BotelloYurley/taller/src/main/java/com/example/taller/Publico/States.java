package com.example.taller.Publico;

import java.sql.Timestamp;
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
public class States {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp create_at,update_at;
    private String abbreviation,name_state;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="country_id",nullable = false)
    private Countries countries;

    @OneToMany(mappedBy="state",fetch= FetchType.EAGER)
    private List<Cities> cities;

    public States() {
    }
    public States(Long id, Timestamp create_at, Timestamp update_at, String abbreviation, String name_state) {
        this.id = id;
        this.create_at = create_at;
        this.update_at = update_at;
        this.abbreviation = abbreviation;
        this.name_state = name_state;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getName_state() {
        return name_state;
    }
    public void setName_state(String name_state) {
        this.name_state = name_state;
    }
   
    public List<Cities> getCities() {
        return cities;
    }
    public void setCities(List<Cities> cities) {
        this.cities = cities;
    }
    public Countries getCountries() {
        return countries;
    }
    public void setCountries(Countries countries) {
        this.countries = countries;
    }
    

    

    

}
