package com.example.taller.infraestructura.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.taller.DTO.ChapterResponse;
import com.example.taller.DTO.ChaptersRequest;
import com.example.taller.Publico.Chapters;
import com.example.taller.application.service.ChapterService;

@RestController
@RequestMapping(value="/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ChapterController {


    private final ChapterService chapterService;
    
    public ChapterController(ChapterService chapterService) {
        this.chapterService= chapterService;
    }

    @GetMapping("/chapter")
    public List<Chapters>findAll(
        @RequestParam(name="filter",defaultValue ="") String filter,
        @RequestParam(name="value",defaultValue ="") String value
        
    ){
        List<Chapters> results=chapterService.findAllChaptersByFilter(filter,value);
    
        return results;
    }

    @DeleteMapping("/chapter/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        boolean Deleted = chapterService.ChapterDeleted(id);
        if (Deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        }
    }
    
    @PostMapping("/chapter")
    public ResponseEntity<ChapterResponse> createNewChapter(@RequestBody ChaptersRequest Chapt) {
        return new ResponseEntity<ChapterResponse>(
            chapterService.createNewChapter(Chapt),
            HttpStatusCode.valueOf(200)
        );
    }
        

    @PatchMapping("/chapter/{id}")
    public  ResponseEntity<ChapterResponse> updatechapter( @PathVariable Long id,@RequestBody ChaptersRequest Chart){
        return ResponseEntity.ok().body(chapterService.patchChapters(id, Chart));
    }


}
