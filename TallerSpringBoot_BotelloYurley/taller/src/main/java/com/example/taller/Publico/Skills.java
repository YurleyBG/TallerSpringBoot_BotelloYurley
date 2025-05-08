package com.example.taller.Publico;

import java.security.Timestamp;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Skills {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Timestamp create_at;
    private Timestamp updtae_at;
    private String iconurl;
    private String skill_name;
    private String skill_description;


    @OneToMany(mappedBy ="skills",fetch= FetchType.EAGER)
    private List<Skill_route_path> skill_route_path ;

    @OneToMany(mappedBy ="skill",fetch= FetchType.EAGER)
    private List<Chapters> chapters ;

    public Skills() {
    }

    public Skills(Long id, Timestamp create_at, Timestamp updtae_at, String iconurl, String skill_name,
            String skill_description) {
        this.id = id;
        this.create_at = create_at;
        this.updtae_at = updtae_at;
        this.iconurl = iconurl;
        this.skill_name = skill_name;
        this.skill_description = skill_description;
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

    public Timestamp getUpdtae_at() {
        return updtae_at;
    }

    public void setUpdtae_at(Timestamp updtae_at) {
        this.updtae_at = updtae_at;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getSkill_description() {
        return skill_description;
    }

    public void setSkill_description(String skill_description) {
        this.skill_description = skill_description;
    }

    public List<Chapters> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapters> chapters) {
        this.chapters = chapters;
    }

    public List<Skill_route_path> getSkill_route_path() {
        return skill_route_path;
    }

    public void setSkill_route_path(List<Skill_route_path> skill_route_path) {
        this.skill_route_path = skill_route_path;
    }

    
    

    

}
