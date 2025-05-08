package com.example.taller.Publico;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Media_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String Descripcion ;
    
    @OneToMany(mappedBy = "mediaType",fetch= FetchType.EAGER)
    private List<Media_sub_chapter> media_sub_chapter;
    
    
    public Media_type() {
    }

    public Media_type(Long id, String descripcion) {
        this.id = id;
        this.Descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public List<Media_sub_chapter> getMedia_sub_chapter() {
        return media_sub_chapter;
    }

    public void setMedia_sub_chapter(List<Media_sub_chapter> media_sub_chapter) {
        this.media_sub_chapter = media_sub_chapter;
    }

   

   



    


}
