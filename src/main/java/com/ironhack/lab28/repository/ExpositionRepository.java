package com.ironhack.lab28.repository;

import com.ironhack.lab28.model.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpositionRepository extends JpaRepository<Exposition, Long> {
}