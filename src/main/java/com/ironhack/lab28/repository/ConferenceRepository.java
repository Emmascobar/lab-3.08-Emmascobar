package com.ironhack.lab28.repository;

import com.ironhack.lab28.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}