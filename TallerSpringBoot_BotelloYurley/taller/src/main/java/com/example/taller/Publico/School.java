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
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp create_at,update_at;
    private String description_school,headmaster_school;
    private String celphone_school,email_school;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="city_id",nullable = false)
    private Cities cities;

    @OneToMany(mappedBy = "school",fetch= FetchType.EAGER)
    private List<Students> students;
    public School() {
    }
    public School(Long id, Timestamp create_at, Timestamp update_at, String description_school,
            String headmaster_school, String celphone_school, String email_school) {
        this.id = id;
        this.create_at = create_at;
        this.update_at = update_at;
        this.description_school = description_school;
        this.headmaster_school = headmaster_school;
        this.celphone_school = celphone_school;
        this.email_school = email_school;
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
    public String getDescription_school() {
        return description_school;
    }
    public void setDescription_school(String description_school) {
        this.description_school = description_school;
    }
    public String getHeadmaster_school() {
        return headmaster_school;
    }
    public void setHeadmaster_school(String headmaster_school) {
        this.headmaster_school = headmaster_school;
    }
    public String getCelphone_school() {
        return celphone_school;
    }
    public void setCelphone_school(String celphone_school) {
        this.celphone_school = celphone_school;
    }
    public String getEmail_school() {
        return email_school;
    }
    public void setEmail_school(String email_school) {
        this.email_school = email_school;
    }
    public Cities getCities() {
        return cities;
    }
    public void setCities(Cities cities) {
        this.cities = cities;
    }
    public List<Students> getStudents() {
        return students;
    }
    public void setStudents(List<Students> students) {
        this.students = students;
    }

    
    

    
    

}
