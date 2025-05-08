package com.example.taller.infraestructura.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taller.Publico.Chapters;

public interface  ChapterRepository extends JpaRepository< Chapters,Long>{

    List<Chapters>findBySummary(String summary);
    Optional<Chapters>findByNumber(int number);

}
