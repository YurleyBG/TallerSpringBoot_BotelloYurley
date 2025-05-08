package com.example.taller.Publico;

import java.security.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Skill_route_path {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private  Timestamp create_at;
    private Timestamp Update_at;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="skill_id",nullable = false)
    private Skills skills;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="road_path_id",nullable = false)
    private Road_path road_path;

    public Skill_route_path() {
    }

    public Skill_route_path(Long id, Timestamp create_at, Timestamp update_at) {
        this.id = id;
        this.create_at = create_at;
        Update_at = update_at;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }
    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }
    public Timestamp getUpdate_at() {
        return Update_at;
    }
    public void setUpdate_at(Timestamp update_at) {
        Update_at = update_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Road_path getRoad_path() {
        return road_path;
    }

    public void setRoad_path(Road_path road_path) {
        this.road_path = road_path;
    }

    

}
