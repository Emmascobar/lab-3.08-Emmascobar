package com.ironhack.lab28.repository;

import com.ironhack.lab28.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository  extends JpaRepository<Event, Long> {
}