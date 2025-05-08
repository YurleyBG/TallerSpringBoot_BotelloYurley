package com.example.taller.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.taller.DTO.ChapterResponse;
import com.example.taller.DTO.ChaptersRequest;
import com.example.taller.Publico.Chapters;

@Service
public interface ChapterService {

    public List<Chapters> findAllChaptersByFilter(String filter,String value);
    boolean ChapterDeleted(Long id) ;
    public ChapterResponse patchChapters(long id ,ChaptersRequest Chart);
    public ChapterResponse createNewChapter(ChaptersRequest ChapReqs );
}
