package com.ironhack.lab28.repository;

import com.ironhack.lab28.model.Chapters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChaptersRepository extends JpaRepository<Chapters, Long> {
}