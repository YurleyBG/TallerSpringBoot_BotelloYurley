package com.example.taller.DTO;

import java.sql.Timestamp;

public class ChapterResponse {
    
    private int numberChapter;
    private Timestamp created_at;
    private Timestamp update_at;
    private String description;
    private String chapter_summary;


    public ChapterResponse() {
    }
    public ChapterResponse(int numberChapter, Timestamp created_at, Timestamp update_at, String description,
            String chapter_summary) {
        this.numberChapter = numberChapter;
        this.created_at = created_at;
        this.update_at = update_at;
        this.description = description;
        this.chapter_summary = chapter_summary;
    }
    public int getNumberChapter() {
        return numberChapter;
    }
    public void setNumberChapter(int numberChapter) {
        this.numberChapter = numberChapter;
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
    public String getChapter_summary() {
        return chapter_summary;
    }
    public void setChapter_summary(String chapter_summary) {
        this.chapter_summary = chapter_summary;
    }

}
