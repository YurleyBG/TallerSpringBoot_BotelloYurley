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
public class Chapters {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private int number;
    private Timestamp created_at;
    private Timestamp update_at;
    private String description;
    private String summary;

    
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="skill_id",nullable = false)
    private Skills skill;

    @OneToMany(mappedBy ="chapters",fetch= FetchType.EAGER)
    private List<SubChapter> subChapter ;

    public Chapters() {
    }

    public Chapters(Timestamp created_at, String description, Long id, int number, Skills skill, List<SubChapter> subChapter, String summary, Timestamp update_at) {
        this.created_at = created_at;
        this.description = description;
        this.id = id;
        this.number = number;
        this.skill = skill;
        this.subChapter = subChapter;
        this.summary = summary;
        this.update_at = update_at;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    public List<SubChapter> getSubChapter() {
        return subChapter;
    }

    public void setSubChapter(List<SubChapter> subChapter) {
        this.subChapter = subChapter;
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    

}
