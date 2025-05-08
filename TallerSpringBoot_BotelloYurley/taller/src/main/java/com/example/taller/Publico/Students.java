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
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int age;
    private String celphone ,email,firstname,lastname;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="city_id",nullable = false)
    private Cities cities;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="school_id",nullable = false)
    private School school;

    
    @OneToMany(mappedBy = "students",fetch= FetchType.EAGER)
    private List<Exams> exams;

    public Students() {
    }

    public Students(Long id, int age, String celphone, String email, String firstname, String lastname) {
        this.id = id;
        this.age = age;
        this.celphone = celphone;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCelphone() {
        return celphone;
    }
    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Cities getCities() {
        return cities;
    }

    public void setCities(Cities cities) {
        this.cities = cities;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Exams> getExams() {
        return exams;
    }

    public void setExams(List<Exams> exams) {
        this.exams = exams;
    }

    

}
