package com.example.taller.Publico;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class SubChapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="description", length = 80,nullable = false)
    private String description;
    @Column(name="summary",nullable = false)
    private String summmary;
    
    @OneToMany(mappedBy ="subChapter",fetch= FetchType.EAGER)
    private List<Media_sub_chapter> Media_sub_chapter ;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="chapter_id",nullable = false)
    private Chapters chapters;
    
    public SubChapter() {
    }

    public SubChapter(Long id, String description, String summmary) {
        this.id = id;
        this.description = description;
        this.summmary = summmary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummmary() {
        return summmary;
    }

    public void setSummmary(String summmary) {
        this.summmary = summmary;
    }

    public List<Media_sub_chapter> getMedia_sub_chapter() {
        return Media_sub_chapter;
    }

    public void setMedia_sub_chapter(List<Media_sub_chapter> media_sub_chapter) {
        Media_sub_chapter = media_sub_chapter;
    }

    public Chapters getChapters() {
        return chapters;
    }

    public void setChapters(Chapters chapters) {
        this.chapters = chapters;
    }

    

    
    



}
