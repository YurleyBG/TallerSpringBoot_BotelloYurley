package com.example.taller.DTO;

import java.sql.Timestamp;

public class ChaptersRequest {

    private int number;
    private Timestamp created_at;
    private Timestamp update_at;
    private String description;
    private String summary;


    public ChaptersRequest() {
    }
    public ChaptersRequest(int number, Timestamp created_at, Timestamp update_at, String description,
            String summary) {
        this.number = number;
        this.created_at = created_at;
        this.update_at = update_at;
        this.description = description;
        this.summary = summary;
    }
    public int getNumberChapter() {
        return number;
    }
    public void setNumberChapter(int number) {
        this.number = number;
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
        return summary;
    }
    public void setChapter_summary(String summary) {
        this.summary = summary;
    }


    
}
