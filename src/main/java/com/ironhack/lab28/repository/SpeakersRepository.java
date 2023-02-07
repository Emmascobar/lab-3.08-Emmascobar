package com.ironhack.lab28.repository;

import com.ironhack.lab28.model.Speakers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakersRepository extends JpaRepository<Speakers, Long> {
}