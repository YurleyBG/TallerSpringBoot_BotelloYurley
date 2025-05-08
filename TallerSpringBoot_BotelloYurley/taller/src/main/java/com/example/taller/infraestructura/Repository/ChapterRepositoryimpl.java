package com.example.taller.infraestructura.Repository;


import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.taller.DTO.ChapterResponse;
import com.example.taller.DTO.ChaptersRequest;
import com.example.taller.Publico.Chapters;
import com.example.taller.application.service.ChapterService;
import com.example.taller.infraestructura.error.RolDuplicationException;

import jakarta.persistence.EntityNotFoundException;


@Service
public class ChapterRepositoryimpl implements ChapterService {

    private final ChapterRepository chapterRepository;
    
    public ChapterRepositoryimpl(ChapterRepository chapterRepository) {
        this.chapterRepository= chapterRepository;
    }
    @Override
    public List<Chapters> findAllChaptersByFilter(String filter, String value) {
        if(filter.equalsIgnoreCase("summary") && !value.isEmpty()){
            return chapterRepository.findBySummary(value);
        }
        return chapterRepository.findAll();
    }

    @Override
    public boolean ChapterDeleted(Long id) {
        Optional<Chapters> chaptersito = chapterRepository.findById(id);
        if (chaptersito.isPresent()) {
            chapterRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public ChapterResponse patchChapters(long id, ChaptersRequest chapt) {
        Chapters chapters = chapterRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("No se encontro el Chapter con la id solicitada"));

        if(chapt.getCreated_at()!=null){
            chapters.setCreated_at(chapt.getCreated_at());
        }
        if(chapt.getChapter_summary()!=null){
            chapters.setNumber(chapt.getNumberChapter());
        }
        if(chapt.getDescription()!=null){
            chapters.setDescription(chapt.getDescription());
        }
        if(chapt.getUpdate_at()!=null){
            chapters.setUpdate_at(chapt.getUpdate_at());
        }
        chapterRepository.save(chapters);
        ChapterResponse resp = new ChapterResponse();
        resp.setNumberChapter(chapters.getNumber());
        resp.setDescription(chapters.getDescription());
        resp.setChapter_summary(chapters.getSummary());
        return resp;

    }

    @Override
    public ChapterResponse createNewChapter(ChaptersRequest ChapReqs) {
        Optional<Chapters> chap = chapterRepository.findByNumber(ChapReqs.getNumberChapter());
        if (chap.isPresent()){
            throw new RolDuplicationException("el capítulo ya se encuentra registrado", HttpStatus.CONFLICT);
        }

        Chapters newChapter = new Chapters();
        newChapter.setNumber(ChapReqs.getNumberChapter());
        newChapter.setCreated_at(new Timestamp(System.currentTimeMillis()));
        newChapter.setUpdate_at(new Timestamp(System.currentTimeMillis()));
        newChapter.setDescription(ChapReqs.getDescription());
        newChapter.setSummary(ChapReqs.getChapter_summary());

        Chapters savedChapter = chapterRepository.save(newChapter);

        ChapterResponse  chapterresp = new ChapterResponse();
        chapterresp.setNumberChapter(savedChapter.getNumber());
        chapterresp.setDescription(savedChapter.getDescription());
        chapterresp.setChapter_summary(savedChapter.getSummary());

        return chapterresp;
    }
   
   

}
