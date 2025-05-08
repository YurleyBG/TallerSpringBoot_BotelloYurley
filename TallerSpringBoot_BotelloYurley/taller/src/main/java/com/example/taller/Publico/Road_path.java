package com.example.taller.Publico;


import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Road_path {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean isactive;
    private  Timestamp created_at;
    private Timestamp update_at;
    private String image_path;
    private String path_name;
    private String description;

    
    public Road_path() {
    }
    public Road_path(Long id, Boolean isactive, Timestamp created_at, Timestamp update_at, String image_path,
            String path_name, String description) {
        this.id = id;
        this.isactive = isactive;
        this.created_at = created_at;
        this.update_at = update_at;
        this.image_path = image_path;
        this.path_name = path_name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Boolean getIsactive() {
        return isactive;
    }
    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
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
    public String getImage_path() {
        return image_path;
    }
    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }
    public String getPath_name() {
        return path_name;
    }
    public void setPath_name(String path_name) {
        this.path_name = path_name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    

    
    

}
