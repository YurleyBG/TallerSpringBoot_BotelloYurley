package com.example.taller.Publico;

import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class media_sub_chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="created_at", length = 6)
    private Timestamp Created_at; 
    @Column(name="update_at", length = 6)
    private Timestamp Update_up;
    @Column(name="descripcion", length = 80, nullable = false)
    private String Description ;
    private String summary;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="media_id",nullable = false)
    private Media_type mediaType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="subchapter_id",nullable = false)
    private SubChapter subChapter;

    public media_sub_chapter() {
    }

    public media_sub_chapter(Long id, Timestamp created_at, Timestamp update_up, String description, String summary) {
        this.id = id;
        this.Created_at = created_at;
        this.Update_up = update_up;
        this.Description = description;
        this.summary = summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return Created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        Created_at = created_at;
    }

    public Timestamp getUpdate_up() {
        return Update_up;
    }

    public void setUpdate_up(Timestamp update_up) {
        Update_up = update_up;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

   
    

}
